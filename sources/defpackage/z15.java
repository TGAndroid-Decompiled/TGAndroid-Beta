package defpackage;
public final class z15 implements p8c {
    public final s25 a;
    public final boolean[] b;
    public final u41 c;
    public final u41 d;
    public final w25 e;
    public final ki7 f;
    public final boolean[] g;
    public final wjb h;

    public z15(s25 s25Var, boolean[] zArr, u41 u41Var, u41 u41Var2, w25 w25Var, ki7 ki7Var, boolean[] zArr2, wjb wjbVar) {
        this.a = s25Var;
        this.b = zArr;
        this.c = u41Var;
        this.d = u41Var2;
        this.e = w25Var;
        this.f = ki7Var;
        this.g = zArr2;
        this.h = wjbVar;
    }

    @Override
    public final void a(Object obj) {
        u41 u41Var;
        Boolean bool = (Boolean) obj;
        s25 s25Var = this.a;
        if (!s25Var.m && !s25Var.n) {
            boolean booleanValue = bool.booleanValue();
            boolean[] zArr = this.b;
            if (booleanValue || zArr[0]) {
                u41 u41Var2 = this.c;
                u41Var2.setEnabled(false);
                u41 u41Var3 = this.d;
                u41Var3.setEnabled(false);
                if (bool.booleanValue()) {
                    u41Var = u41Var3;
                } else {
                    u41Var = u41Var2;
                }
                u41Var.setLoading(true);
                this.e.e(s25Var, bool.booleanValue(), new d25(u41Var2, u41Var3, this.f, this.g, this.h, s25Var, zArr));
            }
        }
    }
}
