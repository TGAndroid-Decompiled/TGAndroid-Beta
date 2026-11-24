package defpackage;
public final class z22 implements ht3 {
    public final byte a;
    public final float b;
    public final Object c;

    public z22(Object obj, float f, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    @Override
    public final void a(zna znaVar, boolean z, float f, float f2) {
        byte b = this.a;
        float f3 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                d32 d32Var = (d32) obj;
                d32Var.w = null;
                if (!z) {
                    d32Var.f = f3;
                    d32Var.c();
                    return;
                }
                d32Var.h = f3;
                return;
            case 1:
                op9 op9Var = (op9) obj;
                pp9 pp9Var = op9Var.P;
                if (pp9Var.l0 == znaVar) {
                    pp9Var.l0 = null;
                    if (!z) {
                        op9Var.k(f3);
                        return;
                    }
                    return;
                }
                return;
            default:
                v9b v9bVar = (v9b) obj;
                if (!z) {
                    v9bVar.N0.setTranslationY(f3);
                    v9bVar.N0.L = false;
                    v9bVar.p2 = null;
                    v9bVar.q2 = null;
                    return;
                }
                return;
        }
    }
}
