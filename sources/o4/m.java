package o4;

import android.util.Pair;
import j3.o2;
import java.util.HashMap;
public final class m extends v0 {
    public final int f16381l;
    public final HashMap f16382m;
    public final HashMap f16383n;

    public m(a aVar) {
        super(new q(aVar, false));
        this.f16381l = Integer.MAX_VALUE;
        this.f16382m = new HashMap();
        this.f16383n = new HashMap();
    }

    @Override
    public final t b(v vVar, g5.q qVar, long j10) {
        int i10 = this.f16381l;
        a aVar = this.f16429k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.b(vVar, qVar, j10);
        }
        Object obj = vVar.f16424a;
        int i11 = j3.a.d;
        v b10 = vVar.b(((Pair) obj).second);
        this.f16382m.put(b10, vVar);
        t b11 = aVar.b(b10, qVar, j10);
        this.f16383n.put(b11, b10);
        return b11;
    }

    @Override
    public final o2 g() {
        q qVar = (q) this.f16429k;
        int i10 = this.f16381l;
        if (i10 != Integer.MAX_VALUE) {
            return new l(qVar.f16397o, i10);
        }
        return new k(qVar.f16397o, 0);
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void n(t tVar) {
        this.f16429k.n(tVar);
        v vVar = (v) this.f16383n.remove(tVar);
        if (vVar != null) {
            this.f16382m.remove(vVar);
        }
    }

    @Override
    public final v s(v vVar) {
        if (this.f16381l != Integer.MAX_VALUE) {
            return (v) this.f16382m.get(vVar);
        }
        return vVar;
    }

    @Override
    public final void u(o2 o2Var) {
        o2 kVar;
        int i10 = this.f16381l;
        if (i10 != Integer.MAX_VALUE) {
            kVar = new l(o2Var, i10);
        } else {
            kVar = new k(o2Var, 0);
        }
        m(kVar);
    }
}
