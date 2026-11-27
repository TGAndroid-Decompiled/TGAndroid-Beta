package defpackage;
public final class z64 {
    public boolean a;
    public nf8 b;
    public int c;
    public boolean d;
    public byte e;

    public z64(nf8 nf8Var) {
        this.b = nf8Var;
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
