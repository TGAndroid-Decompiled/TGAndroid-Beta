package j7;
public final class a extends h7.k {
    public final int f13631f;
    public final d h;

    public a(d dVar, int i9) {
        super(dVar);
        this.f13631f = i9;
        this.h = dVar;
    }

    @Override
    public final Object b(int i9) {
        switch (this.f13631f) {
            case 0:
                Object[] objArr = this.h.f13677c;
                objArr.getClass();
                return objArr[i9];
            case 1:
                return new c(this.h, i9);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i9];
        }
    }
}
