package hi;
public final class m2 implements Runnable {
    public final int f9743a;
    public final z3 f9744b;
    public final int f9745c;

    public m2(z3 z3Var, int i10, int i11) {
        this.f9743a = i11;
        this.f9744b = z3Var;
        this.f9745c = i10;
    }

    @Override
    public final void run() {
        switch (this.f9743a) {
            case 0:
                this.f9744b.c4(this.f9745c);
                return;
            case 1:
                this.f9744b.e4(this.f9745c);
                return;
            case 2:
                this.f9744b.scrollBy(0, this.f9745c);
                return;
            default:
                this.f9744b.d4(this.f9745c);
                return;
        }
    }
}
