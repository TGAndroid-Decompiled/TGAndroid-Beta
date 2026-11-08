package l2;
public final class t implements h2.o, h2.j {
    public final int f18049a;
    public final float f18050b;

    public t(float f10, int i7) {
        this.f18049a = i7;
        this.f18050b = f10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f18049a) {
            case 1:
                ((p4.g1) obj).d(this.f18050b);
                return;
            default:
                ((p4.g1) obj).T(this.f18050b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((e2.a1) obj).l(this.f18050b);
    }
}
