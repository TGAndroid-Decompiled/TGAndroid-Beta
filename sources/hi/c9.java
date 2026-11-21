package hi;
public final class c9 implements r1.c {
    public final int f14391a;
    public final float f14392b;
    public final Object f14393c;

    public c9(Object obj, float f10, int i7) {
        this.f14391a = i7;
        this.f14393c = obj;
        this.f14392b = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f14391a) {
            case 0:
                sa saVar = (sa) this.f14393c;
                if (!z10) {
                    saVar.N0.setTranslationY(this.f14392b);
                    saVar.N0.L = false;
                    saVar.f15430p2 = null;
                    saVar.f15433q2 = null;
                    return;
                }
                return;
            default:
                ki.r3 r3Var = (ki.r3) this.f14393c;
                r3Var.f18909w = null;
                float f12 = this.f14392b;
                if (!z10) {
                    r3Var.f18905f = f12;
                    r3Var.c();
                    return;
                }
                r3Var.h = f12;
                return;
        }
    }
}
