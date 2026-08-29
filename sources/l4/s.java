package l4;

import android.util.Pair;
import j3.r2;
import java.util.HashMap;
public final class s extends m1 {
    public final int f14419l;
    public final HashMap f14420m;
    public final HashMap f14421n;

    public s(a aVar) {
        super(new w(aVar, false));
        this.f14419l = Integer.MAX_VALUE;
        this.f14420m = new HashMap();
        this.f14421n = new HashMap();
    }

    @Override
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        int i10 = this.f14419l;
        a aVar = this.f14381k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.b(c0Var, rVar, j10);
        }
        Object obj = c0Var.f14262a;
        int i11 = j3.a.d;
        c0 b10 = c0Var.b(((Pair) obj).second);
        this.f14420m.put(b10, c0Var);
        z b11 = aVar.b(b10, rVar, j10);
        this.f14421n.put(b11, b10);
        return b11;
    }

    @Override
    public final r2 g() {
        w wVar = (w) this.f14381k;
        int i10 = this.f14419l;
        if (i10 != Integer.MAX_VALUE) {
            return new r(wVar.f14453o, i10);
        }
        return new q(wVar.f14453o, 0);
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void n(z zVar) {
        this.f14381k.n(zVar);
        c0 c0Var = (c0) this.f14421n.remove(zVar);
        if (c0Var != null) {
            this.f14420m.remove(c0Var);
        }
    }

    @Override
    public final c0 x(c0 c0Var) {
        if (this.f14419l != Integer.MAX_VALUE) {
            return (c0) this.f14420m.get(c0Var);
        }
        return c0Var;
    }

    @Override
    public final void y(r2 r2Var) {
        r2 qVar;
        int i10 = this.f14419l;
        if (i10 != Integer.MAX_VALUE) {
            qVar = new r(r2Var, i10);
        } else {
            qVar = new q(r2Var, 0);
        }
        m(qVar);
    }
}
