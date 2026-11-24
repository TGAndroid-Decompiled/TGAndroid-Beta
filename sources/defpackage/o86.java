package defpackage;
public final class o86 extends hh7 {
    public final v3d l;
    public e16 m;
    public e31 n;

    public o86(v3d v3dVar) {
        this.l = v3dVar;
        if (v3dVar.a == null) {
            v3dVar.a = this;
        } else {
            sc8.j("There is already a listener registered");
            throw null;
        }
    }

    @Override
    public final void e() {
        v3d v3dVar = this.l;
        v3dVar.b = true;
        v3dVar.d = false;
        v3dVar.c = false;
        v3dVar.i.drainPermits();
        v3dVar.c();
    }

    @Override
    public final void f() {
        this.l.b = false;
    }

    @Override
    public final void h(co7 co7Var) {
        super.h(co7Var);
        this.m = null;
        this.n = null;
    }

    public final void j() {
        e16 e16Var = this.m;
        e31 e31Var = this.n;
        if (e16Var != null && e31Var != null) {
            super.h(e31Var);
            d(e16Var, e31Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
