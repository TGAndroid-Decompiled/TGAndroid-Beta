package ki;
public final class j2 implements Runnable {
    public final int f15401a;
    public final w3 f15402b;
    public final int f15403c;

    public j2(w3 w3Var, int i10, int i11) {
        this.f15401a = i11;
        this.f15402b = w3Var;
        this.f15403c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15401a) {
            case 0:
                this.f15402b.j4(this.f15403c);
                return;
            case 1:
                this.f15402b.l4(this.f15403c);
                return;
            case 2:
                this.f15402b.scrollBy(0, this.f15403c);
                return;
            default:
                this.f15402b.k4(this.f15403c);
                return;
        }
    }
}
