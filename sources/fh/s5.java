package fh;
public final class s5 implements Runnable {
    public final int f6755a;
    public final e6 f6756b;

    public s5(e6 e6Var, int i9) {
        this.f6755a = i9;
        this.f6756b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f6755a) {
            case 0:
                p5 p5Var = this.f6756b.f6430c;
                if (!p5Var.f6708j.isEmpty()) {
                    p5Var.f6708j.clear();
                    p5Var.h();
                    return;
                }
                return;
            case 1:
                p5 p5Var2 = this.f6756b.f6430c;
                if (!p5Var2.f6709k.isEmpty()) {
                    p5Var2.f6709k.clear();
                    p5Var2.h();
                    return;
                }
                return;
            case 2:
                p5 p5Var3 = this.f6756b.f6430c;
                if (!p5Var3.f6710l.isEmpty()) {
                    p5Var3.f6710l.clear();
                    p5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f6756b.f6430c.i(o5.BY_PRICE);
                return;
            case 4:
                this.f6756b.f6430c.i(o5.BY_DATE);
                return;
            default:
                this.f6756b.f6430c.i(o5.BY_NUMBER);
                return;
        }
    }
}
