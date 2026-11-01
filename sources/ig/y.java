package ig;
public final class y implements Runnable {
    public final int f8505a;
    public final a0 f8506b;
    public final r0 f8507c;

    public y(a0 a0Var, r0 r0Var, int i10) {
        this.f8505a = i10;
        this.f8506b = a0Var;
        this.f8507c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f8505a) {
            case 0:
                org.telegram.messenger.i0.g3(new y(this.f8506b, this.f8507c, 1));
                return;
            default:
                a0 a0Var = this.f8506b;
                a0Var.getClass();
                a0Var.f8252i = this.f8507c.f8437a;
                return;
        }
    }
}
