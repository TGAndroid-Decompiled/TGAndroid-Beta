package ji;
public final class o2 implements Runnable {
    public final int f14095a;
    public final v3 f14096b;
    public final int f14097c;
    public final int d;

    public o2(v3 v3Var, int i10, int i11, int i12) {
        this.f14095a = i12;
        this.f14096b = v3Var;
        this.f14097c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f14095a) {
            case 0:
                this.f14096b.X1(this.f14097c, this.d);
                return;
            default:
                this.f14096b.f4(this.f14097c, this.d);
                return;
        }
    }
}
