package kh;
public final class b4 implements Runnable {
    public final int f10614a;
    public final q5 f10615b;

    public b4(q5 q5Var, int i10) {
        this.f10614a = i10;
        this.f10615b = q5Var;
    }

    @Override
    public final void run() {
        switch (this.f10614a) {
            case 0:
                a5 a5Var = this.f10615b.d;
                if (!a5Var.f10588l.isEmpty()) {
                    a5Var.f10588l.clear();
                    a5Var.h();
                    return;
                }
                return;
            case 1:
                a5 a5Var2 = this.f10615b.d;
                if (!a5Var2.f10587k.isEmpty()) {
                    a5Var2.f10587k.clear();
                    a5Var2.h();
                    return;
                }
                return;
            case 2:
                a5 a5Var3 = this.f10615b.d;
                if (!a5Var3.f10586j.isEmpty()) {
                    a5Var3.f10586j.clear();
                    a5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f10615b.d.i(z4.BY_PRICE);
                return;
            case 4:
                this.f10615b.d.i(z4.BY_DATE);
                return;
            default:
                this.f10615b.d.i(z4.BY_NUMBER);
                return;
        }
    }
}
