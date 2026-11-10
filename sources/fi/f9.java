package fi;
public final class f9 implements r1.c {
    public final int f11994a;
    public final float f11995b;
    public final Object f11996c;

    public f9(Object obj, float f10, int i7) {
        this.f11994a = i7;
        this.f11996c = obj;
        this.f11995b = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f11994a) {
            case 0:
                va vaVar = (va) this.f11996c;
                if (!z9) {
                    vaVar.M0.setTranslationY(this.f11995b);
                    vaVar.M0.K = false;
                    vaVar.f12982o2 = null;
                    vaVar.f12985p2 = null;
                    return;
                }
                return;
            default:
                hi.b4 b4Var = (hi.b4) this.f11996c;
                b4Var.f14571w = null;
                float f12 = this.f11995b;
                if (!z9) {
                    b4Var.f14567f = f12;
                    b4Var.c();
                    return;
                }
                b4Var.h = f12;
                return;
        }
    }
}
