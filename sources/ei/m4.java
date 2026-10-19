package ei;
public final class m4 implements Runnable {
    public final int f9462a;
    public final f6 f9463b;
    public final rg.c2 f9464c;

    public m4(f6 f6Var, rg.c2 c2Var, int i10) {
        this.f9462a = i10;
        this.f9463b = f6Var;
        this.f9464c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f9462a) {
            case 0:
                this.f9463b.C0(this.f9464c, true);
                return;
            default:
                this.f9463b.B0(this.f9464c);
                return;
        }
    }
}
