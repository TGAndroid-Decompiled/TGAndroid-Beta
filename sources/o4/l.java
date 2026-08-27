package o4;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.y0;
import g7.e0;
import h3.j2;
import h3.s0;
import h3.t0;
import h3.t1;
import h7.u6;
import j4.b1;
import j4.d1;
import j4.g0;
import j4.i1;
import j4.j1;
import j4.y;
import j4.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public final class l implements z, p4.r {
    public final i3.k A;
    public final o0.b B = new o0.b(this, 1);
    public y C;
    public int D;
    public j1 E;
    public r[] F;
    public r[] G;
    public int H;
    public a9.i I;

    public final j f19226a;

    public final p4.c f19227b;

    public final m5.o f19228c;
    public final y0 d;

    public final l3.j f19229e;

    public final b6.a f19230f;
    public final ab.a h;

    public final g0 f19231n;

    public final com.google.android.exoplayer2.upstream.r f19232r;

    public final IdentityHashMap f19233s;
    public final n1.d v;

    public final za.b f19234w;

    public final boolean f19235x;

    public final int f19236y;

    public l(j jVar, p4.c cVar, m5.o oVar, y0 y0Var, l3.j jVar2, b6.a aVar, ab.a aVar2, g0 g0Var, com.google.android.exoplayer2.upstream.r rVar, za.b bVar, boolean z10, int i10, i3.k kVar) {
        this.f19226a = jVar;
        this.f19227b = cVar;
        this.f19228c = oVar;
        this.d = y0Var;
        this.f19229e = jVar2;
        this.f19230f = aVar;
        this.h = aVar2;
        this.f19231n = g0Var;
        this.f19232r = rVar;
        this.f19234w = bVar;
        this.f19235x = z10;
        this.f19236y = i10;
        this.A = kVar;
        bVar.getClass();
        this.I = new a9.i(new d1[0], 21);
        this.f19233s = new IdentityHashMap();
        this.v = new n1.d();
        this.F = new r[0];
        this.G = new r[0];
    }

    public static t0 e(t0 t0Var, t0 t0Var2, boolean z10) {
        String strO;
        z3.c cVar;
        int i10;
        String str;
        String str2;
        int i11;
        int i12;
        if (t0Var2 != null) {
            strO = t0Var2.f8190r;
            cVar = t0Var2.f8191s;
            i11 = t0Var2.O;
            i10 = t0Var2.d;
            i12 = t0Var2.f8187e;
            str = t0Var2.f8186c;
            str2 = t0Var2.f8185b;
        } else {
            strO = d5.g0.o(1, t0Var.f8190r);
            cVar = t0Var.f8191s;
            if (z10) {
                i11 = t0Var.O;
                i10 = t0Var.d;
                i12 = t0Var.f8187e;
                str = t0Var.f8186c;
                str2 = t0Var.f8185b;
            } else {
                i10 = 0;
                str = null;
                str2 = null;
                i11 = -1;
                i12 = 0;
            }
        }
        String strC = d5.q.c(strO);
        int i13 = z10 ? t0Var.f8188f : -1;
        int i14 = z10 ? t0Var.h : -1;
        s0 s0Var = new s0();
        s0Var.f8123a = t0Var.f8184a;
        s0Var.f8124b = str2;
        s0Var.f8134n = t0Var.A;
        s0Var.f8135o = strC;
        s0Var.h = strO;
        s0Var.f8129i = cVar;
        s0Var.f8127f = i13;
        s0Var.f8128g = i14;
        s0Var.B = i11;
        s0Var.d = i10;
        s0Var.f8126e = i12;
        s0Var.f8125c = str;
        return new t0(s0Var);
    }

    @Override
    public final long B(long j10, j2 j2Var) {
        for (r rVar : this.G) {
            if (rVar.M == 2) {
                i iVar = rVar.d;
                p4.c cVar = iVar.f19210g;
                int iD = iVar.f19219q.d();
                Uri[] uriArr = iVar.f19208e;
                p4.j jVarA = (iD >= uriArr.length || iD == -1) ? null : cVar.a(uriArr[iVar.f19219q.n()], true);
                if (jVarA == null) {
                    break;
                }
                p8.z zVar = jVarA.f45411r;
                if (zVar.isEmpty() || !jVarA.f45434c) {
                    break;
                    break;
                }
                long j11 = jVarA.h - cVar.f45379y;
                long j12 = j10 - j11;
                int iC = d5.g0.c(zVar, Long.valueOf(j12), true);
                long j13 = ((p4.g) zVar.get(iC)).f45390e;
                return j2Var.a(j12, j13, iC != zVar.size() - 1 ? ((p4.g) zVar.get(iC + 1)).f45390e : j13) + j11;
            }
        }
        return j10;
    }

    @Override
    public final long D() {
        return this.I.D();
    }

    @Override
    public final void E(y yVar, long j10) {
        boolean z10;
        List list;
        List list2;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        Uri[] uriArr;
        boolean z13;
        t0[] t0VarArr;
        int[] iArr;
        int i12;
        int i13;
        int iN;
        int iN2;
        int i14;
        r rVarD;
        ArrayList arrayList;
        t0[] t0VarArr2;
        int i15;
        t0[] t0VarArr3;
        int i16;
        t0[] t0VarArr4;
        List list3;
        int i17;
        Uri[] uriArr2;
        this.C = yVar;
        p4.c cVar = this.f19227b;
        cVar.getClass();
        cVar.f45372e.add(this);
        p4.m mVar = cVar.f45376s;
        mVar.getClass();
        List list4 = mVar.f45426g;
        List list5 = mVar.f45424e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list5.isEmpty();
        List list6 = mVar.h;
        int i18 = 0;
        this.D = 0;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z14 = this.f19235x;
        if (zIsEmpty) {
            z10 = z14;
            list = list4;
            list2 = list6;
        } else {
            t0 t0Var = mVar.f45428j;
            int size = list5.size();
            int[] iArr2 = new int[size];
            int i19 = 0;
            int i20 = 0;
            while (true) {
                list2 = list6;
                if (i19 >= list5.size()) {
                    break;
                }
                t0 t0Var2 = ((p4.l) list5.get(i19)).f45419b;
                int i21 = t0Var2.H;
                String str = t0Var2.f8190r;
                if (i21 > 0 || d5.g0.o(2, str) != null) {
                    iArr2[i19] = 2;
                    i20++;
                } else if (d5.g0.o(1, str) != null) {
                    iArr2[i19] = 1;
                    i18++;
                } else {
                    iArr2[i19] = -1;
                }
                i19++;
                list6 = list2;
            }
            if (i20 > 0) {
                i11 = i20;
                z11 = true;
            } else {
                if (i18 < size) {
                    z14 = z14;
                    i11 = size - i18;
                    z11 = false;
                    z12 = true;
                } else {
                    i11 = size;
                    z11 = false;
                }
                uriArr = new Uri[i11];
                z13 = z11;
                t0VarArr = new t0[i11];
                iArr = new int[i11];
                i12 = 0;
                i13 = 0;
                while (i12 < list5.size()) {
                    if (z13) {
                        uriArr2 = uriArr;
                        if (iArr2[i12] == 2) {
                        }
                        i12++;
                        uriArr = uriArr2;
                    } else {
                        uriArr2 = uriArr;
                    }
                    if (z12 || iArr2[i12] != 1) {
                        p4.l lVar = (p4.l) list5.get(i12);
                        uriArr2[i13] = lVar.f45418a;
                        t0VarArr[i13] = lVar.f45419b;
                        iArr[i13] = i12;
                        i13++;
                    }
                    i12++;
                    uriArr = uriArr2;
                }
                Uri[] uriArr3 = uriArr;
                String str2 = t0VarArr[0].f8190r;
                iN = d5.g0.n(2, str2);
                iN2 = d5.g0.n(1, str2);
                boolean z15 = (iN2 != 1 || (iN2 == 0 && list4.isEmpty())) && iN <= 1 && iN2 + iN > 0;
                if (!z13 || iN2 <= 0) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
                z10 = z14;
                list = list4;
                rVarD = d("main", i14, uriArr3, t0VarArr, mVar.f45428j, mVar.f45429k, map, j10);
                arrayList2.add(rVarD);
                arrayList3.add(iArr);
                if (z10 && z15) {
                    arrayList = new ArrayList();
                    if (iN > 0) {
                        t0VarArr3 = new t0[i11];
                        i16 = 0;
                        while (i16 < i11) {
                            t0 t0Var3 = t0VarArr[i16];
                            String strO = d5.g0.o(2, t0Var3.f8190r);
                            String strC = d5.q.c(strO);
                            s0 s0Var = new s0();
                            s0Var.f8123a = t0Var3.f8184a;
                            s0Var.f8124b = t0Var3.f8185b;
                            s0Var.f8134n = t0Var3.A;
                            s0Var.f8135o = strC;
                            s0Var.h = strO;
                            s0Var.f8129i = t0Var3.f8191s;
                            s0Var.f8127f = t0Var3.f8188f;
                            s0Var.f8128g = t0Var3.h;
                            s0Var.f8140t = t0Var3.G;
                            s0Var.f8141u = t0Var3.H;
                            s0Var.v = t0Var3.I;
                            s0Var.d = t0Var3.d;
                            s0Var.f8126e = t0Var3.f8187e;
                            t0VarArr3[i16] = new t0(s0Var);
                            i16++;
                            t0VarArr = t0VarArr;
                        }
                        t0VarArr4 = t0VarArr;
                        arrayList.add(new i1("main", t0VarArr3));
                        if (iN2 > 0 && (t0Var != null || list.isEmpty())) {
                            arrayList.add(new i1("main:audio", e(t0VarArr4[0], t0Var, false)));
                        }
                        list3 = mVar.f45429k;
                        if (list3 != null) {
                            for (i17 = 0; i17 < list3.size(); i17++) {
                                arrayList.add(new i1(i0.a.k(i17, "main:cc:"), (t0) list3.get(i17)));
                            }
                        }
                    } else {
                        t0VarArr2 = new t0[i11];
                        for (i15 = 0; i15 < i11; i15++) {
                            t0VarArr2[i15] = e(t0VarArr[i15], t0Var, true);
                        }
                        arrayList.add(new i1("main", t0VarArr2));
                    }
                    s0 s0Var2 = new s0();
                    s0Var2.f8123a = "ID3";
                    s0Var2.f8135o = "application/id3";
                    i1 i1Var = new i1("main:id3", new t0(s0Var2));
                    arrayList.add(i1Var);
                    rVarD.x((i1[]) arrayList.toArray(new i1[0]), arrayList.indexOf(i1Var));
                }
            }
            z12 = false;
            uriArr = new Uri[i11];
            z13 = z11;
            t0VarArr = new t0[i11];
            iArr = new int[i11];
            i12 = 0;
            i13 = 0;
            while (i12 < list5.size()) {
                if (z13) {
                    uriArr2 = uriArr;
                    if (iArr2[i12] == 2) {
                    }
                    i12++;
                    uriArr = uriArr2;
                } else {
                    uriArr2 = uriArr;
                }
                if (z12) {
                    p4.l lVar2 = (p4.l) list5.get(i12);
                    uriArr2[i13] = lVar2.f45418a;
                    t0VarArr[i13] = lVar2.f45419b;
                    iArr[i13] = i12;
                    i13++;
                } else {
                    p4.l lVar3 = (p4.l) list5.get(i12);
                    uriArr2[i13] = lVar3.f45418a;
                    t0VarArr[i13] = lVar3.f45419b;
                    iArr[i13] = i12;
                    i13++;
                }
                i12++;
                uriArr = uriArr2;
            }
            Uri[] uriArr4 = uriArr;
            String str3 = t0VarArr[0].f8190r;
            iN = d5.g0.n(2, str3);
            iN2 = d5.g0.n(1, str3);
            if (iN2 != 1) {
            }
            if (z13) {
                i14 = 0;
            } else {
                i14 = 0;
            }
            z10 = z14;
            list = list4;
            rVarD = d("main", i14, uriArr4, t0VarArr, mVar.f45428j, mVar.f45429k, map, j10);
            arrayList2.add(rVarD);
            arrayList3.add(iArr);
            if (z10) {
                arrayList = new ArrayList();
                if (iN > 0) {
                    t0VarArr3 = new t0[i11];
                    i16 = 0;
                    while (i16 < i11) {
                        t0 t0Var4 = t0VarArr[i16];
                        String strO2 = d5.g0.o(2, t0Var4.f8190r);
                        String strC2 = d5.q.c(strO2);
                        s0 s0Var3 = new s0();
                        s0Var3.f8123a = t0Var4.f8184a;
                        s0Var3.f8124b = t0Var4.f8185b;
                        s0Var3.f8134n = t0Var4.A;
                        s0Var3.f8135o = strC2;
                        s0Var3.h = strO2;
                        s0Var3.f8129i = t0Var4.f8191s;
                        s0Var3.f8127f = t0Var4.f8188f;
                        s0Var3.f8128g = t0Var4.h;
                        s0Var3.f8140t = t0Var4.G;
                        s0Var3.f8141u = t0Var4.H;
                        s0Var3.v = t0Var4.I;
                        s0Var3.d = t0Var4.d;
                        s0Var3.f8126e = t0Var4.f8187e;
                        t0VarArr3[i16] = new t0(s0Var3);
                        i16++;
                        t0VarArr = t0VarArr;
                    }
                    t0VarArr4 = t0VarArr;
                    arrayList.add(new i1("main", t0VarArr3));
                    if (iN2 > 0) {
                        arrayList.add(new i1("main:audio", e(t0VarArr4[0], t0Var, false)));
                    }
                    list3 = mVar.f45429k;
                    if (list3 != null) {
                        while (i17 < list3.size()) {
                            arrayList.add(new i1(i0.a.k(i17, "main:cc:"), (t0) list3.get(i17)));
                        }
                    }
                } else {
                    t0VarArr2 = new t0[i11];
                    while (i15 < i11) {
                        t0VarArr2[i15] = e(t0VarArr[i15], t0Var, true);
                    }
                    arrayList.add(new i1("main", t0VarArr2));
                }
                s0 s0Var4 = new s0();
                s0Var4.f8123a = "ID3";
                s0Var4.f8135o = "application/id3";
                i1 i1Var2 = new i1("main:id3", new t0(s0Var4));
                arrayList.add(i1Var2);
                rVarD.x((i1[]) arrayList.toArray(new i1[0]), arrayList.indexOf(i1Var2));
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i22 = 0;
        while (i22 < list.size()) {
            List list7 = list;
            String str4 = ((p4.k) list7.get(i22)).f45417c;
            if (hashSet.add(str4)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z16 = true;
                for (int i23 = 0; i23 < list7.size(); i23++) {
                    String str5 = ((p4.k) list7.get(i23)).f45417c;
                    int i24 = d5.g0.f4795a;
                    if (str4.equals(str5)) {
                        p4.k kVar = (p4.k) list7.get(i23);
                        arrayList6.add(Integer.valueOf(i23));
                        Uri uri = kVar.f45415a;
                        t0 t0Var5 = kVar.f45416b;
                        arrayList4.add(uri);
                        arrayList5.add(t0Var5);
                        z16 &= d5.g0.n(1, t0Var5.f8190r) == 1;
                    }
                }
                String strConcat = "audio:".concat(str4);
                int i25 = d5.g0.f4795a;
                list = list7;
                i10 = i22;
                r rVarD2 = d(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (t0[]) arrayList5.toArray(new t0[0]), null, Collections.EMPTY_LIST, map, j10);
                arrayList3.add(u6.e(arrayList6));
                arrayList2.add(rVarD2);
                if (z10 && z16) {
                    rVarD2.x(new i1[]{new i1(strConcat, (t0[]) arrayList5.toArray(new t0[0]))}, new int[0]);
                }
            } else {
                i10 = i22;
                list = list7;
            }
            i22 = i10 + 1;
        }
        this.H = arrayList2.size();
        for (int i26 = 0; i26 < list2.size(); i26++) {
            p4.k kVar2 = (p4.k) list2.get(i26);
            StringBuilder sbO = i0.a.o(i26, "subtitle:", ":");
            String str6 = kVar2.f45417c;
            t0 t0Var6 = kVar2.f45416b;
            sbO.append(str6);
            String string = sbO.toString();
            r rVarD3 = d(string, 3, new Uri[]{kVar2.f45415a}, new t0[]{t0Var6}, null, Collections.EMPTY_LIST, map, j10);
            arrayList3.add(new int[]{i26});
            arrayList2.add(rVarD3);
            rVarD3.x(new i1[]{new i1(string, t0Var6)}, new int[0]);
        }
        this.F = (r[]) arrayList2.toArray(new r[0]);
        this.D = this.F.length;
        for (int i27 = 0; i27 < this.H; i27++) {
            this.F[i27].d.f19214l = true;
        }
        for (r rVar : this.F) {
            if (!rVar.P) {
                rVar.q(rVar.f19264b0);
            }
        }
        this.G = this.F;
    }

    @Override
    public final long F(b5.s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        b1[] b1VarArr2;
        i iVar;
        i iVar2;
        boolean z10;
        int[] iArr;
        r[] rVarArr;
        int i10;
        int i11;
        b1[] b1VarArr3;
        int i12;
        i iVar3;
        int[] iArr2;
        r rVar;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        b1[] b1VarArr4;
        int i15;
        b5.s[] sVarArr2;
        int i16;
        int[] iArr3 = new int[sVarArr.length];
        int[] iArr4 = new int[sVarArr.length];
        int i17 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f19233s;
            if (i17 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i17];
            iArr3[i17] = b1Var == null ? -1 : ((Integer) identityHashMap.get(b1Var)).intValue();
            iArr4[i17] = -1;
            b5.s sVar = sVarArr[i17];
            if (sVar != null) {
                i1 i1VarB = sVar.b();
                int i18 = 0;
                while (true) {
                    r[] rVarArr2 = this.F;
                    if (i18 >= rVarArr2.length) {
                        break;
                    }
                    r rVar2 = rVarArr2[i18];
                    rVar2.e();
                    if (rVar2.U.b(i1VarB) != -1) {
                        iArr4[i17] = i18;
                        break;
                    }
                    i18++;
                }
            }
            i17++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        b1[] b1VarArr5 = new b1[length2];
        int length3 = sVarArr.length;
        b1[] b1VarArr6 = new b1[length3];
        int length4 = sVarArr.length;
        b5.s[] sVarArr3 = new b5.s[length4];
        r[] rVarArr3 = new r[this.F.length];
        int i19 = length3;
        int i20 = 0;
        int i21 = 0;
        boolean z13 = false;
        while (i20 < this.F.length) {
            int i22 = length2;
            int i23 = 0;
            while (true) {
                b1VarArr2 = b1VarArr5;
                if (i23 >= sVarArr.length) {
                    break;
                }
                b1VarArr6[i23] = iArr3[i23] == i20 ? b1VarArr[i23] : null;
                sVarArr3[i23] = iArr4[i23] == i20 ? sVarArr[i23] : null;
                i23++;
                b1VarArr5 = b1VarArr2;
            }
            r rVar3 = this.F[i20];
            q0 q0Var = rVar3.f19278s;
            int i24 = i20;
            i iVar4 = rVar3.d;
            ArrayList arrayList = rVar3.f19281y;
            rVar3.e();
            int i25 = rVar3.Q;
            b1[] b1VarArr7 = b1VarArr6;
            int i26 = 0;
            while (i26 < length4) {
                n nVar = (n) b1VarArr7[i26];
                if (nVar == null || (sVarArr3[i26] != null && zArr[i26])) {
                    i16 = i26;
                } else {
                    i16 = i26;
                    rVar3.Q--;
                    if (nVar.f19251c != -1) {
                        r rVar4 = nVar.f19250b;
                        int i27 = nVar.f19249a;
                        rVar4.e();
                        rVar4.W.getClass();
                        int i28 = rVar4.W[i27];
                        d5.a.i(rVar4.Z[i28]);
                        rVar4.Z[i28] = false;
                        nVar.f19251c = -1;
                    }
                    b1VarArr7[i16] = null;
                }
                i26 = i16 + 1;
                q0Var = q0Var;
            }
            q0 q0Var2 = q0Var;
            boolean z14 = true;
            if (z13) {
                iVar = iVar4;
                iVar2 = iVar;
                z10 = true;
            } else {
                if (rVar3.f19269e0) {
                    if (i25 != 0) {
                        iVar = iVar4;
                    }
                    iVar = iVar4;
                    iVar2 = iVar;
                    z10 = true;
                } else {
                    iVar = iVar4;
                    if (j10 != rVar3.f19264b0) {
                        iVar2 = iVar;
                        z10 = true;
                    }
                }
                iVar2 = iVar;
                z10 = false;
            }
            b5.s sVar2 = iVar2.f19219q;
            boolean z15 = z10;
            b5.s sVar3 = sVar2;
            int i29 = 0;
            while (i29 < length4) {
                int i30 = i29;
                b5.s sVar4 = sVarArr3[i30];
                if (sVar4 == null) {
                    i15 = length4;
                    sVarArr2 = sVarArr3;
                } else {
                    i15 = length4;
                    sVarArr2 = sVarArr3;
                    int iB = rVar3.U.b(sVar4.b());
                    if (iB == rVar3.X) {
                        iVar2.f19219q = sVar4;
                        sVar3 = sVar4;
                    }
                    if (b1VarArr7[i30] == null) {
                        rVar3.Q++;
                        n nVar2 = new n(rVar3, iB);
                        b1VarArr7[i30] = nVar2;
                        zArr2[i30] = z14;
                        if (rVar3.W != null) {
                            nVar2.b();
                            if (!z15) {
                                q qVar = rVar3.H[rVar3.W[iB]];
                                z15 = (qVar.D(j10, true) || qVar.q() == 0) ? false : true;
                            }
                        }
                    }
                }
                i29 = i30 + 1;
                length4 = i15;
                sVarArr3 = sVarArr2;
                z14 = true;
            }
            int i31 = length4;
            b5.s[] sVarArr4 = sVarArr3;
            if (rVar3.Q == 0) {
                iVar2.f19216n = null;
                rVar3.S = null;
                rVar3.f19267d0 = true;
                arrayList.clear();
                if (q0Var2.d()) {
                    if (rVar3.O) {
                        for (q qVar2 : rVar3.H) {
                            qVar2.i();
                        }
                    }
                    q0Var2.b();
                } else {
                    rVar3.y();
                }
                int[] iArr5 = iArr4;
                rVar = rVar3;
                i13 = i19;
                iArr2 = iArr5;
                iArr = iArr3;
                rVarArr = rVarArr3;
                i11 = i22;
                b1VarArr3 = b1VarArr2;
                i12 = i24;
                iVar3 = iVar2;
            } else {
                boolean z16 = true;
                if (arrayList.isEmpty() || d5.g0.a(sVar3, sVar2)) {
                    iArr = iArr3;
                    rVarArr = rVarArr3;
                    i10 = i19;
                    i11 = i22;
                    b1VarArr3 = b1VarArr2;
                    i12 = i24;
                    iVar3 = iVar2;
                    iArr2 = iArr4;
                    rVar = rVar3;
                } else {
                    if (rVar3.f19269e0) {
                        iArr = iArr3;
                        rVarArr = rVarArr3;
                        i10 = i19;
                        i11 = i22;
                        b1VarArr3 = b1VarArr2;
                        i12 = i24;
                        iVar3 = iVar2;
                        iArr2 = iArr4;
                        rVar = rVar3;
                    } else {
                        long j11 = j10 < 0 ? -j10 : 0L;
                        k kVarR = rVar3.r();
                        b5.s sVar5 = sVar3;
                        iArr = iArr3;
                        rVarArr = rVarArr3;
                        i10 = i19;
                        i11 = i22;
                        b1VarArr3 = b1VarArr2;
                        i12 = i24;
                        iVar3 = iVar2;
                        iArr2 = iArr4;
                        rVar = rVar3;
                        sVar5.m(j10, j11, -9223372036854775807L, rVar3.A, iVar2.a(kVarR, j10));
                        if (sVar5.n() != iVar3.h.a(kVarR.d)) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                    }
                    rVar.f19267d0 = z16;
                    z11 = true;
                    z12 = true;
                    if (z12) {
                        rVar.G(j10, z11);
                        i13 = i10;
                        i14 = 0;
                        while (i14 < i13) {
                            if (b1VarArr7[i14] != null) {
                                zArr2[i14] = z16;
                            }
                            i14++;
                            z16 = true;
                        }
                    } else {
                        i13 = i10;
                    }
                    z15 = z12;
                }
                z11 = z13;
                z12 = z15;
                if (z12) {
                    rVar.G(j10, z11);
                    i13 = i10;
                    i14 = 0;
                    while (i14 < i13) {
                        if (b1VarArr7[i14] != null) {
                            zArr2[i14] = z16;
                        }
                        i14++;
                        z16 = true;
                    }
                } else {
                    i13 = i10;
                }
                z15 = z12;
            }
            ArrayList arrayList2 = rVar.E;
            arrayList2.clear();
            for (int i32 = 0; i32 < i13; i32++) {
                b1 b1Var2 = b1VarArr7[i32];
                if (b1Var2 != null) {
                    arrayList2.add((n) b1Var2);
                }
            }
            rVar.f19269e0 = true;
            int i33 = 0;
            boolean z17 = false;
            while (i33 < sVarArr.length) {
                b1 b1Var3 = b1VarArr7[i33];
                int i34 = i12;
                if (iArr2[i33] == i34) {
                    b1Var3.getClass();
                    b1VarArr4 = b1VarArr3;
                    b1VarArr4[i33] = b1Var3;
                    identityHashMap.put(b1Var3, Integer.valueOf(i34));
                    z17 = true;
                } else {
                    b1VarArr4 = b1VarArr3;
                    if (iArr[i33] == i34) {
                        d5.a.i(b1Var3 == null);
                    }
                }
                i33++;
                b1VarArr3 = b1VarArr4;
                i12 = i34;
            }
            b1[] b1VarArr8 = b1VarArr3;
            int i35 = i12;
            int i36 = i21;
            if (z17) {
                rVarArr[i36] = rVar;
                i21 = i36 + 1;
                if (i36 == 0) {
                    iVar3.f19214l = true;
                    if (z15) {
                        ((SparseArray) this.v.f18088b).clear();
                        z13 = true;
                    } else {
                        r[] rVarArr4 = this.G;
                        if (rVarArr4.length == 0 || rVar != rVarArr4[0]) {
                            ((SparseArray) this.v.f18088b).clear();
                            z13 = true;
                        }
                    }
                } else {
                    iVar3.f19214l = i35 < this.H;
                }
            }
            i20 = i35 + 1;
            b1VarArr5 = b1VarArr8;
            iArr4 = iArr2;
            rVarArr3 = rVarArr;
            b1VarArr6 = b1VarArr7;
            iArr3 = iArr;
            length4 = i31;
            sVarArr3 = sVarArr4;
            i19 = i13;
            length2 = i11;
        }
        System.arraycopy(b1VarArr5, 0, b1VarArr, 0, length2);
        r[] rVarArr5 = (r[]) d5.g0.J(i21, rVarArr3);
        this.G = rVarArr5;
        this.f19234w.getClass();
        this.I = new a9.i(rVarArr5, 21);
        return j10;
    }

    @Override
    public final void I(long j10) {
        this.I.I(j10);
    }

    @Override
    public final void a() {
        for (r rVar : this.F) {
            q0 q0Var = rVar.f19278s;
            ArrayList arrayList = rVar.f19281y;
            if (!arrayList.isEmpty()) {
                k kVar = (k) p8.l.g(arrayList);
                int iB = rVar.d.b(kVar);
                if (iB == 1) {
                    kVar.W = true;
                } else if (iB == 2 && !rVar.f19271f0 && q0Var.d()) {
                    q0Var.b();
                }
            }
        }
        this.C.a(this);
    }

    @Override
    public final boolean b() {
        return this.I.b();
    }

    @Override
    public final boolean c(Uri uri, n2.v vVar, boolean z10) {
        long j10;
        int i10;
        int iU;
        p4.b bVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        for (r rVar : this.F) {
            i iVar = rVar.d;
            Uri[] uriArr = iVar.f19208e;
            if (d5.g0.j(uriArr, uri)) {
                if (!z10) {
                    ab.a aVar = rVar.f19277r;
                    j0 j0VarA = e0.a(iVar.f19219q);
                    aVar.getClass();
                    k0 k0VarX3 = ab.a.x3(j0VarA, vVar);
                    if (k0VarX3 != null && k0VarX3.f2999a == 2) {
                        j10 = k0VarX3.f3000b;
                    }
                    i10 = 0;
                    while (true) {
                        if (i10 < uriArr.length) {
                            i10 = -1;
                            break;
                        }
                        if (uriArr[i10].equals(uri)) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 != -1 && (iU = iVar.f19219q.u(i10)) != -1) {
                        iVar.f19221s |= uri.equals(iVar.f19217o);
                        if (j10 == -9223372036854775807L) {
                            if (iVar.f19219q.e(iU, j10)) {
                                bVar = (p4.b) iVar.f19210g.d.get(uri);
                                if (bVar != null) {
                                    z11 = !p4.b.a(bVar, j10);
                                } else {
                                    z11 = false;
                                }
                                z12 = z11;
                            }
                        }
                    }
                    if (z12 || j10 == -9223372036854775807L) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                }
                j10 = -9223372036854775807L;
                i10 = 0;
                while (true) {
                    if (i10 < uriArr.length) {
                        i10 = -1;
                        break;
                    }
                    if (uriArr[i10].equals(uri)) {
                        break;
                        break;
                    }
                    i10++;
                }
                if (i10 != -1) {
                    iVar.f19221s |= uri.equals(iVar.f19217o);
                    if (j10 == -9223372036854775807L) {
                        if (iVar.f19219q.e(iU, j10)) {
                            bVar = (p4.b) iVar.f19210g.d.get(uri);
                            if (bVar != null) {
                                z11 = !p4.b.a(bVar, j10);
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                            }
                        }
                    }
                }
                if (z12) {
                    z13 = false;
                } else {
                    z13 = false;
                }
            } else {
                z13 = true;
            }
            z14 &= z13;
        }
        this.C.a(this);
        return z14;
    }

    public final r d(String str, int i10, Uri[] uriArr, t0[] t0VarArr, t0 t0Var, List list, Map map, long j10) {
        return new r(str, i10, this.B, new i(this.f19226a, this.f19227b, uriArr, t0VarArr, this.f19228c, this.d, this.v, list, this.A), map, this.f19232r, j10, t0Var, this.f19229e, this.f19230f, this.h, this.f19231n, this.f19236y);
    }

    @Override
    public final long g() {
        return this.I.g();
    }

    @Override
    public final void m() throws IOException {
        for (r rVar : this.F) {
            rVar.v();
            if (rVar.f19271f0 && !rVar.P) {
                throw t1.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override
    public final long o(long j10) {
        r[] rVarArr = this.G;
        if (rVarArr.length > 0) {
            boolean zG = rVarArr[0].G(j10, false);
            int i10 = 1;
            while (true) {
                r[] rVarArr2 = this.G;
                if (i10 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i10].G(j10, zG);
                i10++;
            }
            if (zG) {
                ((SparseArray) this.v.f18088b).clear();
            }
        }
        return j10;
    }

    @Override
    public final void p(long j10) {
        for (r rVar : this.G) {
            if (rVar.O && !rVar.t()) {
                int length = rVar.H.length;
                for (int i10 = 0; i10 < length; i10++) {
                    rVar.H[i10].h(j10, rVar.Z[i10]);
                }
            }
        }
    }

    @Override
    public final boolean q(long j10) {
        if (this.E != null) {
            return this.I.q(j10);
        }
        for (r rVar : this.F) {
            if (!rVar.P) {
                rVar.q(rVar.f19264b0);
            }
        }
        return false;
    }

    @Override
    public final long w() {
        return -9223372036854775807L;
    }

    @Override
    public final j1 z() {
        j1 j1Var = this.E;
        j1Var.getClass();
        return j1Var;
    }
}
