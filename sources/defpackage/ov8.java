package defpackage;

import java.util.Locale;
public final class ov8 implements hp7, jp7 {
    public final byte a;
    public final tv8 b;

    public ov8(tv8 tv8Var, byte b) {
        this.a = b;
        this.b = tv8Var;
    }

    @Override
    public final String c(int i) {
        byte b = this.a;
        tv8 tv8Var = this.b;
        switch (b) {
            case 0:
                if (tv8Var.P) {
                    return jb6.a0("MilesShort", null, 2131748184, Integer.valueOf(i));
                }
                return jb6.a0("KMetersShort", null, 2131748818, Integer.valueOf(i));
            default:
                if (tv8Var.P) {
                    if (i == 1) {
                        return jb6.a0("FootsShort", null, 2131750533, 250);
                    }
                    if (i > 1) {
                        i--;
                    }
                    Locale locale = Locale.US;
                    return hg9.j(i, ".");
                } else if (i == 1) {
                    return jb6.a0("MetersShort", null, 2131748199, 50);
                } else {
                    if (i > 1) {
                        i--;
                    }
                    return jb6.a0("MetersShort", null, 2131748199, Integer.valueOf(i * 100));
                }
        }
    }

    @Override
    public final void g(lp7 lp7Var, int i) {
        tv8 tv8Var = this.b;
        try {
            tv8Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        tv8Var.c(true);
    }
}
