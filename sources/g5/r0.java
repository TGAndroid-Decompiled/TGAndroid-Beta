package g5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
public final class r0 extends g {
    public final Resources f6902a;
    public final String f6903b;
    public Uri f6904c;
    public AssetFileDescriptor d;
    public FileInputStream f6905e;
    public long f6906f;
    public boolean h;

    public r0(Context context) {
        super(false);
        this.f6902a = context.getResources();
        this.f6903b = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override
    public final void close() {
        this.f6904c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f6905e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f6905e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e6) {
                        throw new n(null, e6, 2000);
                    }
                } finally {
                    this.d = null;
                    if (this.h) {
                        this.h = false;
                        transferEnded();
                    }
                }
            } catch (IOException e10) {
                throw new n(null, e10, 2000);
            }
        } catch (Throwable th2) {
            this.f6905e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.d = null;
                    if (this.h) {
                        this.h = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e11) {
                    throw new n(null, e11, 2000);
                }
            } finally {
                this.d = null;
                if (this.h) {
                    this.h = false;
                    transferEnded();
                }
            }
        }
    }

    @Override
    public final Uri getUri() {
        return this.f6904c;
    }

    @Override
    public final long open(g5.p r22) {
        throw new UnsupportedOperationException("Method not decompiled: g5.r0.open(g5.p):long");
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f6906f;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e6) {
                    throw new n(null, e6, 2000);
                }
            }
            FileInputStream fileInputStream = this.f6905e;
            int i12 = h5.d0.f7237a;
            int read = fileInputStream.read(bArr, i10, i11);
            if (read == -1) {
                if (this.f6906f != -1) {
                    throw new n("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
            } else {
                long j11 = this.f6906f;
                if (j11 != -1) {
                    this.f6906f = j11 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
