package defpackage;

import org.telegram.tgnet.TLRPC;
public final class wt1 implements ef7 {
    public final byte a;
    public final Object b;
    public final Object c;

    public wt1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void a(int i) {
        c31 c31Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj;
                zu1 zu1Var = ((ju1) obj2).a;
                if (i > 0 && zu1Var.getParentActivity() != null && zu1Var.fragmentView != null) {
                    d31 b0 = d31.b0(zu1Var);
                    if (r47.J3(document)) {
                        c31Var = c31.H;
                    } else {
                        c31Var = c31.J;
                    }
                    b0.m(c31Var, i, 0, 0, zu1Var.Ba).j();
                    return;
                }
                return;
            default:
                ((int[]) obj2)[0] = i;
                ((ic2) obj).run();
                return;
        }
    }
}
