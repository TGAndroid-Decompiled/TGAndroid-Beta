package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class co0 implements pcc {
    public final byte a;
    public final lo0 b;

    public co0(lo0 lo0Var, byte b) {
        this.a = b;
        this.b = lo0Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        lo0 lo0Var = this.b;
        switch (b) {
            case 0:
                lo0Var.V = (wg1) obj;
                return;
            default:
                hl.c3(new a30(lo0Var, (TL_stories.TL_premium_boostsStatus) obj, (byte) 14));
                return;
        }
    }
}
