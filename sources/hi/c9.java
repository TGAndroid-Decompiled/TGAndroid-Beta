package hi;
public final class c9 implements r1.c {
    public final int f14394a;
    public final float f14395b;
    public final Object f14396c;

    public c9(Object obj, float f10, int i7) {
        this.f14394a = i7;
        this.f14396c = obj;
        this.f14395b = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f14394a) {
            case 0:
                sa saVar = (sa) this.f14396c;
                if (!z10) {
                    saVar.N0.setTranslationY(this.f14395b);
                    saVar.N0.L = false;
                    saVar.f15433p2 = null;
                    saVar.f15436q2 = null;
                    return;
                }
                return;
            default:
                ki.r3 r3Var = (ki.r3) this.f14396c;
                r3Var.f18912w = null;
                float f12 = this.f14395b;
                if (!z10) {
                    r3Var.f18908f = f12;
                    r3Var.c();
                    return;
                }
                r3Var.h = f12;
                return;
        }
    }
}
