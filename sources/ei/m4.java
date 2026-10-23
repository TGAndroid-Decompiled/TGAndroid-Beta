package ei;
public final class m4 implements Runnable {
    public final int f9473a;
    public final f6 f9474b;
    public final rg.d2 f9475c;

    public m4(f6 f6Var, rg.d2 d2Var, int i10) {
        this.f9473a = i10;
        this.f9474b = f6Var;
        this.f9475c = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f9473a) {
            case 0:
                this.f9474b.B0(this.f9475c, true);
                return;
            default:
                this.f9474b.A0(this.f9475c);
                return;
        }
    }
}
