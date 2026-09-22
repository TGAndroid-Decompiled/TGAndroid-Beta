package m4;
public final class o0 implements e2.h {
    public final int f14866a;
    public final float f14867b;

    public o0(float f7, int i10) {
        this.f14866a = i10;
        this.f14867b = f7;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14866a) {
            case 0:
                ((j1) obj).a(this.f14867b);
                return;
            default:
                ((j1) obj).U(this.f14867b);
                return;
        }
    }
}
