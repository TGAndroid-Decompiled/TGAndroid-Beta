package j3;

import android.os.SystemClock;
import java.util.List;
public final class u1 {
    public static final o4.v f8813t = new o4.u(new Object());
    public final o2 f8814a;
    public final o4.v f8815b;
    public final long f8816c;
    public final long d;
    public final int e;
    public final n f8817f;
    public final boolean f8818g;
    public final o4.t0 h;
    public final f5.x f8819i;
    public final List f8820j;
    public final o4.v f8821k;
    public final boolean f8822l;
    public final int f8823m;
    public final v1 f8824n;
    public final boolean f8825o;
    public volatile long f8826p;
    public volatile long f8827q;
    public volatile long f8828r;
    public volatile long f8829s;

    public u1(o2 o2Var, o4.v vVar, long j10, long j11, int i10, n nVar, boolean z4, o4.t0 t0Var, f5.x xVar, List list, o4.v vVar2, boolean z10, int i11, v1 v1Var, long j12, long j13, long j14, long j15, boolean z11) {
        this.f8814a = o2Var;
        this.f8815b = vVar;
        this.f8816c = j10;
        this.d = j11;
        this.e = i10;
        this.f8817f = nVar;
        this.f8818g = z4;
        this.h = t0Var;
        this.f8819i = xVar;
        this.f8820j = list;
        this.f8821k = vVar2;
        this.f8822l = z10;
        this.f8823m = i11;
        this.f8824n = v1Var;
        this.f8826p = j12;
        this.f8827q = j13;
        this.f8828r = j14;
        this.f8829s = j15;
        this.f8825o = z11;
    }

    public static u1 i(f5.x xVar) {
        l2 l2Var = o2.f8748a;
        o4.t0 t0Var = o4.t0.d;
        s8.i0 i0Var = s8.i0.e;
        v1 v1Var = v1.d;
        o4.v vVar = f8813t;
        return new u1(l2Var, vVar, -9223372036854775807L, 0L, 1, null, false, t0Var, xVar, i0Var, vVar, false, 0, v1Var, 0L, 0L, 0L, 0L, false);
    }

    public final u1 a() {
        return new u1(this.f8814a, this.f8815b, this.f8816c, this.d, this.e, this.f8817f, this.f8818g, this.h, this.f8819i, this.f8820j, this.f8821k, this.f8822l, this.f8823m, this.f8824n, this.f8826p, this.f8827q, j(), SystemClock.elapsedRealtime(), this.f8825o);
    }

    public final u1 b(o4.v vVar) {
        return new u1(this.f8814a, this.f8815b, this.f8816c, this.d, this.e, this.f8817f, this.f8818g, this.h, this.f8819i, this.f8820j, vVar, this.f8822l, this.f8823m, this.f8824n, this.f8826p, this.f8827q, this.f8828r, this.f8829s, this.f8825o);
    }

    public final u1 c(o4.v vVar, long j10, long j11, long j12, long j13, o4.t0 t0Var, f5.x xVar, List list) {
        return new u1(this.f8814a, vVar, j11, j12, this.e, this.f8817f, this.f8818g, t0Var, xVar, list, this.f8821k, this.f8822l, this.f8823m, this.f8824n, this.f8826p, j13, j10, SystemClock.elapsedRealtime(), this.f8825o);
    }

    public final u1 d(int i10, boolean z4) {
        return new u1(this.f8814a, this.f8815b, this.f8816c, this.d, this.e, this.f8817f, this.f8818g, this.h, this.f8819i, this.f8820j, this.f8821k, z4, i10, this.f8824n, this.f8826p, this.f8827q, this.f8828r, this.f8829s, this.f8825o);
    }

    public final u1 e(n nVar) {
        return new u1(this.f8814a, this.f8815b, this.f8816c, this.d, this.e, nVar, this.f8818g, this.h, this.f8819i, this.f8820j, this.f8821k, this.f8822l, this.f8823m, this.f8824n, this.f8826p, this.f8827q, this.f8828r, this.f8829s, this.f8825o);
    }

    public final u1 f(v1 v1Var) {
        return new u1(this.f8814a, this.f8815b, this.f8816c, this.d, this.e, this.f8817f, this.f8818g, this.h, this.f8819i, this.f8820j, this.f8821k, this.f8822l, this.f8823m, v1Var, this.f8826p, this.f8827q, this.f8828r, this.f8829s, this.f8825o);
    }

    public final u1 g(int i10) {
        return new u1(this.f8814a, this.f8815b, this.f8816c, this.d, i10, this.f8817f, this.f8818g, this.h, this.f8819i, this.f8820j, this.f8821k, this.f8822l, this.f8823m, this.f8824n, this.f8826p, this.f8827q, this.f8828r, this.f8829s, this.f8825o);
    }

    public final u1 h(o2 o2Var) {
        return new u1(o2Var, this.f8815b, this.f8816c, this.d, this.e, this.f8817f, this.f8818g, this.h, this.f8819i, this.f8820j, this.f8821k, this.f8822l, this.f8823m, this.f8824n, this.f8826p, this.f8827q, this.f8828r, this.f8829s, this.f8825o);
    }

    public final long j() {
        long j10;
        long j11;
        if (!k()) {
            return this.f8828r;
        }
        do {
            j10 = this.f8829s;
            j11 = this.f8828r;
        } while (j10 != this.f8829s);
        return h5.d0.G(h5.d0.S(j11) + (((float) (SystemClock.elapsedRealtime() - j10)) * this.f8824n.f8838a));
    }

    public final boolean k() {
        if (this.e == 3 && this.f8822l && this.f8823m == 0) {
            return true;
        }
        return false;
    }
}
