package l2;
public final class s implements h2.o, h2.j {
    public final int f19536a;
    public final float f19537b;

    public s(float f10, int i7) {
        this.f19536a = i7;
        this.f19537b = f10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19536a) {
            case 1:
                ((p4.i1) obj).d(this.f19537b);
                return;
            default:
                ((p4.i1) obj).T(this.f19537b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((e2.a1) obj).l(this.f19537b);
    }
}
