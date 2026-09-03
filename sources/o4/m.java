package o4;

import android.util.Pair;
import j3.o2;
import java.util.HashMap;
public final class m extends v0 {
    public final int f16363l;
    public final HashMap f16364m;
    public final HashMap f16365n;

    public m(a aVar) {
        super(new q(aVar, false));
        this.f16363l = Integer.MAX_VALUE;
        this.f16364m = new HashMap();
        this.f16365n = new HashMap();
    }

    @Override
    public final t b(v vVar, g5.q qVar, long j10) {
        int i10 = this.f16363l;
        a aVar = this.f16411k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.b(vVar, qVar, j10);
        }
        Object obj = vVar.f16406a;
        int i11 = j3.a.d;
        v b10 = vVar.b(((Pair) obj).second);
        this.f16364m.put(b10, vVar);
        t b11 = aVar.b(b10, qVar, j10);
        this.f16365n.put(b11, b10);
        return b11;
    }

    @Override
    public final o2 g() {
        q qVar = (q) this.f16411k;
        int i10 = this.f16363l;
        if (i10 != Integer.MAX_VALUE) {
            return new l(qVar.f16379o, i10);
        }
        return new k(qVar.f16379o, 0);
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void n(t tVar) {
        this.f16411k.n(tVar);
        v vVar = (v) this.f16365n.remove(tVar);
        if (vVar != null) {
            this.f16364m.remove(vVar);
        }
    }

    @Override
    public final v s(v vVar) {
        if (this.f16363l != Integer.MAX_VALUE) {
            return (v) this.f16364m.get(vVar);
        }
        return vVar;
    }

    @Override
    public final void u(o2 o2Var) {
        o2 kVar;
        int i10 = this.f16363l;
        if (i10 != Integer.MAX_VALUE) {
            kVar = new l(o2Var, i10);
        } else {
            kVar = new k(o2Var, 0);
        }
        m(kVar);
    }
}
