package ii;
public final class j2 implements Runnable {
    public final int f11456a;
    public final w3 f11457b;
    public final int f11458c;

    public j2(w3 w3Var, int i10, int i11) {
        this.f11456a = i11;
        this.f11457b = w3Var;
        this.f11458c = i10;
    }

    @Override
    public final void run() {
        switch (this.f11456a) {
            case 0:
                this.f11457b.e4(this.f11458c);
                return;
            case 1:
                this.f11457b.g4(this.f11458c);
                return;
            case 2:
                this.f11457b.scrollBy(0, this.f11458c);
                return;
            default:
                this.f11457b.f4(this.f11458c);
                return;
        }
    }
}
