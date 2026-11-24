package defpackage;
public final class j8d extends qo2 {
    public final byte f;
    public final so2 h;

    public j8d(so2 so2Var, byte b) {
        super(so2Var, (char) 0);
        this.f = b;
        this.h = so2Var;
    }

    @Override
    public final Object b(int i) {
        byte b = this.f;
        so2 so2Var = this.h;
        switch (b) {
            case 0:
                Object[] objArr = so2Var.d;
                objArr.getClass();
                return objArr[i];
            case 1:
                return new i9d(so2Var, i);
            default:
                Object[] objArr2 = so2Var.e;
                objArr2.getClass();
                return objArr2[i];
        }
    }
}
