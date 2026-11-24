package defpackage;
public final class cx6 implements lx6 {
    public final byte a;
    public final lx6 b;

    public cx6(lx6 lx6Var, byte b) {
        this.a = b;
        this.b = lx6Var;
    }

    @Override
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        byte b = this.a;
        lx6 lx6Var = this.b;
        switch (b) {
            case 0:
                if (tv6Var == null) {
                    ox6.e(null, su6Var, i, lx6Var, new jh(su6Var, i, (byte) 14));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return ox6.e(tv6Var, su6Var, i, lx6Var, new yf(tv6Var, su6Var, i, (byte) 8));
        }
    }
}
