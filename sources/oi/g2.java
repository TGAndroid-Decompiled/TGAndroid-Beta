package oi;
public final class g2 implements Runnable {
    public final int f22098a;
    public final s3 f22099b;
    public final int f22100c;

    public g2(s3 s3Var, int i7, int i10) {
        this.f22098a = i10;
        this.f22099b = s3Var;
        this.f22100c = i7;
    }

    @Override
    public final void run() {
        switch (this.f22098a) {
            case 0:
                this.f22099b.g4(this.f22100c);
                return;
            case 1:
                this.f22099b.i4(this.f22100c);
                return;
            case 2:
                this.f22099b.scrollBy(0, this.f22100c);
                return;
            default:
                this.f22099b.h4(this.f22100c);
                return;
        }
    }
}
