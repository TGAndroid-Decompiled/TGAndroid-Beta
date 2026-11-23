package oi;
public final class o2 implements Runnable {
    public final int f22345a;
    public final t3 f22346b;
    public final int f22347c;
    public final int d;

    public o2(t3 t3Var, int i7, int i10, int i11) {
        this.f22345a = i11;
        this.f22346b = t3Var;
        this.f22347c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f22345a) {
            case 0:
                this.f22346b.c2(this.f22347c, this.d);
                return;
            default:
                this.f22346b.j4(this.f22347c, this.d);
                return;
        }
    }
}
