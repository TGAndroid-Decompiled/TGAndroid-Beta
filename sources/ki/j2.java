package ki;
public final class j2 implements Runnable {
    public final int f15335a;
    public final w3 f15336b;
    public final int f15337c;

    public j2(w3 w3Var, int i10, int i11) {
        this.f15335a = i11;
        this.f15336b = w3Var;
        this.f15337c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15335a) {
            case 0:
                this.f15336b.e4(this.f15337c);
                return;
            case 1:
                this.f15336b.g4(this.f15337c);
                return;
            case 2:
                this.f15336b.scrollBy(0, this.f15337c);
                return;
            default:
                this.f15336b.f4(this.f15337c);
                return;
        }
    }
}
