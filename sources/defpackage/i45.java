package defpackage;
public final class i45 implements pcc {
    public final w45 a;
    public final boolean[] b;
    public final c51 c;
    public final c51 d;
    public final a55 e;
    public final sk7 f;
    public final boolean[] g;
    public final vnb h;

    public i45(w45 w45Var, boolean[] zArr, c51 c51Var, c51 c51Var2, a55 a55Var, sk7 sk7Var, boolean[] zArr2, vnb vnbVar) {
        this.a = w45Var;
        this.b = zArr;
        this.c = c51Var;
        this.d = c51Var2;
        this.e = a55Var;
        this.f = sk7Var;
        this.g = zArr2;
        this.h = vnbVar;
    }

    @Override
    public final void a(Object obj) {
        c51 c51Var;
        Boolean bool = (Boolean) obj;
        w45 w45Var = this.a;
        if (!w45Var.m && !w45Var.n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.b;
            if (booleanValue || zArr[0]) {
                c51 c51Var2 = this.c;
                c51Var2.setEnabled(false);
                c51 c51Var3 = this.d;
                c51Var3.setEnabled(false);
                if (bool.booleanValue()) {
                    c51Var = c51Var3;
                } else {
                    c51Var = c51Var2;
                }
                c51Var.setLoading(true);
                this.e.e(w45Var, bool.booleanValue(), new m45(c51Var2, c51Var3, this.f, this.g, this.h, w45Var, zArr));
            }
        }
    }
}
