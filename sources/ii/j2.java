package ii;
public final class j2 implements Runnable {
    public final int f11453a;
    public final w3 f11454b;
    public final int f11455c;

    public j2(w3 w3Var, int i10, int i11) {
        this.f11453a = i11;
        this.f11454b = w3Var;
        this.f11455c = i10;
    }

    @Override
    public final void run() {
        switch (this.f11453a) {
            case 0:
                this.f11454b.d4(this.f11455c);
                return;
            case 1:
                this.f11454b.f4(this.f11455c);
                return;
            case 2:
                this.f11454b.scrollBy(0, this.f11455c);
                return;
            default:
                this.f11454b.e4(this.f11455c);
                return;
        }
    }
}
