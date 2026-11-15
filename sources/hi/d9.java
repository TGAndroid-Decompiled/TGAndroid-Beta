package hi;
public final class d9 implements r1.c {
    public final int f14179a;
    public final float f14180b;
    public final Object f14181c;

    public d9(Object obj, float f10, int i7) {
        this.f14179a = i7;
        this.f14181c = obj;
        this.f14180b = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f14179a) {
            case 0:
                sa saVar = (sa) this.f14181c;
                if (!z10) {
                    saVar.N0.setTranslationY(this.f14180b);
                    saVar.N0.L = false;
                    saVar.f15084p2 = null;
                    saVar.f15087q2 = null;
                    return;
                }
                return;
            default:
                ki.x3 x3Var = (ki.x3) this.f14181c;
                x3Var.f18699w = null;
                float f12 = this.f14180b;
                if (!z10) {
                    x3Var.f18695f = f12;
                    x3Var.c();
                    return;
                }
                x3Var.h = f12;
                return;
        }
    }
}
