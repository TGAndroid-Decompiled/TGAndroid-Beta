package cg;
public final class b2 extends d2 {
    public final int f2319f;
    public final a2 f2320g;
    public final e2 h;

    public b2(e2 e2Var, a2 a2Var, int i10) {
        this.f2319f = i10;
        this.h = e2Var;
        this.f2320g = a2Var;
    }

    @Override
    public final void a() {
        switch (this.f2319f) {
            case 0:
                s1 s1Var = this.h.h;
                float f10 = s1Var.f2521i;
                float f11 = s1Var.f2522j;
                this.d = f10;
                this.e = f11;
                return;
            default:
                s1 s1Var2 = this.h.h;
                float f12 = s1Var2.d;
                float f13 = s1Var2.e;
                this.d = f12;
                this.e = f13;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f2319f) {
            case 0:
                s1 s1Var = this.h.h;
                s1Var.f2521i = f10;
                s1Var.f2522j = f11;
                this.d = f10;
                this.e = f11;
                this.f2320g.a();
                return;
            default:
                s1 s1Var2 = this.h.h;
                s1Var2.d = f10;
                s1Var2.e = f11;
                this.d = f10;
                this.e = f11;
                this.f2320g.a();
                return;
        }
    }
}
