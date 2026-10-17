package g2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import e2.m0;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
public final class e extends c {
    public final ContentResolver f10766a;
    public Uri f10767b;
    public AssetFileDescriptor f10768c;
    public FileInputStream d;
    public long e;
    public boolean f10769f;

    public e(Context context) {
        super(false);
        this.f10766a = context.getContentResolver();
    }

    @Override
    public final void close() {
        this.f10767b = null;
        try {
            try {
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f10768c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new j(e, 2000);
                    }
                } finally {
                    this.f10768c = null;
                    if (this.f10769f) {
                        this.f10769f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e7) {
                throw new j(e7, 2000);
            }
        } catch (Throwable th2) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f10768c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f10768c = null;
                    if (this.f10769f) {
                        this.f10769f = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e10) {
                    throw new j(e10, 2000);
                }
            } finally {
                this.f10768c = null;
                if (this.f10769f) {
                    this.f10769f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f10767b;
    }

    @Override
    public final long open(m mVar) {
        int i10;
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        try {
            try {
                Uri uri = mVar.f10792a;
                long j10 = mVar.f10795f;
                long j11 = mVar.e;
                Uri normalizeScheme = uri.normalizeScheme();
                this.f10767b = normalizeScheme;
                transferInitializing(mVar);
                boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f10766a;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.f10768c = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.d = fileInputStream;
                    int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i11 != 0 && j11 > length) {
                        throw new j((Exception) null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j11) - startOffset;
                    if (skip == j11) {
                        if (i11 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.e = -1L;
                            } else {
                                long position = size - channel.position();
                                this.e = position;
                                if (position < 0) {
                                    throw new j((Exception) null, 2008);
                                }
                            }
                        } else {
                            long j12 = length - skip;
                            this.e = j12;
                            if (j12 < 0) {
                                throw new j((Exception) null, 2008);
                            }
                        }
                        int i12 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                        if (i12 != 0) {
                            long j13 = this.e;
                            if (j13 == -1) {
                                min = j10;
                            } else {
                                min = Math.min(j13, j10);
                            }
                            this.e = min;
                        }
                        this.f10769f = true;
                        transferStarted(mVar);
                        if (i12 != 0) {
                            return j10;
                        }
                        return this.e;
                    }
                    throw new j((Exception) null, 2008);
                }
                i10 = 2000;
                try {
                    throw new j(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                } catch (IOException e) {
                    e = e;
                    if (e instanceof FileNotFoundException) {
                        i10 = 2005;
                    }
                    throw new j(e, i10);
                }
            } catch (IOException e7) {
                e = e7;
                i10 = 2000;
            }
        } catch (d e10) {
            throw e10;
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.e;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e) {
                    throw new j(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.d;
            String str = m0.f8254a;
            int read = fileInputStream.read(bArr, i10, i11);
            if (read != -1) {
                long j11 = this.e;
                if (j11 != -1) {
                    this.e = j11 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
