package lh;
public final class c4 implements Runnable {
    public final int f12652a;
    public final r5 f12653b;

    public c4(r5 r5Var, int i10) {
        this.f12652a = i10;
        this.f12653b = r5Var;
    }

    @Override
    public final void run() {
        switch (this.f12652a) {
            case 0:
                b5 b5Var = this.f12653b.d;
                if (!b5Var.f12627l.isEmpty()) {
                    b5Var.f12627l.clear();
                    b5Var.h();
                    return;
                }
                return;
            case 1:
                b5 b5Var2 = this.f12653b.d;
                if (!b5Var2.f12626k.isEmpty()) {
                    b5Var2.f12626k.clear();
                    b5Var2.h();
                    return;
                }
                return;
            case 2:
                b5 b5Var3 = this.f12653b.d;
                if (!b5Var3.f12625j.isEmpty()) {
                    b5Var3.f12625j.clear();
                    b5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f12653b.d.i(a5.BY_PRICE);
                return;
            case 4:
                this.f12653b.d.i(a5.BY_DATE);
                return;
            default:
                this.f12653b.d.i(a5.BY_NUMBER);
                return;
        }
    }
}
