package defpackage;
public final class b7b implements li4 {
    public final t7b a;

    public b7b(t7b t7bVar) {
        this.a = t7bVar;
    }

    @Override
    public final void setInvert(float f) {
        boolean z;
        t7b t7bVar = this.a;
        s7b s7bVar = t7bVar.n;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        gl.j3(s7bVar, z);
        s7b s7bVar2 = t7bVar.n;
        if (i > 0) {
            z2 = true;
        }
        gl.m3(s7bVar2, z2);
    }

    @Override
    public final void invalidate() {
    }
}
