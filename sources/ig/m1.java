package ig;
public final class m1 extends o1 {
    public final int f8365f;
    public final l1 f8366g;
    public final p1 h;

    public m1(p1 p1Var, l1 l1Var, int i10) {
        this.f8365f = i10;
        this.h = p1Var;
        this.f8366g = l1Var;
    }

    @Override
    public final void a() {
        switch (this.f8365f) {
            case 0:
                f1 f1Var = this.h.h;
                float f7 = f1Var.f8305i;
                float f10 = f1Var.f8306j;
                this.d = f7;
                this.e = f10;
                return;
            default:
                f1 f1Var2 = this.h.h;
                float f11 = f1Var2.d;
                float f12 = f1Var2.e;
                this.d = f11;
                this.e = f12;
                return;
        }
    }

    @Override
    public final void b(float f7, float f10) {
        switch (this.f8365f) {
            case 0:
                f1 f1Var = this.h.h;
                f1Var.f8305i = f7;
                f1Var.f8306j = f10;
                this.d = f7;
                this.e = f10;
                this.f8366g.a();
                return;
            default:
                f1 f1Var2 = this.h.h;
                f1Var2.d = f7;
                f1Var2.e = f10;
                this.d = f7;
                this.e = f10;
                this.f8366g.a();
                return;
        }
    }
}
