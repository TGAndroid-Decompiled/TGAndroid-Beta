package defpackage;

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
public final class zu2 extends qf0 {
    public final ContentResolver a;
    public Uri b;
    public AssetFileDescriptor c;
    public FileInputStream d;
    public long e;
    public boolean f;

    public zu2(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    @Override
    public final void close() {
        this.b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new r63(e, 2000);
                    }
                } finally {
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e2) {
                throw new r63(e2, 2000);
            }
        } catch (Throwable th) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        transferEnded();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new r63(e3, 2000);
                }
            } finally {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.b;
    }

    @Override
    public final long open(u63 u63Var) {
        int i;
        int i2;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        long min;
        try {
            try {
                Uri uri = u63Var.a;
                long j2 = u63Var.f;
                long j3 = u63Var.e;
                Uri normalizeScheme = uri.normalizeScheme();
                this.b = normalizeScheme;
                transferInitializing(u63Var);
                boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.a;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.c = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.d = fileInputStream;
                    int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i3 != 0 && j3 > length) {
                        throw new r63((Exception) null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j3) - startOffset;
                    if (skip == j3) {
                        if (i3 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.e = -1L;
                                j = -1;
                            } else {
                                j = size - channel.position();
                                this.e = j;
                                if (j < 0) {
                                    throw new r63((Exception) null, 2008);
                                }
                            }
                        } else {
                            j = length - skip;
                            this.e = j;
                            if (j < 0) {
                                throw new r63((Exception) null, 2008);
                            }
                        }
                        int i4 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                        if (i4 != 0) {
                            if (j == -1) {
                                min = j2;
                            } else {
                                min = Math.min(j, j2);
                            }
                            this.e = min;
                        }
                        this.f = true;
                        transferStarted(u63Var);
                        if (i4 != 0) {
                            return j2;
                        }
                        return this.e;
                    }
                    throw new r63((Exception) null, 2008);
                }
                i = 2000;
                try {
                    throw new r63(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                } catch (IOException e) {
                    e = e;
                    if (e instanceof FileNotFoundException) {
                        i2 = 2005;
                    } else {
                        i2 = i;
                    }
                    throw new r63(e, i2);
                }
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (yu2 e3) {
            throw e3;
        }
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new r63(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = g8c.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.e;
                if (j2 != -1) {
                    this.e = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
