package g9;
public final class p extends b8.d {
    public final int f12117f;
    public final s h;

    public p(s sVar, int i3) {
        super(sVar);
        this.f12117f = i3;
        this.h = sVar;
    }

    @Override
    public final Object a(int i3) {
        switch (this.f12117f) {
            case 0:
                return this.h.k()[i3];
            case 1:
                return new r(this.h, i3);
            default:
                return this.h.l()[i3];
        }
    }
}
