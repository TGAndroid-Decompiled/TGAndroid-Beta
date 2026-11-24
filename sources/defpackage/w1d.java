package defpackage;

import j$.util.Objects;
import java.util.Set;
public final class w1d implements eg0 {
    public final xx4 a;
    public final go b;
    public ug5 c;
    public Set d;
    public boolean e;
    public final hy4 f;

    public w1d(hy4 hy4Var, xx4 xx4Var, go goVar) {
        Objects.requireNonNull(hy4Var);
        this.f = hy4Var;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = xx4Var;
        this.b = goVar;
    }

    @Override
    public final void a(ds2 ds2Var) {
        this.f.y.post(new rld((Object) this, (Object) ds2Var, false, (byte) 12));
    }

    public final void b(ds2 ds2Var) {
        u1d u1dVar = (u1d) this.f.s.get(this.b);
        if (u1dVar != null) {
            u1dVar.k(ds2Var);
        }
    }
}
