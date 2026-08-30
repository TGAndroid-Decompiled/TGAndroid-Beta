package j3;

import android.os.SystemClock;
import java.util.List;
public final class u1 {
    public static final o4.v f8831t = new o4.u(new Object());
    public final o2 f8832a;
    public final o4.v f8833b;
    public final long f8834c;
    public final long d;
    public final int e;
    public final n f8835f;
    public final boolean f8836g;
    public final o4.t0 h;
    public final f5.x f8837i;
    public final List f8838j;
    public final o4.v f8839k;
    public final boolean f8840l;
    public final int f8841m;
    public final v1 f8842n;
    public final boolean f8843o;
    public volatile long f8844p;
    public volatile long f8845q;
    public volatile long f8846r;
    public volatile long f8847s;

    public u1(o2 o2Var, o4.v vVar, long j10, long j11, int i10, n nVar, boolean z4, o4.t0 t0Var, f5.x xVar, List list, o4.v vVar2, boolean z10, int i11, v1 v1Var, long j12, long j13, long j14, long j15, boolean z11) {
        this.f8832a = o2Var;
        this.f8833b = vVar;
        this.f8834c = j10;
        this.d = j11;
        this.e = i10;
        this.f8835f = nVar;
        this.f8836g = z4;
        this.h = t0Var;
        this.f8837i = xVar;
        this.f8838j = list;
        this.f8839k = vVar2;
        this.f8840l = z10;
        this.f8841m = i11;
        this.f8842n = v1Var;
        this.f8844p = j12;
        this.f8845q = j13;
        this.f8846r = j14;
        this.f8847s = j15;
        this.f8843o = z11;
    }

    public static u1 i(f5.x xVar) {
        l2 l2Var = o2.f8766a;
        o4.t0 t0Var = o4.t0.d;
        s8.i0 i0Var = s8.i0.e;
        v1 v1Var = v1.d;
        o4.v vVar = f8831t;
        return new u1(l2Var, vVar, -9223372036854775807L, 0L, 1, null, false, t0Var, xVar, i0Var, vVar, false, 0, v1Var, 0L, 0L, 0L, 0L, false);
    }

    public final u1 a() {
        return new u1(this.f8832a, this.f8833b, this.f8834c, this.d, this.e, this.f8835f, this.f8836g, this.h, this.f8837i, this.f8838j, this.f8839k, this.f8840l, this.f8841m, this.f8842n, this.f8844p, this.f8845q, j(), SystemClock.elapsedRealtime(), this.f8843o);
    }

    public final u1 b(o4.v vVar) {
        return new u1(this.f8832a, this.f8833b, this.f8834c, this.d, this.e, this.f8835f, this.f8836g, this.h, this.f8837i, this.f8838j, vVar, this.f8840l, this.f8841m, this.f8842n, this.f8844p, this.f8845q, this.f8846r, this.f8847s, this.f8843o);
    }

    public final u1 c(o4.v vVar, long j10, long j11, long j12, long j13, o4.t0 t0Var, f5.x xVar, List list) {
        return new u1(this.f8832a, vVar, j11, j12, this.e, this.f8835f, this.f8836g, t0Var, xVar, list, this.f8839k, this.f8840l, this.f8841m, this.f8842n, this.f8844p, j13, j10, SystemClock.elapsedRealtime(), this.f8843o);
    }

    public final u1 d(int i10, boolean z4) {
        return new u1(this.f8832a, this.f8833b, this.f8834c, this.d, this.e, this.f8835f, this.f8836g, this.h, this.f8837i, this.f8838j, this.f8839k, z4, i10, this.f8842n, this.f8844p, this.f8845q, this.f8846r, this.f8847s, this.f8843o);
    }

    public final u1 e(n nVar) {
        return new u1(this.f8832a, this.f8833b, this.f8834c, this.d, this.e, nVar, this.f8836g, this.h, this.f8837i, this.f8838j, this.f8839k, this.f8840l, this.f8841m, this.f8842n, this.f8844p, this.f8845q, this.f8846r, this.f8847s, this.f8843o);
    }

    public final u1 f(v1 v1Var) {
        return new u1(this.f8832a, this.f8833b, this.f8834c, this.d, this.e, this.f8835f, this.f8836g, this.h, this.f8837i, this.f8838j, this.f8839k, this.f8840l, this.f8841m, v1Var, this.f8844p, this.f8845q, this.f8846r, this.f8847s, this.f8843o);
    }

    public final u1 g(int i10) {
        return new u1(this.f8832a, this.f8833b, this.f8834c, this.d, i10, this.f8835f, this.f8836g, this.h, this.f8837i, this.f8838j, this.f8839k, this.f8840l, this.f8841m, this.f8842n, this.f8844p, this.f8845q, this.f8846r, this.f8847s, this.f8843o);
    }

    public final u1 h(o2 o2Var) {
        return new u1(o2Var, this.f8833b, this.f8834c, this.d, this.e, this.f8835f, this.f8836g, this.h, this.f8837i, this.f8838j, this.f8839k, this.f8840l, this.f8841m, this.f8842n, this.f8844p, this.f8845q, this.f8846r, this.f8847s, this.f8843o);
    }

    public final long j() {
        long j10;
        long j11;
        if (!k()) {
            return this.f8846r;
        }
        do {
            j10 = this.f8847s;
            j11 = this.f8846r;
        } while (j10 != this.f8847s);
        return h5.d0.G(h5.d0.S(j11) + (((float) (SystemClock.elapsedRealtime() - j10)) * this.f8842n.f8856a));
    }

    public final boolean k() {
        if (this.e == 3 && this.f8840l && this.f8841m == 0) {
            return true;
        }
        return false;
    }
}
