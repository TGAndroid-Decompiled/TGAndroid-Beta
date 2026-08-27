package i7;

public final class i extends k {

    public final int f10658f;
    public final n h;

    public i(n nVar, int i10) {
        super(nVar);
        this.f10658f = i10;
        this.h = nVar;
    }

    @Override
    public final Object b(int i10) {
        switch (this.f10658f) {
            case 0:
                Object[] objArr = this.h.f10743c;
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
