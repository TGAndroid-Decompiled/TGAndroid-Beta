package defpackage;
public final class lad extends bq2 {
    public final byte f;
    public final dq2 h;

    public lad(dq2 dq2Var, byte b) {
        super(dq2Var, (char) 0);
        this.f = b;
        this.h = dq2Var;
    }

    @Override
    public final Object b(int i) {
        byte b = this.f;
        dq2 dq2Var = this.h;
        switch (b) {
            case 0:
                Object[] objArr = dq2Var.d;
                objArr.getClass();
                return objArr[i];
            case 1:
                return new kbd(dq2Var, i);
            default:
                Object[] objArr2 = dq2Var.e;
                objArr2.getClass();
                return objArr2[i];
        }
    }
}
