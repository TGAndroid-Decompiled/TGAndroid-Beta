package ii;
public final class p2 implements Runnable {
    public final int f11556a;
    public final w3 f11557b;
    public final int f11558c;
    public final int d;

    public p2(w3 w3Var, int i10, int i11, int i12) {
        this.f11556a = i12;
        this.f11557b = w3Var;
        this.f11558c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f11556a) {
            case 0:
                this.f11557b.Y1(this.f11558c, this.d);
                return;
            default:
                this.f11557b.g4(this.f11558c, this.d);
                return;
        }
    }
}
