package i2;
public final class u implements e2.o, e2.j {
    public final int f13770a;
    public final float f13771b;

    public u(float f7, int i10) {
        this.f13770a = i10;
        this.f13771b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13770a) {
            case 1:
                ((m4.n1) obj).b(this.f13771b);
                return;
            default:
                ((m4.n1) obj).U(this.f13771b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.e1) obj).onVolumeChanged(this.f13771b);
    }
}
