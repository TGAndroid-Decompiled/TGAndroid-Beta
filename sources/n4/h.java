package n4;

import ag.j2;
import android.net.Uri;
import c2.u;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.r;
import f5.d0;
import f7.v;
import j$.util.DesugarCollections;
import j3.t0;
import j3.u0;
import j7.l1;
import java.util.ArrayList;
import java.util.List;
import l4.b1;
import l4.c1;
import l4.e1;
import l4.g0;
import l4.x;
import o3.t;
import o4.o;
public final class h implements c1, e1, l0, o0 {
    public final g9.l A;
    public e B;
    public t0 C;
    public g D;
    public long E;
    public long F;
    public int G;
    public a H;
    public boolean I;
    public final int f17138a;
    public final int[] f17139b;
    public final t0[] f17140c;
    public final boolean[] d;
    public final o4.l f17141e;
    public final o4.b f17142f;
    public final g0 h;
    public final v f17143n;
    public final q0 f17144r = new q0("ChunkSampleStream");
    public final u f17145s = new u(4);
    public final ArrayList v;
    public final List f17146w;
    public final b1 f17147x;
    public final b1[] f17148y;

    public h(int i10, int[] iArr, t0[] t0VarArr, o4.l lVar, o4.b bVar, r rVar, long j10, n3.i iVar, j2 j2Var, v vVar, g0 g0Var) {
        this.f17138a = i10;
        this.f17139b = iArr;
        this.f17140c = t0VarArr;
        this.f17141e = lVar;
        this.f17142f = bVar;
        this.h = g0Var;
        this.f17143n = vVar;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f17146w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f17148y = new b1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        b1[] b1VarArr = new b1[i11];
        iVar.getClass();
        b1 b1Var = new b1(rVar, iVar, j2Var);
        this.f17147x = b1Var;
        int i12 = 0;
        iArr2[0] = i10;
        b1VarArr[0] = b1Var;
        while (i12 < length) {
            b1 b1Var2 = new b1(rVar, null, null);
            this.f17148y[i12] = b1Var2;
            int i13 = i12 + 1;
            b1VarArr[i13] = b1Var2;
            iArr2[i13] = this.f17139b[i12];
            i12 = i13;
        }
        this.A = new g9.l(iArr2, b1VarArr, false, 24);
        this.E = j10;
        this.F = j10;
    }

    @Override
    public final long L() {
        if (this.I) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.E;
        }
        long j10 = this.F;
        a l10 = l();
        if (!l10.c()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                l10 = (a) l1.i(2, arrayList);
            } else {
                l10 = null;
            }
        }
        if (l10 != null) {
            j10 = Math.max(j10, l10.f17132n);
        }
        return Math.max(j10, this.f17147x.n());
    }

    @Override
    public final void U(long j10) {
        int size;
        q0 q0Var = this.f17144r;
        if (!q0Var.c() && !t()) {
            boolean d = q0Var.d();
            boolean z10 = false;
            List list = this.f17146w;
            o4.l lVar = this.f17141e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.B;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !q(arrayList.size() - 1)) {
                    if (lVar.f19191l == null) {
                        z10 = lVar.f19188i.p(j10, eVar, list);
                    }
                    if (z10) {
                        q0Var.b();
                        if (z11) {
                            this.H = (a) eVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (lVar.f19191l == null && lVar.f19188i.length() >= 2) {
                size = lVar.f19188i.j(j10, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                f5.a.i(!q0Var.d());
                int size2 = arrayList.size();
                while (true) {
                    if (size < size2) {
                        if (!q(size)) {
                            break;
                        }
                        size++;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size != -1) {
                    long j11 = l().f17132n;
                    a k9 = k(size);
                    if (arrayList.isEmpty()) {
                        this.E = this.F;
                    }
                    this.I = false;
                    long j12 = k9.h;
                    g0 g0Var = this.h;
                    g0Var.m(new x(1, this.f17138a, null, 3, null, g0Var.a(j12), g0Var.a(j11)));
                }
            }
        }
    }

    @Override
    public final void a() {
        q0 q0Var = this.f17144r;
        q0Var.a();
        this.f17147x.w();
        if (!q0Var.d()) {
            o4.l lVar = this.f17141e;
            l4.b bVar = lVar.f19191l;
            if (bVar == null) {
                lVar.f19182a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean b() {
        return this.f17144r.d();
    }

    @Override
    public final void c() {
        b1[] b1VarArr;
        b1 b1Var = this.f17147x;
        b1Var.A(true);
        n3.e eVar = b1Var.h;
        if (eVar != null) {
            eVar.p(b1Var.f14269e);
            b1Var.h = null;
            b1Var.f14271g = null;
        }
        for (b1 b1Var2 : this.f17148y) {
            b1Var2.A(true);
            n3.e eVar2 = b1Var2.h;
            if (eVar2 != null) {
                eVar2.p(b1Var2.f14269e);
                b1Var2.h = null;
                b1Var2.f14271g = null;
            }
        }
        for (o4.j jVar : this.f17141e.h) {
            d dVar = jVar.f19177a;
            if (dVar != null) {
                dVar.f17120a.release();
            }
        }
        g gVar = this.D;
        if (gVar != null) {
            o4.b bVar = (o4.b) gVar;
            synchronized (bVar) {
                o oVar = (o) bVar.f19146y.remove(this);
                if (oVar != null) {
                    b1 b1Var3 = oVar.f19201a;
                    b1Var3.A(true);
                    n3.e eVar3 = b1Var3.h;
                    if (eVar3 != null) {
                        eVar3.p(b1Var3.f14269e);
                        b1Var3.h = null;
                        b1Var3.f14271g = null;
                    }
                }
            }
        }
    }

    @Override
    public final int d(u0 u0Var, m3.i iVar, int i10) {
        if (!t()) {
            a aVar = this.H;
            b1 b1Var = this.f17147x;
            if (aVar != null && aVar.d(0) <= b1Var.q()) {
                return -3;
            }
            u();
            return b1Var.z(u0Var, iVar, i10, this.I);
        }
        return -3;
    }

    @Override
    public final boolean e() {
        if (!t() && this.f17147x.u(this.I)) {
            return true;
        }
        return false;
    }

    @Override
    public final void g(n0 n0Var, long j10, long j11, boolean z10) {
        e eVar = (e) n0Var;
        this.B = null;
        this.H = null;
        long j12 = eVar.f17127a;
        Uri uri = eVar.f17133r.f3667c;
        ?? obj = new Object();
        this.f17143n.getClass();
        this.h.d(obj, eVar.f17129c, this.f17138a, eVar.d, eVar.f17130e, eVar.f17131f, eVar.h, eVar.f17132n);
        if (!z10) {
            if (t()) {
                this.f17147x.A(false);
                for (b1 b1Var : this.f17148y) {
                    b1Var.A(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                k(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.E = this.F;
                }
            }
            this.f17142f.a(this);
        }
    }

    @Override
    public final long h() {
        if (t()) {
            return this.E;
        }
        if (this.I) {
            return Long.MIN_VALUE;
        }
        return l().f17132n;
    }

    @Override
    public final int i(long j10) {
        if (t()) {
            return 0;
        }
        boolean z10 = this.I;
        b1 b1Var = this.f17147x;
        int s10 = b1Var.s(j10, z10);
        a aVar = this.H;
        if (aVar != null) {
            s10 = Math.min(s10, aVar.d(0) - b1Var.q());
        }
        b1Var.E(s10);
        u();
        return s10;
    }

    @Override
    public final com.google.android.exoplayer2.upstream.k0 j(com.google.android.exoplayer2.upstream.n0 r27, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: n4.h.j(com.google.android.exoplayer2.upstream.n0, java.io.IOException, int):com.google.android.exoplayer2.upstream.k0");
    }

    public final a k(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.N(i10, arrayList.size(), arrayList);
        this.G = Math.max(this.G, arrayList.size());
        int i11 = 0;
        this.f17147x.k(aVar.d(0));
        while (true) {
            b1[] b1VarArr = this.f17148y;
            if (i11 < b1VarArr.length) {
                b1 b1Var = b1VarArr[i11];
                i11++;
                b1Var.k(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a l() {
        return (a) l1.i(1, this.v);
    }

    @Override
    public final void m(n0 n0Var, long j10, long j11) {
        e eVar = (e) n0Var;
        o3.f fVar = null;
        this.B = null;
        boolean z10 = eVar instanceof j;
        o4.l lVar = this.f17141e;
        if (z10) {
            int m10 = lVar.f19188i.m(((j) eVar).d);
            o4.j[] jVarArr = lVar.h;
            o4.j jVar = jVarArr[m10];
            if (jVar.d == null) {
                d dVar = jVar.f19177a;
                t tVar = dVar.f17125n;
                if (tVar instanceof o3.f) {
                    fVar = (o3.f) tVar;
                }
                if (fVar != null) {
                    p4.m mVar = jVar.f19178b;
                    jVarArr[m10] = new o4.j(jVar.f19180e, mVar, jVar.f19179c, dVar, jVar.f19181f, new f2.c(fVar, mVar.f45581c, 6));
                }
            }
        }
        o oVar = lVar.f19187g;
        if (oVar != null) {
            long j12 = oVar.d;
            if (j12 == -9223372036854775807L || eVar.f17132n > j12) {
                oVar.d = eVar.f17132n;
            }
            oVar.f19204e.h = true;
        }
        long j13 = eVar.f17127a;
        Uri uri = eVar.f17133r.f3667c;
        ?? obj = new Object();
        this.f17143n.getClass();
        this.h.f(obj, eVar.f17129c, this.f17138a, eVar.d, eVar.f17130e, eVar.f17131f, eVar.h, eVar.f17132n);
        this.f17142f.a(this);
    }

    public final boolean q(int i10) {
        int q6;
        a aVar = (a) this.v.get(i10);
        if (this.f17147x.q() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b1[] b1VarArr = this.f17148y;
            if (i11 >= b1VarArr.length) {
                return false;
            }
            q6 = b1VarArr[i11].q();
            i11++;
        } while (q6 <= aVar.d(i11));
        return true;
    }

    @Override
    public final boolean s(long r56) {
        throw new UnsupportedOperationException("Method not decompiled: n4.h.s(long):boolean");
    }

    public final boolean t() {
        if (this.E != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void u() {
        int v = v(this.f17147x.q(), this.G - 1);
        while (true) {
            int i10 = this.G;
            if (i10 <= v) {
                this.G = i10 + 1;
                a aVar = (a) this.v.get(i10);
                t0 t0Var = aVar.d;
                if (!t0Var.equals(this.C)) {
                    this.h.b(this.f17138a, t0Var, aVar.f17130e, aVar.f17131f, aVar.h);
                }
                this.C = t0Var;
            } else {
                return;
            }
        }
    }

    public final int v(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.v;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).d(0) <= i10);
        return i11 - 1;
    }

    public final void w(o4.b bVar) {
        b1[] b1VarArr;
        this.D = bVar;
        b1 b1Var = this.f17147x;
        b1Var.i();
        n3.e eVar = b1Var.h;
        if (eVar != null) {
            eVar.p(b1Var.f14269e);
            b1Var.h = null;
            b1Var.f14271g = null;
        }
        for (b1 b1Var2 : this.f17148y) {
            b1Var2.i();
            n3.e eVar2 = b1Var2.h;
            if (eVar2 != null) {
                eVar2.p(b1Var2.f14269e);
                b1Var2.h = null;
                b1Var2.f14271g = null;
            }
        }
        this.f17144r.e(this);
    }
}
