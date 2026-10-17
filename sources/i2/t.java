package i2;
public final class t implements e2.o, e2.j {
    public final int f12592a;
    public final float f12593b;

    public t(float f7, int i10) {
        this.f12592a = i10;
        this.f12593b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f12592a) {
            case 1:
                ((m4.m1) obj).a(this.f12593b);
                return;
            default:
                ((m4.m1) obj).U(this.f12593b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.d1) obj).onVolumeChanged(this.f12593b);
    }
}
