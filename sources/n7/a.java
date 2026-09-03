package n7;
public final class a extends l7.k {
    public final int f14262f;
    public final d h;

    public a(d dVar, int i10) {
        super(dVar);
        this.f14262f = i10;
        this.h = dVar;
    }

    @Override
    public final Object a(int i10) {
        switch (this.f14262f) {
            case 0:
                Object[] objArr = this.h.f14305c;
                objArr.getClass();
                return objArr[i10];
            case 1:
                return new c(this.h, i10);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i10];
        }
    }
}
