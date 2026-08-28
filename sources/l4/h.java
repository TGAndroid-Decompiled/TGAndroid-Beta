package l4;

import android.net.Uri;
import c2.t;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.r;
import d5.f0;
import h3.t0;
import h3.u0;
import j$.util.DesugarCollections;
import j3.r0;
import j4.a1;
import j4.b1;
import j4.d1;
import j4.h0;
import j4.y;
import java.util.ArrayList;
import java.util.List;
import m4.n;
public final class h implements b1, d1, l0, o0 {
    public final g5.b A;
    public e B;
    public t0 C;
    public g D;
    public long E;
    public long F;
    public int G;
    public a H;
    public boolean I;
    public final int f16671a;
    public final int[] f16672b;
    public final t0[] f16673c;
    public final boolean[] d;
    public final m4.k f16674e;
    public final m4.b f16675f;
    public final h0 h;
    public final v9.d f16676n;
    public final q0 f16677r = new q0("ChunkSampleStream");
    public final t f16678s = new t(3);
    public final ArrayList v;
    public final List f16679w;
    public final a1 f16680x;
    public final a1[] f16681y;

    public h(int i9, int[] iArr, t0[] t0VarArr, m4.k kVar, m4.b bVar, r rVar, long j10, l3.i iVar, a6.a aVar, v9.d dVar, h0 h0Var) {
        this.f16671a = i9;
        this.f16672b = iArr;
        this.f16673c = t0VarArr;
        this.f16674e = kVar;
        this.f16675f = bVar;
        this.h = h0Var;
        this.f16676n = dVar;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f16679w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f16681y = new a1[length];
        this.d = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        a1[] a1VarArr = new a1[i10];
        iVar.getClass();
        a1 a1Var = new a1(rVar, iVar, aVar);
        this.f16680x = a1Var;
        int i11 = 0;
        iArr2[0] = i9;
        a1VarArr[0] = a1Var;
        while (i11 < length) {
            a1 a1Var2 = new a1(rVar, null, null);
            this.f16681y[i11] = a1Var2;
            int i12 = i11 + 1;
            a1VarArr[i12] = a1Var2;
            iArr2[i12] = this.f16672b[i11];
            i11 = i12;
        }
        this.A = new g5.b(16, iArr2, a1VarArr);
        this.E = j10;
        this.F = j10;
    }

    public final int A(int i9, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.v;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).d(0) <= i9);
        return i10 - 1;
    }

    public final void B(m4.b bVar) {
        a1[] a1VarArr;
        this.D = bVar;
        a1 a1Var = this.f16680x;
        a1Var.i();
        l3.e eVar = a1Var.h;
        if (eVar != null) {
            eVar.k(a1Var.f13406e);
            a1Var.h = null;
            a1Var.f13408g = null;
        }
        for (a1 a1Var2 : this.f16681y) {
            a1Var2.i();
            l3.e eVar2 = a1Var2.h;
            if (eVar2 != null) {
                eVar2.k(a1Var2.f13406e);
                a1Var2.h = null;
                a1Var2.f13408g = null;
            }
        }
        this.f16677r.e(this);
    }

    @Override
    public final void a() {
        q0 q0Var = this.f16677r;
        q0Var.a();
        this.f16680x.w();
        if (!q0Var.d()) {
            m4.k kVar = this.f16674e;
            j4.b bVar = kVar.f17330l;
            if (bVar == null) {
                kVar.f17321a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean b() {
        return this.f16677r.d();
    }

    @Override
    public final void c() {
        a1[] a1VarArr;
        a1 a1Var = this.f16680x;
        a1Var.A(true);
        l3.e eVar = a1Var.h;
        if (eVar != null) {
            eVar.k(a1Var.f13406e);
            a1Var.h = null;
            a1Var.f13408g = null;
        }
        for (a1 a1Var2 : this.f16681y) {
            a1Var2.A(true);
            l3.e eVar2 = a1Var2.h;
            if (eVar2 != null) {
                eVar2.k(a1Var2.f13406e);
                a1Var2.h = null;
                a1Var2.f13408g = null;
            }
        }
        for (m4.i iVar : this.f16674e.h) {
            d dVar = iVar.f17316a;
            if (dVar != null) {
                dVar.f16653a.release();
            }
        }
        g gVar = this.D;
        if (gVar != null) {
            m4.b bVar = (m4.b) gVar;
            synchronized (bVar) {
                n nVar = (n) bVar.f17287y.remove(this);
                if (nVar != null) {
                    a1 a1Var3 = nVar.f17340a;
                    a1Var3.A(true);
                    l3.e eVar3 = a1Var3.h;
                    if (eVar3 != null) {
                        eVar3.k(a1Var3.f13406e);
                        a1Var3.h = null;
                        a1Var3.f13408g = null;
                    }
                }
            }
        }
    }

    @Override
    public final long d() {
        if (t()) {
            return this.E;
        }
        if (this.I) {
            return Long.MIN_VALUE;
        }
        return r().f16665n;
    }

    @Override
    public final void e(n0 n0Var, long j10, long j11, boolean z10) {
        e eVar = (e) n0Var;
        this.B = null;
        this.H = null;
        long j12 = eVar.f16660a;
        Uri uri = eVar.f16666r.f2653c;
        ?? obj = new Object();
        this.f16676n.getClass();
        this.h.d(obj, eVar.f16662c, this.f16671a, eVar.d, eVar.f16663e, eVar.f16664f, eVar.h, eVar.f16665n);
        if (!z10) {
            if (t()) {
                this.f16680x.A(false);
                for (a1 a1Var : this.f16681y) {
                    a1Var.A(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                p(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.E = this.F;
                }
            }
            this.f16675f.c(this);
        }
    }

    @Override
    public final boolean f() {
        if (!t() && this.f16680x.u(this.I)) {
            return true;
        }
        return false;
    }

    @Override
    public final com.google.android.exoplayer2.upstream.k0 h(com.google.android.exoplayer2.upstream.n0 r26, java.io.IOException r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: l4.h.h(com.google.android.exoplayer2.upstream.n0, java.io.IOException, int):com.google.android.exoplayer2.upstream.k0");
    }

    @Override
    public final int j(long j10) {
        if (t()) {
            return 0;
        }
        boolean z10 = this.I;
        a1 a1Var = this.f16680x;
        int s10 = a1Var.s(j10, z10);
        a aVar = this.H;
        if (aVar != null) {
            s10 = Math.min(s10, aVar.d(0) - a1Var.q());
        }
        a1Var.E(s10);
        y();
        return s10;
    }

    @Override
    public final int l(u0 u0Var, k3.i iVar, int i9) {
        if (!t()) {
            a aVar = this.H;
            a1 a1Var = this.f16680x;
            if (aVar != null && aVar.d(0) <= a1Var.q()) {
                return -3;
            }
            y();
            return a1Var.z(u0Var, iVar, i9, this.I);
        }
        return -3;
    }

    @Override
    public final void m(n0 n0Var, long j10, long j11) {
        e eVar = (e) n0Var;
        m3.f fVar = null;
        this.B = null;
        boolean z10 = eVar instanceof j;
        m4.k kVar = this.f16674e;
        if (z10) {
            int a2 = kVar.f17327i.a(((j) eVar).d);
            m4.i[] iVarArr = kVar.h;
            m4.i iVar = iVarArr[a2];
            if (iVar.d == null) {
                d dVar = iVar.f17316a;
                m3.t tVar = dVar.f16658n;
                if (tVar instanceof m3.f) {
                    fVar = (m3.f) tVar;
                }
                if (fVar != null) {
                    n4.m mVar = iVar.f17317b;
                    iVarArr[a2] = new m4.i(iVar.f17319e, mVar, iVar.f17318c, dVar, iVar.f17320f, new f2.d(fVar, mVar.f18432c, 6));
                }
            }
        }
        n nVar = kVar.f17326g;
        if (nVar != null) {
            long j12 = nVar.d;
            if (j12 == -9223372036854775807L || eVar.f16665n > j12) {
                nVar.d = eVar.f16665n;
            }
            nVar.f17343e.h = true;
        }
        long j13 = eVar.f16660a;
        Uri uri = eVar.f16666r.f2653c;
        ?? obj = new Object();
        this.f16676n.getClass();
        this.h.f(obj, eVar.f16662c, this.f16671a, eVar.d, eVar.f16663e, eVar.f16664f, eVar.h, eVar.f16665n);
        this.f16675f.c(this);
    }

    @Override
    public final boolean n(long r56) {
        throw new UnsupportedOperationException("Method not decompiled: l4.h.n(long):boolean");
    }

    public final a p(int i9) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i9);
        f0.N(i9, arrayList.size(), arrayList);
        this.G = Math.max(this.G, arrayList.size());
        int i10 = 0;
        this.f16680x.k(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.f16681y;
            if (i10 < a1VarArr.length) {
                a1 a1Var = a1VarArr[i10];
                i10++;
                a1Var.k(aVar.d(i10));
            } else {
                return aVar;
            }
        }
    }

    public final a r() {
        return (a) r0.j(1, this.v);
    }

    public final boolean s(int i9) {
        int q10;
        a aVar = (a) this.v.get(i9);
        if (this.f16680x.q() > aVar.d(0)) {
            return true;
        }
        int i10 = 0;
        do {
            a1[] a1VarArr = this.f16681y;
            if (i10 >= a1VarArr.length) {
                return false;
            }
            q10 = a1VarArr[i10].q();
            i10++;
        } while (q10 <= aVar.d(i10));
        return true;
    }

    public final boolean t() {
        if (this.E != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long v() {
        if (this.I) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.E;
        }
        long j10 = this.F;
        a r10 = r();
        if (!r10.c()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                r10 = (a) r0.j(2, arrayList);
            } else {
                r10 = null;
            }
        }
        if (r10 != null) {
            j10 = Math.max(j10, r10.f16665n);
        }
        return Math.max(j10, this.f16680x.n());
    }

    public final void y() {
        int A = A(this.f16680x.q(), this.G - 1);
        while (true) {
            int i9 = this.G;
            if (i9 <= A) {
                this.G = i9 + 1;
                a aVar = (a) this.v.get(i9);
                t0 t0Var = aVar.d;
                if (!t0Var.equals(this.C)) {
                    this.h.b(this.f16671a, t0Var, aVar.f16663e, aVar.f16664f, aVar.h);
                }
                this.C = t0Var;
            } else {
                return;
            }
        }
    }

    @Override
    public final void z(long j10) {
        int size;
        q0 q0Var = this.f16677r;
        if (!q0Var.c() && !t()) {
            boolean d = q0Var.d();
            boolean z10 = false;
            List list = this.f16679w;
            m4.k kVar = this.f16674e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.B;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !s(arrayList.size() - 1)) {
                    if (kVar.f17330l == null) {
                        z10 = kVar.f17327i.c(j10, eVar, list);
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
            if (kVar.f17330l == null && kVar.f17327i.length() >= 2) {
                size = kVar.f17327i.k(j10, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                d5.a.i(!q0Var.d());
                int size2 = arrayList.size();
                while (true) {
                    if (size < size2) {
                        if (!s(size)) {
                            break;
                        }
                        size++;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size != -1) {
                    long j11 = r().f16665n;
                    a p6 = p(size);
                    if (arrayList.isEmpty()) {
                        this.E = this.F;
                    }
                    this.I = false;
                    long j12 = p6.h;
                    h0 h0Var = this.h;
                    h0Var.m(new y(1, this.f16671a, null, 3, null, h0Var.a(j12), h0Var.a(j11)));
                }
            }
        }
    }
}
