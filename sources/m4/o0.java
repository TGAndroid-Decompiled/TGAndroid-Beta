package m4;
public final class o0 implements e2.h {
    public final int f14815a;
    public final float f14816b;

    public o0(float f7, int i10) {
        this.f14815a = i10;
        this.f14816b = f7;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14815a) {
            case 0:
                ((j1) obj).a(this.f14816b);
                return;
            default:
                ((j1) obj).U(this.f14816b);
                return;
        }
    }
}
