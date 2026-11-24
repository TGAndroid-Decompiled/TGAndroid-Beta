package defpackage;

import org.telegram.tgnet.TLRPC;
public final class lr1 implements we7 {
    public final byte a;
    public final boolean b;
    public final Object c;

    public lr1(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void a(int i) {
        b41 b41Var;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                yv1 yv1Var = ((nr1) obj).b;
                if (i > 0 && yv1Var.getParentActivity() != null) {
                    c41 b0 = c41.b0(yv1Var);
                    if (this.b) {
                        b41Var = b41.H;
                    } else {
                        b41Var = b41.J;
                    }
                    b0.m(b41Var, i, 0, 0, yv1Var.Ba).j();
                    return;
                }
                return;
            default:
                mr1 mr1Var = (mr1) obj;
                yv1 yv1Var2 = mr1Var.b.b;
                if (i >= 50) {
                    TLRPC.Chat chat = yv1Var2.e;
                    TLRPC.User user = yv1Var2.f;
                    boolean z = this.b;
                    ik.r(yv1Var2, true, chat, user, false, false, false, z, new cd1(mr1Var, z));
                    return;
                }
                yv1Var2.Ha(yv1Var2.s4, true);
                return;
        }
    }
}
