package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class te2 implements qac {
    public final byte a;
    public final if2 b;

    public te2(if2 if2Var, byte b) {
        this.a = b;
        this.b = if2Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        if2 if2Var = this.b;
        switch (b) {
            case 0:
                if2Var.Y1 = (TL_stories.TL_premium_boostsStatus) obj;
                if2Var.X1 = true;
                if2Var.U0(true);
                if2Var.W1 = false;
                return;
            default:
                vh1 vh1Var = (vh1) obj;
                if (if2Var.getContext() != null) {
                    yv1 yv1Var = if2Var.u1;
                    i46 i46Var = new i46(22, if2Var.a, if2Var.J0, if2Var.getContext(), yv1Var);
                    i46Var.r1(vh1Var);
                    i46Var.q1(if2Var.Y1, true);
                    i46Var.s1(if2Var.u1.a());
                    i46Var.L2 = new re2(if2Var, (byte) 2);
                    i46Var.show();
                    return;
                }
                return;
        }
    }
}
