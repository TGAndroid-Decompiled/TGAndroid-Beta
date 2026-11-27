package defpackage;
public final class g99 {
    public s99 a;
    public s99 b;
    public a86 c;
    public a94[] d;
    public boolean e;
    public short f;

    public final um4 a() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        xve.a("Must set register function", z);
        if (this.b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        xve.a("Must set unregister function", z2);
        if (this.c == null) {
            z3 = false;
        }
        xve.a("Must set holder", z3);
        y76 y76Var = this.c.b;
        xve.i(y76Var, "Key must not be null");
        return new um4(new y6d(this, this.c, this.d, this.e, this.f), new k7b(this, y76Var, false, (byte) 10), (byte) 23);
    }
}
