package defpackage;
public final class gz6 implements pz6 {
    public final byte a;
    public final pz6 b;

    public gz6(pz6 pz6Var, byte b) {
        this.a = b;
        this.b = pz6Var;
    }

    @Override
    public final Object j(yx6 yx6Var, xw6 xw6Var, int i) {
        byte b = this.a;
        pz6 pz6Var = this.b;
        switch (b) {
            case 0:
                if (yx6Var == null) {
                    sz6.e(null, xw6Var, i, pz6Var, new wg(xw6Var, i, (byte) 14));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return sz6.e(yx6Var, xw6Var, i, pz6Var, new bf(yx6Var, xw6Var, i, (byte) 9));
        }
    }
}
