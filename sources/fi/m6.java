package fi;
public final class m6 implements Runnable {
    public final int f12267a;
    public final o6 f12268b;

    public m6(o6 o6Var, int i7) {
        this.f12267a = i7;
        this.f12268b = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f12267a) {
            case 0:
                this.f12268b.e();
                return;
            default:
                this.f12268b.b();
                return;
        }
    }
}
