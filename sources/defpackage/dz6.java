package defpackage;
public final class dz6 implements lz6 {
    public final byte a;
    public final lz6 b;

    public dz6(lz6 lz6Var, byte b) {
        this.a = b;
        this.b = lz6Var;
    }

    @Override
    public final Object t(tx6 tx6Var, sw6 sw6Var, int i) {
        byte b = this.a;
        lz6 lz6Var = this.b;
        switch (b) {
            case 0:
                if (tx6Var == null) {
                    oz6.e(null, sw6Var, i, lz6Var, new ji(sw6Var, i, (byte) 14));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return oz6.e(tx6Var, sw6Var, i, lz6Var, new yg(tx6Var, sw6Var, i, (byte) 9));
        }
    }
}
