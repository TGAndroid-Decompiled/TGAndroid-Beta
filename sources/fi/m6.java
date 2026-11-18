package fi;
public final class m6 implements Runnable {
    public final int f12272a;
    public final o6 f12273b;

    public m6(o6 o6Var, int i7) {
        this.f12272a = i7;
        this.f12273b = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f12272a) {
            case 0:
                this.f12273b.e();
                return;
            default:
                this.f12273b.b();
                return;
        }
    }
}
