package i2;
public final class v implements e2.m, e2.h {
    public final int f11905a;
    public final float f11906b;

    public v(float f7, int i10) {
        this.f11905a = i10;
        this.f11906b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11905a) {
            case 1:
                ((m4.g1) obj).a(this.f11906b);
                return;
            default:
                ((m4.g1) obj).U(this.f11906b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.z0) obj).onVolumeChanged(this.f11906b);
    }
}
