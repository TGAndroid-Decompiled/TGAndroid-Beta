package fi;
public final class p6 implements Runnable {
    public final int f12177a;
    public final r6 f12178b;

    public p6(r6 r6Var, int i7) {
        this.f12177a = i7;
        this.f12178b = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f12177a) {
            case 0:
                this.f12178b.e();
                return;
            default:
                this.f12178b.b();
                return;
        }
    }
}
