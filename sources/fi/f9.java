package fi;
public final class f9 implements r1.c {
    public final int f11990a;
    public final float f11991b;
    public final Object f11992c;

    public f9(Object obj, float f10, int i7) {
        this.f11990a = i7;
        this.f11992c = obj;
        this.f11991b = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f11990a) {
            case 0:
                va vaVar = (va) this.f11992c;
                if (!z9) {
                    vaVar.M0.setTranslationY(this.f11991b);
                    vaVar.M0.K = false;
                    vaVar.f12980o2 = null;
                    vaVar.f12983p2 = null;
                    return;
                }
                return;
            default:
                hi.b4 b4Var = (hi.b4) this.f11992c;
                b4Var.f14569w = null;
                float f12 = this.f11991b;
                if (!z9) {
                    b4Var.f14565f = f12;
                    b4Var.c();
                    return;
                }
                b4Var.h = f12;
                return;
        }
    }
}
