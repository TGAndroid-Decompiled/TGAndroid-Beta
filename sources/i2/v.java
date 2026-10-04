package i2;
public final class v implements e2.m, e2.h {
    public final int f11855a;
    public final float f11856b;

    public v(float f7, int i10) {
        this.f11855a = i10;
        this.f11856b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11855a) {
            case 1:
                ((m4.e1) obj).a(this.f11856b);
                return;
            default:
                ((m4.e1) obj).U(this.f11856b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.z0) obj).onVolumeChanged(this.f11856b);
    }
}
