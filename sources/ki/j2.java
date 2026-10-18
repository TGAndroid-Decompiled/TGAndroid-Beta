package ki;
public final class j2 implements Runnable {
    public final int f15340a;
    public final w3 f15341b;
    public final int f15342c;

    public j2(w3 w3Var, int i10, int i11) {
        this.f15340a = i11;
        this.f15341b = w3Var;
        this.f15342c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15340a) {
            case 0:
                this.f15341b.e4(this.f15342c);
                return;
            case 1:
                this.f15341b.g4(this.f15342c);
                return;
            case 2:
                this.f15341b.scrollBy(0, this.f15342c);
                return;
            default:
                this.f15341b.f4(this.f15342c);
                return;
        }
    }
}
