package l2;
public final class s implements h2.o, h2.j {
    public final int f19175a;
    public final float f19176b;

    public s(float f10, int i7) {
        this.f19175a = i7;
        this.f19176b = f10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19175a) {
            case 1:
                ((p4.g1) obj).d(this.f19176b);
                return;
            default:
                ((p4.g1) obj).T(this.f19176b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((e2.a1) obj).j(this.f19176b);
    }
}
