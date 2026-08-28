package fh;
public final class o4 implements Runnable {
    public final int f6665a;
    public final g6 f6666b;

    public o4(g6 g6Var, int i9) {
        this.f6665a = i9;
        this.f6666b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f6665a) {
            case 0:
                p5 p5Var = this.f6666b.d;
                if (!p5Var.f6710l.isEmpty()) {
                    p5Var.f6710l.clear();
                    p5Var.h();
                    return;
                }
                return;
            case 1:
                p5 p5Var2 = this.f6666b.d;
                if (!p5Var2.f6709k.isEmpty()) {
                    p5Var2.f6709k.clear();
                    p5Var2.h();
                    return;
                }
                return;
            case 2:
                p5 p5Var3 = this.f6666b.d;
                if (!p5Var3.f6708j.isEmpty()) {
                    p5Var3.f6708j.clear();
                    p5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f6666b.d.i(o5.BY_PRICE);
                return;
            case 4:
                this.f6666b.d.i(o5.BY_DATE);
                return;
            default:
                this.f6666b.d.i(o5.BY_NUMBER);
                return;
        }
    }
}
