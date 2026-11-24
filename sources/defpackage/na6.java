package defpackage;
public final class na6 extends kj7 {
    public final x5d l;
    public e36 m;
    public m41 n;

    public na6(x5d x5dVar) {
        this.l = x5dVar;
        if (x5dVar.a == null) {
            x5dVar.a = this;
        } else {
            dq9.m("There is already a listener registered");
            throw null;
        }
    }

    @Override
    public final void e() {
        x5d x5dVar = this.l;
        x5dVar.b = true;
        x5dVar.d = false;
        x5dVar.c = false;
        x5dVar.i.drainPermits();
        x5dVar.c();
    }

    @Override
    public final void f() {
        this.l.b = false;
    }

    @Override
    public final void h(fq7 fq7Var) {
        super.h(fq7Var);
        this.m = null;
        this.n = null;
    }

    public final void j() {
        e36 e36Var = this.m;
        m41 m41Var = this.n;
        if (e36Var != null && m41Var != null) {
            super.h(m41Var);
            d(e36Var, m41Var);
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
