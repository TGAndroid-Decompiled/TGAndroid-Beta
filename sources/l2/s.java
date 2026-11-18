package l2;
public final class s implements h2.o, h2.j {
    public final int f19542a;
    public final float f19543b;

    public s(float f10, int i7) {
        this.f19542a = i7;
        this.f19543b = f10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19542a) {
            case 1:
                ((p4.i1) obj).d(this.f19543b);
                return;
            default:
                ((p4.i1) obj).T(this.f19543b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((e2.a1) obj).l(this.f19543b);
    }
}
