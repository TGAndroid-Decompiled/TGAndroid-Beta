package defpackage;

import android.net.Uri;
public final class f51 extends sf0 {
    public final e51 a;
    public Uri b;
    public byte[] c;
    public int d;
    public int e;
    public boolean f;

    public f51(byte[] bArr) {
        super(false);
        e51 e51Var = new e51(bArr);
        this.a = e51Var;
        yve.f(bArr.length > 0);
    }

    @Override
    public final void close() {
        if (this.f) {
            this.f = false;
            transferEnded();
        }
        this.b = null;
        this.c = null;
    }

    @Override
    public final Uri getUri() {
        return this.b;
    }

    @Override
    public final long open(n73 n73Var) {
        transferInitializing(n73Var);
        Uri uri = n73Var.a;
        long j = n73Var.f;
        this.b = uri;
        byte[] bArr = this.a.a;
        this.c = bArr;
        long j2 = n73Var.e;
        if (j2 <= bArr.length) {
            int i = (int) j2;
            this.d = i;
            int length = bArr.length - i;
            this.e = length;
            int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if (i2 != 0) {
                this.e = (int) Math.min(length, j);
            }
            this.f = true;
            transferStarted(n73Var);
            if (i2 != 0) {
                return j;
            }
            return this.e;
        }
        throw new k73(2008);
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.e;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.c;
        bArr2.getClass();
        System.arraycopy(bArr2, this.d, bArr, i, min);
        this.d += min;
        this.e -= min;
        bytesTransferred(min);
        return min;
    }
}
