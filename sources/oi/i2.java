package oi;
public final class i2 implements Runnable {
    public final int f22174a;
    public final t3 f22175b;
    public final int f22176c;

    public i2(t3 t3Var, int i7, int i10) {
        this.f22174a = i10;
        this.f22175b = t3Var;
        this.f22176c = i7;
    }

    @Override
    public final void run() {
        switch (this.f22174a) {
            case 0:
                this.f22175b.g4(this.f22176c);
                return;
            case 1:
                this.f22175b.i4(this.f22176c);
                return;
            case 2:
                this.f22175b.scrollBy(0, this.f22176c);
                return;
            default:
                this.f22175b.h4(this.f22176c);
                return;
        }
    }
}
