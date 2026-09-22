package o2;

import android.net.Uri;
import android.util.Pair;
import b2.l1;
import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.c0;
import k2.u;
import v7.y7;
public final class i {
    public final c f15373a;
    public final g2.h f15374b;
    public final g2.h f15375c;
    public final mi.a d;
    public final Uri[] e;
    public final b2.s[] f15376f;
    public final p2.d f15377g;
    public final l1 h;
    public final List f15378i;
    public final j2.k f15380k;
    public boolean f15381l;
    public u2.b f15383n;
    public Uri f15384o;
    public Uri f15385p;
    public boolean f15386q;
    public x2.r f15387r;
    public final c0 f15379j = new c0();
    public byte[] f15382m = d0.f7886b;
    public long f15388s = -9223372036854775807L;

    public i(c cVar, p2.d dVar, Uri[] uriArr, b2.s[] sVarArr, u uVar, g2.c0 c0Var, mi.a aVar, List list, j2.k kVar) {
        this.f15373a = cVar;
        this.f15377g = dVar;
        this.e = uriArr;
        this.f15376f = sVarArr;
        this.d = aVar;
        this.f15378i = list;
        this.f15380k = kVar;
        g2.h createDataSource = ((g2.g) uVar.f13384b).createDataSource();
        this.f15374b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f15375c = ((g2.g) uVar.f13384b).createDataSource();
        this.h = new l1("", sVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((sVarArr[i10].f3295f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        l1 l1Var = this.h;
        int[] f7 = y7.f(arrayList);
        ?? cVar2 = new x2.c(l1Var, f7);
        cVar2.f15369g = cVar2.s(l1Var.d[f7[0]]);
        this.f15387r = cVar2;
    }

    public static h d(p2.m mVar, long j3, int i10) {
        long j10 = mVar.f40465k;
        i0 i0Var = mVar.f40473s;
        int i11 = (int) (j3 - j10);
        i0 i0Var2 = mVar.f40472r;
        if (i11 == i0Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < i0Var.size()) {
                return new h((p2.k) i0Var.get(i10), j3, i10);
            }
            return null;
        }
        p2.j jVar = (p2.j) i0Var2.get(i11);
        if (i10 == -1) {
            return new h(jVar, j3, -1);
        }
        if (i10 < jVar.f40450x.size()) {
            return new h((p2.k) jVar.f40450x.get(i10), j3, i10);
        }
        int i12 = i11 + 1;
        if (i12 < i0Var2.size()) {
            return new h((p2.k) i0Var2.get(i12), j3 + 1, -1);
        }
        if (!i0Var.isEmpty()) {
            return new h((p2.k) i0Var.get(0), j3 + 1, 0);
        }
        return null;
    }

    public final v2.l[] a(j jVar, long j3) {
        int a2;
        boolean z10;
        List list;
        i iVar = this;
        j jVar2 = jVar;
        if (jVar2 == null) {
            a2 = -1;
        } else {
            a2 = iVar.h.a(jVar2.d);
        }
        int length = iVar.f15387r.length();
        v2.l[] lVarArr = new v2.l[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.f15387r.h(i10);
            Uri uri = iVar.e[h];
            p2.d dVar = iVar.f15377g;
            if (!dVar.c(uri)) {
                lVarArr[i10] = v2.l.B;
            } else {
                p2.m a10 = dVar.a(uri, z11);
                a10.getClass();
                long j10 = a10.h - dVar.f40412y;
                if (h != a2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Pair c10 = iVar.c(jVar2, z10, a10, j10, j3);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                long j11 = a10.f40465k;
                i0 i0Var = a10.f40473s;
                i0 i0Var2 = a10.f40472r;
                int i11 = (int) (longValue - j11);
                if (i11 >= 0 && i0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            p2.j jVar3 = (p2.j) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar3);
                            } else if (intValue < jVar3.f40450x.size()) {
                                i0 i0Var3 = jVar3.f40450x;
                                arrayList.addAll(i0Var3.subList(intValue, i0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(i0Var2.subList(i11, i0Var2.size()));
                        intValue = 0;
                    }
                    if (a10.f40468n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(intValue, i0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    g0 g0Var = i0.f8081b;
                    list = a1.e;
                }
                lVarArr[i10] = new f(j10, list);
            }
            i10++;
            iVar = this;
            jVar2 = jVar;
            z11 = false;
        }
        return lVarArr;
    }

    public final int b(j jVar) {
        i0 i0Var;
        int i10 = jVar.E;
        if (i10 != -1) {
            p2.m a2 = this.f15377g.a(this.e[this.h.a(jVar.d)], false);
            a2.getClass();
            i0 i0Var2 = a2.f40472r;
            int i11 = (int) (jVar.f43860s - a2.f40465k);
            if (i11 >= 0) {
                if (i11 < i0Var2.size()) {
                    i0Var = ((p2.j) i0Var2.get(i11)).f40450x;
                } else {
                    i0Var = a2.f40473s;
                }
                if (i10 < i0Var.size()) {
                    p2.h hVar = (p2.h) i0Var.get(i10);
                    if (hVar.f40445x) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(e2.a.l(a2.f40492a, hVar.f40451a)), jVar.f43839b.f9377a)) {
                        return 1;
                    }
                    return 2;
                }
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public final Pair c(j jVar, boolean z10, p2.m mVar, long j3, long j10) {
        i0 i0Var;
        long j11;
        boolean z11 = true;
        int i10 = -1;
        if (jVar != null) {
            long j12 = jVar.f43860s;
            int i11 = jVar.E;
            if (!z10) {
                if (jVar.X) {
                    if (i11 == -1) {
                        j12 = jVar.b();
                    }
                    Long valueOf = Long.valueOf(j12);
                    if (i11 != -1) {
                        i10 = i11 + 1;
                    }
                    return new Pair(valueOf, Integer.valueOf(i10));
                }
                return new Pair(Long.valueOf(j12), Integer.valueOf(i11));
            }
        }
        long j13 = mVar.f40475u;
        i0 i0Var2 = mVar.f40473s;
        long j14 = mVar.f40465k;
        i0 i0Var3 = mVar.f40472r;
        long j15 = j13 + j3;
        if (jVar != null && !this.f15386q) {
            j10 = jVar.h;
        }
        if (!mVar.f40469o && j10 >= j15) {
            return new Pair(Long.valueOf(j14 + i0Var3.size()), -1);
        }
        long j16 = j10 - j3;
        Long valueOf2 = Long.valueOf(j16);
        int i12 = 0;
        if (this.f15377g.f40411x && jVar != null) {
            z11 = false;
        }
        int c10 = d0.c(i0Var3, valueOf2, z11);
        long j17 = c10 + j14;
        if (c10 >= 0) {
            p2.j jVar2 = (p2.j) i0Var3.get(c10);
            if (j16 < jVar2.e + jVar2.f40453c) {
                i0Var = jVar2.f40450x;
            } else {
                i0Var = i0Var2;
            }
            while (true) {
                if (i12 >= i0Var.size()) {
                    break;
                }
                p2.h hVar = (p2.h) i0Var.get(i12);
                if (j16 < hVar.e + hVar.f40453c) {
                    if (hVar.f40444w) {
                        if (i0Var == i0Var2) {
                            j11 = 1;
                        } else {
                            j11 = 0;
                        }
                        j17 += j11;
                        i10 = i12;
                    }
                } else {
                    i12++;
                }
            }
        }
        return new Pair(Long.valueOf(j17), Integer.valueOf(i10));
    }

    public final e e(int i10, Uri uri, boolean z10) {
        if (uri == null) {
            return null;
        }
        c0 c0Var = this.f15379j;
        byte[] bArr = (byte[]) ((d) c0Var.f13236b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) c0Var.f13236b).put(uri, bArr);
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        b2.s sVar = this.f15376f[i10];
        int n10 = this.f15387r.n();
        Object q6 = this.f15387r.q();
        byte[] bArr3 = this.f15382m;
        ?? eVar = new v2.e(this.f15375c, mVar, 3, sVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = d0.f7886b;
        }
        eVar.f15367s = bArr3;
        return eVar;
    }
}
