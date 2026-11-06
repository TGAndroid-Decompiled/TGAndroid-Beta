package a8;
public final class j extends l {
    public final int f490f;
    public final o h;

    public j(o oVar, int i7) {
        super(oVar);
        this.f490f = i7;
        this.h = oVar;
    }

    @Override
    public final Object b(int i7) {
        switch (this.f490f) {
            case 0:
                Object[] objArr = this.h.f550c;
                objArr.getClass();
                return objArr[i7];
            case 1:
                return new m(this.h, i7);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i7];
        }
    }
}
