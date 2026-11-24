package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class cp0 implements qac {
    public final byte a;
    public final lp0 b;

    public cp0(lp0 lp0Var, byte b) {
        this.a = b;
        this.b = lp0Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        lp0 lp0Var = this.b;
        switch (b) {
            case 0:
                lp0Var.V = (vh1) obj;
                return;
            default:
                gm.c3(new x30(lp0Var, (TL_stories.TL_premium_boostsStatus) obj, (byte) 15));
                return;
        }
    }
}
