package defpackage;

import org.telegram.tgnet.TLRPC;
public final class kt1 implements uc7 {
    public final byte a;
    public final Object b;
    public final Object c;

    public kt1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void a(int i) {
        t21 t21Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj;
                mu1 mu1Var = ((wt1) obj2).a;
                if (i > 0 && mu1Var.getParentActivity() != null && mu1Var.fragmentView != null) {
                    u21 b0 = u21.b0(mu1Var);
                    if (k27.J3(document)) {
                        t21Var = t21.H;
                    } else {
                        t21Var = t21.J;
                    }
                    b0.m(t21Var, i, 0, 0, mu1Var.Ba).j();
                    return;
                }
                return;
            default:
                ((int[]) obj2)[0] = i;
                ((sb2) obj).run();
                return;
        }
    }
}
