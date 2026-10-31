package ig;
public final class y implements Runnable {
    public final int f8504a;
    public final a0 f8505b;
    public final r0 f8506c;

    public y(a0 a0Var, r0 r0Var, int i10) {
        this.f8504a = i10;
        this.f8505b = a0Var;
        this.f8506c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f8504a) {
            case 0:
                org.telegram.messenger.i0.g3(new y(this.f8505b, this.f8506c, 1));
                return;
            default:
                a0 a0Var = this.f8505b;
                a0Var.getClass();
                a0Var.f8251i = this.f8506c.f8436a;
                return;
        }
    }
}
