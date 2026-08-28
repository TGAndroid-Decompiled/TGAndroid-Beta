package o4;

import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.exoplayer2.upstream.y0;
import d5.f0;
import h3.b1;
import h3.c1;
import h3.f1;
import h3.r0;
import j4.a0;
import j4.d0;
import j4.h0;
import j4.h1;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n5.e0;
import o8.z;
public final class m extends j4.a {
    public final j h;
    public final c1 f18890i;
    public final e0 f18891j;
    public final za.a f18892k;
    public final l3.i f18893l;
    public final v9.d f18894m;
    public final boolean f18895n;
    public final int f18896o;
    public final p4.c f18897p;
    public final long f18898q;
    public final f1 f18899r;
    public b1 f18900s;
    public y0 f18901t;

    static {
        r0.a("goog.exo.hls");
    }

    public m(f1 f1Var, e0 e0Var, c cVar, za.a aVar, l3.i iVar, v9.d dVar, p4.c cVar2, long j10, boolean z10, int i9) {
        c1 c1Var = f1Var.f9399b;
        c1Var.getClass();
        this.f18890i = c1Var;
        this.f18899r = f1Var;
        this.f18900s = f1Var.f9400c;
        this.f18891j = e0Var;
        this.h = cVar;
        this.f18892k = aVar;
        this.f18893l = iVar;
        this.f18894m = dVar;
        this.f18897p = cVar2;
        this.f18898q = j10;
        this.f18895n = z10;
        this.f18896o = i9;
    }

    public static p4.e s(long j10, List list) {
        p4.e eVar = null;
        for (int i9 = 0; i9 < list.size(); i9++) {
            p4.e eVar2 = (p4.e) list.get(i9);
            long j11 = eVar2.f45384e;
            if (j11 <= j10 && eVar2.f45374w) {
                eVar = eVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return eVar;
    }

    @Override
    public final a0 b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        h0 a2 = a(d0Var);
        a6.a aVar = new a6.a((CopyOnWriteArrayList) this.d.d, 0, d0Var, 14);
        y0 y0Var = this.f18901t;
        i3.l lVar = this.f13402g;
        d5.a.j(lVar);
        return new l(this.h, this.f18897p, this.f18891j, y0Var, this.f18893l, aVar, this.f18894m, a2, rVar, this.f18892k, this.f18895n, this.f18896o, lVar);
    }

    @Override
    public final f1 h() {
        return this.f18899r;
    }

    @Override
    public final void j() {
        p4.c cVar = this.f18897p;
        q0 q0Var = cVar.h;
        if (q0Var != null) {
            q0Var.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            p4.b bVar = (p4.b) cVar.d.get(uri);
            bVar.f45356b.a();
            IOException iOException = bVar.f45362s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override
    public final void l(y0 y0Var) {
        boolean z10;
        this.f18901t = y0Var;
        l3.i iVar = this.f18893l;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        i3.l lVar = this.f13402g;
        d5.a.j(lVar);
        iVar.H(myLooper, lVar);
        h0 a2 = a(null);
        Uri uri = this.f18890i.f9362a;
        p4.c cVar = this.f18897p;
        cVar.getClass();
        cVar.f45368n = f0.k(null);
        cVar.f45367f = a2;
        cVar.f45369r = this;
        t0 t0Var = new t0(((com.google.android.exoplayer2.upstream.l) cVar.f45363a.f18488b).createDataSource(), uri, 4, cVar.f45364b.V1());
        if (cVar.h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        q0 q0Var = new q0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = q0Var;
        v9.d dVar = cVar.f45365c;
        int i9 = t0Var.f2608c;
        q0Var.f(t0Var, cVar, dVar.l3(i9));
        a2.k(new j4.q(t0Var.f2607b), i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void n(a0 a0Var) {
        r[] rVarArr;
        q[] qVarArr;
        l lVar = (l) a0Var;
        lVar.f18880b.f45366e.remove(lVar);
        for (r rVar : lVar.F) {
            if (rVar.P) {
                for (q qVar : rVar.H) {
                    qVar.i();
                    l3.e eVar = qVar.h;
                    if (eVar != null) {
                        eVar.k(qVar.f13406e);
                        qVar.h = null;
                        qVar.f13408g = null;
                    }
                }
            }
            rVar.f18931s.e(rVar);
            rVar.D.removeCallbacksAndMessages(null);
            rVar.T = true;
            rVar.E.clear();
        }
        lVar.C = null;
    }

    @Override
    public final void p() {
        p4.c cVar = this.f18897p;
        cVar.v = null;
        cVar.f45371w = null;
        cVar.f45370s = null;
        cVar.f45373y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        for (p4.b bVar : hashMap.values()) {
            bVar.f45356b.e(null);
        }
        cVar.f45368n.removeCallbacksAndMessages(null);
        cVar.f45368n = null;
        hashMap.clear();
        this.f18893l.release();
    }

    public final void t(p4.j jVar) {
        long j10;
        long j11;
        long j12;
        h1 h1Var;
        long j13;
        long j14;
        long j15;
        long j16;
        boolean z10;
        float f10;
        float f11;
        long j17;
        boolean z11;
        boolean z12 = jVar.f45403p;
        boolean z13 = jVar.f45395g;
        z zVar = jVar.f45405r;
        long j18 = jVar.f45408u;
        long j19 = jVar.f45393e;
        int i9 = jVar.d;
        long j20 = jVar.h;
        if (z12) {
            j10 = f0.S(j20);
        } else {
            j10 = -9223372036854775807L;
        }
        if (i9 != 2 && i9 != 1) {
            j11 = -9223372036854775807L;
        } else {
            j11 = j10;
        }
        p4.c cVar = this.f18897p;
        p4.m mVar = cVar.f45370s;
        mVar.getClass();
        ?? obj = new Object();
        new p4.m(mVar.f45426a, mVar.f45427b, mVar.f45418e, mVar.f45419f, mVar.f45420g, mVar.h, mVar.f45421i, mVar.f45422j, mVar.f45423k, mVar.f45428c, mVar.f45424l, mVar.f45425m);
        if (cVar.f45372x) {
            p4.i iVar = jVar.v;
            long j21 = j20 - cVar.f45373y;
            boolean z14 = jVar.f45402o;
            if (z14) {
                j13 = j21 + j18;
            } else {
                j13 = -9223372036854775807L;
            }
            if (jVar.f45403p) {
                j14 = f0.H(f0.t(this.f18898q)) - (j20 + j18);
            } else {
                j14 = 0;
            }
            long j22 = this.f18900s.f9347a;
            if (j22 != -9223372036854775807L) {
                j16 = f0.H(j22);
            } else {
                if (j19 != -9223372036854775807L) {
                    j15 = j18 - j19;
                } else {
                    j15 = iVar.d;
                    if (j15 == -9223372036854775807L || jVar.f45401n == -9223372036854775807L) {
                        j15 = iVar.f45391c;
                        if (j15 == -9223372036854775807L) {
                            j15 = 3 * jVar.f45400m;
                        }
                    }
                }
                j16 = j15 + j14;
            }
            long j23 = j18 + j14;
            long i10 = f0.i(j16, j14, j23);
            b1 b1Var = this.f18899r.f9400c;
            if (b1Var.d == -3.4028235E38f && b1Var.f9350e == -3.4028235E38f && iVar.f45391c == -9223372036854775807L && iVar.d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            long S = f0.S(i10);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.f18900s.d;
            }
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = this.f18900s.f9350e;
            }
            this.f18900s = new b1(S, -9223372036854775807L, -9223372036854775807L, f10, f11);
            if (j19 == -9223372036854775807L) {
                j19 = j23 - f0.H(S);
            }
            if (z13) {
                j17 = j19;
            } else {
                p4.e s10 = s(j19, jVar.f45406s);
                if (s10 != null) {
                    j17 = s10.f45384e;
                } else if (zVar.isEmpty()) {
                    j17 = 0;
                } else {
                    p4.g gVar = (p4.g) zVar.get(f0.c(zVar, Long.valueOf(j19), true));
                    p4.e s11 = s(j19, gVar.f45380x);
                    if (s11 != null) {
                        j17 = s11.f45384e;
                    } else {
                        j17 = gVar.f45384e;
                    }
                }
            }
            if (i9 == 2 && jVar.f45394f) {
                z11 = true;
            } else {
                z11 = false;
            }
            h1Var = new h1(j11, j10, j13, jVar.f45408u, j21, j17, true, !z14, z11, obj, this.f18899r, this.f18900s);
        } else {
            if (j19 != -9223372036854775807L && !zVar.isEmpty()) {
                if (!z13 && j19 != j18) {
                    j19 = ((p4.g) zVar.get(f0.c(zVar, Long.valueOf(j19), true))).f45384e;
                }
                j12 = j19;
            } else {
                j12 = 0;
            }
            long j24 = jVar.f45408u;
            h1Var = new h1(j11, j10, j24, j24, 0L, j12, true, false, true, obj, this.f18899r, null);
        }
        m(h1Var);
    }
}
