package o2;

import android.net.Uri;
import android.util.Pair;
import b2.l1;
import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import g2.c0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.u;
import v7.y7;
public final class i {
    public final c f15514a;
    public final g2.h f15515b;
    public final g2.h f15516c;
    public final u d;
    public final Uri[] e;
    public final b2.s[] f15517f;
    public final p2.c f15518g;
    public final l1 h;
    public final List f15519i;
    public final j2.k f15521k;
    public boolean f15522l;
    public u2.b f15524n;
    public Uri f15525o;
    public Uri f15526p;
    public boolean f15527q;
    public x2.r f15528r;
    public final n2.e f15520j = new n2.e(2);
    public byte[] f15523m = d0.f7888b;
    public long f15529s = -9223372036854775807L;

    public i(c cVar, p2.c cVar2, Uri[] uriArr, b2.s[] sVarArr, l.d dVar, c0 c0Var, u uVar, List list, j2.k kVar) {
        this.f15514a = cVar;
        this.f15518g = cVar2;
        this.e = uriArr;
        this.f15517f = sVarArr;
        this.d = uVar;
        this.f15519i = list;
        this.f15521k = kVar;
        g2.h createDataSource = ((g2.g) dVar.f13859a).createDataSource();
        this.f15515b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f15516c = ((g2.g) dVar.f13859a).createDataSource();
        this.h = new l1("", sVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((sVarArr[i10].f3298f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        l1 l1Var = this.h;
        int[] f7 = y7.f(arrayList);
        ?? cVar3 = new x2.c(l1Var, f7);
        cVar3.f15510g = cVar3.s(l1Var.d[f7[0]]);
        this.f15528r = cVar3;
    }

    public static h d(p2.l lVar, long j3, int i10) {
        long j10 = lVar.f40722k;
        i0 i0Var = lVar.f40730s;
        int i11 = (int) (j3 - j10);
        i0 i0Var2 = lVar.f40729r;
        if (i11 == i0Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < i0Var.size()) {
                return new h((p2.j) i0Var.get(i10), j3, i10);
            }
            return null;
        }
        p2.i iVar = (p2.i) i0Var2.get(i11);
        if (i10 == -1) {
            return new h(iVar, j3, -1);
        }
        if (i10 < iVar.f40707x.size()) {
            return new h((p2.j) iVar.f40707x.get(i10), j3, i10);
        }
        int i12 = i11 + 1;
        if (i12 < i0Var2.size()) {
            return new h((p2.j) i0Var2.get(i12), j3 + 1, -1);
        }
        if (!i0Var.isEmpty()) {
            return new h((p2.j) i0Var.get(0), j3 + 1, 0);
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
        int length = iVar.f15528r.length();
        v2.l[] lVarArr = new v2.l[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.f15528r.h(i10);
            Uri uri = iVar.e[h];
            p2.c cVar = iVar.f15518g;
            if (!cVar.c(uri)) {
                lVarArr[i10] = v2.l.B;
            } else {
                p2.l a10 = cVar.a(uri, z11);
                a10.getClass();
                long j10 = a10.h - cVar.f40669y;
                if (h != a2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Pair c10 = iVar.c(jVar2, z10, a10, j10, j3);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                long j11 = a10.f40722k;
                i0 i0Var = a10.f40730s;
                i0 i0Var2 = a10.f40729r;
                int i11 = (int) (longValue - j11);
                if (i11 >= 0 && i0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            p2.i iVar2 = (p2.i) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(iVar2);
                            } else if (intValue < iVar2.f40707x.size()) {
                                i0 i0Var3 = iVar2.f40707x;
                                arrayList.addAll(i0Var3.subList(intValue, i0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(i0Var2.subList(i11, i0Var2.size()));
                        intValue = 0;
                    }
                    if (a10.f40725n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(intValue, i0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    g0 g0Var = i0.f8083b;
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
            p2.l a2 = this.f15518g.a(this.e[this.h.a(jVar.d)], false);
            a2.getClass();
            i0 i0Var2 = a2.f40729r;
            int i11 = (int) (jVar.f44118s - a2.f40722k);
            if (i11 >= 0) {
                if (i11 < i0Var2.size()) {
                    i0Var = ((p2.i) i0Var2.get(i11)).f40707x;
                } else {
                    i0Var = a2.f40730s;
                }
                if (i10 < i0Var.size()) {
                    p2.g gVar = (p2.g) i0Var.get(i10);
                    if (gVar.f40702x) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(e2.a.l(a2.f40749a, gVar.f40708a)), jVar.f44097b.f9379a)) {
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

    public final Pair c(j jVar, boolean z10, p2.l lVar, long j3, long j10) {
        i0 i0Var;
        long j11;
        boolean z11 = true;
        int i10 = -1;
        if (jVar != null) {
            long j12 = jVar.f44118s;
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
        long j13 = lVar.f40732u;
        i0 i0Var2 = lVar.f40730s;
        long j14 = lVar.f40722k;
        i0 i0Var3 = lVar.f40729r;
        long j15 = j13 + j3;
        if (jVar != null && !this.f15527q) {
            j10 = jVar.h;
        }
        if (!lVar.f40726o && j10 >= j15) {
            return new Pair(Long.valueOf(j14 + i0Var3.size()), -1);
        }
        long j16 = j10 - j3;
        Long valueOf2 = Long.valueOf(j16);
        int i12 = 0;
        if (this.f15518g.f40668x && jVar != null) {
            z11 = false;
        }
        int c10 = d0.c(i0Var3, valueOf2, z11);
        long j17 = c10 + j14;
        if (c10 >= 0) {
            p2.i iVar = (p2.i) i0Var3.get(c10);
            if (j16 < iVar.e + iVar.f40710c) {
                i0Var = iVar.f40707x;
            } else {
                i0Var = i0Var2;
            }
            while (true) {
                if (i12 >= i0Var.size()) {
                    break;
                }
                p2.g gVar = (p2.g) i0Var.get(i12);
                if (j16 < gVar.e + gVar.f40710c) {
                    if (gVar.f40701w) {
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
        n2.e eVar = this.f15520j;
        byte[] bArr = (byte[]) ((d) eVar.f15073b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) eVar.f15073b).put(uri, bArr);
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        b2.s sVar = this.f15517f[i10];
        int n10 = this.f15528r.n();
        Object q6 = this.f15528r.q();
        byte[] bArr3 = this.f15523m;
        ?? eVar2 = new v2.e(this.f15516c, mVar, 3, sVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = d0.f7888b;
        }
        eVar2.f15508s = bArr3;
        return eVar2;
    }
}
