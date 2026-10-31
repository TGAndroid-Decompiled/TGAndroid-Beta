package i2;
public final class t implements e2.o, e2.j {
    public final int f8081a;
    public final float f8082b;

    public t(float f7, int i10) {
        this.f8081a = i10;
        this.f8082b = f7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8081a) {
            case 1:
                ((m4.n1) obj).b(this.f8082b);
                return;
            default:
                ((m4.n1) obj).S(this.f8082b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((b2.d1) obj).q(this.f8082b);
    }
}
