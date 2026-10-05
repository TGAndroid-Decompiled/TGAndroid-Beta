package o2;

import android.net.Uri;
import android.util.Pair;
import b2.l1;
import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import g2.c0;
import ii.n4;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.y7;
public final class i {
    public final c f17020a;
    public final g2.h f17021b;
    public final g2.h f17022c;
    public final t d;
    public final Uri[] f17023e;
    public final b2.s[] f17024f;
    public final p2.c f17025g;
    public final l1 h;
    public final List f17026i;
    public final j2.k f17028k;
    public boolean f17029l;
    public u2.b f17031n;
    public Uri f17032o;
    public Uri f17033p;
    public boolean f17034q;
    public x2.r f17035r;
    public final n2.c f17027j = new n2.c(2);
    public byte[] f17030m = d0.f8539b;
    public long f17036s = -9223372036854775807L;

    public i(c cVar, p2.c cVar2, Uri[] uriArr, b2.s[] sVarArr, n4 n4Var, c0 c0Var, t tVar, List list, j2.k kVar) {
        this.f17020a = cVar;
        this.f17025g = cVar2;
        this.f17023e = uriArr;
        this.f17024f = sVarArr;
        this.d = tVar;
        this.f17026i = list;
        this.f17028k = kVar;
        g2.h createDataSource = ((g2.g) n4Var.f12544b).createDataSource();
        this.f17021b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f17022c = ((g2.g) n4Var.f12544b).createDataSource();
        this.h = new l1("", sVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((sVarArr[i10].f3553f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        l1 l1Var = this.h;
        int[] f7 = y7.f(arrayList);
        ?? cVar3 = new x2.c(l1Var, f7);
        cVar3.f17016g = cVar3.s(l1Var.d[f7[0]]);
        this.f17035r = cVar3;
    }

    public static h d(p2.l lVar, long j3, int i10) {
        long j10 = lVar.f44074k;
        i0 i0Var = lVar.f44082s;
        int i11 = (int) (j3 - j10);
        i0 i0Var2 = lVar.f44081r;
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
        if (i10 < iVar.f44056x.size()) {
            return new h((p2.j) iVar.f44056x.get(i10), j3, i10);
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
        int length = iVar.f17035r.length();
        v2.l[] lVarArr = new v2.l[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.f17035r.h(i10);
            Uri uri = iVar.f17023e[h];
            p2.c cVar = iVar.f17025g;
            if (!cVar.c(uri)) {
                lVarArr[i10] = v2.l.B;
            } else {
                p2.l a10 = cVar.a(uri, z11);
                a10.getClass();
                long j10 = a10.h - cVar.f44016y;
                if (h != a2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Pair c10 = iVar.c(jVar2, z10, a10, j10, j3);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                long j11 = a10.f44074k;
                i0 i0Var = a10.f44082s;
                i0 i0Var2 = a10.f44081r;
                int i11 = (int) (longValue - j11);
                if (i11 >= 0 && i0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            p2.i iVar2 = (p2.i) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(iVar2);
                            } else if (intValue < iVar2.f44056x.size()) {
                                i0 i0Var3 = iVar2.f44056x;
                                arrayList.addAll(i0Var3.subList(intValue, i0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(i0Var2.subList(i11, i0Var2.size()));
                        intValue = 0;
                    }
                    if (a10.f44077n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(intValue, i0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    g0 g0Var = i0.f8758b;
                    list = a1.f8721e;
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
            p2.l a2 = this.f17025g.a(this.f17023e[this.h.a(jVar.d)], false);
            a2.getClass();
            i0 i0Var2 = a2.f44081r;
            int i11 = (int) (jVar.f47818s - a2.f44074k);
            if (i11 >= 0) {
                if (i11 < i0Var2.size()) {
                    i0Var = ((p2.i) i0Var2.get(i11)).f44056x;
                } else {
                    i0Var = a2.f44082s;
                }
                if (i10 < i0Var.size()) {
                    p2.g gVar = (p2.g) i0Var.get(i10);
                    if (gVar.f44051x) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(e2.a.l(a2.f44103a, gVar.f44057a)), jVar.f47794b.f10194a)) {
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
            long j12 = jVar.f47818s;
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
        long j13 = lVar.f44084u;
        i0 i0Var2 = lVar.f44082s;
        long j14 = lVar.f44074k;
        i0 i0Var3 = lVar.f44081r;
        long j15 = j13 + j3;
        if (jVar != null && !this.f17034q) {
            j10 = jVar.h;
        }
        if (!lVar.f44078o && j10 >= j15) {
            return new Pair(Long.valueOf(j14 + i0Var3.size()), -1);
        }
        long j16 = j10 - j3;
        Long valueOf2 = Long.valueOf(j16);
        int i12 = 0;
        if (this.f17025g.f44015x && jVar != null) {
            z11 = false;
        }
        int c10 = d0.c(i0Var3, valueOf2, z11);
        long j17 = c10 + j14;
        if (c10 >= 0) {
            p2.i iVar = (p2.i) i0Var3.get(c10);
            if (j16 < iVar.f44060e + iVar.f44059c) {
                i0Var = iVar.f44056x;
            } else {
                i0Var = i0Var2;
            }
            while (true) {
                if (i12 >= i0Var.size()) {
                    break;
                }
                p2.g gVar = (p2.g) i0Var.get(i12);
                if (j16 < gVar.f44060e + gVar.f44059c) {
                    if (gVar.f44050w) {
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
        n2.c cVar = this.f17027j;
        byte[] bArr = (byte[]) ((d) cVar.f16532b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) cVar.f16532b).put(uri, bArr);
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        b2.s sVar = this.f17024f[i10];
        int n10 = this.f17035r.n();
        Object q6 = this.f17035r.q();
        byte[] bArr3 = this.f17030m;
        ?? eVar = new v2.e(this.f17022c, mVar, 3, sVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = d0.f8539b;
        }
        eVar.f17013s = bArr3;
        return eVar;
    }
}
