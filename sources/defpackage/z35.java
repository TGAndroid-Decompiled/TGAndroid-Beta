package defpackage;
public final class z35 implements qac {
    public final s45 a;
    public final boolean[] b;
    public final b61 c;
    public final b61 d;
    public final w45 e;
    public final mk7 f;
    public final boolean[] g;
    public final ylb h;

    public z35(s45 s45Var, boolean[] zArr, b61 b61Var, b61 b61Var2, w45 w45Var, mk7 mk7Var, boolean[] zArr2, ylb ylbVar) {
        this.a = s45Var;
        this.b = zArr;
        this.c = b61Var;
        this.d = b61Var2;
        this.e = w45Var;
        this.f = mk7Var;
        this.g = zArr2;
        this.h = ylbVar;
    }

    @Override
    public final void a(Object obj) {
        b61 b61Var;
        Boolean bool = (Boolean) obj;
        s45 s45Var = this.a;
        if (!s45Var.m && !s45Var.n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.b;
            if (booleanValue || zArr[0]) {
                b61 b61Var2 = this.c;
                b61Var2.setEnabled(false);
                b61 b61Var3 = this.d;
                b61Var3.setEnabled(false);
                if (bool.booleanValue()) {
                    b61Var = b61Var3;
                } else {
                    b61Var = b61Var2;
                }
                b61Var.setLoading(true);
                this.e.e(s45Var, bool.booleanValue(), new d45(b61Var2, b61Var3, this.f, this.g, this.h, s45Var, zArr));
            }
        }
    }
}
