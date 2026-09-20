package m4;
public final class o0 implements e2.h {
    public final int f14851a;
    public final float f14852b;

    public o0(float f7, int i10) {
        this.f14851a = i10;
        this.f14852b = f7;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14851a) {
            case 0:
                ((j1) obj).a(this.f14852b);
                return;
            default:
                ((j1) obj).U(this.f14852b);
                return;
        }
    }
}
