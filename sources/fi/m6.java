package fi;
public final class m6 implements Runnable {
    public final int f12275a;
    public final o6 f12276b;

    public m6(o6 o6Var, int i7) {
        this.f12275a = i7;
        this.f12276b = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f12275a) {
            case 0:
                this.f12276b.e();
                return;
            default:
                this.f12276b.b();
                return;
        }
    }
}
