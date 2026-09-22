package ii;
public final class j2 implements Runnable {
    public final int f11455a;
    public final w3 f11456b;
    public final int f11457c;

    public j2(w3 w3Var, int i10, int i11) {
        this.f11455a = i11;
        this.f11456b = w3Var;
        this.f11457c = i10;
    }

    @Override
    public final void run() {
        switch (this.f11455a) {
            case 0:
                this.f11456b.d4(this.f11457c);
                return;
            case 1:
                this.f11456b.f4(this.f11457c);
                return;
            case 2:
                this.f11456b.scrollBy(0, this.f11457c);
                return;
            default:
                this.f11456b.e4(this.f11457c);
                return;
        }
    }
}
