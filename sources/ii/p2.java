package ii;
public final class p2 implements Runnable {
    public final int f11559a;
    public final w3 f11560b;
    public final int f11561c;
    public final int d;

    public p2(w3 w3Var, int i10, int i11, int i12) {
        this.f11559a = i12;
        this.f11560b = w3Var;
        this.f11561c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f11559a) {
            case 0:
                this.f11560b.Z1(this.f11561c, this.d);
                return;
            default:
                this.f11560b.h4(this.f11561c, this.d);
                return;
        }
    }
}
