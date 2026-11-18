package hi;
public final class f3 implements Runnable {
    public final int f14648a;
    public final i3 f14649b;

    public f3(i3 i3Var, int i7) {
        this.f14648a = i7;
        this.f14649b = i3Var;
    }

    @Override
    public final void run() {
        switch (this.f14648a) {
            case 0:
                this.f14649b.dismiss();
                return;
            default:
                i3.J0(this.f14649b);
                return;
        }
    }
}
