package m4;
public final class p0 implements e2.h {
    public final int f14650a;
    public final float f14651b;

    public p0(float f7, int i10) {
        this.f14650a = i10;
        this.f14651b = f7;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14650a) {
            case 0:
                ((k1) obj).a(this.f14651b);
                return;
            default:
                ((k1) obj).U(this.f14651b);
                return;
        }
    }
}
