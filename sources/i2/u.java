package i2;
public final class u implements e2.o, e2.j {
    public final int f11200a;
    public final float f11201b;

    public u(float f7, int i10) {
        this.f11200a = i10;
        this.f11201b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11200a) {
            case 1:
                ((m4.m1) obj).a(this.f11201b);
                return;
            default:
                ((m4.m1) obj).U(this.f11201b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.e1) obj).onVolumeChanged(this.f11201b);
    }
}
