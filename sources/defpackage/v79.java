package defpackage;
public final class v79 {
    public h89 a;
    public h89 b;
    public w76 c;
    public o94[] d;
    public boolean e;
    public short f;

    public final wm4 a() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        ite.a("Must set register function", z);
        if (this.b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        ite.a("Must set unregister function", z2);
        if (this.c != null) {
            z3 = true;
        }
        ite.a("Must set holder", z3);
        u76 u76Var = this.c.b;
        ite.i(u76Var, "Key must not be null");
        return new wm4(new j4d(this, this.c, this.d, this.e, this.f), new xab(this, u76Var, (byte) 9), (byte) 22);
    }
}
