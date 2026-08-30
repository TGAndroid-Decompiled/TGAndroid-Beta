package l7;
public final class i extends k {
    public final int f11485f;
    public final n h;

    public i(n nVar, int i10) {
        super(nVar);
        this.f11485f = i10;
        this.h = nVar;
    }

    @Override
    public final Object a(int i10) {
        switch (this.f11485f) {
            case 0:
                Object[] objArr = this.h.f11563c;
                objArr.getClass();
                return objArr[i10];
            case 1:
                return new l(this.h, i10);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i10];
        }
    }
}
