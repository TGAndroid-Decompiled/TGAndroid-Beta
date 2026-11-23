package oi;
public final class o2 implements Runnable {
    public final int f22281a;
    public final t3 f22282b;
    public final int f22283c;
    public final int d;

    public o2(t3 t3Var, int i7, int i10, int i11) {
        this.f22281a = i11;
        this.f22282b = t3Var;
        this.f22283c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f22281a) {
            case 0:
                this.f22282b.c2(this.f22283c, this.d);
                return;
            default:
                this.f22282b.j4(this.f22283c, this.d);
                return;
        }
    }
}
