package lh;
public final class e5 implements Runnable {
    public final int f12698a;
    public final p5 f12699b;

    public e5(p5 p5Var, int i10) {
        this.f12698a = i10;
        this.f12699b = p5Var;
    }

    @Override
    public final void run() {
        switch (this.f12698a) {
            case 0:
                b5 b5Var = this.f12699b.f12898c;
                if (!b5Var.f12627j.isEmpty()) {
                    b5Var.f12627j.clear();
                    b5Var.h();
                    return;
                }
                return;
            case 1:
                b5 b5Var2 = this.f12699b.f12898c;
                if (!b5Var2.f12628k.isEmpty()) {
                    b5Var2.f12628k.clear();
                    b5Var2.h();
                    return;
                }
                return;
            case 2:
                b5 b5Var3 = this.f12699b.f12898c;
                if (!b5Var3.f12629l.isEmpty()) {
                    b5Var3.f12629l.clear();
                    b5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f12699b.f12898c.i(a5.BY_PRICE);
                return;
            case 4:
                this.f12699b.f12898c.i(a5.BY_DATE);
                return;
            default:
                this.f12699b.f12898c.i(a5.BY_NUMBER);
                return;
        }
    }
}
