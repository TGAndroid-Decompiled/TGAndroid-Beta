package k2;
public final class t implements g2.p, g2.k {
    public final int f16734a;
    public final float f16735b;

    public t(float f10, int i3) {
        this.f16734a = i3;
        this.f16735b = f10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f16734a) {
            case 1:
                ((o4.l1) obj).b(this.f16735b);
                return;
            default:
                ((o4.l1) obj).R(this.f16735b);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        ((d2.c1) obj).s(this.f16735b);
    }
}
