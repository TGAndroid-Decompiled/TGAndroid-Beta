package defpackage;
public abstract class zse {
    public static int a(sj0 sj0Var, boolean z) {
        byte b;
        int i = sj0Var.b;
        int i2 = sj0Var.c;
        if (!z) {
            i2 = i;
            i = i2;
        }
        byte[][] bArr = (byte[][]) sj0Var.d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            byte b2 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                if (z) {
                    b = bArr[i4][i6];
                } else {
                    b = bArr[i6][i4];
                }
                if (b == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += i5 - 2;
                    }
                    i5 = 1;
                    b2 = b;
                }
            }
            if (i5 >= 5) {
                i3 = (i5 - 2) + i3;
            }
        }
        return i3;
    }
}
