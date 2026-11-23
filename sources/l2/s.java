package l2;
public final class s implements h2.o, h2.j {
    public final int f19570a;
    public final float f19571b;

    public s(float f10, int i7) {
        this.f19570a = i7;
        this.f19571b = f10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19570a) {
            case 1:
                ((p4.i1) obj).d(this.f19571b);
                return;
            default:
                ((p4.i1) obj).T(this.f19571b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((e2.a1) obj).l(this.f19571b);
    }
}
