package o4;

import a4.w;
import ag.j2;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.exoplayer2.upstream.y0;
import com.google.firebase.messaging.s;
import f5.d0;
import f7.v;
import i7.p7;
import j3.s0;
import j3.t0;
import j7.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.b1;
import l4.c1;
import l4.d1;
import l4.e1;
import l4.g0;
import l4.j1;
import l4.k1;
import l4.y;
import l4.z;
import nh.d6;
public final class b implements z, d1, n4.g {
    public static final Pattern J = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern K = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final g0 A;
    public final j2 B;
    public y C;
    public ha.c F;
    public p4.c G;
    public int H;
    public List I;
    public final int f19136a;
    public final d6 f19137b;
    public final y0 f19138c;
    public final n3.i d;
    public final v f19139e;
    public final s f19140f;
    public final long h;
    public final r0 f19141n;
    public final r f19142r;
    public final k1 f19143s;
    public final a[] v;
    public final bb.a f19144w;
    public final p f19145x;
    public n4.h[] D = new n4.h[0];
    public m[] E = new m[0];
    public final IdentityHashMap f19146y = new IdentityHashMap();

    public b(int i10, p4.c cVar, s sVar, int i11, d6 d6Var, y0 y0Var, n3.i iVar, j2 j2Var, v vVar, g0 g0Var, long j10, r0 r0Var, r rVar, bb.a aVar, d6 d6Var2, k3.k kVar) {
        String k9;
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        t0[] t0VarArr;
        p4.f d;
        n3.i iVar2 = iVar;
        this.f19136a = i10;
        this.G = cVar;
        this.f19140f = sVar;
        this.H = i11;
        this.f19137b = d6Var;
        this.f19138c = y0Var;
        this.d = iVar2;
        this.B = j2Var;
        this.f19139e = vVar;
        this.A = g0Var;
        this.h = j10;
        this.f19141n = r0Var;
        this.f19142r = rVar;
        this.f19144w = aVar;
        this.f19145x = new p(cVar, d6Var2, rVar);
        n4.h[] hVarArr = this.D;
        aVar.getClass();
        this.F = new ha.c(hVarArr, 24);
        p4.h b10 = cVar.b(i11);
        List list = b10.d;
        this.I = list;
        List list2 = b10.f45568c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            sparseIntArray.put(((p4.a) list2.get(i14)).f45531a, i14);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            p4.a aVar2 = (p4.a) list2.get(i15);
            List list3 = aVar2.f45534e;
            List list4 = aVar2.f45535f;
            p4.f d10 = d("http://dashif.org/guidelines/trickmode", list3);
            d10 = d10 == null ? d("http://dashif.org/guidelines/trickmode", list4) : d10;
            int i16 = (d10 == null || (i16 = sparseIntArray.get(Integer.parseInt(d10.f45561b), -1)) == -1) ? i15 : i16;
            if (i16 == i15 && (d = d("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = d.f45561b;
                int i17 = d0.f6579a;
                for (String str2 : str.split(",", -1)) {
                    int i18 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i18 != -1) {
                        i16 = Math.min(i16, i18);
                    }
                }
            }
            if (i16 != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(i16);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2];
        for (int i19 = 0; i19 < size2; i19++) {
            int[] e10 = p7.e((Collection) arrayList.get(i19));
            iArr2[i19] = e10;
            Arrays.sort(e10);
        }
        boolean[] zArr2 = new boolean[size2];
        t0[][] t0VarArr2 = new t0[size2];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr3 = iArr2[i20];
            int length = iArr3.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length) {
                    break;
                }
                List list7 = ((p4.a) list2.get(iArr3[i22])).f45533c;
                for (int i23 = 0; i23 < list7.size(); i23++) {
                    if (!((p4.m) list7.get(i23)).d.isEmpty()) {
                        zArr2[i20] = true;
                        i21++;
                        break;
                    }
                }
                i22++;
            }
            int[] iArr4 = iArr2[i20];
            int length2 = iArr4.length;
            int i24 = 0;
            while (true) {
                if (i24 < length2) {
                    int i25 = iArr4[i24];
                    p4.a aVar3 = (p4.a) list2.get(i25);
                    List list8 = ((p4.a) list2.get(i25)).d;
                    int[] iArr5 = iArr4;
                    int i26 = 0;
                    while (i26 < list8.size()) {
                        p4.f fVar = (p4.f) list8.get(i26);
                        iArr = iArr2;
                        zArr = zArr2;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f45560a)) {
                            s0 s0Var = new s0();
                            s0Var.f10742o = "application/cea-608";
                            s0Var.f10730a = w.l(aVar3.f45531a, ":cea608", new StringBuilder());
                            t0VarArr = g(fVar, J, new t0(s0Var));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f45560a)) {
                            s0 s0Var2 = new s0();
                            s0Var2.f10742o = "application/cea-708";
                            s0Var2.f10730a = w.l(aVar3.f45531a, ":cea708", new StringBuilder());
                            t0VarArr = g(fVar, K, new t0(s0Var2));
                            break;
                        } else {
                            i26++;
                            iArr2 = iArr;
                            zArr2 = zArr;
                        }
                    }
                    i24++;
                    iArr4 = iArr5;
                } else {
                    iArr = iArr2;
                    zArr = zArr2;
                    t0VarArr = new t0[0];
                    break;
                }
            }
            t0VarArr2[i20] = t0VarArr;
            if (t0VarArr.length != 0) {
                i21++;
            }
            i20++;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i21 + size2;
        j1[] j1VarArr = new j1[size3];
        a[] aVarArr = new a[size3];
        int i27 = 0;
        int i28 = 0;
        while (i28 < size2) {
            int[] iArr7 = iArr6[i28];
            ArrayList arrayList3 = new ArrayList();
            for (int i29 : iArr7) {
                arrayList3.addAll(((p4.a) list2.get(i29)).f45533c);
            }
            int size4 = arrayList3.size();
            t0[] t0VarArr3 = new t0[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size2;
                t0 t0Var = ((p4.m) arrayList3.get(i30)).f45579a;
                int i32 = i27;
                int b11 = iVar2.b(t0Var);
                s0 a2 = t0Var.a();
                a2.J = b11;
                t0VarArr3[i30] = new t0(a2);
                i30++;
                size2 = i31;
                i27 = i32;
            }
            int i33 = size2;
            int i34 = i27;
            p4.a aVar4 = (p4.a) list2.get(iArr7[0]);
            int i35 = aVar4.f45531a;
            if (i35 != -1) {
                k9 = Integer.toString(i35);
            } else {
                k9 = l1.k(i28, "unset:");
            }
            int i36 = i34 + 1;
            if (zArr3[i28]) {
                i12 = i34 + 2;
            } else {
                i12 = i36;
                i36 = -1;
            }
            if (t0VarArr2[i28].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            List list9 = list2;
            j1VarArr[i34] = new j1(k9, t0VarArr3);
            int i37 = i34;
            aVarArr[i37] = new a(aVar4.f45532b, 0, iArr7, i34, i36, i12, -1);
            int i38 = -1;
            if (i36 != -1) {
                String k10 = u3.c.k(k9, ":emsg");
                s0 s0Var3 = new s0();
                s0Var3.f10730a = k10;
                s0Var3.f10742o = "application/x-emsg";
                j1VarArr[i36] = new j1(k10, new t0(s0Var3));
                a aVar5 = new a(5, 1, iArr7, i37, -1, -1, -1);
                i37 = i37;
                aVarArr[i36] = aVar5;
                i38 = -1;
            }
            if (i12 != i38) {
                j1VarArr[i12] = new j1(u3.c.k(k9, ":cc"), t0VarArr2[i28]);
                aVarArr[i12] = new a(3, 1, iArr7, i37, -1, -1, -1);
            }
            i28++;
            size2 = i33;
            iVar2 = iVar;
            i27 = i13;
            list2 = list9;
        }
        int i39 = 0;
        while (i39 < list.size()) {
            p4.g gVar = (p4.g) list.get(i39);
            s0 s0Var4 = new s0();
            s0Var4.f10730a = gVar.a();
            s0Var4.f10742o = "application/x-emsg";
            j1VarArr[i27] = new j1(gVar.a() + ":" + i39, new t0(s0Var4));
            aVarArr[i27] = new a(5, 2, new int[0], -1, -1, -1, i39);
            i39++;
            i27++;
        }
        Pair create = Pair.create(new k1(j1VarArr), aVarArr);
        this.f19143s = (k1) create.first;
        this.v = (a[]) create.second;
    }

    public static p4.f d(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            p4.f fVar = (p4.f) list.get(i10);
            if (str.equals(fVar.f45560a)) {
                return fVar;
            }
        }
        return null;
    }

    public static t0[] g(p4.f fVar, Pattern pattern, t0 t0Var) {
        String str = fVar.f45561b;
        if (str == null) {
            return new t0[]{t0Var};
        }
        int i10 = d0.f6579a;
        String[] split = str.split(";", -1);
        t0[] t0VarArr = new t0[split.length];
        for (int i11 = 0; i11 < split.length; i11++) {
            Matcher matcher = pattern.matcher(split[i11]);
            if (!matcher.matches()) {
                return new t0[]{t0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            s0 a2 = t0Var.a();
            a2.f10730a = t0Var.f10797a + ":" + parseInt;
            a2.G = parseInt;
            a2.f10732c = matcher.group(2);
            t0VarArr[i11] = new t0(a2);
        }
        return t0VarArr;
    }

    @Override
    public final long A(d5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        int i10;
        boolean z10;
        int[] iArr;
        int i11;
        int[] iArr2;
        boolean z11;
        j1 j1Var;
        int i12;
        boolean z12;
        j1 j1Var2;
        int i13;
        o oVar;
        boolean z13;
        int[] iArr3 = new int[rVarArr.length];
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= rVarArr.length) {
                break;
            }
            d5.r rVar = rVarArr[i14];
            if (rVar != null) {
                iArr3[i14] = this.f19143s.b(rVar.a());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < rVarArr.length; i15++) {
            if (rVarArr[i15] == null || !zArr[i15]) {
                Object[] objArr = c1VarArr[i15];
                if (objArr instanceof n4.h) {
                    ((n4.h) objArr).w(this);
                } else if (objArr instanceof n4.f) {
                    n4.f fVar = (n4.f) objArr;
                    n4.h hVar = fVar.f17137e;
                    boolean[] zArr3 = hVar.d;
                    int i16 = fVar.f17136c;
                    f5.a.i(zArr3[i16]);
                    hVar.d[i16] = false;
                }
                c1VarArr[i15] = 0;
            }
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            if (i17 >= rVarArr.length) {
                break;
            }
            Object[] objArr2 = c1VarArr[i17];
            if ((objArr2 instanceof l4.m) || (objArr2 instanceof n4.f)) {
                int e10 = e(i17, iArr3);
                if (e10 == -1) {
                    z13 = c1VarArr[i17] instanceof l4.m;
                } else {
                    Object[] objArr3 = c1VarArr[i17];
                    z13 = ((objArr3 instanceof n4.f) && ((n4.f) objArr3).f17134a == c1VarArr[e10]) ? false : false;
                }
                if (!z13) {
                    Object[] objArr4 = c1VarArr[i17];
                    if (objArr4 instanceof n4.f) {
                        n4.f fVar2 = (n4.f) objArr4;
                        n4.h hVar2 = fVar2.f17137e;
                        boolean[] zArr4 = hVar2.d;
                        int i18 = fVar2.f17136c;
                        f5.a.i(zArr4[i18]);
                        hVar2.d[i18] = false;
                    }
                    c1VarArr[i17] = 0;
                }
            }
            i17++;
        }
        int i19 = 0;
        while (i19 < rVarArr.length) {
            d5.r rVar2 = rVarArr[i19];
            if (rVar2 == null) {
                i11 = i19;
                iArr2 = iArr3;
            } else {
                Object[] objArr5 = c1VarArr[i19];
                if (objArr5 == 0) {
                    zArr2[i19] = z10;
                    a aVar = this.v[iArr3[i19]];
                    int i20 = aVar.f19132c;
                    if (i20 == 0) {
                        int i21 = aVar.f19134f;
                        if (i21 != i10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            j1Var = this.f19143s.a(i21);
                            i12 = 1;
                        } else {
                            j1Var = null;
                            i12 = 0;
                        }
                        int i22 = aVar.f19135g;
                        if (i22 != i10) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            j1Var2 = this.f19143s.a(i22);
                            i12 += j1Var2.f14347a;
                        } else {
                            j1Var2 = null;
                        }
                        t0[] t0VarArr = new t0[i12];
                        int[] iArr4 = new int[i12];
                        if (z11) {
                            t0VarArr[0] = j1Var.d[0];
                            iArr4[0] = 5;
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z12) {
                            for (int i23 = 0; i23 < j1Var2.f14347a; i23++) {
                                t0 t0Var = j1Var2.d[i23];
                                t0VarArr[i13] = t0Var;
                                iArr4[i13] = 3;
                                arrayList.add(t0Var);
                                i13++;
                            }
                        }
                        if (this.G.d && z11) {
                            p pVar = this.f19145x;
                            oVar = new o(pVar, pVar.f19205a);
                        } else {
                            oVar = null;
                        }
                        d6 d6Var = this.f19137b;
                        r0 r0Var = this.f19141n;
                        p4.c cVar = this.G;
                        s sVar = this.f19140f;
                        int i24 = this.H;
                        int[] iArr5 = aVar.f19130a;
                        int i25 = aVar.f19131b;
                        long j11 = this.h;
                        i11 = i19;
                        y0 y0Var = this.f19138c;
                        com.google.android.exoplayer2.upstream.m createDataSource = ((com.google.android.exoplayer2.upstream.l) d6Var.f17533b).createDataSource();
                        if (y0Var != null) {
                            createDataSource.addTransferListener(y0Var);
                        }
                        o oVar2 = oVar;
                        iArr2 = iArr3;
                        n4.h hVar3 = new n4.h(aVar.f19131b, iArr4, t0VarArr, new l(r0Var, cVar, sVar, i24, iArr5, rVar2, i25, createDataSource, j11, z11, arrayList, oVar), this, this.f19142r, j10, this.d, this.B, this.f19139e, this.A);
                        synchronized (this) {
                            this.f19146y.put(hVar3, oVar2);
                        }
                        c1VarArr[i11] = hVar3;
                    } else {
                        i11 = i19;
                        iArr2 = iArr3;
                        if (i20 == 2) {
                            c1VarArr[i11] = new m((p4.g) this.I.get(aVar.d), rVar2.a().d[0], this.G.d);
                        }
                    }
                } else {
                    i11 = i19;
                    iArr2 = iArr3;
                    if (objArr5 instanceof n4.h) {
                        ((n4.h) objArr5).f17141e.f19188i = rVar2;
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
        while (i26 < rVarArr.length) {
            if (c1VarArr[i26] == 0 && rVarArr[i26] != null) {
                a aVar2 = this.v[iArr6[i26]];
                if (aVar2.f19132c == 1) {
                    iArr = iArr6;
                    int e11 = e(i26, iArr);
                    if (e11 == -1) {
                        c1VarArr[i26] = new Object();
                    } else {
                        n4.h hVar4 = (n4.h) c1VarArr[e11];
                        int i27 = aVar2.f19131b;
                        boolean[] zArr5 = hVar4.d;
                        b1[] b1VarArr = hVar4.f17148y;
                        for (int i28 = 0; i28 < b1VarArr.length; i28++) {
                            if (hVar4.f17139b[i28] == i27) {
                                f5.a.i(!zArr5[i28]);
                                zArr5[i28] = true;
                                b1VarArr[i28].D(j10, true);
                                c1VarArr[i26] = new n4.f(hVar4, hVar4, b1VarArr[i28], i28);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    i26++;
                    iArr6 = iArr;
                }
            }
            iArr = iArr6;
            i26++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object[] objArr6 : c1VarArr) {
            if (objArr6 instanceof n4.h) {
                arrayList2.add((n4.h) objArr6);
            } else if (objArr6 instanceof m) {
                arrayList3.add((m) objArr6);
            }
        }
        n4.h[] hVarArr = new n4.h[arrayList2.size()];
        this.D = hVarArr;
        arrayList2.toArray(hVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.E = mVarArr;
        arrayList3.toArray(mVarArr);
        bb.a aVar3 = this.f19144w;
        n4.h[] hVarArr2 = this.D;
        aVar3.getClass();
        this.F = new ha.c(hVarArr2, 24);
        return j10;
    }

    @Override
    public final long E() {
        return -9223372036854775807L;
    }

    @Override
    public final k1 J() {
        return this.f19143s;
    }

    @Override
    public final long L() {
        return this.F.L();
    }

    @Override
    public final void U(long j10) {
        this.F.U(j10);
    }

    @Override
    public final void a(e1 e1Var) {
        this.C.a(this);
    }

    @Override
    public final boolean b() {
        return this.F.b();
    }

    public final int e(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].f19133e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f19132c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final long f(long j10, j3.j2 j2Var) {
        long j11;
        long j12 = j10;
        n4.h[] hVarArr = this.D;
        int length = hVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            n4.h hVar = hVarArr[i11];
            if (hVar.f17138a == 2) {
                j[] jVarArr = hVar.f17141e.h;
                int length2 = jVarArr.length;
                while (i10 < length2) {
                    j jVar = jVarArr[i10];
                    i iVar = jVar.d;
                    i iVar2 = jVar.d;
                    long j13 = jVar.f19181f;
                    long j14 = jVar.f19180e;
                    if (iVar != null) {
                        long r6 = iVar.r(j12, j14) + j13;
                        long d = jVar.d(r6);
                        long F = iVar2.F(j14);
                        if (d < j12 && (F == -1 || r6 < ((iVar2.z() + j13) + F) - 1)) {
                            j11 = jVar.d(r6 + 1);
                        } else {
                            j11 = d;
                        }
                        return j2Var.a(j12, d, j11);
                    }
                    i10++;
                    j12 = j10;
                }
            } else {
                i11++;
                j12 = j10;
            }
        }
        return j10;
    }

    @Override
    public final long h() {
        return this.F.h();
    }

    @Override
    public final void n(y yVar, long j10) {
        this.C = yVar;
        yVar.c(this);
    }

    @Override
    public final void o() {
        this.f19141n.a();
    }

    @Override
    public final long p(long j10) {
        n4.h[] hVarArr;
        m[] mVarArr;
        long j11;
        n4.a aVar;
        boolean z10;
        boolean D;
        for (n4.h hVar : this.D) {
            hVar.F = j10;
            if (hVar.t()) {
                hVar.E = j10;
            } else {
                for (int i10 = 0; i10 < hVar.v.size(); i10++) {
                    aVar = (n4.a) hVar.v.get(i10);
                    int i11 = (aVar.h > j10 ? 1 : (aVar.h == j10 ? 0 : -1));
                    if (i11 == 0 && aVar.v == -9223372036854775807L) {
                        break;
                    } else if (i11 > 0) {
                        break;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    b1 b1Var = hVar.f17147x;
                    int d = aVar.d(0);
                    synchronized (b1Var) {
                        b1Var.B();
                        int i12 = b1Var.f14280q;
                        if (d >= i12 && d <= b1Var.f14279p + i12) {
                            b1Var.f14283t = Long.MIN_VALUE;
                            b1Var.f14282s = d - i12;
                            D = true;
                        }
                        D = false;
                    }
                } else {
                    b1 b1Var2 = hVar.f17147x;
                    if (j10 < hVar.h()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    D = b1Var2.D(j10, z10);
                }
                if (D) {
                    hVar.G = hVar.v(hVar.f17147x.q(), 0);
                    b1[] b1VarArr = hVar.f17148y;
                    for (b1 b1Var3 : b1VarArr) {
                        b1Var3.D(j10, true);
                    }
                } else {
                    hVar.E = j10;
                    hVar.I = false;
                    hVar.v.clear();
                    hVar.G = 0;
                    if (hVar.f17144r.d()) {
                        hVar.f17147x.i();
                        for (b1 b1Var4 : hVar.f17148y) {
                            b1Var4.i();
                        }
                        hVar.f17144r.b();
                    } else {
                        hVar.f17144r.f3609c = null;
                        hVar.f17147x.A(false);
                        for (b1 b1Var5 : hVar.f17148y) {
                            b1Var5.A(false);
                        }
                    }
                }
            }
        }
        for (m mVar : this.E) {
            int b10 = d0.b(mVar.f19195c, j10, true);
            mVar.h = b10;
            if (mVar.d && b10 == mVar.f19195c.length) {
                j11 = j10;
            } else {
                j11 = -9223372036854775807L;
            }
            mVar.f19198n = j11;
        }
        return j10;
    }

    @Override
    public final void r(long j10) {
        n4.h[] hVarArr;
        long j11;
        for (n4.h hVar : this.D) {
            if (!hVar.t()) {
                b1 b1Var = hVar.f17147x;
                int i10 = b1Var.f14280q;
                b1Var.h(j10, true);
                b1 b1Var2 = hVar.f17147x;
                int i11 = b1Var2.f14280q;
                if (i11 > i10) {
                    synchronized (b1Var2) {
                        if (b1Var2.f14279p == 0) {
                            j11 = Long.MIN_VALUE;
                        } else {
                            j11 = b1Var2.f14277n[b1Var2.f14281r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        b1[] b1VarArr = hVar.f17148y;
                        if (i12 >= b1VarArr.length) {
                            break;
                        }
                        b1VarArr[i12].h(j11, hVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(hVar.v(i11, 0), hVar.G);
                if (min > 0) {
                    d0.N(0, min, hVar.v);
                    hVar.G -= min;
                }
            }
        }
    }

    @Override
    public final boolean s(long j10) {
        return this.F.s(j10);
    }
}
