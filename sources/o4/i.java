package o4;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.y0;
import d5.f0;
import g7.r6;
import h3.t0;
import j$.util.DesugarCollections;
import j4.i1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m5.c0;
import n5.e0;
import o8.l0;
import o8.x;
import o8.z;
public final class i {
    public final j f18858a;
    public final com.google.android.exoplayer2.upstream.m f18859b;
    public final com.google.android.exoplayer2.upstream.m f18860c;
    public final c0 d;
    public final Uri[] f18861e;
    public final t0[] f18862f;
    public final p4.c f18863g;
    public final i1 h;
    public final List f18864i;
    public final i3.l f18866k;
    public boolean f18867l;
    public j4.b f18869n;
    public Uri f18870o;
    public boolean f18871p;
    public b5.t f18872q;
    public boolean f18874s;
    public final n2.p f18865j = new n2.p(4);
    public byte[] f18868m = f0.f4353f;
    public long f18873r = -9223372036854775807L;

    public i(j jVar, p4.c cVar, Uri[] uriArr, t0[] t0VarArr, e0 e0Var, y0 y0Var, c0 c0Var, List list, i3.l lVar) {
        this.f18858a = jVar;
        this.f18863g = cVar;
        this.f18861e = uriArr;
        this.f18862f = t0VarArr;
        this.d = c0Var;
        this.f18864i = list;
        this.f18866k = lVar;
        com.google.android.exoplayer2.upstream.m createDataSource = ((com.google.android.exoplayer2.upstream.l) e0Var.f18488b).createDataSource();
        this.f18859b = createDataSource;
        if (y0Var != null) {
            createDataSource.addTransferListener(y0Var);
        }
        this.f18860c = ((com.google.android.exoplayer2.upstream.l) e0Var.f18488b).createDataSource();
        this.h = new i1("", t0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < uriArr.length; i9++) {
            if ((t0VarArr[i9].f9763e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
        i1 i1Var = this.h;
        int[] e10 = r6.e(arrayList);
        ?? cVar2 = new b5.c(i1Var, e10);
        cVar2.f18854g = cVar2.a(i1Var.d[e10[0]]);
        this.f18872q = cVar2;
    }

    public final l4.l[] a(k kVar, long j10) {
        int a2;
        boolean z10;
        List list;
        i iVar = this;
        k kVar2 = kVar;
        if (kVar2 == null) {
            a2 = -1;
        } else {
            a2 = iVar.h.a(kVar2.d);
        }
        int length = iVar.f18872q.length();
        l4.l[] lVarArr = new l4.l[length];
        boolean z11 = false;
        int i9 = 0;
        while (i9 < length) {
            int j11 = iVar.f18872q.j(i9);
            Uri uri = iVar.f18861e[j11];
            p4.c cVar = iVar.f18863g;
            if (!cVar.c(uri)) {
                lVarArr[i9] = l4.l.f16686q;
            } else {
                p4.j a3 = cVar.a(uri, z11);
                a3.getClass();
                long j12 = a3.h - cVar.f45373y;
                if (j11 != a2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Pair c10 = iVar.c(kVar2, z10, a3, j12, j10);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                long j13 = a3.f45398k;
                z zVar = a3.f45406s;
                z zVar2 = a3.f45405r;
                int i10 = (int) (longValue - j13);
                if (i10 >= 0 && zVar2.size() >= i10) {
                    ArrayList arrayList = new ArrayList();
                    if (i10 < zVar2.size()) {
                        if (intValue != -1) {
                            p4.g gVar = (p4.g) zVar2.get(i10);
                            if (intValue == 0) {
                                arrayList.add(gVar);
                            } else if (intValue < gVar.f45380x.size()) {
                                z zVar3 = gVar.f45380x;
                                arrayList.addAll(zVar3.subList(intValue, zVar3.size()));
                            }
                            i10++;
                        }
                        arrayList.addAll(zVar2.subList(i10, zVar2.size()));
                        intValue = 0;
                    }
                    if (a3.f45401n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < zVar.size()) {
                            arrayList.addAll(zVar.subList(intValue, zVar.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    x xVar = z.f19105b;
                    list = l0.f19056e;
                }
                lVarArr[i9] = new f(j12, list);
            }
            i9++;
            iVar = this;
            kVar2 = kVar;
            z11 = false;
        }
        return lVarArr;
    }

    public final int b(k kVar) {
        z zVar;
        int i9 = kVar.A;
        if (i9 != -1) {
            p4.j a2 = this.f18863g.a(this.f18861e[this.h.a(kVar.d)], false);
            a2.getClass();
            z zVar2 = a2.f45405r;
            int i10 = (int) (kVar.f16685s - a2.f45398k);
            if (i10 >= 0) {
                if (i10 < zVar2.size()) {
                    zVar = ((p4.g) zVar2.get(i10)).f45380x;
                } else {
                    zVar = a2.f45406s;
                }
                if (i9 < zVar.size()) {
                    p4.e eVar = (p4.e) zVar.get(i9);
                    if (eVar.f45375x) {
                        return 0;
                    }
                    if (f0.a(Uri.parse(d5.a.G(a2.f45426a, eVar.f45381a)), kVar.f16661b.f2585a)) {
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

    public final Pair c(k kVar, boolean z10, p4.j jVar, long j10, long j11) {
        z zVar;
        long j12;
        boolean z11 = true;
        int i9 = -1;
        if (kVar != null) {
            long j13 = kVar.f16685s;
            int i10 = kVar.A;
            if (!z10) {
                if (kVar.T) {
                    if (i10 == -1) {
                        j13 = kVar.b();
                    }
                    Long valueOf = Long.valueOf(j13);
                    if (i10 != -1) {
                        i9 = i10 + 1;
                    }
                    return new Pair(valueOf, Integer.valueOf(i9));
                }
                return new Pair(Long.valueOf(j13), Integer.valueOf(i10));
            }
        }
        long j14 = jVar.f45408u;
        z zVar2 = jVar.f45406s;
        long j15 = jVar.f45398k;
        z zVar3 = jVar.f45405r;
        long j16 = j14 + j10;
        if (kVar != null && !this.f18871p) {
            j11 = kVar.h;
        }
        if (!jVar.f45402o && j11 >= j16) {
            return new Pair(Long.valueOf(j15 + zVar3.size()), -1);
        }
        long j17 = j11 - j10;
        Long valueOf2 = Long.valueOf(j17);
        int i11 = 0;
        if (this.f18863g.f45372x && kVar != null) {
            z11 = false;
        }
        int c10 = f0.c(zVar3, valueOf2, z11);
        long j18 = c10 + j15;
        if (c10 >= 0) {
            p4.g gVar = (p4.g) zVar3.get(c10);
            if (j17 < gVar.f45384e + gVar.f45383c) {
                zVar = gVar.f45380x;
            } else {
                zVar = zVar2;
            }
            while (true) {
                if (i11 >= zVar.size()) {
                    break;
                }
                p4.e eVar = (p4.e) zVar.get(i11);
                if (j17 < eVar.f45384e + eVar.f45383c) {
                    if (eVar.f45374w) {
                        if (zVar == zVar2) {
                            j12 = 1;
                        } else {
                            j12 = 0;
                        }
                        j18 += j12;
                        i9 = i11;
                    }
                } else {
                    i11++;
                }
            }
        }
        return new Pair(Long.valueOf(j18), Integer.valueOf(i9));
    }

    public final e d(Uri uri, int i9) {
        if (uri == null) {
            return null;
        }
        n2.p pVar = this.f18865j;
        byte[] bArr = (byte[]) ((d) pVar.f18343b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) pVar.f18343b).put(uri, bArr);
            return null;
        }
        com.google.android.exoplayer2.upstream.q qVar = new com.google.android.exoplayer2.upstream.q(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        t0 t0Var = this.f18862f[i9];
        int p6 = this.f18872q.p();
        Object r10 = this.f18872q.r();
        byte[] bArr3 = this.f18868m;
        ?? eVar = new l4.e(this.f18860c, qVar, 3, t0Var, p6, r10, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = f0.f4353f;
        }
        eVar.f18851s = bArr3;
        return eVar;
    }
}
