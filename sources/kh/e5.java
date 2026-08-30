package kh;
public final class e5 implements Runnable {
    public final int f10563a;
    public final p5 f10564b;

    public e5(p5 p5Var, int i10) {
        this.f10563a = i10;
        this.f10564b = p5Var;
    }

    @Override
    public final void run() {
        switch (this.f10563a) {
            case 0:
                b5 b5Var = this.f10564b.f10752c;
                if (!b5Var.f10488j.isEmpty()) {
                    b5Var.f10488j.clear();
                    b5Var.h();
                    return;
                }
                return;
            case 1:
                b5 b5Var2 = this.f10564b.f10752c;
                if (!b5Var2.f10489k.isEmpty()) {
                    b5Var2.f10489k.clear();
                    b5Var2.h();
                    return;
                }
                return;
            case 2:
                b5 b5Var3 = this.f10564b.f10752c;
                if (!b5Var3.f10490l.isEmpty()) {
                    b5Var3.f10490l.clear();
                    b5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f10564b.f10752c.i(a5.BY_PRICE);
                return;
            case 4:
                this.f10564b.f10752c.i(a5.BY_DATE);
                return;
            default:
                this.f10564b.f10752c.i(a5.BY_NUMBER);
                return;
        }
    }
}
