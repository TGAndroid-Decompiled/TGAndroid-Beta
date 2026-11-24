package defpackage;
public final class t59 {
    public f69 a;
    public f69 b;
    public w56 c;
    public f84[] d;
    public boolean e;
    public short f;

    public final wk4 a() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        fre.a("Must set register function", z);
        if (this.b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        fre.a("Must set unregister function", z2);
        if (this.c != null) {
            z3 = true;
        }
        fre.a("Must set holder", z3);
        u56 u56Var = this.c.b;
        fre.i(u56Var, "Key must not be null");
        return new wk4(new h2d(this, this.c, this.d, this.e, this.f), new v8b(this, u56Var, (byte) 9), (byte) 22);
    }
}
