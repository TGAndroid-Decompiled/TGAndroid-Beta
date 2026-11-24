package defpackage;

import android.text.TextUtils;
public final class g86 extends ja {
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;

    public g86(int i, int i2, int i3, int i4, String str) {
        super(i, false);
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public static g86 b(int i, String str) {
        return new g86(4, 0, i, 0, str);
    }

    public static g86 c(int i, int i2, String str) {
        return new g86(3, i, i2, 0, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g86) {
                g86 g86Var = (g86) obj;
                int i = g86Var.a;
                int i2 = this.a;
                if (i == i2) {
                    if (i2 != 3 || g86Var.d == this.d) {
                        if (i2 != 5 || g86Var.f == this.f) {
                            if ((i2 != 3 && i2 != 4) || g86Var.e == this.e) {
                                if ((i2 == 0 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) && !TextUtils.equals(g86Var.c, this.c)) {
                                    return false;
                                }
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
