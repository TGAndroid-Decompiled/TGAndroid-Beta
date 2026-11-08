package li;
public final class n2 implements Runnable {
    public final int f18728a;
    public final t3 f18729b;
    public final int f18730c;
    public final int d;

    public n2(t3 t3Var, int i7, int i10, int i11) {
        this.f18728a = i11;
        this.f18729b = t3Var;
        this.f18730c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18728a) {
            case 0:
                this.f18729b.c2(this.f18730c, this.d);
                return;
            default:
                this.f18729b.j4(this.f18730c, this.d);
                return;
        }
    }
}
