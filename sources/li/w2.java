package li;
public final class w2 implements Runnable {
    public final int f18958a;
    public final t3 f18959b;
    public final v4.l0 f18960c;

    public w2(t3 t3Var, v4.l0 l0Var, int i7) {
        this.f18958a = i7;
        this.f18959b = t3Var;
        this.f18960c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f18958a) {
            case 0:
                this.f18959b.setItemAnimator(this.f18960c);
                return;
            case 1:
                this.f18959b.setItemAnimator(this.f18960c);
                return;
            default:
                this.f18959b.setItemAnimator(this.f18960c);
                return;
        }
    }
}
