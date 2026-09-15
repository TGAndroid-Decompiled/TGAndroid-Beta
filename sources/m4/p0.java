package m4;
public final class p0 implements e2.h {
    public final int f14640a;
    public final float f14641b;

    public p0(float f7, int i10) {
        this.f14640a = i10;
        this.f14641b = f7;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14640a) {
            case 0:
                ((k1) obj).a(this.f14641b);
                return;
            default:
                ((k1) obj).U(this.f14641b);
                return;
        }
    }
}
