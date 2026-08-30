package kh;
public final class c4 implements Runnable {
    public final int f10516a;
    public final r5 f10517b;

    public c4(r5 r5Var, int i10) {
        this.f10516a = i10;
        this.f10517b = r5Var;
    }

    @Override
    public final void run() {
        switch (this.f10516a) {
            case 0:
                b5 b5Var = this.f10517b.d;
                if (!b5Var.f10490l.isEmpty()) {
                    b5Var.f10490l.clear();
                    b5Var.h();
                    return;
                }
                return;
            case 1:
                b5 b5Var2 = this.f10517b.d;
                if (!b5Var2.f10489k.isEmpty()) {
                    b5Var2.f10489k.clear();
                    b5Var2.h();
                    return;
                }
                return;
            case 2:
                b5 b5Var3 = this.f10517b.d;
                if (!b5Var3.f10488j.isEmpty()) {
                    b5Var3.f10488j.clear();
                    b5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f10517b.d.i(a5.BY_PRICE);
                return;
            case 4:
                this.f10517b.d.i(a5.BY_DATE);
                return;
            default:
                this.f10517b.d.i(a5.BY_NUMBER);
                return;
        }
    }
}
