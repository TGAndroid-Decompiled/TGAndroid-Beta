package defpackage;
public final class c69 extends wm5 {
    public static final c69 n;
    public final transient wn7 e;
    public final transient int f;
    public transient vm5 h;

    static {
        ?? obj = new Object();
        obj.d(3);
        n = new c69(obj);
    }

    public c69(wn7 wn7Var) {
        this.e = wn7Var;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = wn7Var.c;
            if (i < i2) {
                gre.j(i, i2);
                j += wn7Var.b[i];
                i++;
            } else {
                this.f = gle.d(j);
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
