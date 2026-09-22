package ii;
public final class p2 implements Runnable {
    public final int f11558a;
    public final w3 f11559b;
    public final int f11560c;
    public final int d;

    public p2(w3 w3Var, int i10, int i11, int i12) {
        this.f11558a = i12;
        this.f11559b = w3Var;
        this.f11560c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f11558a) {
            case 0:
                this.f11559b.Y1(this.f11560c, this.d);
                return;
            default:
                this.f11559b.g4(this.f11560c, this.d);
                return;
        }
    }
}
