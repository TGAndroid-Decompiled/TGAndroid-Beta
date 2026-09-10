package m4;
public final class p0 implements e2.h {
    public final int f13471a;
    public final float f13472b;

    public p0(float f7, int i10) {
        this.f13471a = i10;
        this.f13472b = f7;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f13471a) {
            case 0:
                ((l1) obj).a(this.f13472b);
                return;
            default:
                ((l1) obj).U(this.f13472b);
                return;
        }
    }
}
