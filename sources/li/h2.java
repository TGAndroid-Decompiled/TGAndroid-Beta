package li;
public final class h2 implements Runnable {
    public final int f18622a;
    public final t3 f18623b;
    public final int f18624c;

    public h2(t3 t3Var, int i7, int i10) {
        this.f18622a = i10;
        this.f18623b = t3Var;
        this.f18624c = i7;
    }

    @Override
    public final void run() {
        switch (this.f18622a) {
            case 0:
                this.f18623b.g4(this.f18624c);
                return;
            case 1:
                this.f18623b.i4(this.f18624c);
                return;
            case 2:
                this.f18623b.scrollBy(0, this.f18624c);
                return;
            default:
                this.f18623b.h4(this.f18624c);
                return;
        }
    }
}
