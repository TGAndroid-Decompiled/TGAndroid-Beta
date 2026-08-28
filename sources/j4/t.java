package j4;

import android.util.Pair;
import h3.r2;
import java.util.HashMap;
public final class t extends l1 {
    public final int f13563l;
    public final HashMap f13564m;
    public final HashMap f13565n;

    public t(a aVar) {
        super(new x(aVar, false));
        this.f13563l = Integer.MAX_VALUE;
        this.f13564m = new HashMap();
        this.f13565n = new HashMap();
    }

    @Override
    public final a0 b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        int i9 = this.f13563l;
        a aVar = this.f13504k;
        if (i9 == Integer.MAX_VALUE) {
            return aVar.b(d0Var, rVar, j10);
        }
        Object obj = d0Var.f13426a;
        int i10 = h3.a.d;
        d0 b10 = d0Var.b(((Pair) obj).second);
        this.f13564m.put(b10, d0Var);
        a0 b11 = aVar.b(b10, rVar, j10);
        this.f13565n.put(b11, b10);
        return b11;
    }

    @Override
    public final r2 g() {
        x xVar = (x) this.f13504k;
        int i9 = this.f13563l;
        if (i9 != Integer.MAX_VALUE) {
            return new s(xVar.f13601o, i9);
        }
        return new r(xVar.f13601o, 0);
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void n(a0 a0Var) {
        this.f13504k.n(a0Var);
        d0 d0Var = (d0) this.f13565n.remove(a0Var);
        if (d0Var != null) {
            this.f13564m.remove(d0Var);
        }
    }

    @Override
    public final d0 x(d0 d0Var) {
        if (this.f13563l != Integer.MAX_VALUE) {
            return (d0) this.f13564m.get(d0Var);
        }
        return d0Var;
    }

    @Override
    public final void y(r2 r2Var) {
        r2 rVar;
        int i9 = this.f13563l;
        if (i9 != Integer.MAX_VALUE) {
            rVar = new s(r2Var, i9);
        } else {
            rVar = new r(r2Var, 0);
        }
        m(rVar);
    }
}
