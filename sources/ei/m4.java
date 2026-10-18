package ei;
public final class m4 implements Runnable {
    public final int f9465a;
    public final f6 f9466b;
    public final rg.b2 f9467c;

    public m4(f6 f6Var, rg.b2 b2Var, int i10) {
        this.f9465a = i10;
        this.f9466b = f6Var;
        this.f9467c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f9465a) {
            case 0:
                this.f9466b.C0(this.f9467c, true);
                return;
            default:
                this.f9466b.B0(this.f9467c);
                return;
        }
    }
}
