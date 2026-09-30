package i2;
public final class v implements e2.m, e2.h {
    public final int f10896a;
    public final float f10897b;

    public v(float f7, int i10) {
        this.f10896a = i10;
        this.f10897b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f10896a) {
            case 1:
                ((m4.e1) obj).a(this.f10897b);
                return;
            default:
                ((m4.e1) obj).U(this.f10897b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.z0) obj).onVolumeChanged(this.f10897b);
    }
}
