package defpackage;

import j$.util.Objects;
import java.util.Set;
public final class y3d implements fh0 {
    public final zz4 a;
    public final gp b;
    public ti5 c;
    public Set d;
    public boolean e;
    public final i05 f;

    public y3d(i05 i05Var, zz4 zz4Var, gp gpVar) {
        Objects.requireNonNull(i05Var);
        this.f = i05Var;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = zz4Var;
        this.b = gpVar;
    }

    @Override
    public final void a(ot2 ot2Var) {
        this.f.y.post(new tnd((Object) this, (Object) ot2Var, false, (byte) 12));
    }

    public final void b(ot2 ot2Var) {
        w3d w3dVar = (w3d) this.f.s.get(this.b);
        if (w3dVar != null) {
            w3dVar.k(ot2Var);
        }
    }
}
