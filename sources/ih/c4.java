package ih;
public final class c4 implements Runnable {
    public final int f9082a;
    public final r5 f9083b;

    public c4(r5 r5Var, int i10) {
        this.f9082a = i10;
        this.f9083b = r5Var;
    }

    @Override
    public final void run() {
        switch (this.f9082a) {
            case 0:
                b5 b5Var = this.f9083b.d;
                if (!b5Var.f9052l.isEmpty()) {
                    b5Var.f9052l.clear();
                    b5Var.h();
                    return;
                }
                return;
            case 1:
                b5 b5Var2 = this.f9083b.d;
                if (!b5Var2.f9051k.isEmpty()) {
                    b5Var2.f9051k.clear();
                    b5Var2.h();
                    return;
                }
                return;
            case 2:
                b5 b5Var3 = this.f9083b.d;
                if (!b5Var3.f9050j.isEmpty()) {
                    b5Var3.f9050j.clear();
                    b5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f9083b.d.i(a5.BY_PRICE);
                return;
            case 4:
                this.f9083b.d.i(a5.BY_DATE);
                return;
            default:
                this.f9083b.d.i(a5.BY_NUMBER);
                return;
        }
    }
}
