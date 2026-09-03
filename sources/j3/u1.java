package j3;

import android.os.SystemClock;
import java.util.List;
public final class u1 {
    public static final o4.v f9425t = new o4.u(new Object());
    public final o2 f9426a;
    public final o4.v f9427b;
    public final long f9428c;
    public final long d;
    public final int f9429e;
    public final n f9430f;
    public final boolean f9431g;
    public final o4.t0 h;
    public final f5.y f9432i;
    public final List f9433j;
    public final o4.v f9434k;
    public final boolean f9435l;
    public final int f9436m;
    public final v1 f9437n;
    public final boolean f9438o;
    public volatile long f9439p;
    public volatile long f9440q;
    public volatile long f9441r;
    public volatile long f9442s;

    public u1(o2 o2Var, o4.v vVar, long j10, long j11, int i10, n nVar, boolean z4, o4.t0 t0Var, f5.y yVar, List list, o4.v vVar2, boolean z10, int i11, v1 v1Var, long j12, long j13, long j14, long j15, boolean z11) {
        this.f9426a = o2Var;
        this.f9427b = vVar;
        this.f9428c = j10;
        this.d = j11;
        this.f9429e = i10;
        this.f9430f = nVar;
        this.f9431g = z4;
        this.h = t0Var;
        this.f9432i = yVar;
        this.f9433j = list;
        this.f9434k = vVar2;
        this.f9435l = z10;
        this.f9436m = i11;
        this.f9437n = v1Var;
        this.f9439p = j12;
        this.f9440q = j13;
        this.f9441r = j14;
        this.f9442s = j15;
        this.f9438o = z11;
    }

    public static u1 i(f5.y yVar) {
        l2 l2Var = o2.f9353a;
        o4.t0 t0Var = o4.t0.d;
        s8.i0 i0Var = s8.i0.f47139e;
        v1 v1Var = v1.d;
        o4.v vVar = f9425t;
        return new u1(l2Var, vVar, -9223372036854775807L, 0L, 1, null, false, t0Var, yVar, i0Var, vVar, false, 0, v1Var, 0L, 0L, 0L, 0L, false);
    }

    public final u1 a() {
        return new u1(this.f9426a, this.f9427b, this.f9428c, this.d, this.f9429e, this.f9430f, this.f9431g, this.h, this.f9432i, this.f9433j, this.f9434k, this.f9435l, this.f9436m, this.f9437n, this.f9439p, this.f9440q, j(), SystemClock.elapsedRealtime(), this.f9438o);
    }

    public final u1 b(o4.v vVar) {
        return new u1(this.f9426a, this.f9427b, this.f9428c, this.d, this.f9429e, this.f9430f, this.f9431g, this.h, this.f9432i, this.f9433j, vVar, this.f9435l, this.f9436m, this.f9437n, this.f9439p, this.f9440q, this.f9441r, this.f9442s, this.f9438o);
    }

    public final u1 c(o4.v vVar, long j10, long j11, long j12, long j13, o4.t0 t0Var, f5.y yVar, List list) {
        return new u1(this.f9426a, vVar, j11, j12, this.f9429e, this.f9430f, this.f9431g, t0Var, yVar, list, this.f9434k, this.f9435l, this.f9436m, this.f9437n, this.f9439p, j13, j10, SystemClock.elapsedRealtime(), this.f9438o);
    }

    public final u1 d(int i10, boolean z4) {
        return new u1(this.f9426a, this.f9427b, this.f9428c, this.d, this.f9429e, this.f9430f, this.f9431g, this.h, this.f9432i, this.f9433j, this.f9434k, z4, i10, this.f9437n, this.f9439p, this.f9440q, this.f9441r, this.f9442s, this.f9438o);
    }

    public final u1 e(n nVar) {
        return new u1(this.f9426a, this.f9427b, this.f9428c, this.d, this.f9429e, nVar, this.f9431g, this.h, this.f9432i, this.f9433j, this.f9434k, this.f9435l, this.f9436m, this.f9437n, this.f9439p, this.f9440q, this.f9441r, this.f9442s, this.f9438o);
    }

    public final u1 f(v1 v1Var) {
        return new u1(this.f9426a, this.f9427b, this.f9428c, this.d, this.f9429e, this.f9430f, this.f9431g, this.h, this.f9432i, this.f9433j, this.f9434k, this.f9435l, this.f9436m, v1Var, this.f9439p, this.f9440q, this.f9441r, this.f9442s, this.f9438o);
    }

    public final u1 g(int i10) {
        return new u1(this.f9426a, this.f9427b, this.f9428c, this.d, i10, this.f9430f, this.f9431g, this.h, this.f9432i, this.f9433j, this.f9434k, this.f9435l, this.f9436m, this.f9437n, this.f9439p, this.f9440q, this.f9441r, this.f9442s, this.f9438o);
    }

    public final u1 h(o2 o2Var) {
        return new u1(o2Var, this.f9427b, this.f9428c, this.d, this.f9429e, this.f9430f, this.f9431g, this.h, this.f9432i, this.f9433j, this.f9434k, this.f9435l, this.f9436m, this.f9437n, this.f9439p, this.f9440q, this.f9441r, this.f9442s, this.f9438o);
    }

    public final long j() {
        long j10;
        long j11;
        if (!k()) {
            return this.f9441r;
        }
        do {
            j10 = this.f9442s;
            j11 = this.f9441r;
        } while (j10 != this.f9442s);
        return h5.d0.G(h5.d0.S(j11) + (((float) (SystemClock.elapsedRealtime() - j10)) * this.f9437n.f9452a));
    }

    public final boolean k() {
        if (this.f9429e == 3 && this.f9435l && this.f9436m == 0) {
            return true;
        }
        return false;
    }
}
