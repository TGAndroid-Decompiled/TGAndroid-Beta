package di;
public final class t4 implements Runnable {
    public final int f7827a;
    public final o6 f7828b;
    public final rg.d2 f7829c;

    public t4(o6 o6Var, rg.d2 d2Var, int i10) {
        this.f7827a = i10;
        this.f7828b = o6Var;
        this.f7829c = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f7827a) {
            case 0:
                this.f7828b.C0(this.f7829c, true);
                return;
            default:
                this.f7828b.B0(this.f7829c);
                return;
        }
    }
}
