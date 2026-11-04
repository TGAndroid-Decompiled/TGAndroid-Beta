package gi;
public final class e3 implements Runnable {
    public final int f12657a;
    public final h3 f12658b;

    public e3(h3 h3Var, int i3) {
        this.f12657a = i3;
        this.f12658b = h3Var;
    }

    @Override
    public final void run() {
        switch (this.f12657a) {
            case 0:
                this.f12658b.dismiss();
                return;
            default:
                h3.I0(this.f12658b);
                return;
        }
    }
}
