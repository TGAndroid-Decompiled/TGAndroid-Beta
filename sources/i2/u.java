package i2;
public final class u implements e2.o, e2.j {
    public final int f11196a;
    public final float f11197b;

    public u(float f7, int i10) {
        this.f11196a = i10;
        this.f11197b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11196a) {
            case 1:
                ((m4.n1) obj).a(this.f11197b);
                return;
            default:
                ((m4.n1) obj).U(this.f11197b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.e1) obj).onVolumeChanged(this.f11197b);
    }
}
