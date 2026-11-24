package defpackage;
public final class n3c implements dla {
    public int a;
    public boolean b;
    public final o3c c;

    public n3c(o3c o3cVar) {
        this.c = o3cVar;
    }

    @Override
    public final void L(int i, boolean z) {
        if (this.a != i || this.b != z) {
            this.a = i;
            this.b = z;
            if (i > gm.L(20.0f)) {
                o3c o3cVar = this.c;
                if (!o3cVar.n0) {
                    o3cVar.u0.r0 = false;
                    o3cVar.n0 = true;
                }
            }
        }
    }
}
