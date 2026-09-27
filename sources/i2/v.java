package i2;
public final class v implements e2.m, e2.h {
    public final int f10885a;
    public final float f10886b;

    public v(float f7, int i10) {
        this.f10885a = i10;
        this.f10886b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f10885a) {
            case 1:
                ((m4.e1) obj).a(this.f10886b);
                return;
            default:
                ((m4.e1) obj).U(this.f10886b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.z0) obj).onVolumeChanged(this.f10886b);
    }
}
