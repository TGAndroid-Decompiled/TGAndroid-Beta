package oi;
public final class f2 implements Runnable {
    public final int f21689a;
    public final q3 f21690b;
    public final int f21691c;

    public f2(q3 q3Var, int i7, int i10) {
        this.f21689a = i10;
        this.f21690b = q3Var;
        this.f21691c = i7;
    }

    @Override
    public final void run() {
        switch (this.f21689a) {
            case 0:
                this.f21690b.g4(this.f21691c);
                return;
            case 1:
                this.f21690b.i4(this.f21691c);
                return;
            case 2:
                this.f21690b.scrollBy(0, this.f21691c);
                return;
            default:
                this.f21690b.h4(this.f21691c);
                return;
        }
    }
}
