package li;
public final class n2 implements Runnable {
    public final int f18725a;
    public final t3 f18726b;
    public final int f18727c;
    public final int d;

    public n2(t3 t3Var, int i7, int i10, int i11) {
        this.f18725a = i11;
        this.f18726b = t3Var;
        this.f18727c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18725a) {
            case 0:
                this.f18726b.c2(this.f18727c, this.d);
                return;
            default:
                this.f18726b.j4(this.f18727c, this.d);
                return;
        }
    }
}
