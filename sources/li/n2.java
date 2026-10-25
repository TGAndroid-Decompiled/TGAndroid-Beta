package li;
public final class n2 implements Runnable {
    public final int f17377a;
    public final v3 f17378b;
    public final int f17379c;
    public final int d;

    public n2(v3 v3Var, int i10, int i11, int i12) {
        this.f17377a = i12;
        this.f17378b = v3Var;
        this.f17379c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17377a) {
            case 0:
                this.f17378b.e2(this.f17379c, this.d);
                return;
            default:
                this.f17378b.m4(this.f17379c, this.d);
                return;
        }
    }
}
