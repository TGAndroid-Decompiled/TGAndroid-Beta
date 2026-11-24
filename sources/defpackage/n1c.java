package defpackage;
public final class n1c implements bja {
    public int a;
    public boolean b;
    public final o1c c;

    public n1c(o1c o1cVar) {
        this.c = o1cVar;
    }

    @Override
    public final void L(int i, boolean z) {
        if (this.a != i || this.b != z) {
            this.a = i;
            this.b = z;
            if (i > gl.L(20.0f)) {
                o1c o1cVar = this.c;
                if (!o1cVar.n0) {
                    o1cVar.u0.r0 = false;
                    o1cVar.n0 = true;
                }
            }
        }
    }
}
