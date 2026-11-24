package defpackage;
public final class d9b implements qk4 {
    public final v9b a;

    public d9b(v9b v9bVar) {
        this.a = v9bVar;
    }

    @Override
    public final void setInvert(float f) {
        boolean z;
        v9b v9bVar = this.a;
        u9b u9bVar = v9bVar.n;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        gm.j3(u9bVar, z);
        u9b u9bVar2 = v9bVar.n;
        if (i > 0) {
            z2 = true;
        }
        gm.m3(u9bVar2, z2);
    }

    @Override
    public final void invalidate() {
    }
}
