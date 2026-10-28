package li;
public final class n2 implements Runnable {
    public final int f17376a;
    public final v3 f17377b;
    public final int f17378c;
    public final int d;

    public n2(v3 v3Var, int i10, int i11, int i12) {
        this.f17376a = i12;
        this.f17377b = v3Var;
        this.f17378c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17376a) {
            case 0:
                this.f17377b.e2(this.f17378c, this.d);
                return;
            default:
                this.f17377b.m4(this.f17378c, this.d);
                return;
        }
    }
}
