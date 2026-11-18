package c8;
public final class a extends a8.l {
    public final int f4474f;
    public final d h;

    public a(d dVar, int i7) {
        super(dVar);
        this.f4474f = i7;
        this.h = dVar;
    }

    @Override
    public final Object b(int i7) {
        switch (this.f4474f) {
            case 0:
                Object[] objArr = this.h.f4530c;
                objArr.getClass();
                return objArr[i7];
            case 1:
                return new c(this.h, i7);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i7];
        }
    }
}
