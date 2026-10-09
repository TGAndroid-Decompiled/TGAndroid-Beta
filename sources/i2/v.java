package i2;
public final class v implements e2.m, e2.h {
    public final int f11906a;
    public final float f11907b;

    public v(float f7, int i10) {
        this.f11906a = i10;
        this.f11907b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11906a) {
            case 1:
                ((m4.f1) obj).a(this.f11907b);
                return;
            default:
                ((m4.f1) obj).U(this.f11907b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.z0) obj).onVolumeChanged(this.f11907b);
    }
}
