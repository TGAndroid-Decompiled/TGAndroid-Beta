package oi;
public final class o2 implements Runnable {
    public final int f22278a;
    public final t3 f22279b;
    public final int f22280c;
    public final int d;

    public o2(t3 t3Var, int i7, int i10, int i11) {
        this.f22278a = i11;
        this.f22279b = t3Var;
        this.f22280c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f22278a) {
            case 0:
                this.f22279b.c2(this.f22280c, this.d);
                return;
            default:
                this.f22279b.j4(this.f22280c, this.d);
                return;
        }
    }
}
