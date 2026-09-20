package ii;
public final class p2 implements Runnable {
    public final int f11560a;
    public final w3 f11561b;
    public final int f11562c;
    public final int d;

    public p2(w3 w3Var, int i10, int i11, int i12) {
        this.f11560a = i12;
        this.f11561b = w3Var;
        this.f11562c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f11560a) {
            case 0:
                this.f11561b.Z1(this.f11562c, this.d);
                return;
            default:
                this.f11561b.h4(this.f11562c, this.d);
                return;
        }
    }
}
