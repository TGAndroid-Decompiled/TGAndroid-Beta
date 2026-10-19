package ki;
public final class j2 implements Runnable {
    public final int f15341a;
    public final w3 f15342b;
    public final int f15343c;

    public j2(w3 w3Var, int i10, int i11) {
        this.f15341a = i11;
        this.f15342b = w3Var;
        this.f15343c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15341a) {
            case 0:
                this.f15342b.e4(this.f15343c);
                return;
            case 1:
                this.f15342b.g4(this.f15343c);
                return;
            case 2:
                this.f15342b.scrollBy(0, this.f15343c);
                return;
            default:
                this.f15342b.f4(this.f15343c);
                return;
        }
    }
}
