package li;
public final class h2 implements Runnable {
    public final int f18619a;
    public final t3 f18620b;
    public final int f18621c;

    public h2(t3 t3Var, int i7, int i10) {
        this.f18619a = i10;
        this.f18620b = t3Var;
        this.f18621c = i7;
    }

    @Override
    public final void run() {
        switch (this.f18619a) {
            case 0:
                this.f18620b.g4(this.f18621c);
                return;
            case 1:
                this.f18620b.i4(this.f18621c);
                return;
            case 2:
                this.f18620b.scrollBy(0, this.f18621c);
                return;
            default:
                this.f18620b.h4(this.f18621c);
                return;
        }
    }
}
