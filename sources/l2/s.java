package l2;
public final class s implements h2.o, h2.j {
    public final int f19567a;
    public final float f19568b;

    public s(float f10, int i7) {
        this.f19567a = i7;
        this.f19568b = f10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19567a) {
            case 1:
                ((p4.i1) obj).d(this.f19568b);
                return;
            default:
                ((p4.i1) obj).T(this.f19568b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((e2.a1) obj).l(this.f19568b);
    }
}
