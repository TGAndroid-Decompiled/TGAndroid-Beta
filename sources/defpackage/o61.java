package defpackage;

import java.io.InputStream;
public final class o61 {
    public static int f;
    public InputStream a;
    public int b;
    public int c;
    public int d;
    public vk1 e;

    public final int a() {
        char c;
        int i = this.d;
        if (i == 8) {
            this.b = this.c;
            this.c = this.a.read();
            i = 0;
            this.d = 0;
            if (this.b == -1) {
                return -1;
            }
        }
        int i2 = (this.b >> (7 - i)) & 1;
        this.d = i + 1;
        vk1 vk1Var = this.e;
        if (i2 == 0) {
            c = '0';
        } else {
            c = '1';
        }
        int i3 = vk1Var.c;
        char[] cArr = vk1Var.b;
        if (i3 < cArr.length - 1) {
            cArr[i3] = c;
            vk1Var.c = i3 + 1;
        }
        f++;
        return i2;
    }

    public final boolean b(String str) {
        boolean z;
        String str2;
        if (a() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        f(str, str2);
        return z;
    }

    public final long c(int i) {
        if (i <= 64) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 1) | a();
            }
            return j;
        }
        u36.j("Can not readByte more then 64 bit");
        return 0L;
    }

    public final long d(int i, String str) {
        long c = c(i);
        f(str, String.valueOf(c));
        return c;
    }

    public final int e(String str) {
        int i = 0;
        int i2 = 0;
        while (a() == 0) {
            i2++;
        }
        if (i2 > 0) {
            i = (int) (((1 << i2) - 1) + c(i2));
        }
        f(str, String.valueOf(i));
        return i;
    }

    public final void f(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = f;
        vk1 vk1Var = this.e;
        String valueOf = String.valueOf(i - vk1Var.c);
        int length = 8 - valueOf.length();
        sb.append("@".concat(valueOf));
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        int length2 = (100 - sb.length()) - vk1Var.c;
        for (int i3 = 0; i3 < length2; i3++) {
            sb.append(' ');
        }
        sb.append(vk1Var);
        sb.append(" (" + str2 + ")");
        vk1Var.c = 0;
    }
}
