package defpackage;
public final class q65 extends zo {
    public final j95 c;

    public q65(j95 j95Var) {
        this.c = j95Var;
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
