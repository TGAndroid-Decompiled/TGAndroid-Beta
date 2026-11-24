package defpackage;
public final class f64 {
    public boolean a;
    public yb8 b;
    public int c;
    public boolean d;
    public byte e;

    public f64(yb8 yb8Var) {
        this.b = yb8Var;
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
