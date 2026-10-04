package i2;
public final class v implements e2.m, e2.h {
    public final int f11856a;
    public final float f11857b;

    public v(float f7, int i10) {
        this.f11856a = i10;
        this.f11857b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11856a) {
            case 1:
                ((m4.e1) obj).a(this.f11857b);
                return;
            default:
                ((m4.e1) obj).U(this.f11857b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.z0) obj).onVolumeChanged(this.f11857b);
    }
}
