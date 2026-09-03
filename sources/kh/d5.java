package kh;
public final class d5 implements Runnable {
    public final int f10653a;
    public final o5 f10654b;

    public d5(o5 o5Var, int i10) {
        this.f10653a = i10;
        this.f10654b = o5Var;
    }

    @Override
    public final void run() {
        switch (this.f10653a) {
            case 0:
                a5 a5Var = this.f10654b.f10851c;
                if (!a5Var.f10586j.isEmpty()) {
                    a5Var.f10586j.clear();
                    a5Var.h();
                    return;
                }
                return;
            case 1:
                a5 a5Var2 = this.f10654b.f10851c;
                if (!a5Var2.f10587k.isEmpty()) {
                    a5Var2.f10587k.clear();
                    a5Var2.h();
                    return;
                }
                return;
            case 2:
                a5 a5Var3 = this.f10654b.f10851c;
                if (!a5Var3.f10588l.isEmpty()) {
                    a5Var3.f10588l.clear();
                    a5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f10654b.f10851c.i(z4.BY_PRICE);
                return;
            case 4:
                this.f10654b.f10851c.i(z4.BY_DATE);
                return;
            default:
                this.f10654b.f10851c.i(z4.BY_NUMBER);
                return;
        }
    }
}
