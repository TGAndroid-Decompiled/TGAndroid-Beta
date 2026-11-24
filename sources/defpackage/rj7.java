package defpackage;

import java.util.Arrays;
public final class rj7 {
    public final short a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;

    public rj7(int i) {
        this.a = i;
        byte[] bArr = new byte[131];
        this.d = bArr;
        bArr[2] = 1;
    }

    public final void a(int i, int i2, byte[] bArr) {
        if (!this.b) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i4 = this.e + i3;
        if (length < i4) {
            bArr2 = Arrays.copyOf(bArr2, i4 << 1);
            this.d = bArr2;
        }
        System.arraycopy(bArr, i, bArr2, this.e, i3);
        this.e += i3;
    }

    public final boolean b(int i) {
        if (!this.b) {
            return false;
        }
        this.e -= i;
        this.b = false;
        this.c = true;
        return true;
    }

    public final void c() {
        this.b = false;
        this.c = false;
    }

    public final void d(int i) {
        boolean z = true;
        jte.p(!this.b);
        if (i != this.a) {
            z = false;
        }
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }
}
