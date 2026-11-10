package li;
public final class h2 implements Runnable {
    public final int f18625a;
    public final t3 f18626b;
    public final int f18627c;

    public h2(t3 t3Var, int i7, int i10) {
        this.f18625a = i10;
        this.f18626b = t3Var;
        this.f18627c = i7;
    }

    @Override
    public final void run() {
        switch (this.f18625a) {
            case 0:
                this.f18626b.g4(this.f18627c);
                return;
            case 1:
                this.f18626b.i4(this.f18627c);
                return;
            case 2:
                this.f18626b.scrollBy(0, this.f18627c);
                return;
            default:
                this.f18626b.h4(this.f18627c);
                return;
        }
    }
}
