package defpackage;

import android.media.MediaDataSource;
import android.net.Uri;
import java.io.IOException;
public final class u5b extends MediaDataSource {
    public final Uri a;
    public final long b;
    public volatile kd4 c;
    public long d = -1;
    public volatile boolean e;

    public u5b(long j, Uri uri) {
        this.a = uri;
        this.b = j;
    }

    @Override
    public final void close() {
        this.e = true;
        kd4 kd4Var = this.c;
        if (kd4Var != null) {
            try {
                kd4Var.close();
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public final long getSize() {
        return this.b;
    }

    @Override
    public final synchronized int readAt(long j, byte[] bArr, int i, int i2) {
        if (!this.e) {
            int i3 = -1;
            if (j >= this.b) {
                return -1;
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.c == null || j != this.d) {
                kd4 kd4Var = this.c;
                this.c = null;
                if (kd4Var != null) {
                    kd4Var.close();
                }
                kd4 kd4Var2 = new kd4();
                kd4Var2.open(new g83(j, this.a));
                this.c = kd4Var2;
                this.d = j;
            }
            int read = this.c.read(bArr, i, i2);
            if (!this.e) {
                if (read <= 0) {
                    if (read == 0) {
                        i3 = 0;
                    }
                    return i3;
                }
                this.d += read;
                return read;
            }
            throw new IOException("closed");
        }
        throw new IOException("closed");
    }
}
