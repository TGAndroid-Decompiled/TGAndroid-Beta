package l2;
public final class t implements h2.o, h2.j {
    public final int f18050a;
    public final float f18051b;

    public t(float f10, int i7) {
        this.f18050a = i7;
        this.f18051b = f10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f18050a) {
            case 1:
                ((p4.g1) obj).d(this.f18051b);
                return;
            default:
                ((p4.g1) obj).T(this.f18051b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((e2.a1) obj).l(this.f18051b);
    }
}
