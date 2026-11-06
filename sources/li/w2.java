package li;
public final class w2 implements Runnable {
    public final int f18950a;
    public final t3 f18951b;
    public final v4.l0 f18952c;

    public w2(t3 t3Var, v4.l0 l0Var, int i7) {
        this.f18950a = i7;
        this.f18951b = t3Var;
        this.f18952c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f18950a) {
            case 0:
                this.f18951b.setItemAnimator(this.f18952c);
                return;
            case 1:
                this.f18951b.setItemAnimator(this.f18952c);
                return;
            default:
                this.f18951b.setItemAnimator(this.f18952c);
                return;
        }
    }
}
