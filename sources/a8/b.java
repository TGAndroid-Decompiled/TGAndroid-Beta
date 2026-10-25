package a8;
public final class b extends d {
    public final int f365f;
    public final g h;

    public b(g gVar, int i10) {
        super(gVar);
        this.f365f = i10;
        this.h = gVar;
    }

    @Override
    public final Object b(int i10) {
        switch (this.f365f) {
            case 0:
                Object[] objArr = this.h.f471c;
                objArr.getClass();
                return objArr[i10];
            case 1:
                return new e(this.h, i10);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i10];
        }
    }
}
