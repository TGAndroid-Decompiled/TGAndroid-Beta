package i2;
public final class u implements e2.o, e2.j {
    public final int f12593a;
    public final float f12594b;

    public u(float f7, int i10) {
        this.f12593a = i10;
        this.f12594b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f12593a) {
            case 1:
                ((m4.m1) obj).a(this.f12594b);
                return;
            default:
                ((m4.m1) obj).U(this.f12594b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.d1) obj).onVolumeChanged(this.f12594b);
    }
}
