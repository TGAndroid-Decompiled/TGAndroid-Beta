package defpackage;
public final class cdd extends jp2 {
    public final byte f;
    public final lp2 h;

    public cdd(lp2 lp2Var, byte b) {
        super(lp2Var, (char) 0);
        this.f = b;
        this.h = lp2Var;
    }

    @Override
    public final Object b(int i) {
        byte b = this.f;
        lp2 lp2Var = this.h;
        switch (b) {
            case 0:
                Object[] objArr = lp2Var.d;
                objArr.getClass();
                return objArr[i];
            case 1:
                return new bed(lp2Var, i);
            default:
                Object[] objArr2 = lp2Var.e;
                objArr2.getClass();
                return objArr2[i];
        }
    }
}
