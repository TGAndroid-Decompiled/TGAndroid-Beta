package fi;
public final class m6 implements Runnable {
    public final int f12310a;
    public final o6 f12311b;

    public m6(o6 o6Var, int i7) {
        this.f12310a = i7;
        this.f12311b = o6Var;
    }

    @Override
    public final void run() {
        switch (this.f12310a) {
            case 0:
                this.f12311b.e();
                return;
            default:
                this.f12311b.b();
                return;
        }
    }
}
