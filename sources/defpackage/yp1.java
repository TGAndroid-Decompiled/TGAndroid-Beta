package defpackage;

import org.telegram.tgnet.TLRPC;
public final class yp1 implements uc7 {
    public final byte a;
    public final boolean b;
    public final Object c;

    public yp1(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void a(int i) {
        t21 t21Var;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                mu1 mu1Var = ((aq1) obj).b;
                if (i > 0 && mu1Var.getParentActivity() != null) {
                    u21 b0 = u21.b0(mu1Var);
                    if (this.b) {
                        t21Var = t21.H;
                    } else {
                        t21Var = t21.J;
                    }
                    b0.m(t21Var, i, 0, 0, mu1Var.Ba).j();
                    return;
                }
                return;
            default:
                zp1 zp1Var = (zp1) obj;
                mu1 mu1Var2 = zp1Var.b.b;
                if (i >= 50) {
                    TLRPC.Chat chat = mu1Var2.e;
                    TLRPC.User user = mu1Var2.f;
                    boolean z = this.b;
                    ij.r(mu1Var2, true, chat, user, false, false, false, z, new rh1(zp1Var, z));
                    return;
                }
                mu1Var2.xa(mu1Var2.s4, true);
                return;
        }
    }
}
