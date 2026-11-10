package li;
public final class n2 implements Runnable {
    public final int f18731a;
    public final t3 f18732b;
    public final int f18733c;
    public final int d;

    public n2(t3 t3Var, int i7, int i10, int i11) {
        this.f18731a = i11;
        this.f18732b = t3Var;
        this.f18733c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18731a) {
            case 0:
                this.f18732b.c2(this.f18733c, this.d);
                return;
            default:
                this.f18732b.j4(this.f18733c, this.d);
                return;
        }
    }
}
