package i2;
public final class v implements e2.o, e2.j {
    public final int f12596a;
    public final float f12597b;

    public v(float f7, int i10) {
        this.f12596a = i10;
        this.f12597b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f12596a) {
            case 1:
                ((m4.m1) obj).a(this.f12597b);
                return;
            default:
                ((m4.m1) obj).U(this.f12597b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.d1) obj).onVolumeChanged(this.f12597b);
    }
}
