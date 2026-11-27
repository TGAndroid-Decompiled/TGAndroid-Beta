package defpackage;

import java.util.Locale;
public final class ww8 implements dq7, fq7 {
    public final byte a;
    public final bx8 b;

    public ww8(bx8 bx8Var, byte b) {
        this.a = b;
        this.b = bx8Var;
    }

    @Override
    public final String c(int i) {
        byte b = this.a;
        bx8 bx8Var = this.b;
        switch (b) {
            case 0:
                if (bx8Var.P) {
                    return ob6.a0("MilesShort", null, 2131748181, Integer.valueOf(i));
                }
                return ob6.a0("KMetersShort", null, 2131748815, Integer.valueOf(i));
            default:
                if (bx8Var.P) {
                    if (i == 1) {
                        return ob6.a0("FootsShort", null, 2131750561, 250);
                    }
                    if (i > 1) {
                        i--;
                    }
                    Locale locale = Locale.US;
                    return uh9.k(i, ".");
                } else if (i == 1) {
                    return ob6.a0("MetersShort", null, 2131748196, 50);
                } else {
                    if (i > 1) {
                        i--;
                    }
                    return ob6.a0("MetersShort", null, 2131748196, Integer.valueOf(i * 100));
                }
        }
    }

    @Override
    public final void i(hq7 hq7Var, int i) {
        bx8 bx8Var = this.b;
        try {
            bx8Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        bx8Var.c(true);
    }
}
