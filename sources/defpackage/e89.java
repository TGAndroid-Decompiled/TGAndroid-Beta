package defpackage;
public final class e89 extends wo5 {
    public static final e89 n;
    public final transient zp7 e;
    public final transient int f;
    public transient vo5 h;

    static {
        ?? obj = new Object();
        obj.d(3);
        n = new e89(obj);
    }

    public e89(zp7 zp7Var) {
        this.e = zp7Var;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = zp7Var.c;
            if (i < i2) {
                jte.j(i, i2);
                j += zp7Var.b[i];
                i++;
            } else {
                this.f = ine.d(j);
                return;
            }
        }
    }

    @Override
    public final boolean m() {
        throw null;
    }

    @Override
    public final int size() {
        return this.f;
    }
}
