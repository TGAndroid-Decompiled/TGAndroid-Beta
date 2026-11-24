package defpackage;
public abstract class yad {
    public static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(qk0 qk0Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    qk0Var.c(i5, i4);
                    qk0Var.c(i5, i6);
                    qk0Var.c(i4, i5);
                    qk0Var.c(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        qk0Var.c(i7, i7);
        int i8 = i7 + 1;
        qk0Var.c(i8, i7);
        qk0Var.c(i7, i8);
        int i9 = i + i2;
        qk0Var.c(i9, i7);
        qk0Var.c(i9, i8);
        qk0Var.c(i9, i9 - 1);
    }

    public static pk0 b(pk0 pk0Var, int i, int i2) {
        iu4 iu4Var;
        int i3;
        int i4 = pk0Var.b / i2;
        if (i2 != 4) {
            if (i2 != 6) {
                if (i2 != 8) {
                    if (i2 != 10) {
                        if (i2 == 12) {
                            iu4Var = iu4.h;
                        } else {
                            u36.j(hg9.j(i2, "Unsupported word size "));
                            return null;
                        }
                    } else {
                        iu4Var = iu4.i;
                    }
                } else {
                    iu4Var = iu4.m;
                }
            } else {
                iu4Var = iu4.j;
            }
        } else {
            iu4Var = iu4.k;
        }
        wm4 wm4Var = new wm4(iu4Var);
        int i5 = i / i2;
        int[] iArr = new int[i5];
        int i6 = pk0Var.b / i2;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                if (pk0Var.d((i7 * i2) + i9)) {
                    i3 = 1 << ((i2 - i9) - 1);
                } else {
                    i3 = 0;
                }
                i8 |= i3;
            }
            iArr[i7] = i8;
        }
        wm4Var.R(iArr, i5 - i4);
        pk0 pk0Var2 = new pk0();
        pk0Var2.b(0, i % i2);
        for (int i10 = 0; i10 < i5; i10++) {
            pk0Var2.b(iArr[i10], i2);
        }
        return pk0Var2;
    }

    public static pk0 c(pk0 pk0Var, int i) {
        pk0 pk0Var2 = new pk0();
        int i2 = pk0Var.b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || pk0Var.d(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                pk0Var2.b(i8, i);
            } else if (i8 == 0) {
                pk0Var2.b(i5 | 1, i);
            } else {
                pk0Var2.b(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return pk0Var2;
    }
}
