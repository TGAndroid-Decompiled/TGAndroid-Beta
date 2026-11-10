package h9;
public final class p extends a8.l {
    public final int f14364f;
    public final s h;

    public p(s sVar, int i7) {
        super(sVar);
        this.f14364f = i7;
        this.h = sVar;
    }

    @Override
    public final Object a(int i7) {
        switch (this.f14364f) {
            case 0:
                return this.h.k()[i7];
            case 1:
                return new r(this.h, i7);
            default:
                return this.h.l()[i7];
        }
    }
}
