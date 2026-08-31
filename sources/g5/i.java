package g5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
public final class i extends g {
    public final ContentResolver f6857a;
    public Uri f6858b;
    public AssetFileDescriptor f6859c;
    public FileInputStream d;
    public long f6860e;
    public boolean f6861f;

    public i(Context context) {
        super(false);
        this.f6857a = context.getContentResolver();
    }

    @Override
    public final void close() {
        this.f6858b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f6859c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e6) {
                        throw new n(e6, 2000);
                    }
                } finally {
                    this.f6859c = null;
                    if (this.f6861f) {
                        this.f6861f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e10) {
                throw new n(e10, 2000);
            }
        } catch (Throwable th2) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f6859c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f6859c = null;
                    if (this.f6861f) {
                        this.f6861f = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e11) {
                    throw new n(e11, 2000);
                }
            } finally {
                this.f6859c = null;
                if (this.f6861f) {
                    this.f6861f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f6858b;
    }

    @Override
    public final long open(p pVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i10 = 2000;
        try {
            Uri uri = pVar.f6885a;
            long j10 = pVar.f6889f;
            long j11 = pVar.f6888e;
            Uri normalizeScheme = uri.normalizeScheme();
            this.f6858b = normalizeScheme;
            transferInitializing(pVar);
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f6857a;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f6859c = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.d = fileInputStream;
                int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i11 != 0 && j11 > length) {
                    throw new n((Exception) null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (skip == j11) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f6860e = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f6860e = position;
                            if (position < 0) {
                                throw new n((Exception) null, 2008);
                            }
                        }
                    } else {
                        long j12 = length - skip;
                        this.f6860e = j12;
                        if (j12 < 0) {
                            throw new n((Exception) null, 2008);
                        }
                    }
                    int i12 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                    if (i12 != 0) {
                        long j13 = this.f6860e;
                        if (j13 == -1) {
                            min = j10;
                        } else {
                            min = Math.min(j13, j10);
                        }
                        this.f6860e = min;
                    }
                    this.f6861f = true;
                    transferStarted(pVar);
                    if (i12 != 0) {
                        return j10;
                    }
                    return this.f6860e;
                }
                throw new n((Exception) null, 2008);
            }
            throw new n(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
        } catch (h e6) {
            throw e6;
        } catch (IOException e10) {
            if (e10 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new n(e10, i10);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f6860e;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e6) {
                    throw new n(e6, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            int i12 = h5.d0.f7237a;
            int read = fileInputStream.read(bArr, i10, i11);
            if (read != -1) {
                long j11 = this.f6860e;
                if (j11 != -1) {
                    this.f6860e = j11 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
