package i2;
public final class v implements e2.m, e2.h {
    public final int f11904a;
    public final float f11905b;

    public v(float f7, int i10) {
        this.f11904a = i10;
        this.f11905b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11904a) {
            case 1:
                ((m4.g1) obj).a(this.f11905b);
                return;
            default:
                ((m4.g1) obj).U(this.f11905b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.z0) obj).onVolumeChanged(this.f11905b);
    }
}
