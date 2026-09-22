package m4;
public final class p0 implements e2.h {
    public final int f14638a;
    public final float f14639b;

    public p0(float f7, int i10) {
        this.f14638a = i10;
        this.f14639b = f7;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14638a) {
            case 0:
                ((k1) obj).a(this.f14639b);
                return;
            default:
                ((k1) obj).U(this.f14639b);
                return;
        }
    }
}
