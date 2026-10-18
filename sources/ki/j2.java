package ki;
public final class j2 implements Runnable {
    public final int f15342a;
    public final w3 f15343b;
    public final int f15344c;

    public j2(w3 w3Var, int i10, int i11) {
        this.f15342a = i11;
        this.f15343b = w3Var;
        this.f15344c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15342a) {
            case 0:
                this.f15343b.e4(this.f15344c);
                return;
            case 1:
                this.f15343b.g4(this.f15344c);
                return;
            case 2:
                this.f15343b.scrollBy(0, this.f15344c);
                return;
            default:
                this.f15343b.f4(this.f15344c);
                return;
        }
    }
}
