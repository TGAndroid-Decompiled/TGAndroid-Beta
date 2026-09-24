package i2;
public final class v implements e2.m, e2.h {
    public final int f10882a;
    public final float f10883b;

    public v(float f7, int i10) {
        this.f10882a = i10;
        this.f10883b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f10882a) {
            case 1:
                ((m4.e1) obj).a(this.f10883b);
                return;
            default:
                ((m4.e1) obj).U(this.f10883b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.z0) obj).onVolumeChanged(this.f10883b);
    }
}
