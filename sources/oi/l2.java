package oi;
public final class l2 implements Runnable {
    public final int f21795a;
    public final q3 f21796b;
    public final int f21797c;
    public final int d;

    public l2(q3 q3Var, int i7, int i10, int i11) {
        this.f21795a = i11;
        this.f21796b = q3Var;
        this.f21797c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21795a) {
            case 0:
                this.f21796b.c2(this.f21797c, this.d);
                return;
            default:
                this.f21796b.j4(this.f21797c, this.d);
                return;
        }
    }
}
