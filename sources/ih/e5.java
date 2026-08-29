package ih;
public final class e5 implements Runnable {
    public final int f9125a;
    public final p5 f9126b;

    public e5(p5 p5Var, int i10) {
        this.f9125a = i10;
        this.f9126b = p5Var;
    }

    @Override
    public final void run() {
        switch (this.f9125a) {
            case 0:
                b5 b5Var = this.f9126b.f9329c;
                if (!b5Var.f9050j.isEmpty()) {
                    b5Var.f9050j.clear();
                    b5Var.h();
                    return;
                }
                return;
            case 1:
                b5 b5Var2 = this.f9126b.f9329c;
                if (!b5Var2.f9051k.isEmpty()) {
                    b5Var2.f9051k.clear();
                    b5Var2.h();
                    return;
                }
                return;
            case 2:
                b5 b5Var3 = this.f9126b.f9329c;
                if (!b5Var3.f9052l.isEmpty()) {
                    b5Var3.f9052l.clear();
                    b5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f9126b.f9329c.i(a5.BY_PRICE);
                return;
            case 4:
                this.f9126b.f9329c.i(a5.BY_DATE);
                return;
            default:
                this.f9126b.f9329c.i(a5.BY_NUMBER);
                return;
        }
    }
}
