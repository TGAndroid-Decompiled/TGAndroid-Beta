package m4;

import a9.p;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b5.s;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.exoplayer2.upstream.y0;
import com.google.firebase.messaging.t;
import h3.j2;
import h3.s0;
import h3.t0;
import h7.u6;
import j4.a1;
import j4.b1;
import j4.c1;
import j4.d1;
import j4.g0;
import j4.i1;
import j4.j1;
import j4.y;
import j4.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b implements z, c1, l4.g {
    public static final Pattern J = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern K = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final g0 A;
    public final b6.a B;
    public y C;
    public a9.i F;
    public n4.c G;
    public int H;
    public List I;

    public final int f17653a;

    public final k5.i f17654b;

    public final y0 f17655c;
    public final l3.j d;

    public final ab.a f17656e;

    public final t f17657f;
    public final long h;

    public final r0 f17658n;

    public final r f17659r;

    public final j1 f17660s;
    public final a[] v;

    public final za.b f17661w;

    public final o f17662x;
    public l4.h[] D = new l4.h[0];
    public l[] E = new l[0];

    public final IdentityHashMap f17663y = new IdentityHashMap();

    public b(int i10, n4.c cVar, t tVar, int i11, k5.i iVar, y0 y0Var, l3.j jVar, b6.a aVar, ab.a aVar2, g0 g0Var, long j10, r0 r0Var, r rVar, za.b bVar, k5.i iVar2, i3.k kVar) {
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        t0[] t0VarArrF;
        n4.f fVarC;
        l3.j jVar2 = jVar;
        this.f17653a = i10;
        this.G = cVar;
        this.f17657f = tVar;
        this.H = i11;
        this.f17654b = iVar;
        this.f17655c = y0Var;
        this.d = jVar2;
        this.B = aVar;
        this.f17656e = aVar2;
        this.A = g0Var;
        this.h = j10;
        this.f17658n = r0Var;
        this.f17659r = rVar;
        this.f17661w = bVar;
        this.f17662x = new o(cVar, iVar2, rVar);
        l4.h[] hVarArr = this.D;
        bVar.getClass();
        this.F = new a9.i(hVarArr, 21);
        n4.h hVarB = cVar.b(i11);
        List list = hVarB.d;
        this.I = list;
        List list2 = hVarB.f18246c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            sparseIntArray.put(((n4.a) list2.get(i14)).f18209a, i14);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            n4.a aVar3 = (n4.a) list2.get(i15);
            List list3 = aVar3.f18212e;
            List list4 = aVar3.f18213f;
            n4.f fVarC2 = c("http://dashif.org/guidelines/trickmode", list3);
            fVarC2 = fVarC2 == null ? c("http://dashif.org/guidelines/trickmode", list4) : fVarC2;
            int iMin = (fVarC2 == null || (iMin = sparseIntArray.get(Integer.parseInt(fVarC2.f18239b), -1)) == -1) ? i15 : iMin;
            if (iMin == i15 && (fVarC = c("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = fVarC.f18239b;
                int i16 = d5.g0.f4795a;
                for (String str2 : str.split(",", -1)) {
                    int i17 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i17 != -1) {
                        iMin = Math.min(iMin, i17);
                    }
                }
            }
            if (iMin != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(iMin);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i18 = 0; i18 < size2; i18++) {
            int[] iArrE = u6.e((Collection) arrayList.get(i18));
            iArr2[i18] = iArrE;
            Arrays.sort(iArrE);
        }
        boolean[] zArr2 = new boolean[size2];
        t0[][] t0VarArr = new t0[size2][];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            for (int i21 : iArr2[i19]) {
                List list7 = ((n4.a) list2.get(i21)).f18211c;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    if (!((n4.m) list7.get(i22)).d.isEmpty()) {
                        zArr2[i19] = true;
                        i20++;
                        break;
                    }
                }
            }
            int[] iArr3 = iArr2[i19];
            int length = iArr3.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length) {
                    iArr = iArr2;
                    zArr = zArr2;
                    t0VarArrF = new t0[0];
                    break;
                }
                int i24 = iArr3[i23];
                n4.a aVar4 = (n4.a) list2.get(i24);
                List list8 = ((n4.a) list2.get(i24)).d;
                int[] iArr4 = iArr3;
                int i25 = 0;
                while (i25 < list8.size()) {
                    n4.f fVar = (n4.f) list8.get(i25);
                    iArr = iArr2;
                    zArr = zArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f18238a)) {
                        s0 s0Var = new s0();
                        s0Var.f8135o = "application/cea-608";
                        s0Var.f8123a = p.k(aVar4.f18209a, ":cea608", new StringBuilder());
                        t0VarArrF = f(fVar, J, new t0(s0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f18238a)) {
                        s0 s0Var2 = new s0();
                        s0Var2.f8135o = "application/cea-708";
                        s0Var2.f8123a = p.k(aVar4.f18209a, ":cea708", new StringBuilder());
                        t0VarArrF = f(fVar, K, new t0(s0Var2));
                        break;
                    }
                    i25++;
                    iArr2 = iArr;
                    zArr2 = zArr;
                }
                i23++;
                iArr3 = iArr4;
            }
            t0VarArr[i19] = t0VarArrF;
            if (t0VarArrF.length != 0) {
                i20++;
            }
            i19++;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr5 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i20 + size2;
        i1[] i1VarArr = new i1[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr6 = iArr5[i27];
            ArrayList arrayList3 = new ArrayList();
            for (int i28 : iArr6) {
                arrayList3.addAll(((n4.a) list2.get(i28)).f18211c);
            }
            int size4 = arrayList3.size();
            t0[] t0VarArr2 = new t0[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                t0 t0Var = ((n4.m) arrayList3.get(i29)).f18257a;
                int i31 = i26;
                int iM = jVar2.m(t0Var);
                s0 s0VarA = t0Var.a();
                s0VarA.J = iM;
                t0VarArr2[i29] = new t0(s0VarA);
                i29++;
                size2 = i30;
                i26 = i31;
            }
            int i32 = size2;
            int i33 = i26;
            n4.a aVar5 = (n4.a) list2.get(iArr6[0]);
            int i34 = aVar5.f18209a;
            String string = i34 != -1 ? Integer.toString(i34) : i0.a.k(i27, "unset:");
            int i35 = i33 + 1;
            if (zArr3[i27]) {
                i12 = i33 + 2;
            } else {
                i12 = i35;
                i35 = -1;
            }
            if (t0VarArr[i27].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            List list9 = list2;
            i1VarArr[i33] = new i1(string, t0VarArr2);
            int i36 = i33;
            aVarArr[i36] = new a(aVar5.f18210b, 0, iArr6, i33, i35, i12, -1);
            int i37 = -1;
            if (i35 != -1) {
                String strL = s3.c.l(string, ":emsg");
                s0 s0Var3 = new s0();
                s0Var3.f8123a = strL;
                s0Var3.f8135o = "application/x-emsg";
                i1VarArr[i35] = new i1(strL, new t0(s0Var3));
                aVarArr[i35] = new a(5, 1, iArr6, i36, -1, -1, -1);
                i37 = -1;
            }
            if (i12 != i37) {
                i36 = i36;
                i1VarArr[i12] = new i1(s3.c.l(string, ":cc"), t0VarArr[i27]);
                aVarArr[i12] = new a(3, 1, iArr6, i36, -1, -1, -1);
            } else {
                i36 = i36;
            }
            i27++;
            size2 = i32;
            jVar2 = jVar;
            i26 = i13;
            list2 = list9;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            n4.g gVar = (n4.g) list.get(i38);
            s0 s0Var4 = new s0();
            s0Var4.f8123a = gVar.a();
            s0Var4.f8135o = "application/x-emsg";
            i1VarArr[i26] = new i1(gVar.a() + ":" + i38, new t0(s0Var4));
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i38);
            i38++;
            i26++;
        }
        Pair pairCreate = Pair.create(new j1(i1VarArr), aVarArr);
        this.f17660s = (j1) pairCreate.first;
        this.v = (a[]) pairCreate.second;
    }

    public static n4.f c(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            n4.f fVar = (n4.f) list.get(i10);
            if (str.equals(fVar.f18238a)) {
                return fVar;
            }
        }
        return null;
    }

    public static t0[] f(n4.f fVar, Pattern pattern, t0 t0Var) {
        String str = fVar.f18239b;
        if (str == null) {
            return new t0[]{t0Var};
        }
        int i10 = d5.g0.f4795a;
        String[] strArrSplit = str.split(";", -1);
        t0[] t0VarArr = new t0[strArrSplit.length];
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            Matcher matcher = pattern.matcher(strArrSplit[i11]);
            if (!matcher.matches()) {
                return new t0[]{t0Var};
            }
            int i12 = Integer.parseInt(matcher.group(1));
            s0 s0VarA = t0Var.a();
            s0VarA.f8123a = t0Var.f8184a + ":" + i12;
            s0VarA.G = i12;
            s0VarA.f8125c = matcher.group(2);
            t0VarArr[i11] = new t0(s0VarA);
        }
        return t0VarArr;
    }

    @Override
    public final long B(long j10, j2 j2Var) {
        int i10 = 0;
        for (l4.h hVar : this.D) {
            if (hVar.f15428a == 2) {
                i[] iVarArr = hVar.f15431e.h;
                int length = iVarArr.length;
                while (i10 < length) {
                    i iVar = iVarArr[i10];
                    h hVar2 = iVar.d;
                    h hVar3 = iVar.d;
                    long j11 = iVar.f17696f;
                    long j12 = iVar.f17695e;
                    if (hVar2 != null) {
                        long jY = hVar2.y(j10, j12) + j11;
                        long jD = iVar.d(jY);
                        long jF = hVar3.F(j12);
                        return j2Var.a(j10, jD, (jD >= j10 || (jF != -1 && jY >= ((hVar3.E() + j11) + jF) - 1)) ? jD : iVar.d(jY + 1));
                    }
                    i10++;
                    j10 = j10;
                }
                break;
            }
        }
        return j10;
    }

    @Override
    public final long D() {
        return this.F.D();
    }

    @Override
    public final void E(y yVar, long j10) {
        this.C = yVar;
        yVar.e(this);
    }

    @Override
    public final long F(s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) throws Throwable {
        int i10;
        boolean z10;
        int[] iArr;
        int i11;
        int[] iArr2;
        i1 i1VarA;
        int i12;
        i1 i1VarA2;
        int i13;
        n nVar;
        boolean z11;
        int[] iArr3 = new int[sVarArr.length];
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= sVarArr.length) {
                break;
            }
            s sVar = sVarArr[i14];
            if (sVar != null) {
                iArr3[i14] = this.f17660s.b(sVar.b());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < sVarArr.length; i15++) {
            if (sVarArr[i15] == null || !zArr[i15]) {
                b1 b1Var = b1VarArr[i15];
                if (b1Var instanceof l4.h) {
                    ((l4.h) b1Var).u(this);
                } else if (b1Var instanceof l4.f) {
                    l4.f fVar = (l4.f) b1Var;
                    l4.h hVar = fVar.f15427e;
                    boolean[] zArr3 = hVar.d;
                    int i16 = fVar.f15426c;
                    d5.a.i(zArr3[i16]);
                    hVar.d[i16] = false;
                }
                b1VarArr[i15] = null;
            }
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            if (i17 >= sVarArr.length) {
                break;
            }
            b1 b1Var2 = b1VarArr[i17];
            if ((b1Var2 instanceof j4.m) || (b1Var2 instanceof l4.f)) {
                int iD = d(i17, iArr3);
                if (iD == -1) {
                    z11 = b1VarArr[i17] instanceof j4.m;
                } else {
                    b1 b1Var3 = b1VarArr[i17];
                    z11 = (b1Var3 instanceof l4.f) && ((l4.f) b1Var3).f15424a == b1VarArr[iD];
                }
                if (!z11) {
                    b1 b1Var4 = b1VarArr[i17];
                    if (b1Var4 instanceof l4.f) {
                        l4.f fVar2 = (l4.f) b1Var4;
                        l4.h hVar2 = fVar2.f15427e;
                        boolean[] zArr4 = hVar2.d;
                        int i18 = fVar2.f15426c;
                        d5.a.i(zArr4[i18]);
                        hVar2.d[i18] = false;
                    }
                    b1VarArr[i17] = null;
                }
            }
            i17++;
        }
        int i19 = 0;
        while (i19 < sVarArr.length) {
            s sVar2 = sVarArr[i19];
            if (sVar2 == null) {
                i11 = i19;
                iArr2 = iArr3;
            } else {
                b1 b1Var5 = b1VarArr[i19];
                if (b1Var5 == null) {
                    zArr2[i19] = z10;
                    a aVar = this.v[iArr3[i19]];
                    int i20 = aVar.f17649c;
                    if (i20 == 0) {
                        int i21 = aVar.f17651f;
                        boolean z12 = i21 != i10;
                        if (z12) {
                            i1VarA = this.f17660s.a(i21);
                            i12 = 1;
                        } else {
                            i1VarA = null;
                            i12 = 0;
                        }
                        int i22 = aVar.f17652g;
                        boolean z13 = i22 != i10;
                        if (z13) {
                            i1VarA2 = this.f17660s.a(i22);
                            i12 += i1VarA2.f12583a;
                        } else {
                            i1VarA2 = null;
                        }
                        t0[] t0VarArr = new t0[i12];
                        int[] iArr4 = new int[i12];
                        if (z12) {
                            t0VarArr[0] = i1VarA.d[0];
                            iArr4[0] = 5;
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z13) {
                            for (int i23 = 0; i23 < i1VarA2.f12583a; i23++) {
                                t0 t0Var = i1VarA2.d[i23];
                                t0VarArr[i13] = t0Var;
                                iArr4[i13] = 3;
                                arrayList.add(t0Var);
                                i13++;
                            }
                        }
                        if (this.G.d && z12) {
                            o oVar = this.f17662x;
                            nVar = new n(oVar, oVar.f17720a);
                        } else {
                            nVar = null;
                        }
                        k5.i iVar = this.f17654b;
                        r0 r0Var = this.f17658n;
                        n4.c cVar = this.G;
                        t tVar = this.f17657f;
                        int i24 = this.H;
                        int[] iArr5 = aVar.f17647a;
                        int i25 = aVar.f17648b;
                        long j11 = this.h;
                        i11 = i19;
                        y0 y0Var = this.f17655c;
                        com.google.android.exoplayer2.upstream.m mVarCreateDataSource = ((com.google.android.exoplayer2.upstream.l) iVar.f14480b).createDataSource();
                        if (y0Var != null) {
                            mVarCreateDataSource.addTransferListener(y0Var);
                        }
                        n nVar2 = nVar;
                        iArr2 = iArr3;
                        l4.h hVar3 = new l4.h(aVar.f17648b, iArr4, t0VarArr, new k(r0Var, cVar, tVar, i24, iArr5, sVar2, i25, mVarCreateDataSource, j11, z12, arrayList, nVar), this, this.f17659r, j10, this.d, this.B, this.f17656e, this.A);
                        synchronized (this) {
                            this.f17663y.put(hVar3, nVar2);
                        }
                        b1VarArr[i11] = hVar3;
                    } else {
                        i11 = i19;
                        iArr2 = iArr3;
                        if (i20 == 2) {
                            b1VarArr[i11] = new l((n4.g) this.I.get(aVar.d), sVar2.b().d[0], this.G.d);
                        }
                    }
                } else {
                    i11 = i19;
                    iArr2 = iArr3;
                    if (b1Var5 instanceof l4.h) {
                        ((l4.h) b1Var5).f15431e.f17703i = sVar2;
                    }
                }
            }
            i19 = i11 + 1;
            iArr3 = iArr2;
            i10 = -1;
            z10 = true;
        }
        int[] iArr6 = iArr3;
        int i26 = 0;
        while (i26 < sVarArr.length) {
            if (b1VarArr[i26] != null || sVarArr[i26] == null) {
                iArr = iArr6;
            } else {
                a aVar2 = this.v[iArr6[i26]];
                if (aVar2.f17649c == 1) {
                    iArr = iArr6;
                    int iD2 = d(i26, iArr);
                    if (iD2 == -1) {
                        b1VarArr[i26] = new j4.m();
                    } else {
                        l4.h hVar4 = (l4.h) b1VarArr[iD2];
                        int i27 = aVar2.f17648b;
                        boolean[] zArr5 = hVar4.d;
                        a1[] a1VarArr = hVar4.f15438y;
                        int i28 = 0;
                        while (true) {
                            if (i28 >= a1VarArr.length) {
                                throw new IllegalStateException();
                            }
                            if (hVar4.f15429b[i28] == i27) {
                                d5.a.i(!zArr5[i28]);
                                zArr5[i28] = true;
                                a1VarArr[i28].D(j10, true);
                                b1VarArr[i26] = new l4.f(hVar4, hVar4, a1VarArr[i28], i28);
                                break;
                            }
                            i28++;
                        }
                    }
                } else {
                    iArr = iArr6;
                }
            }
            i26++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (b1 b1Var6 : b1VarArr) {
            if (b1Var6 instanceof l4.h) {
                arrayList2.add((l4.h) b1Var6);
            } else if (b1Var6 instanceof l) {
                arrayList3.add((l) b1Var6);
            }
        }
        l4.h[] hVarArr = new l4.h[arrayList2.size()];
        this.D = hVarArr;
        arrayList2.toArray(hVarArr);
        l[] lVarArr = new l[arrayList3.size()];
        this.E = lVarArr;
        arrayList3.toArray(lVarArr);
        za.b bVar = this.f17661w;
        l4.h[] hVarArr2 = this.D;
        bVar.getClass();
        this.F = new a9.i(hVarArr2, 21);
        return j10;
    }

    @Override
    public final void I(long j10) {
        this.F.I(j10);
    }

    @Override
    public final void a(d1 d1Var) {
        this.C.a(this);
    }

    @Override
    public final boolean b() {
        return this.F.b();
    }

    public final int d(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].f17650e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f17649c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final long g() {
        return this.F.g();
    }

    @Override
    public final void m() {
        this.f17658n.a();
    }

    @Override
    public final long o(long j10) throws Throwable {
        l4.a aVar;
        boolean zD;
        for (l4.h hVar : this.D) {
            hVar.F = j10;
            if (hVar.r()) {
                hVar.E = j10;
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 < hVar.v.size()) {
                        aVar = (l4.a) hVar.v.get(i10);
                        long j11 = aVar.h;
                        if (j11 == j10 && aVar.v == -9223372036854775807L) {
                            break;
                        }
                        if (j11 <= j10) {
                            i10++;
                        }
                    }
                    aVar = null;
                    break;
                }
                if (aVar != null) {
                    a1 a1Var = hVar.f15437x;
                    int iD = aVar.d(0);
                    synchronized (a1Var) {
                        a1Var.B();
                        int i11 = a1Var.f12521q;
                        if (iD < i11 || iD > a1Var.f12520p + i11) {
                            zD = false;
                        } else {
                            a1Var.f12524t = Long.MIN_VALUE;
                            a1Var.f12523s = iD - i11;
                            zD = true;
                        }
                    }
                } else {
                    zD = hVar.f15437x.D(j10, j10 < hVar.g());
                }
                if (zD) {
                    hVar.G = hVar.t(hVar.f15437x.q(), 0);
                    a1[] a1VarArr = hVar.f15438y;
                    for (a1 a1Var2 : a1VarArr) {
                        a1Var2.D(j10, true);
                    }
                } else {
                    hVar.E = j10;
                    hVar.I = false;
                    hVar.v.clear();
                    hVar.G = 0;
                    if (hVar.f15434r.d()) {
                        hVar.f15437x.i();
                        for (a1 a1Var3 : hVar.f15438y) {
                            a1Var3.i();
                        }
                        hVar.f15434r.b();
                    } else {
                        hVar.f15434r.f3032c = null;
                        hVar.f15437x.A(false);
                        for (a1 a1Var4 : hVar.f15438y) {
                            a1Var4.A(false);
                        }
                    }
                }
            }
        }
        for (l lVar : this.E) {
            int iB = d5.g0.b(lVar.f17710c, j10, true);
            lVar.h = iB;
            lVar.f17713n = (lVar.d && iB == lVar.f17710c.length) ? j10 : -9223372036854775807L;
        }
        return j10;
    }

    @Override
    public final void p(long j10) {
        long j11;
        for (l4.h hVar : this.D) {
            if (!hVar.r()) {
                a1 a1Var = hVar.f15437x;
                int i10 = a1Var.f12521q;
                a1Var.h(j10, true);
                a1 a1Var2 = hVar.f15437x;
                int i11 = a1Var2.f12521q;
                if (i11 > i10) {
                    synchronized (a1Var2) {
                        j11 = a1Var2.f12520p == 0 ? Long.MIN_VALUE : a1Var2.f12518n[a1Var2.f12522r];
                    }
                    int i12 = 0;
                    while (true) {
                        a1[] a1VarArr = hVar.f15438y;
                        if (i12 >= a1VarArr.length) {
                            break;
                        }
                        a1VarArr[i12].h(j11, hVar.d[i12]);
                        i12++;
                    }
                }
                int iMin = Math.min(hVar.t(i11, 0), hVar.G);
                if (iMin > 0) {
                    d5.g0.N(0, iMin, hVar.v);
                    hVar.G -= iMin;
                }
            }
        }
    }

    @Override
    public final boolean q(long j10) {
        return this.F.q(j10);
    }

    @Override
    public final long w() {
        return -9223372036854775807L;
    }

    @Override
    public final j1 z() {
        return this.f17660s;
    }
}
