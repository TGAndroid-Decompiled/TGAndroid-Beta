package fi;
public final class m6 implements Runnable {
    public final int f12313a;
    public final o6 f12314b;

    public m6(o6 o6Var, int i7) {
        this.f12313a = i7;
        this.f12314b = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f12313a) {
            case 0:
                this.f12314b.e();
                return;
            default:
                this.f12314b.b();
                return;
        }
    }
}
