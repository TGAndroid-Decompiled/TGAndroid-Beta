package ii;
public final class j2 implements Runnable {
    public final int f11457a;
    public final w3 f11458b;
    public final int f11459c;

    public j2(w3 w3Var, int i10, int i11) {
        this.f11457a = i11;
        this.f11458b = w3Var;
        this.f11459c = i10;
    }

    @Override
    public final void run() {
        switch (this.f11457a) {
            case 0:
                this.f11458b.e4(this.f11459c);
                return;
            case 1:
                this.f11458b.g4(this.f11459c);
                return;
            case 2:
                this.f11458b.scrollBy(0, this.f11459c);
                return;
            default:
                this.f11458b.f4(this.f11459c);
                return;
        }
    }
}
