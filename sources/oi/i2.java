package oi;
public final class i2 implements Runnable {
    public final int f22242a;
    public final t3 f22243b;
    public final int f22244c;

    public i2(t3 t3Var, int i7, int i10) {
        this.f22242a = i10;
        this.f22243b = t3Var;
        this.f22244c = i7;
    }

    @Override
    public final void run() {
        switch (this.f22242a) {
            case 0:
                this.f22243b.g4(this.f22244c);
                return;
            case 1:
                this.f22243b.i4(this.f22244c);
                return;
            case 2:
                this.f22243b.scrollBy(0, this.f22244c);
                return;
            default:
                this.f22243b.h4(this.f22244c);
                return;
        }
    }
}
