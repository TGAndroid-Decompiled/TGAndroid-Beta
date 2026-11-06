package j2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import h2.m0;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
public final class e extends c {
    public final ContentResolver f16415a;
    public Uri f16416b;
    public AssetFileDescriptor f16417c;
    public FileInputStream d;
    public long f16418e;
    public boolean f16419f;

    public e(Context context) {
        super(false);
        this.f16415a = context.getContentResolver();
    }

    @Override
    public final void close() {
        this.f16416b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f16417c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new j(e10, 2000);
                    }
                } finally {
                    this.f16417c = null;
                    if (this.f16419f) {
                        this.f16419f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e11) {
                throw new j(e11, 2000);
            }
        } catch (Throwable th2) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f16417c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f16417c = null;
                    if (this.f16419f) {
                        this.f16419f = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new j(e12, 2000);
                }
            } finally {
                this.f16417c = null;
                if (this.f16419f) {
                    this.f16419f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f16416b;
    }

    @Override
    public final long open(m mVar) {
        int i7;
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        try {
            try {
                Uri uri = mVar.f16446a;
                long j3 = mVar.f16450f;
                long j10 = mVar.f16449e;
                Uri normalizeScheme = uri.normalizeScheme();
                this.f16416b = normalizeScheme;
                transferInitializing(mVar);
                boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f16415a;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.f16417c = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.d = fileInputStream;
                    int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i10 != 0 && j10 > length) {
                        throw new j((Exception) null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j10) - startOffset;
                    if (skip == j10) {
                        if (i10 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f16418e = -1L;
                            } else {
                                long position = size - channel.position();
                                this.f16418e = position;
                                if (position < 0) {
                                    throw new j((Exception) null, 2008);
                                }
                            }
                        } else {
                            long j11 = length - skip;
                            this.f16418e = j11;
                            if (j11 < 0) {
                                throw new j((Exception) null, 2008);
                            }
                        }
                        int i11 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                        if (i11 != 0) {
                            long j12 = this.f16418e;
                            if (j12 == -1) {
                                min = j3;
                            } else {
                                min = Math.min(j12, j3);
                            }
                            this.f16418e = min;
                        }
                        this.f16419f = true;
                        transferStarted(mVar);
                        if (i11 != 0) {
                            return j3;
                        }
                        return this.f16418e;
                    }
                    throw new j((Exception) null, 2008);
                }
                i7 = 2000;
                try {
                    throw new j(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                } catch (IOException e10) {
                    e = e10;
                    if (e instanceof FileNotFoundException) {
                        i7 = 2005;
                    }
                    throw new j(e, i7);
                }
            } catch (d e11) {
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
            i7 = 2000;
        }
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j3 = this.f16418e;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i10 = (int) Math.min(j3, i10);
                } catch (IOException e10) {
                    throw new j(e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = m0.f14112a;
            int read = fileInputStream.read(bArr, i7, i10);
            if (read != -1) {
                long j10 = this.f16418e;
                if (j10 != -1) {
                    this.f16418e = j10 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
