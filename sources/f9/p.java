package f9;
public final class p extends a8.d {
    public final int f10317f;
    public final s h;

    public p(s sVar, int i10) {
        super(sVar);
        this.f10317f = i10;
        this.h = sVar;
    }

    @Override
    public final Object a(int i10) {
        switch (this.f10317f) {
            case 0:
                return this.h.j()[i10];
            case 1:
                return new r(this.h, i10);
            default:
                return this.h.k()[i10];
        }
    }
}
