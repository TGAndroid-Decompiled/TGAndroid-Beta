package defpackage;

import android.net.Uri;
public final class x41 extends qf0 {
    public final w41 a;
    public Uri b;
    public byte[] c;
    public int d;
    public int e;
    public boolean f;

    public x41(byte[] bArr) {
        super(false);
        w41 w41Var = new w41(bArr);
        this.a = w41Var;
        gre.f(bArr.length > 0);
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
    public final long open(u63 u63Var) {
        transferInitializing(u63Var);
        Uri uri = u63Var.a;
        long j = u63Var.f;
        this.b = uri;
        byte[] bArr = this.a.a;
        this.c = bArr;
        long j2 = u63Var.e;
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
            transferStarted(u63Var);
            if (i2 != 0) {
                return j;
            }
            return this.e;
        }
        throw new r63(2008);
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
