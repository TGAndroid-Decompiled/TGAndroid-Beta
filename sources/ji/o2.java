package ji;
public final class o2 implements Runnable {
    public final int f14121a;
    public final v3 f14122b;
    public final int f14123c;
    public final int d;

    public o2(v3 v3Var, int i10, int i11, int i12) {
        this.f14121a = i12;
        this.f14122b = v3Var;
        this.f14123c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f14121a) {
            case 0:
                this.f14122b.X1(this.f14123c, this.d);
                return;
            default:
                this.f14122b.f4(this.f14123c, this.d);
                return;
        }
    }
}
