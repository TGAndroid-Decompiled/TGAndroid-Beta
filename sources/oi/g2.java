package oi;
public final class g2 implements Runnable {
    public final int f22069a;
    public final s3 f22070b;
    public final int f22071c;

    public g2(s3 s3Var, int i7, int i10) {
        this.f22069a = i10;
        this.f22070b = s3Var;
        this.f22071c = i7;
    }

    @Override
    public final void run() {
        switch (this.f22069a) {
            case 0:
                this.f22070b.g4(this.f22071c);
                return;
            case 1:
                this.f22070b.i4(this.f22071c);
                return;
            case 2:
                this.f22070b.scrollBy(0, this.f22071c);
                return;
            default:
                this.f22070b.h4(this.f22071c);
                return;
        }
    }
}
