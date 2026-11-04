package mi;
public final class o2 implements Runnable {
    public final int f19787a;
    public final t3 f19788b;
    public final int f19789c;
    public final int d;

    public o2(t3 t3Var, int i3, int i10, int i11) {
        this.f19787a = i11;
        this.f19788b = t3Var;
        this.f19789c = i3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19787a) {
            case 0:
                this.f19788b.c2(this.f19789c, this.d);
                return;
            default:
                this.f19788b.j4(this.f19789c, this.d);
                return;
        }
    }
}
