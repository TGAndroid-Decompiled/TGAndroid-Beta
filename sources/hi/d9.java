package hi;
public final class d9 implements r1.c {
    public final int f14418a;
    public final float f14419b;
    public final Object f14420c;

    public d9(Object obj, float f10, int i7) {
        this.f14418a = i7;
        this.f14420c = obj;
        this.f14419b = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f14418a) {
            case 0:
                ta taVar = (ta) this.f14420c;
                if (!z10) {
                    taVar.N0.setTranslationY(this.f14419b);
                    taVar.N0.L = false;
                    taVar.f15436p2 = null;
                    taVar.f15439q2 = null;
                    return;
                }
                return;
            default:
                ki.r3 r3Var = (ki.r3) this.f14420c;
                r3Var.f18878w = null;
                float f12 = this.f14419b;
                if (!z10) {
                    r3Var.f18874f = f12;
                    r3Var.c();
                    return;
                }
                r3Var.h = f12;
                return;
        }
    }
}
