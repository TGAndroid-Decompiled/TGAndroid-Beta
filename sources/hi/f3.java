package hi;
public final class f3 implements Runnable {
    public final int f14651a;
    public final i3 f14652b;

    public f3(i3 i3Var, int i7) {
        this.f14651a = i7;
        this.f14652b = i3Var;
    }

    @Override
    public final void run() {
        switch (this.f14651a) {
            case 0:
                this.f14652b.dismiss();
                return;
            default:
                i3.J0(this.f14652b);
                return;
        }
    }
}
