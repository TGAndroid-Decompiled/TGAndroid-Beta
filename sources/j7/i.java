package j7;
public final class i extends k {
    public final int f11030f;
    public final n h;

    public i(n nVar, int i10) {
        super(nVar);
        this.f11030f = i10;
        this.h = nVar;
    }

    @Override
    public final Object b(int i10) {
        switch (this.f11030f) {
            case 0:
                Object[] objArr = this.h.f11114c;
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
