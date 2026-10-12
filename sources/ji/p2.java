package ji;
public final class p2 implements Runnable {
    public final int f13461a;
    public final x3 f13462b;
    public final int f13463c;
    public final int d;

    public p2(x3 x3Var, int i10, int i11, int i12) {
        this.f13461a = i12;
        this.f13462b = x3Var;
        this.f13463c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f13461a) {
            case 0:
                this.f13462b.Z1(this.f13463c, this.d);
                return;
            default:
                this.f13462b.h4(this.f13463c, this.d);
                return;
        }
    }
}
