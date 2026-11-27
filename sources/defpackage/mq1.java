package defpackage;

import org.telegram.tgnet.TLRPC;
public final class mq1 implements ef7 {
    public final byte a;
    public final boolean b;
    public final Object c;

    public mq1(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void a(int i) {
        c31 c31Var;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                zu1 zu1Var = ((oq1) obj).b;
                if (i > 0 && zu1Var.getParentActivity() != null) {
                    d31 b0 = d31.b0(zu1Var);
                    if (this.b) {
                        c31Var = c31.H;
                    } else {
                        c31Var = c31.J;
                    }
                    b0.m(c31Var, i, 0, 0, zu1Var.Ba).j();
                    return;
                }
                return;
            default:
                nq1 nq1Var = (nq1) obj;
                zu1 zu1Var2 = nq1Var.b.b;
                if (i >= 50) {
                    TLRPC.Chat chat = zu1Var2.e;
                    TLRPC.User user = zu1Var2.f;
                    boolean z = this.b;
                    jj.r(zu1Var2, true, chat, user, false, false, false, z, new rd1(nq1Var, z));
                    return;
                }
                zu1Var2.Ia(zu1Var2.s4, true);
                return;
        }
    }
}
