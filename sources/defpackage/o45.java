package defpackage;
public final class o45 extends yo {
    public final h75 c;

    public o45(h75 h75Var) {
        this.c = h75Var;
    }

    @Override
    public final int i(int i) {
        int size = this.c.g4.e.size();
        if (size > 1 && size != 2) {
            if (size != 3 || i == 0 || i == 1) {
                return 3;
            }
            return 6;
        }
        return 6;
    }
}
