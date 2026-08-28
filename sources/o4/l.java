package o4;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.y0;
import d5.f0;
import h3.j2;
import h3.s0;
import h3.t0;
import h3.t1;
import j4.a0;
import j4.d1;
import j4.h0;
import j4.j1;
import j4.z;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import m5.c0;
import n5.e0;
public final class l implements a0, p4.r {
    public final i3.l A;
    public final n5.a0 B = new n5.a0(this, 3);
    public z C;
    public int D;
    public j1 E;
    public r[] F;
    public r[] G;
    public int H;
    public android.support.v4.media.c I;
    public final j f18879a;
    public final p4.c f18880b;
    public final e0 f18881c;
    public final y0 d;
    public final l3.i f18882e;
    public final a6.a f18883f;
    public final v9.d h;
    public final h0 f18884n;
    public final com.google.android.exoplayer2.upstream.r f18885r;
    public final IdentityHashMap f18886s;
    public final c0 v;
    public final za.a f18887w;
    public final boolean f18888x;
    public final int f18889y;

    public l(j jVar, p4.c cVar, e0 e0Var, y0 y0Var, l3.i iVar, a6.a aVar, v9.d dVar, h0 h0Var, com.google.android.exoplayer2.upstream.r rVar, za.a aVar2, boolean z10, int i9, i3.l lVar) {
        this.f18879a = jVar;
        this.f18880b = cVar;
        this.f18881c = e0Var;
        this.d = y0Var;
        this.f18882e = iVar;
        this.f18883f = aVar;
        this.h = dVar;
        this.f18884n = h0Var;
        this.f18885r = rVar;
        this.f18887w = aVar2;
        this.f18888x = z10;
        this.f18889y = i9;
        this.A = lVar;
        aVar2.getClass();
        this.I = new android.support.v4.media.c(new d1[0], 19);
        this.f18886s = new IdentityHashMap();
        this.v = new c0(8);
        this.F = new r[0];
        this.G = new r[0];
    }

    public static t0 f(t0 t0Var, t0 t0Var2, boolean z10) {
        String o6;
        z3.c cVar;
        int i9;
        String str;
        String str2;
        int i10;
        int i11;
        int i12;
        int i13 = -1;
        if (t0Var2 != null) {
            o6 = t0Var2.f9766r;
            cVar = t0Var2.f9767s;
            i10 = t0Var2.O;
            i9 = t0Var2.d;
            i11 = t0Var2.f9763e;
            str = t0Var2.f9762c;
            str2 = t0Var2.f9761b;
        } else {
            o6 = f0.o(1, t0Var.f9766r);
            cVar = t0Var.f9767s;
            if (z10) {
                i10 = t0Var.O;
                i9 = t0Var.d;
                i11 = t0Var.f9763e;
                str = t0Var.f9762c;
                str2 = t0Var.f9761b;
            } else {
                i9 = 0;
                str = null;
                str2 = null;
                i10 = -1;
                i11 = 0;
            }
        }
        String c10 = d5.q.c(o6);
        if (z10) {
            i12 = t0Var.f9764f;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = t0Var.h;
        }
        s0 s0Var = new s0();
        s0Var.f9693a = t0Var.f9760a;
        s0Var.f9694b = str2;
        s0Var.f9704n = t0Var.A;
        s0Var.f9705o = c10;
        s0Var.h = o6;
        s0Var.f9699i = cVar;
        s0Var.f9697f = i12;
        s0Var.f9698g = i13;
        s0Var.B = i10;
        s0Var.d = i9;
        s0Var.f9696e = i11;
        s0Var.f9695c = str;
        return new t0(s0Var);
    }

    @Override
    public final void a() {
        r[] rVarArr;
        for (r rVar : this.F) {
            q0 q0Var = rVar.f18931s;
            ArrayList arrayList = rVar.f18934y;
            if (!arrayList.isEmpty()) {
                k kVar = (k) o8.l.g(arrayList);
                int b10 = rVar.d.b(kVar);
                if (b10 == 1) {
                    kVar.W = true;
                } else if (b10 == 2 && !rVar.f18924f0 && q0Var.d()) {
                    q0Var.b();
                }
            }
        }
        this.C.c(this);
    }

    @Override
    public final boolean b() {
        return this.I.b();
    }

    @Override
    public final boolean c(android.net.Uri r18, n2.w r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: o4.l.c(android.net.Uri, n2.w, boolean):boolean");
    }

    @Override
    public final long d() {
        return this.I.d();
    }

    public final r e(String str, int i9, Uri[] uriArr, t0[] t0VarArr, t0 t0Var, List list, Map map, long j10) {
        return new r(str, i9, this.B, new i(this.f18879a, this.f18880b, uriArr, t0VarArr, this.f18881c, this.d, this.v, list, this.A), map, this.f18885r, j10, t0Var, this.f18882e, this.f18883f, this.h, this.f18884n, this.f18889y);
    }

    @Override
    public final void g() {
        r[] rVarArr;
        for (r rVar : this.F) {
            rVar.D();
            if (rVar.f18924f0 && !rVar.P) {
                throw t1.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override
    public final long i(long j10) {
        r[] rVarArr = this.G;
        if (rVarArr.length > 0) {
            boolean G = rVarArr[0].G(j10, false);
            int i9 = 1;
            while (true) {
                r[] rVarArr2 = this.G;
                if (i9 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i9].G(j10, G);
                i9++;
            }
            if (G) {
                ((SparseArray) this.v.f17378b).clear();
            }
        }
        return j10;
    }

    @Override
    public final void k(long j10) {
        r[] rVarArr;
        for (r rVar : this.G) {
            if (rVar.O && !rVar.A()) {
                int length = rVar.H.length;
                for (int i9 = 0; i9 < length; i9++) {
                    rVar.H[i9].h(j10, rVar.Z[i9]);
                }
            }
        }
    }

    @Override
    public final boolean n(long j10) {
        r[] rVarArr;
        if (this.E == null) {
            for (r rVar : this.F) {
                if (!rVar.P) {
                    rVar.n(rVar.f18917b0);
                }
            }
            return false;
        }
        return this.I.n(j10);
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final j1 q() {
        j1 j1Var = this.E;
        j1Var.getClass();
        return j1Var;
    }

    @Override
    public final long u(long j10, j2 j2Var) {
        p4.j jVar;
        long j11;
        r[] rVarArr = this.G;
        int length = rVarArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            r rVar = rVarArr[i9];
            if (rVar.M == 2) {
                i iVar = rVar.d;
                p4.c cVar = iVar.f18863g;
                int d = iVar.f18872q.d();
                Uri[] uriArr = iVar.f18861e;
                if (d < uriArr.length && d != -1) {
                    jVar = cVar.a(uriArr[iVar.f18872q.n()], true);
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    o8.z zVar = jVar.f45405r;
                    if (!zVar.isEmpty() && jVar.f45428c) {
                        long j12 = jVar.h - cVar.f45373y;
                        long j13 = j10 - j12;
                        int c10 = f0.c(zVar, Long.valueOf(j13), true);
                        long j14 = ((p4.g) zVar.get(c10)).f45384e;
                        if (c10 != zVar.size() - 1) {
                            j11 = ((p4.g) zVar.get(c10 + 1)).f45384e;
                        } else {
                            j11 = j14;
                        }
                        return j2Var.a(j13, j14, j11) + j12;
                    }
                }
            } else {
                i9++;
            }
        }
        return j10;
    }

    @Override
    public final long v() {
        return this.I.v();
    }

    @Override
    public final void w(j4.z r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: o4.l.w(j4.z, long):void");
    }

    @Override
    public final long x(b5.t[] r38, boolean[] r39, j4.b1[] r40, boolean[] r41, long r42) {
        throw new UnsupportedOperationException("Method not decompiled: o4.l.x(b5.t[], boolean[], j4.b1[], boolean[], long):long");
    }

    @Override
    public final void z(long j10) {
        this.I.z(j10);
    }
}
