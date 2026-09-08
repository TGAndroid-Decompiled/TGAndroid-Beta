package m4;
public final class o0 implements e2.h {
    public final int f16045a;
    public final float f16046b;

    public o0(float f7, int i10) {
        this.f16045a = i10;
        this.f16046b = f7;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16045a) {
            case 0:
                ((j1) obj).a(this.f16046b);
                return;
            default:
                ((j1) obj).U(this.f16046b);
                return;
        }
    }
}
