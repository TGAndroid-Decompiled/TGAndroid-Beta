package defpackage;

import org.telegram.tgnet.TLRPC;
public final class wu1 implements we7 {
    public final byte a;
    public final Object b;
    public final Object c;

    public wu1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void a(int i) {
        b41 b41Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj;
                yv1 yv1Var = ((iv1) obj2).a;
                if (i > 0 && yv1Var.getParentActivity() != null && yv1Var.fragmentView != null) {
                    c41 b0 = c41.b0(yv1Var);
                    if (k47.J3(document)) {
                        b41Var = b41.H;
                    } else {
                        b41Var = b41.J;
                    }
                    b0.m(b41Var, i, 0, 0, yv1Var.Ba).j();
                    return;
                }
                return;
            default:
                ((int[]) obj2)[0] = i;
                ((dd2) obj).run();
                return;
        }
    }
}
