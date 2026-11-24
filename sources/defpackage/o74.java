package defpackage;
public final class o74 {
    public boolean a;
    public be8 b;
    public int c;
    public boolean d;
    public byte e;

    public o74(be8 be8Var) {
        this.b = be8Var;
    }

    public final void a(int i) {
        boolean z;
        boolean z2 = this.a;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.a = z2 | z;
        this.c += i;
    }
}
