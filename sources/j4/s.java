package j4;

import android.util.Pair;
import h3.s2;
import java.util.HashMap;

public final class s extends l1 {

    public final int f12660l;

    public final HashMap f12661m;

    public final HashMap f12662n;

    public s(a aVar) {
        super(new w(aVar, false));
        this.f12660l = Integer.MAX_VALUE;
        this.f12661m = new HashMap();
        this.f12662n = new HashMap();
    }

    @Override
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        int i10 = this.f12660l;
        a aVar = this.f12614k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.b(c0Var, rVar, j10);
        }
        Object obj = c0Var.f12503a;
        int i11 = h3.a.d;
        c0 c0VarB = c0Var.b(((Pair) obj).second);
        this.f12661m.put(c0VarB, c0Var);
        z zVarB = aVar.b(c0VarB, rVar, j10);
        this.f12662n.put(zVarB, c0VarB);
        return zVarB;
    }

    @Override
    public final s2 g() {
        w wVar = (w) this.f12614k;
        int i10 = this.f12660l;
        return i10 != Integer.MAX_VALUE ? new r(wVar.f12698o, i10) : new q(wVar.f12698o, 0);
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void n(z zVar) {
        this.f12614k.n(zVar);
        c0 c0Var = (c0) this.f12662n.remove(zVar);
        if (c0Var != null) {
            this.f12661m.remove(c0Var);
        }
    }

    @Override
    public final c0 x(c0 c0Var) {
        return this.f12660l != Integer.MAX_VALUE ? (c0) this.f12661m.get(c0Var) : c0Var;
    }

    @Override
    public final void y(s2 s2Var) {
        int i10 = this.f12660l;
        m(i10 != Integer.MAX_VALUE ? new r(s2Var, i10) : new q(s2Var, 0));
    }
}
