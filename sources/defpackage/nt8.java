package defpackage;

import java.util.Locale;
public final class nt8 implements dn7, fn7 {
    public final byte a;
    public final st8 b;

    public nt8(st8 st8Var, byte b) {
        this.a = b;
        this.b = st8Var;
    }

    @Override
    public final String c(int i) {
        byte b = this.a;
        st8 st8Var = this.b;
        switch (b) {
            case 0:
                if (st8Var.P) {
                    return k96.a0("MilesShort", null, 2131748235, Integer.valueOf(i));
                }
                return k96.a0("KMetersShort", null, 2131748869, Integer.valueOf(i));
            default:
                if (st8Var.P) {
                    if (i == 1) {
                        return k96.a0("FootsShort", null, 2131750584, 250);
                    }
                    if (i > 1) {
                        i--;
                    }
                    Locale locale = Locale.US;
                    return de9.k(i, ".");
                } else if (i == 1) {
                    return k96.a0("MetersShort", null, 2131748250, 50);
                } else {
                    if (i > 1) {
                        i--;
                    }
                    return k96.a0("MetersShort", null, 2131748250, Integer.valueOf(i * 100));
                }
        }
    }

    @Override
    public final void i(hn7 hn7Var, int i) {
        st8 st8Var = this.b;
        try {
            st8Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        st8Var.c(true);
    }
}
