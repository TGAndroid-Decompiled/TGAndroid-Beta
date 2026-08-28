package h7;
public final class i extends k {
    public final int f9949f;
    public final n h;

    public i(n nVar, int i9) {
        super(nVar);
        this.f9949f = i9;
        this.h = nVar;
    }

    @Override
    public final Object b(int i9) {
        switch (this.f9949f) {
            case 0:
                Object[] objArr = this.h.f10034c;
                objArr.getClass();
                return objArr[i9];
            case 1:
                return new l(this.h, i9);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i9];
        }
    }
}
