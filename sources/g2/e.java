package g2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
public final class e extends c {
    public final ContentResolver f10327a;
    public Uri f10328b;
    public AssetFileDescriptor f10329c;
    public FileInputStream d;
    public long f10330e;
    public boolean f10331f;

    public e(Context context) {
        super(false);
        this.f10327a = context.getContentResolver();
    }

    @Override
    public final void close() {
        this.f10328b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f10329c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new j(e7, 2000);
                    }
                } finally {
                    this.f10329c = null;
                    if (this.f10331f) {
                        this.f10331f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e10) {
                throw new j(e10, 2000);
            }
        } catch (Throwable th2) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f10329c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f10329c = null;
                    if (this.f10331f) {
                        this.f10331f = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e11) {
                    throw new j(e11, 2000);
                }
            } finally {
                this.f10329c = null;
                if (this.f10331f) {
                    this.f10331f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f10328b;
    }

    @Override
    public final long open(m mVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i10 = 2000;
        try {
            Uri uri = mVar.f10358a;
            long j3 = mVar.f10362f;
            long j10 = mVar.f10361e;
            Uri normalizeScheme = uri.normalizeScheme();
            this.f10328b = normalizeScheme;
            transferInitializing(mVar);
            boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
            ContentResolver contentResolver = this.f10327a;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f10329c = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.d = fileInputStream;
                int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i11 != 0 && j10 > length) {
                    throw new j((Exception) null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (skip == j10) {
                    if (i11 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f10330e = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f10330e = position;
                            if (position < 0) {
                                throw new j((Exception) null, 2008);
                            }
                        }
                    } else {
                        long j11 = length - skip;
                        this.f10330e = j11;
                        if (j11 < 0) {
                            throw new j((Exception) null, 2008);
                        }
                    }
                    int i12 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                    if (i12 != 0) {
                        long j12 = this.f10330e;
                        if (j12 == -1) {
                            min = j3;
                        } else {
                            min = Math.min(j12, j3);
                        }
                        this.f10330e = min;
                    }
                    this.f10331f = true;
                    transferStarted(mVar);
                    if (i12 != 0) {
                        return j3;
                    }
                    return this.f10330e;
                }
                throw new j((Exception) null, 2008);
            }
            throw new j(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
        } catch (d e7) {
            throw e7;
        } catch (IOException e10) {
            if (e10 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new j(e10, i10);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f10330e;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i11 = (int) Math.min(j3, i11);
                } catch (IOException e7) {
                    throw new j(e7, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = e2.d0.f8765a;
            int read = fileInputStream.read(bArr, i10, i11);
            if (read != -1) {
                long j10 = this.f10330e;
                if (j10 != -1) {
                    this.f10330e = j10 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
