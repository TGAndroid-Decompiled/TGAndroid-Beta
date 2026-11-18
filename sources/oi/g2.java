package oi;
public final class g2 implements Runnable {
    public final int f22072a;
    public final s3 f22073b;
    public final int f22074c;

    public g2(s3 s3Var, int i7, int i10) {
        this.f22072a = i10;
        this.f22073b = s3Var;
        this.f22074c = i7;
    }

    @Override
    public final void run() {
        switch (this.f22072a) {
            case 0:
                this.f22073b.g4(this.f22074c);
                return;
            case 1:
                this.f22073b.i4(this.f22074c);
                return;
            case 2:
                this.f22073b.scrollBy(0, this.f22074c);
                return;
            default:
                this.f22073b.h4(this.f22074c);
                return;
        }
    }
}
