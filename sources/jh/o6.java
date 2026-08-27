package jh;

public final class o6 implements Runnable {

    public final int f13752a;

    public final r6 f13753b;

    public o6(r6 r6Var, int i10) {
        this.f13752a = i10;
        this.f13753b = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f13752a) {
            case 0:
                this.f13753b.e();
                break;
            default:
                this.f13753b.b();
                break;
        }
    }
}
