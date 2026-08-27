package l4;

import android.net.Uri;
import android.os.SystemClock;
import b5.s;
import c2.t;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.x0;
import h3.t0;
import h3.u0;
import h7.u;
import j$.util.DesugarCollections;
import j4.a1;
import j4.b1;
import j4.d1;
import j4.g0;
import j4.p;
import j4.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import m4.n;
import m4.o;
import n2.v;
import p8.z;

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

    public final int f15428a;

    public final int[] f15429b;

    public final t0[] f15430c;
    public final boolean[] d;

    public final m4.k f15431e;

    public final m4.b f15432f;
    public final g0 h;

    public final ab.a f15433n;

    public final q0 f15434r = new q0("ChunkSampleStream");

    public final t f15435s = new t(3);
    public final ArrayList v;

    public final List f15436w;

    public final a1 f15437x;

    public final a1[] f15438y;

    public h(int i10, int[] iArr, t0[] t0VarArr, m4.k kVar, m4.b bVar, r rVar, long j10, l3.j jVar, b6.a aVar, ab.a aVar2, g0 g0Var) {
        this.f15428a = i10;
        this.f15429b = iArr;
        this.f15430c = t0VarArr;
        this.f15431e = kVar;
        this.f15432f = bVar;
        this.h = g0Var;
        this.f15433n = aVar2;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f15436w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f15438y = new a1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        a1[] a1VarArr = new a1[i11];
        jVar.getClass();
        a1 a1Var = new a1(rVar, jVar, aVar);
        this.f15437x = a1Var;
        int i12 = 0;
        iArr2[0] = i10;
        a1VarArr[0] = a1Var;
        while (i12 < length) {
            a1 a1Var2 = new a1(rVar, null, null);
            this.f15438y[i12] = a1Var2;
            int i13 = i12 + 1;
            a1VarArr[i13] = a1Var2;
            iArr2[i13] = this.f15429b[i12];
            i12 = i13;
        }
        this.A = new g5.b(14, iArr2, a1VarArr);
        this.E = j10;
        this.F = j10;
    }

    @Override
    public final long D() {
        if (this.I) {
            return Long.MIN_VALUE;
        }
        if (r()) {
            return this.E;
        }
        long jMax = this.F;
        a aVarK = k();
        if (!aVarK.c()) {
            ArrayList arrayList = this.v;
            aVarK = arrayList.size() > 1 ? (a) i0.a.i(2, arrayList) : null;
        }
        if (aVarK != null) {
            jMax = Math.max(jMax, aVarK.f15422n);
        }
        return Math.max(jMax, this.f15437x.n());
    }

    @Override
    public final void I(long j10) {
        q0 q0Var = this.f15434r;
        if (q0Var.c() || r()) {
            return;
        }
        boolean zD = q0Var.d();
        List list = this.f15436w;
        m4.k kVar = this.f15431e;
        ArrayList arrayList = this.v;
        if (zD) {
            e eVar = this.B;
            eVar.getClass();
            boolean z10 = eVar instanceof a;
            if (z10 && n(arrayList.size() - 1)) {
                return;
            }
            if (kVar.f17706l == null ? kVar.f17703i.c(j10, eVar, list) : false) {
                q0Var.b();
                if (z10) {
                    this.H = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int size = (kVar.f17706l != null || kVar.f17703i.length() < 2) ? list.size() : kVar.f17703i.k(j10, list);
        if (size < arrayList.size()) {
            d5.a.i(!q0Var.d());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!n(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j11 = k().f15422n;
            a aVarJ = j(size);
            if (arrayList.isEmpty()) {
                this.E = this.F;
            }
            this.I = false;
            long j12 = aVarJ.h;
            g0 g0Var = this.h;
            g0Var.m(new x(1, this.f15428a, null, 3, null, g0Var.a(j12), g0Var.a(j11)));
        }
    }

    @Override
    public final void a() throws j4.b, l3.e {
        q0 q0Var = this.f15434r;
        q0Var.a();
        this.f15437x.w();
        if (q0Var.d()) {
            return;
        }
        m4.k kVar = this.f15431e;
        j4.b bVar = kVar.f17706l;
        if (bVar != null) {
            throw bVar;
        }
        kVar.f17697a.a();
    }

    @Override
    public final boolean b() {
        return this.f15434r.d();
    }

    @Override
    public final void c() {
        a1 a1Var = this.f15437x;
        a1Var.A(true);
        l3.f fVar = a1Var.h;
        if (fVar != null) {
            fVar.h(a1Var.f12510e);
            a1Var.h = null;
            a1Var.f12512g = null;
        }
        for (a1 a1Var2 : this.f15438y) {
            a1Var2.A(true);
            l3.f fVar2 = a1Var2.h;
            if (fVar2 != null) {
                fVar2.h(a1Var2.f12510e);
                a1Var2.h = null;
                a1Var2.f12512g = null;
            }
        }
        for (m4.i iVar : this.f15431e.h) {
            d dVar = iVar.f17692a;
            if (dVar != null) {
                dVar.f15410a.release();
            }
        }
        g gVar = this.D;
        if (gVar != null) {
            m4.b bVar = (m4.b) gVar;
            synchronized (bVar) {
                n nVar = (n) bVar.f17663y.remove(this);
                if (nVar != null) {
                    a1 a1Var3 = nVar.f17716a;
                    a1Var3.A(true);
                    l3.f fVar3 = a1Var3.h;
                    if (fVar3 != null) {
                        fVar3.h(a1Var3.f12510e);
                        a1Var3.h = null;
                        a1Var3.f12512g = null;
                    }
                }
            }
        }
    }

    @Override
    public final void d(n0 n0Var, long j10, long j11, boolean z10) {
        e eVar = (e) n0Var;
        this.B = null;
        this.H = null;
        long j12 = eVar.f15417a;
        Uri uri = eVar.f15423r.f3090c;
        p pVar = new p();
        this.f15433n.getClass();
        this.h.d(pVar, eVar.f15419c, this.f15428a, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n);
        if (z10) {
            return;
        }
        if (r()) {
            this.f15437x.A(false);
            for (a1 a1Var : this.f15438y) {
                a1Var.A(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.v;
            j(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.E = this.F;
            }
        }
        this.f15432f.a(this);
    }

    @Override
    public final boolean e() {
        return !r() && this.f15437x.u(this.I);
    }

    @Override
    public final int f(long j10) throws Throwable {
        if (r()) {
            return 0;
        }
        boolean z10 = this.I;
        a1 a1Var = this.f15437x;
        int iS = a1Var.s(j10, z10);
        a aVar = this.H;
        if (aVar != null) {
            iS = Math.min(iS, aVar.d(0) - a1Var.q());
        }
        a1Var.E(iS);
        s();
        return iS;
    }

    @Override
    public final long g() {
        if (r()) {
            return this.E;
        }
        if (this.I) {
            return Long.MIN_VALUE;
        }
        return k().f15422n;
    }

    @Override
    public final k0 h(n0 n0Var, IOException iOException, int i10) {
        p pVar;
        boolean z10;
        n4.b bVar;
        n4.b bVarL;
        s sVar;
        z zVar;
        long jElapsedRealtime;
        ArrayList arrayList;
        int length;
        ab.a aVar;
        int i11;
        int i12;
        HashSet hashSet;
        int i13;
        j0 j0Var;
        HashSet hashSet2;
        ArrayList arrayListJ;
        boolean z11;
        int i14;
        k0 k0VarX3;
        long j10;
        int i15;
        long jElapsedRealtime2;
        String str;
        HashMap map;
        long jMax;
        int i16;
        Integer numValueOf;
        HashMap map2;
        boolean zE;
        k0 k0Var;
        boolean zA;
        long jA3;
        boolean z12;
        e eVar = (e) n0Var;
        x0 x0Var = eVar.f15423r;
        t0 t0Var = eVar.d;
        long j11 = eVar.h;
        long j12 = x0Var.f3089b;
        boolean z13 = eVar instanceof a;
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size() - 1;
        boolean z14 = (j12 != 0 && z13 && n(size)) ? false : true;
        Uri uri = eVar.f15423r.f3090c;
        p pVar2 = new p();
        d5.g0.S(j11);
        d5.g0.S(eVar.f15422n);
        v vVar = new v(iOException, i10, 1);
        m4.k kVar = this.f15431e;
        m4.i[] iVarArr = kVar.h;
        com.google.firebase.messaging.t tVar = kVar.f17698b;
        ab.a aVar2 = this.f15433n;
        if (z14) {
            pVar = pVar2;
            n nVar = kVar.f17702g;
            if (nVar != null) {
                long j13 = nVar.d;
                boolean z15 = j13 != -9223372036854775807L && j13 < j11;
                o oVar = nVar.f17719e;
                if (oVar.f17724f.d) {
                    if (!oVar.f17725n) {
                        if (!z15) {
                            if (kVar.f17704j.d && (eVar instanceof k) && (iOException instanceof h0) && ((h0) iOException).d == 404) {
                                m4.i iVar = iVarArr[kVar.f17703i.a(t0Var)];
                                z10 = z14;
                                long jF = iVar.d.F(iVar.f17695e);
                                if (jF != -1 && jF != 0) {
                                    if (((k) eVar).b() > ((iVar.d.E() + iVar.f17696f) + jF) - 1) {
                                        kVar.f17707m = true;
                                    }
                                    z11 = z13;
                                    arrayList = arrayList2;
                                    aVar = aVar2;
                                    zE = true;
                                }
                            } else {
                                z10 = z14;
                            }
                            m4.i iVar2 = iVarArr[kVar.f17703i.a(t0Var)];
                            n4.m mVar = iVar2.f17693b;
                            bVar = iVar2.f17694c;
                            bVarL = tVar.L(mVar.f18258b);
                            if (bVarL != null || bVar.equals(bVarL)) {
                                sVar = kVar.f17703i;
                                zVar = iVar2.f17693b.f18258b;
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                arrayList = arrayList2;
                                length = sVar.length();
                                aVar = aVar2;
                                i12 = 0;
                                for (i11 = 0; i11 < length; i11++) {
                                    if (sVar.f(i11, jElapsedRealtime)) {
                                        i12++;
                                    }
                                }
                                hashSet = new HashSet();
                                for (i13 = 0; i13 < zVar.size(); i13++) {
                                    hashSet.add(Integer.valueOf(((n4.b) zVar.get(i13)).f18216c));
                                }
                                int size2 = hashSet.size();
                                hashSet2 = new HashSet();
                                arrayListJ = tVar.j(zVar);
                                z11 = z13;
                                for (i14 = 0; i14 < arrayListJ.size(); i14++) {
                                    hashSet2.add(Integer.valueOf(((n4.b) arrayListJ.get(i14)).f18216c));
                                }
                                j0Var = new j0(size2, size2 - hashSet2.size(), length, i12);
                                if (j0Var.a(2) || j0Var.a(1)) {
                                    aVar.getClass();
                                    k0VarX3 = ab.a.x3(j0Var, vVar);
                                    if (k0VarX3 != null) {
                                        j10 = k0VarX3.f3000b;
                                        i15 = k0VarX3.f2999a;
                                        if (j0Var.a(i15)) {
                                            if (i15 == 2) {
                                                s sVar2 = kVar.f17703i;
                                                zE = sVar2.e(sVar2.a(t0Var), j10);
                                            } else if (i15 == 1) {
                                                jElapsedRealtime2 = SystemClock.elapsedRealtime() + j10;
                                                str = bVar.f18215b;
                                                map = (HashMap) tVar.f4619b;
                                                if (map.containsKey(str)) {
                                                    Long l10 = (Long) map.get(str);
                                                    int i17 = d5.g0.f4795a;
                                                    jMax = Math.max(jElapsedRealtime2, l10.longValue());
                                                } else {
                                                    jMax = jElapsedRealtime2;
                                                }
                                                map.put(str, Long.valueOf(jMax));
                                                i16 = bVar.f18216c;
                                                if (i16 != Integer.MIN_VALUE) {
                                                    numValueOf = Integer.valueOf(i16);
                                                    map2 = (HashMap) tVar.f4620c;
                                                    if (map2.containsKey(numValueOf)) {
                                                        Long l11 = (Long) map2.get(numValueOf);
                                                        int i18 = d5.g0.f4795a;
                                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l11.longValue());
                                                    }
                                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                                }
                                            }
                                        }
                                        zE = false;
                                    }
                                }
                            } else {
                                z11 = z13;
                                arrayList = arrayList2;
                                aVar = aVar2;
                            }
                            zE = true;
                        } else if (oVar.h) {
                            oVar.f17725n = true;
                            oVar.h = false;
                            m4.g gVar = (m4.g) oVar.f17721b.f14480b;
                            gVar.D.removeCallbacks(gVar.f17688w);
                            gVar.v();
                        }
                    }
                    z10 = z14;
                    z11 = z13;
                    arrayList = arrayList2;
                    aVar = aVar2;
                    zE = true;
                } else {
                    if (kVar.f17704j.d) {
                        z10 = z14;
                        m4.i iVar3 = iVarArr[kVar.f17703i.a(t0Var)];
                        n4.m mVar2 = iVar3.f17693b;
                        bVar = iVar3.f17694c;
                        bVarL = tVar.L(mVar2.f18258b);
                        if (bVarL != null) {
                        }
                        sVar = kVar.f17703i;
                        zVar = iVar3.f17693b.f18258b;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        arrayList = arrayList2;
                        length = sVar.length();
                        aVar = aVar2;
                        i12 = 0;
                        while (i11 < length) {
                            if (sVar.f(i11, jElapsedRealtime)) {
                                i12++;
                            }
                        }
                        hashSet = new HashSet();
                        while (i13 < zVar.size()) {
                            hashSet.add(Integer.valueOf(((n4.b) zVar.get(i13)).f18216c));
                        }
                        int size3 = hashSet.size();
                        hashSet2 = new HashSet();
                        arrayListJ = tVar.j(zVar);
                        z11 = z13;
                        while (i14 < arrayListJ.size()) {
                            hashSet2.add(Integer.valueOf(((n4.b) arrayListJ.get(i14)).f18216c));
                        }
                        j0Var = new j0(size3, size3 - hashSet2.size(), length, i12);
                        if (j0Var.a(2)) {
                            aVar.getClass();
                            k0VarX3 = ab.a.x3(j0Var, vVar);
                            if (k0VarX3 != null) {
                                j10 = k0VarX3.f3000b;
                                i15 = k0VarX3.f2999a;
                                if (j0Var.a(i15)) {
                                    if (i15 == 2) {
                                        s sVar3 = kVar.f17703i;
                                        zE = sVar3.e(sVar3.a(t0Var), j10);
                                    } else if (i15 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j10;
                                        str = bVar.f18215b;
                                        map = (HashMap) tVar.f4619b;
                                        if (map.containsKey(str)) {
                                            Long l12 = (Long) map.get(str);
                                            int i19 = d5.g0.f4795a;
                                            jMax = Math.max(jElapsedRealtime2, l12.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i16 = bVar.f18216c;
                                        if (i16 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i16);
                                            map2 = (HashMap) tVar.f4620c;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l13 = (Long) map2.get(numValueOf);
                                                int i110 = d5.g0.f4795a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l13.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zE = true;
                                    }
                                }
                                zE = false;
                            }
                        } else {
                            aVar.getClass();
                            k0VarX3 = ab.a.x3(j0Var, vVar);
                            if (k0VarX3 != null) {
                                j10 = k0VarX3.f3000b;
                                i15 = k0VarX3.f2999a;
                                if (j0Var.a(i15)) {
                                    if (i15 == 2) {
                                        s sVar4 = kVar.f17703i;
                                        zE = sVar4.e(sVar4.a(t0Var), j10);
                                    } else if (i15 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j10;
                                        str = bVar.f18215b;
                                        map = (HashMap) tVar.f4619b;
                                        if (map.containsKey(str)) {
                                            Long l14 = (Long) map.get(str);
                                            int i111 = d5.g0.f4795a;
                                            jMax = Math.max(jElapsedRealtime2, l14.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i16 = bVar.f18216c;
                                        if (i16 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i16);
                                            map2 = (HashMap) tVar.f4620c;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l15 = (Long) map2.get(numValueOf);
                                                int i112 = d5.g0.f4795a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l15.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zE = true;
                                    }
                                }
                                zE = false;
                            }
                        }
                    } else {
                        z10 = z14;
                        m4.i iVar4 = iVarArr[kVar.f17703i.a(t0Var)];
                        n4.m mVar3 = iVar4.f17693b;
                        bVar = iVar4.f17694c;
                        bVarL = tVar.L(mVar3.f18258b);
                        if (bVarL != null) {
                        }
                        sVar = kVar.f17703i;
                        zVar = iVar4.f17693b.f18258b;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        arrayList = arrayList2;
                        length = sVar.length();
                        aVar = aVar2;
                        i12 = 0;
                        while (i11 < length) {
                            if (sVar.f(i11, jElapsedRealtime)) {
                                i12++;
                            }
                        }
                        hashSet = new HashSet();
                        while (i13 < zVar.size()) {
                            hashSet.add(Integer.valueOf(((n4.b) zVar.get(i13)).f18216c));
                        }
                        int size4 = hashSet.size();
                        hashSet2 = new HashSet();
                        arrayListJ = tVar.j(zVar);
                        z11 = z13;
                        while (i14 < arrayListJ.size()) {
                            hashSet2.add(Integer.valueOf(((n4.b) arrayListJ.get(i14)).f18216c));
                        }
                        j0Var = new j0(size4, size4 - hashSet2.size(), length, i12);
                        if (j0Var.a(2)) {
                            aVar.getClass();
                            k0VarX3 = ab.a.x3(j0Var, vVar);
                            if (k0VarX3 != null) {
                                j10 = k0VarX3.f3000b;
                                i15 = k0VarX3.f2999a;
                                if (j0Var.a(i15)) {
                                    if (i15 == 2) {
                                        s sVar5 = kVar.f17703i;
                                        zE = sVar5.e(sVar5.a(t0Var), j10);
                                    } else if (i15 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j10;
                                        str = bVar.f18215b;
                                        map = (HashMap) tVar.f4619b;
                                        if (map.containsKey(str)) {
                                            Long l16 = (Long) map.get(str);
                                            int i113 = d5.g0.f4795a;
                                            jMax = Math.max(jElapsedRealtime2, l16.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i16 = bVar.f18216c;
                                        if (i16 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i16);
                                            map2 = (HashMap) tVar.f4620c;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l17 = (Long) map2.get(numValueOf);
                                                int i114 = d5.g0.f4795a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l17.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zE = true;
                                    }
                                }
                                zE = false;
                            }
                        } else {
                            aVar.getClass();
                            k0VarX3 = ab.a.x3(j0Var, vVar);
                            if (k0VarX3 != null) {
                                j10 = k0VarX3.f3000b;
                                i15 = k0VarX3.f2999a;
                                if (j0Var.a(i15)) {
                                    if (i15 == 2) {
                                        s sVar6 = kVar.f17703i;
                                        zE = sVar6.e(sVar6.a(t0Var), j10);
                                    } else if (i15 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j10;
                                        str = bVar.f18215b;
                                        map = (HashMap) tVar.f4619b;
                                        if (map.containsKey(str)) {
                                            Long l18 = (Long) map.get(str);
                                            int i115 = d5.g0.f4795a;
                                            jMax = Math.max(jElapsedRealtime2, l18.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i16 = bVar.f18216c;
                                        if (i16 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i16);
                                            map2 = (HashMap) tVar.f4620c;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l19 = (Long) map2.get(numValueOf);
                                                int i116 = d5.g0.f4795a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l19.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zE = true;
                                    }
                                }
                                zE = false;
                            }
                        }
                    }
                    z11 = z13;
                    arrayList = arrayList2;
                    aVar = aVar2;
                    zE = true;
                }
            } else {
                if (kVar.f17704j.d) {
                    z10 = z14;
                    m4.i iVar5 = iVarArr[kVar.f17703i.a(t0Var)];
                    n4.m mVar4 = iVar5.f17693b;
                    bVar = iVar5.f17694c;
                    bVarL = tVar.L(mVar4.f18258b);
                    if (bVarL != null) {
                    }
                    sVar = kVar.f17703i;
                    zVar = iVar5.f17693b.f18258b;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    arrayList = arrayList2;
                    length = sVar.length();
                    aVar = aVar2;
                    i12 = 0;
                    while (i11 < length) {
                        if (sVar.f(i11, jElapsedRealtime)) {
                            i12++;
                        }
                    }
                    hashSet = new HashSet();
                    while (i13 < zVar.size()) {
                        hashSet.add(Integer.valueOf(((n4.b) zVar.get(i13)).f18216c));
                    }
                    int size5 = hashSet.size();
                    hashSet2 = new HashSet();
                    arrayListJ = tVar.j(zVar);
                    z11 = z13;
                    while (i14 < arrayListJ.size()) {
                        hashSet2.add(Integer.valueOf(((n4.b) arrayListJ.get(i14)).f18216c));
                    }
                    j0Var = new j0(size5, size5 - hashSet2.size(), length, i12);
                    if (j0Var.a(2)) {
                        aVar.getClass();
                        k0VarX3 = ab.a.x3(j0Var, vVar);
                        if (k0VarX3 != null) {
                            j10 = k0VarX3.f3000b;
                            i15 = k0VarX3.f2999a;
                            if (j0Var.a(i15)) {
                                if (i15 == 2) {
                                    s sVar7 = kVar.f17703i;
                                    zE = sVar7.e(sVar7.a(t0Var), j10);
                                } else if (i15 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j10;
                                    str = bVar.f18215b;
                                    map = (HashMap) tVar.f4619b;
                                    if (map.containsKey(str)) {
                                        Long l110 = (Long) map.get(str);
                                        int i117 = d5.g0.f4795a;
                                        jMax = Math.max(jElapsedRealtime2, l110.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i16 = bVar.f18216c;
                                    if (i16 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i16);
                                        map2 = (HashMap) tVar.f4620c;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l111 = (Long) map2.get(numValueOf);
                                            int i118 = d5.g0.f4795a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l111.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zE = true;
                                }
                            }
                            zE = false;
                        }
                    } else {
                        aVar.getClass();
                        k0VarX3 = ab.a.x3(j0Var, vVar);
                        if (k0VarX3 != null) {
                            j10 = k0VarX3.f3000b;
                            i15 = k0VarX3.f2999a;
                            if (j0Var.a(i15)) {
                                if (i15 == 2) {
                                    s sVar8 = kVar.f17703i;
                                    zE = sVar8.e(sVar8.a(t0Var), j10);
                                } else if (i15 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j10;
                                    str = bVar.f18215b;
                                    map = (HashMap) tVar.f4619b;
                                    if (map.containsKey(str)) {
                                        Long l112 = (Long) map.get(str);
                                        int i119 = d5.g0.f4795a;
                                        jMax = Math.max(jElapsedRealtime2, l112.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i16 = bVar.f18216c;
                                    if (i16 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i16);
                                        map2 = (HashMap) tVar.f4620c;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l113 = (Long) map2.get(numValueOf);
                                            int i1110 = d5.g0.f4795a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l113.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zE = true;
                                }
                            }
                            zE = false;
                        }
                    }
                } else {
                    z10 = z14;
                    m4.i iVar6 = iVarArr[kVar.f17703i.a(t0Var)];
                    n4.m mVar5 = iVar6.f17693b;
                    bVar = iVar6.f17694c;
                    bVarL = tVar.L(mVar5.f18258b);
                    if (bVarL != null) {
                    }
                    sVar = kVar.f17703i;
                    zVar = iVar6.f17693b.f18258b;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    arrayList = arrayList2;
                    length = sVar.length();
                    aVar = aVar2;
                    i12 = 0;
                    while (i11 < length) {
                        if (sVar.f(i11, jElapsedRealtime)) {
                            i12++;
                        }
                    }
                    hashSet = new HashSet();
                    while (i13 < zVar.size()) {
                        hashSet.add(Integer.valueOf(((n4.b) zVar.get(i13)).f18216c));
                    }
                    int size6 = hashSet.size();
                    hashSet2 = new HashSet();
                    arrayListJ = tVar.j(zVar);
                    z11 = z13;
                    while (i14 < arrayListJ.size()) {
                        hashSet2.add(Integer.valueOf(((n4.b) arrayListJ.get(i14)).f18216c));
                    }
                    j0Var = new j0(size6, size6 - hashSet2.size(), length, i12);
                    if (j0Var.a(2)) {
                        aVar.getClass();
                        k0VarX3 = ab.a.x3(j0Var, vVar);
                        if (k0VarX3 != null) {
                            j10 = k0VarX3.f3000b;
                            i15 = k0VarX3.f2999a;
                            if (j0Var.a(i15)) {
                                if (i15 == 2) {
                                    s sVar9 = kVar.f17703i;
                                    zE = sVar9.e(sVar9.a(t0Var), j10);
                                } else if (i15 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j10;
                                    str = bVar.f18215b;
                                    map = (HashMap) tVar.f4619b;
                                    if (map.containsKey(str)) {
                                        Long l114 = (Long) map.get(str);
                                        int i1111 = d5.g0.f4795a;
                                        jMax = Math.max(jElapsedRealtime2, l114.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i16 = bVar.f18216c;
                                    if (i16 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i16);
                                        map2 = (HashMap) tVar.f4620c;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l115 = (Long) map2.get(numValueOf);
                                            int i1112 = d5.g0.f4795a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l115.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zE = true;
                                }
                            }
                            zE = false;
                        }
                    } else {
                        aVar.getClass();
                        k0VarX3 = ab.a.x3(j0Var, vVar);
                        if (k0VarX3 != null) {
                            j10 = k0VarX3.f3000b;
                            i15 = k0VarX3.f2999a;
                            if (j0Var.a(i15)) {
                                if (i15 == 2) {
                                    s sVar10 = kVar.f17703i;
                                    zE = sVar10.e(sVar10.a(t0Var), j10);
                                } else if (i15 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j10;
                                    str = bVar.f18215b;
                                    map = (HashMap) tVar.f4619b;
                                    if (map.containsKey(str)) {
                                        Long l116 = (Long) map.get(str);
                                        int i1113 = d5.g0.f4795a;
                                        jMax = Math.max(jElapsedRealtime2, l116.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i16 = bVar.f18216c;
                                    if (i16 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i16);
                                        map2 = (HashMap) tVar.f4620c;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l117 = (Long) map2.get(numValueOf);
                                            int i1114 = d5.g0.f4795a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l117.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zE = true;
                                }
                            }
                            zE = false;
                        }
                    }
                }
                z11 = z13;
                arrayList = arrayList2;
                aVar = aVar2;
                zE = true;
            }
            if (!zE) {
                k0Var = null;
            } else if (z10) {
                if (z11) {
                    if (j(size) == eVar) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    d5.a.i(z12);
                    if (arrayList.isEmpty()) {
                        this.E = this.F;
                    }
                }
                k0Var = q0.f3028e;
            } else {
                d5.a.K("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                k0Var = null;
            }
            if (k0Var == null) {
                aVar.getClass();
                jA3 = ab.a.A3(vVar);
                if (jA3 != -9223372036854775807L) {
                    k0Var = new k0(0, jA3, false);
                } else {
                    k0Var = q0.f3029f;
                }
            }
            k0 k0Var2 = k0Var;
            zA = k0Var2.a();
            this.h.h(pVar, eVar.f15419c, this.f15428a, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n, iOException, !zA);
            if (!zA) {
                this.B = null;
                aVar.getClass();
                this.f15432f.a(this);
            }
            return k0Var2;
        }
        pVar = pVar2;
        z10 = z14;
        z11 = z13;
        arrayList = arrayList2;
        aVar = aVar2;
        zE = false;
        if (!zE) {
            k0Var = null;
        } else if (z10) {
            if (z11) {
                if (j(size) == eVar) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d5.a.i(z12);
                if (arrayList.isEmpty()) {
                    this.E = this.F;
                }
            }
            k0Var = q0.f3028e;
        } else {
            d5.a.K("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            k0Var = null;
        }
        if (k0Var == null) {
            aVar.getClass();
            jA3 = ab.a.A3(vVar);
            if (jA3 != -9223372036854775807L) {
                k0Var = new k0(0, jA3, false);
            } else {
                k0Var = q0.f3029f;
            }
        }
        k0 k0Var3 = k0Var;
        zA = k0Var3.a();
        this.h.h(pVar, eVar.f15419c, this.f15428a, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n, iOException, !zA);
        if (!zA) {
            this.B = null;
            aVar.getClass();
            this.f15432f.a(this);
        }
        return k0Var3;
    }

    @Override
    public final int i(u0 u0Var, k3.i iVar, int i10) {
        if (r()) {
            return -3;
        }
        a aVar = this.H;
        a1 a1Var = this.f15437x;
        if (aVar != null && aVar.d(0) <= a1Var.q()) {
            return -3;
        }
        s();
        return a1Var.z(u0Var, iVar, i10, this.I);
    }

    public final a j(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d5.g0.N(i10, arrayList.size(), arrayList);
        this.G = Math.max(this.G, arrayList.size());
        int i11 = 0;
        this.f15437x.k(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.f15438y;
            if (i11 >= a1VarArr.length) {
                return aVar;
            }
            a1 a1Var = a1VarArr[i11];
            i11++;
            a1Var.k(aVar.d(i11));
        }
    }

    public final a k() {
        return (a) i0.a.i(1, this.v);
    }

    @Override
    public final void l(n0 n0Var, long j10, long j11) {
        e eVar = (e) n0Var;
        this.B = null;
        boolean z10 = eVar instanceof j;
        m4.k kVar = this.f15431e;
        if (z10) {
            int iA = kVar.f17703i.a(((j) eVar).d);
            m4.i[] iVarArr = kVar.h;
            m4.i iVar = iVarArr[iA];
            if (iVar.d == null) {
                d dVar = iVar.f17692a;
                m3.t tVar = dVar.f15415n;
                m3.f fVar = tVar instanceof m3.f ? (m3.f) tVar : null;
                if (fVar != null) {
                    n4.m mVar = iVar.f17693b;
                    iVarArr[iA] = new m4.i(iVar.f17695e, mVar, iVar.f17694c, dVar, iVar.f17696f, new f2.c(fVar, mVar.f18259c, 6));
                }
            }
        }
        n nVar = kVar.f17702g;
        if (nVar != null) {
            long j12 = nVar.d;
            if (j12 == -9223372036854775807L || eVar.f15422n > j12) {
                nVar.d = eVar.f15422n;
            }
            nVar.f17719e.h = true;
        }
        long j13 = eVar.f15417a;
        Uri uri = eVar.f15423r.f3090c;
        p pVar = new p();
        this.f15433n.getClass();
        this.h.f(pVar, eVar.f15419c, this.f15428a, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n);
        this.f15432f.a(this);
    }

    public final boolean n(int i10) {
        int iQ;
        a aVar = (a) this.v.get(i10);
        if (this.f15437x.q() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            a1[] a1VarArr = this.f15438y;
            if (i11 >= a1VarArr.length) {
                return false;
            }
            iQ = a1VarArr[i11].q();
            i11++;
        } while (iQ <= aVar.d(i11));
        return true;
    }

    @Override
    public final boolean q(long j10) {
        long j11;
        List list;
        t tVar;
        long j12;
        List list2;
        List list3;
        k kVar;
        boolean z10;
        long j13;
        long jMax;
        q0 q0Var;
        t tVar2;
        Object iVar;
        boolean z11;
        boolean z12;
        e eVar;
        boolean z13;
        g5.b bVar;
        a aVar;
        a1[] a1VarArr;
        int[] iArr;
        int i10;
        long j14;
        long j15;
        int i11;
        if (this.I) {
            return false;
        }
        q0 q0Var2 = this.f15434r;
        if (q0Var2.d() || q0Var2.c()) {
            return false;
        }
        boolean zR = r();
        if (zR) {
            list = Collections.EMPTY_LIST;
            j11 = this.E;
        } else {
            j11 = k().f15422n;
            list = this.f15436w;
        }
        List list4 = list;
        m4.k kVar2 = this.f15431e;
        m4.i[] iVarArr = kVar2.h;
        j4.b bVar2 = kVar2.f17706l;
        t tVar3 = this.f15435s;
        if (bVar2 == null) {
            long j16 = j11 - j10;
            tVar = tVar3;
            j12 = -9223372036854775807L;
            long jH = d5.g0.H(kVar2.f17704j.b(kVar2.f17705k).f18245b) + d5.g0.H(kVar2.f17704j.f18217a) + j11;
            n nVar = kVar2.f17702g;
            if (nVar != null) {
                o oVar = nVar.f17719e;
                n4.c cVar = oVar.f17724f;
                k5.i iVar2 = oVar.f17721b;
                if (!cVar.d) {
                    list2 = list4;
                    z11 = false;
                } else if (oVar.f17725n) {
                    list2 = list4;
                    z11 = true;
                } else {
                    list2 = list4;
                    Map.Entry entryCeilingEntry = oVar.f17723e.ceilingEntry(Long.valueOf(cVar.h));
                    if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jH) {
                        z11 = false;
                    } else {
                        long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                        m4.g gVar = (m4.g) iVar2.f14480b;
                        long j17 = gVar.N;
                        if (j17 == -9223372036854775807L || j17 < jLongValue) {
                            gVar.N = jLongValue;
                        }
                        z11 = true;
                    }
                    if (z11 && oVar.h) {
                        oVar.f17725n = true;
                        oVar.h = false;
                        m4.g gVar2 = (m4.g) iVar2.f14480b;
                        gVar2.D.removeCallbacks(gVar2.f17688w);
                        gVar2.v();
                    }
                }
                if (z11) {
                }
                z12 = tVar2.f2346b;
                eVar = (e) tVar2.f2347c;
                tVar2.f2347c = null;
                tVar2.f2346b = false;
                if (z12) {
                    this.E = j12;
                    this.I = true;
                    return true;
                }
                if (eVar == null) {
                    return false;
                }
                this.B = eVar;
                z13 = eVar instanceof a;
                bVar = this.A;
                if (z13) {
                    aVar = (a) eVar;
                    if (z10) {
                        j14 = aVar.h;
                        j15 = this.E;
                        if (j14 != j15) {
                            this.f15437x.f12524t = j15;
                            for (a1 a1Var : this.f15438y) {
                                a1Var.f12524t = this.E;
                            }
                        }
                        this.E = -9223372036854775807L;
                    }
                    aVar.f15399x = bVar;
                    a1VarArr = (a1[]) bVar.f6390c;
                    iArr = new int[a1VarArr.length];
                    for (i10 = 0; i10 < a1VarArr.length; i10++) {
                        a1 a1Var2 = a1VarArr[i10];
                        iArr[i10] = a1Var2.f12521q + a1Var2.f12520p;
                    }
                    aVar.f15400y = iArr;
                    this.v.add(aVar);
                } else if (eVar instanceof j) {
                    ((j) eVar).v = bVar;
                }
                q0Var.f(eVar, this, this.f15433n.z3(eVar.f15419c));
                this.h.k(new p(eVar.f15418b), eVar.f15419c, this.f15428a, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n);
                return true;
            }
            list2 = list4;
            long jH2 = d5.g0.H(d5.g0.t(kVar2.f17701f));
            n4.c cVar2 = kVar2.f17704j;
            long j18 = cVar2.f18217a;
            long jH3 = j18 == -9223372036854775807L ? -9223372036854775807L : jH2 - d5.g0.H(j18 + cVar2.b(kVar2.f17705k).f18245b);
            if (list2.isEmpty()) {
                list3 = list2;
                kVar = null;
            } else {
                list3 = list2;
                kVar = (k) i0.a.j(1, list3);
            }
            int length = kVar2.f17703i.length();
            long j19 = j16;
            l[] lVarArr = new l[length];
            int i12 = 0;
            while (i12 < length) {
                k kVar3 = kVar;
                m4.i iVar3 = iVarArr[i12];
                boolean z14 = zR;
                m4.h hVar = iVar3.d;
                int i13 = length;
                long j20 = j19;
                long j21 = iVar3.f17696f;
                long j22 = iVar3.f17695e;
                za.b bVar3 = l.f15443o;
                if (hVar == null) {
                    lVarArr[i12] = bVar3;
                } else {
                    long jR = hVar.r(j22, jH2) + j21;
                    long jB = iVar3.b(jH2);
                    long jB2 = kVar3 != null ? kVar3.b() : d5.g0.i(iVar3.d.y(j11, j22) + j21, jR, jB);
                    if (jB2 < jR) {
                        lVarArr[i12] = bVar3;
                    } else {
                        lVarArr[i12] = new m4.j(kVar2.b(i12), jB2, jB);
                    }
                }
                i12++;
                kVar = kVar3;
                zR = z14;
                length = i13;
                j19 = j20;
            }
            k kVar4 = kVar;
            z10 = zR;
            long j23 = j19;
            if (kVar2.f17704j.d) {
                long jC = iVarArr[0].c(iVarArr[0].b(jH2));
                n4.c cVar3 = kVar2.f17704j;
                long j24 = cVar3.f18217a;
                j13 = 0;
                jMax = Math.max(0L, Math.min(j24 == -9223372036854775807L ? -9223372036854775807L : jH2 - d5.g0.H(j24 + cVar3.b(kVar2.f17705k).f18245b), jC) - j10);
            } else {
                jMax = -9223372036854775807L;
                j13 = 0;
            }
            q0Var = q0Var2;
            tVar2 = tVar;
            long j25 = j13;
            kVar2.f17703i.m(j10, j23, jMax, list3, lVarArr);
            m4.i iVarB = kVar2.b(kVar2.f17703i.d());
            long j26 = iVarB.f17696f;
            long j27 = iVarB.f17695e;
            m4.h hVar2 = iVarB.d;
            n4.b bVar4 = iVarB.f17694c;
            d dVar = iVarB.f17692a;
            n4.m mVar = iVarB.f17693b;
            if (dVar != null) {
                n4.j jVar = dVar.f15416r == null ? mVar.h : null;
                n4.j jVarD = hVar2 == null ? mVar.d() : null;
                if (jVar != null || jVarD != null) {
                    com.google.android.exoplayer2.upstream.m mVar2 = kVar2.f17700e;
                    t0 t0VarO = kVar2.f17703i.o();
                    int iP = kVar2.f17703i.p();
                    Object objR = kVar2.f17703i.r();
                    if (jVar != null) {
                        n4.j jVarA = jVar.a(jVarD, bVar4.f18214a);
                        if (jVarA != null) {
                            jVar = jVarA;
                        }
                    } else {
                        jVar = jVarD;
                    }
                    tVar2.f2347c = new j(mVar2, u.a(mVar, bVar4.f18214a, jVar, 0), t0VarO, iP, objR, iVarB.f17692a);
                }
                z12 = tVar2.f2346b;
                eVar = (e) tVar2.f2347c;
                tVar2.f2347c = null;
                tVar2.f2346b = false;
                if (z12) {
                    this.E = j12;
                    this.I = true;
                    return true;
                }
                if (eVar == null) {
                    return false;
                }
                this.B = eVar;
                z13 = eVar instanceof a;
                bVar = this.A;
                if (z13) {
                    aVar = (a) eVar;
                    if (z10) {
                        j14 = aVar.h;
                        j15 = this.E;
                        if (j14 != j15) {
                            this.f15437x.f12524t = j15;
                            while (i11 < r5) {
                                a1Var.f12524t = this.E;
                            }
                        }
                        this.E = -9223372036854775807L;
                    }
                    aVar.f15399x = bVar;
                    a1VarArr = (a1[]) bVar.f6390c;
                    iArr = new int[a1VarArr.length];
                    while (i10 < a1VarArr.length) {
                        a1 a1Var3 = a1VarArr[i10];
                        iArr[i10] = a1Var3.f12521q + a1Var3.f12520p;
                    }
                    aVar.f15400y = iArr;
                    this.v.add(aVar);
                } else if (eVar instanceof j) {
                    ((j) eVar).v = bVar;
                }
                q0Var.f(eVar, this, this.f15433n.z3(eVar.f15419c));
                this.h.k(new p(eVar.f15418b), eVar.f15419c, this.f15428a, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n);
                return true;
            }
            list3 = list3;
            boolean z15 = j27 != -9223372036854775807L;
            if (hVar2.F(j27) == j25) {
                tVar2.f2346b = z15;
            } else {
                long jR2 = hVar2.r(j27, jH2) + j26;
                long jB3 = iVarB.b(jH2);
                long jB4 = kVar4 != null ? kVar4.b() : d5.g0.i(hVar2.y(j11, j27) + j26, jR2, jB3);
                if (jB4 < jR2) {
                    kVar2.f17706l = new j4.b();
                } else if (jB4 <= jB3) {
                    long j28 = j11;
                    if (kVar2.f17707m && jB4 >= jB3) {
                        tVar2.f2346b = z15;
                    } else if (!z15 || iVarB.d(jB4) < j27) {
                        int iMin = (int) Math.min(1, (jB3 - jB4) + 1);
                        if (j27 != -9223372036854775807L) {
                            while (iMin > 1 && iVarB.d((((long) iMin) + jB4) - 1) >= j27) {
                                iMin--;
                            }
                        }
                        long j29 = list3.isEmpty() ? j28 : -9223372036854775807L;
                        com.google.android.exoplayer2.upstream.m mVar3 = kVar2.f17700e;
                        int i14 = kVar2.d;
                        t0 t0VarO2 = kVar2.f17703i.o();
                        int iP2 = kVar2.f17703i.p();
                        Object objR2 = kVar2.f17703i.r();
                        long jD = iVarB.d(jB4);
                        n4.j jVarW = hVar2.w(jB4 - j26);
                        if (dVar == null) {
                            iVar = new m(mVar3, u.a(mVar, bVar4.f18214a, jVarW, hVar2.B() || (jH3 > (-9223372036854775807L) ? 1 : (jH3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (iVarB.c(jB4) > jH3 ? 1 : (iVarB.c(jB4) == jH3 ? 0 : -1)) <= 0 ? 0 : 8), t0VarO2, iP2, objR2, jD, iVarB.c(jB4), jB4, i14, t0VarO2);
                        } else {
                            long j30 = jB4;
                            int i15 = 1;
                            int i16 = 1;
                            while (i15 < iMin) {
                                n4.j jVarA2 = jVarW.a(hVar2.w((j30 + ((long) i15)) - j26), bVar4.f18214a);
                                if (jVarA2 == null) {
                                    break;
                                }
                                i16++;
                                i15++;
                                jVarW = jVarA2;
                            }
                            long j31 = (j30 + ((long) i16)) - 1;
                            long jC2 = iVarB.c(j31);
                            iVar = new i(mVar3, u.a(mVar, bVar4.f18214a, jVarW, hVar2.B() || (jH3 > (-9223372036854775807L) ? 1 : (jH3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (iVarB.c(j31) > jH3 ? 1 : (iVarB.c(j31) == jH3 ? 0 : -1)) <= 0 ? 0 : 8), t0VarO2, iP2, objR2, jD, jC2, j29, (j27 == -9223372036854775807L || j27 > jC2) ? -9223372036854775807L : j27, j30, i16, -mVar.f18259c, iVarB.f17692a);
                        }
                        tVar2.f2347c = iVar;
                    } else {
                        tVar2.f2346b = true;
                    }
                } else {
                    tVar2.f2346b = z15;
                }
            }
            z12 = tVar2.f2346b;
            eVar = (e) tVar2.f2347c;
            tVar2.f2347c = null;
            tVar2.f2346b = false;
            if (z12) {
                this.E = j12;
                this.I = true;
                return true;
            }
            if (eVar == null) {
                return false;
            }
            this.B = eVar;
            z13 = eVar instanceof a;
            bVar = this.A;
            if (z13) {
                aVar = (a) eVar;
                if (z10) {
                    j14 = aVar.h;
                    j15 = this.E;
                    if (j14 != j15) {
                        this.f15437x.f12524t = j15;
                        while (i11 < r5) {
                            a1Var.f12524t = this.E;
                        }
                    }
                    this.E = -9223372036854775807L;
                }
                aVar.f15399x = bVar;
                a1VarArr = (a1[]) bVar.f6390c;
                iArr = new int[a1VarArr.length];
                while (i10 < a1VarArr.length) {
                    a1 a1Var4 = a1VarArr[i10];
                    iArr[i10] = a1Var4.f12521q + a1Var4.f12520p;
                }
                aVar.f15400y = iArr;
                this.v.add(aVar);
            } else if (eVar instanceof j) {
                ((j) eVar).v = bVar;
            }
            q0Var.f(eVar, this, this.f15433n.z3(eVar.f15419c));
            this.h.k(new p(eVar.f15418b), eVar.f15419c, this.f15428a, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n);
            return true;
        }
        tVar = tVar3;
        j12 = -9223372036854775807L;
        t tVar4 = tVar;
        q0Var = q0Var2;
        tVar2 = tVar4;
        z10 = zR;
        z12 = tVar2.f2346b;
        eVar = (e) tVar2.f2347c;
        tVar2.f2347c = null;
        tVar2.f2346b = false;
        if (z12) {
            this.E = j12;
            this.I = true;
            return true;
        }
        if (eVar == null) {
            return false;
        }
        this.B = eVar;
        z13 = eVar instanceof a;
        bVar = this.A;
        if (z13) {
            aVar = (a) eVar;
            if (z10) {
                j14 = aVar.h;
                j15 = this.E;
                if (j14 != j15) {
                    this.f15437x.f12524t = j15;
                    while (i11 < r5) {
                        a1Var.f12524t = this.E;
                    }
                }
                this.E = -9223372036854775807L;
            }
            aVar.f15399x = bVar;
            a1VarArr = (a1[]) bVar.f6390c;
            iArr = new int[a1VarArr.length];
            while (i10 < a1VarArr.length) {
                a1 a1Var5 = a1VarArr[i10];
                iArr[i10] = a1Var5.f12521q + a1Var5.f12520p;
            }
            aVar.f15400y = iArr;
            this.v.add(aVar);
        } else if (eVar instanceof j) {
            ((j) eVar).v = bVar;
        }
        q0Var.f(eVar, this, this.f15433n.z3(eVar.f15419c));
        this.h.k(new p(eVar.f15418b), eVar.f15419c, this.f15428a, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n);
        return true;
    }

    public final boolean r() {
        return this.E != -9223372036854775807L;
    }

    public final void s() {
        int iT = t(this.f15437x.q(), this.G - 1);
        while (true) {
            int i10 = this.G;
            if (i10 > iT) {
                return;
            }
            this.G = i10 + 1;
            a aVar = (a) this.v.get(i10);
            t0 t0Var = aVar.d;
            if (!t0Var.equals(this.C)) {
                this.h.b(this.f15428a, t0Var, aVar.f15420e, aVar.f15421f, aVar.h);
            }
            this.C = t0Var;
        }
    }

    public final int t(int i10, int i11) {
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

    public final void u(m4.b bVar) {
        this.D = bVar;
        a1 a1Var = this.f15437x;
        a1Var.i();
        l3.f fVar = a1Var.h;
        if (fVar != null) {
            fVar.h(a1Var.f12510e);
            a1Var.h = null;
            a1Var.f12512g = null;
        }
        for (a1 a1Var2 : this.f15438y) {
            a1Var2.i();
            l3.f fVar2 = a1Var2.h;
            if (fVar2 != null) {
                fVar2.h(a1Var2.f12510e);
                a1Var2.h = null;
                a1Var2.f12512g = null;
            }
        }
        this.f15434r.e(this);
    }
}
