package oi;
public final class i2 implements Runnable {
    public final int f22171a;
    public final t3 f22172b;
    public final int f22173c;

    public i2(t3 t3Var, int i7, int i10) {
        this.f22171a = i10;
        this.f22172b = t3Var;
        this.f22173c = i7;
    }

    @Override
    public final void run() {
        switch (this.f22171a) {
            case 0:
                this.f22172b.g4(this.f22173c);
                return;
            case 1:
                this.f22172b.i4(this.f22173c);
                return;
            case 2:
                this.f22172b.scrollBy(0, this.f22173c);
                return;
            default:
                this.f22172b.h4(this.f22173c);
                return;
        }
    }
}
