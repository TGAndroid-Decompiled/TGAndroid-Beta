package gh;

public final class l5 implements Runnable {

    public final int f7416a;

    public final w5 f7417b;

    public l5(w5 w5Var, int i10) {
        this.f7416a = i10;
        this.f7417b = w5Var;
    }

    @Override
    public final void run() {
        switch (this.f7416a) {
            case 0:
                i5 i5Var = this.f7417b.f7607c;
                if (!i5Var.f7330j.isEmpty()) {
                    i5Var.f7330j.clear();
                    i5Var.h();
                    break;
                }
                break;
            case 1:
                i5 i5Var2 = this.f7417b.f7607c;
                if (!i5Var2.f7331k.isEmpty()) {
                    i5Var2.f7331k.clear();
                    i5Var2.h();
                    break;
                }
                break;
            case 2:
                i5 i5Var3 = this.f7417b.f7607c;
                if (!i5Var3.f7332l.isEmpty()) {
                    i5Var3.f7332l.clear();
                    i5Var3.h();
                    break;
                }
                break;
            case 3:
                this.f7417b.f7607c.i(h5.BY_PRICE);
                break;
            case 4:
                this.f7417b.f7607c.i(h5.BY_DATE);
                break;
            default:
                this.f7417b.f7607c.i(h5.BY_NUMBER);
                break;
        }
    }
}
