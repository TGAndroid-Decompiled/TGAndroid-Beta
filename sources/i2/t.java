package i2;
public final class t implements e2.o, e2.j {
    public final int f8082a;
    public final float f8083b;

    public t(float f7, int i10) {
        this.f8082a = i10;
        this.f8083b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8082a) {
            case 1:
                ((m4.n1) obj).b(this.f8083b);
                return;
            default:
                ((m4.n1) obj).S(this.f8083b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.d1) obj).q(this.f8083b);
    }
}
