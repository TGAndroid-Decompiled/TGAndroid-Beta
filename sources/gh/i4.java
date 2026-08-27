package gh;

public final class i4 implements Runnable {

    public final int f7321a;

    public final y5 f7322b;

    public i4(y5 y5Var, int i10) {
        this.f7321a = i10;
        this.f7322b = y5Var;
    }

    @Override
    public final void run() {
        switch (this.f7321a) {
            case 0:
                i5 i5Var = this.f7322b.d;
                if (!i5Var.f7332l.isEmpty()) {
                    i5Var.f7332l.clear();
                    i5Var.h();
                    break;
                }
                break;
            case 1:
                i5 i5Var2 = this.f7322b.d;
                if (!i5Var2.f7331k.isEmpty()) {
                    i5Var2.f7331k.clear();
                    i5Var2.h();
                    break;
                }
                break;
            case 2:
                i5 i5Var3 = this.f7322b.d;
                if (!i5Var3.f7330j.isEmpty()) {
                    i5Var3.f7330j.clear();
                    i5Var3.h();
                    break;
                }
                break;
            case 3:
                this.f7322b.d.i(h5.BY_PRICE);
                break;
            case 4:
                this.f7322b.d.i(h5.BY_DATE);
                break;
            default:
                this.f7322b.d.i(h5.BY_NUMBER);
                break;
        }
    }
}
