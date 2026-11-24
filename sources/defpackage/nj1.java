package defpackage;

import java.util.Arrays;
public final class nj1 {
    public final byte a;
    public char[] b;
    public int c;

    public final void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.b;
        if (cArr.length <= i3) {
            int i4 = i << 1;
            if (i3 < i4) {
                i3 = i4;
            }
            this.b = Arrays.copyOf(cArr, i3);
        }
    }

    public final void b() {
        mj1 mj1Var = mj1.c;
        char[] cArr = this.b;
        mj1Var.getClass();
        cArr.getClass();
        synchronized (mj1Var) {
            int i = mj1Var.b;
            if (cArr.length + i < qs.a) {
                mj1Var.b = i + cArr.length;
                mj1Var.a.addLast(cArr);
            }
        }
    }

    public final void c(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.c, length);
        str.getChars(0, str.length(), this.b, this.c);
        this.c += length;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return new String(this.b, 0, this.c);
            default:
                return new String(this.b, 0, this.c);
        }
    }
}
