package i2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import g2.n0;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
public final class e extends c {
    public final ContentResolver f14530a;
    public Uri f14531b;
    public AssetFileDescriptor f14532c;
    public FileInputStream d;
    public long f14533e;
    public boolean f14534f;

    public e(Context context) {
        super(false);
        this.f14530a = context.getContentResolver();
    }

    @Override
    public final void close() {
        this.f14531b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14532c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new k(e10, 2000);
                    }
                } finally {
                    this.f14532c = null;
                    if (this.f14534f) {
                        this.f14534f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e11) {
                throw new k(e11, 2000);
            }
        } catch (Throwable th2) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f14532c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f14532c = null;
                    if (this.f14534f) {
                        this.f14534f = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new k(e12, 2000);
                }
            } finally {
                this.f14532c = null;
                if (this.f14534f) {
                    this.f14534f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f14531b;
    }

    @Override
    public final long open(n nVar) {
        int i3;
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        try {
            try {
                Uri uri = nVar.f14564a;
                long j10 = nVar.f14568f;
                long j11 = nVar.f14567e;
                Uri normalizeScheme = uri.normalizeScheme();
                this.f14531b = normalizeScheme;
                transferInitializing(nVar);
                boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f14530a;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.f14532c = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.d = fileInputStream;
                    int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i10 != 0 && j11 > length) {
                        throw new k((Exception) null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j11) - startOffset;
                    if (skip == j11) {
                        if (i10 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f14533e = -1L;
                            } else {
                                long position = size - channel.position();
                                this.f14533e = position;
                                if (position < 0) {
                                    throw new k((Exception) null, 2008);
                                }
                            }
                        } else {
                            long j12 = length - skip;
                            this.f14533e = j12;
                            if (j12 < 0) {
                                throw new k((Exception) null, 2008);
                            }
                        }
                        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                        if (i11 != 0) {
                            long j13 = this.f14533e;
                            if (j13 == -1) {
                                min = j10;
                            } else {
                                min = Math.min(j13, j10);
                            }
                            this.f14533e = min;
                        }
                        this.f14534f = true;
                        transferStarted(nVar);
                        if (i11 != 0) {
                            return j10;
                        }
                        return this.f14533e;
                    }
                    throw new k((Exception) null, 2008);
                }
                i3 = 2000;
                try {
                    throw new k(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                } catch (IOException e10) {
                    e = e10;
                    if (e instanceof FileNotFoundException) {
                        i3 = 2005;
                    }
                    throw new k(e, i3);
                }
            } catch (d e11) {
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
            i3 = 2000;
        }
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f14533e;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i10 = (int) Math.min(j10, i10);
                } catch (IOException e10) {
                    throw new k(e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = n0.f11873a;
            int read = fileInputStream.read(bArr, i3, i10);
            if (read != -1) {
                long j11 = this.f14533e;
                if (j11 != -1) {
                    this.f14533e = j11 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
