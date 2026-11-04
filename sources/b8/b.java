package b8;
public final class b extends d {
    public final int f2475f;
    public final g h;

    public b(g gVar, int i3) {
        super(gVar);
        this.f2475f = i3;
        this.h = gVar;
    }

    @Override
    public final Object b(int i3) {
        switch (this.f2475f) {
            case 0:
                Object[] objArr = this.h.f2614c;
                objArr.getClass();
                return objArr[i3];
            case 1:
                return new e(this.h, i3);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i3];
        }
    }
}
