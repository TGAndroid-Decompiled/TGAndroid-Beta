package defpackage;
public final class m65 extends yp {
    public final g95 c;

    public m65(g95 g95Var) {
        this.c = g95Var;
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
