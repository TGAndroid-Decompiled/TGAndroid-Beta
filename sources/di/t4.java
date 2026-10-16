package di;
public final class t4 implements Runnable {
    public final int f7830a;
    public final o6 f7831b;
    public final rg.d2 f7832c;

    public t4(o6 o6Var, rg.d2 d2Var, int i10) {
        this.f7830a = i10;
        this.f7831b = o6Var;
        this.f7832c = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f7830a) {
            case 0:
                this.f7831b.C0(this.f7832c, true);
                return;
            default:
                this.f7831b.B0(this.f7832c);
                return;
        }
    }
}
