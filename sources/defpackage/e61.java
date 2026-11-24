package defpackage;

import android.net.Uri;
public final class e61 extends qg0 {
    public final d61 a;
    public Uri b;
    public byte[] c;
    public int d;
    public int e;
    public boolean f;

    public e61(byte[] bArr) {
        super(false);
        d61 d61Var = new d61(bArr);
        this.a = d61Var;
        jte.f(bArr.length > 0);
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
    public final long open(g83 g83Var) {
        transferInitializing(g83Var);
        Uri uri = g83Var.a;
        long j = g83Var.f;
        this.b = uri;
        byte[] bArr = this.a.a;
        this.c = bArr;
        long j2 = g83Var.e;
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
            transferStarted(g83Var);
            if (i2 != 0) {
                return j;
            }
            return this.e;
        }
        throw new d83(2008);
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
