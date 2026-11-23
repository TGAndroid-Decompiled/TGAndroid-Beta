package l2;
public final class t implements h2.o, h2.j {
    public final int f19640a;
    public final float f19641b;

    public t(float f10, int i7) {
        this.f19640a = i7;
        this.f19641b = f10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19640a) {
            case 1:
                ((p4.h1) obj).d(this.f19641b);
                return;
            default:
                ((p4.h1) obj).U(this.f19641b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((e2.a1) obj).k(this.f19641b);
    }
}
