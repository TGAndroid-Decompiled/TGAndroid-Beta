package o2;

import android.net.Uri;
import android.util.Pair;
import b2.l1;
import e2.d0;
import e9.a1;
import e9.i0;
import g2.c0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.g0;
import m.y0;
import v7.v7;
public final class i {
    public final c f16717a;
    public final g2.h f16718b;
    public final g2.h f16719c;
    public final g0 d;
    public final Uri[] f16720e;
    public final b2.s[] f16721f;
    public final p2.d f16722g;
    public final l1 h;
    public final List f16723i;
    public final j2.k f16725k;
    public boolean f16726l;
    public u2.b f16728n;
    public Uri f16729o;
    public Uri f16730p;
    public boolean f16731q;
    public x2.r f16732r;
    public final y0 f16724j = new y0(4);
    public byte[] f16727m = d0.f8530b;
    public long f16733s = -9223372036854775807L;

    public i(c cVar, p2.d dVar, Uri[] uriArr, b2.s[] sVarArr, n4.l lVar, c0 c0Var, g0 g0Var, List list, j2.k kVar) {
        this.f16717a = cVar;
        this.f16722g = dVar;
        this.f16720e = uriArr;
        this.f16721f = sVarArr;
        this.d = g0Var;
        this.f16723i = list;
        this.f16725k = kVar;
        g2.h createDataSource = ((g2.g) lVar.f16325a).createDataSource();
        this.f16718b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.f16719c = ((g2.g) lVar.f16325a).createDataSource();
        this.h = new l1("", sVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((sVarArr[i10].f3630f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        l1 l1Var = this.h;
        int[] f7 = v7.f(arrayList);
        ?? cVar2 = new x2.c(l1Var, f7);
        cVar2.f16713g = cVar2.s(l1Var.d[f7[0]]);
        this.f16732r = cVar2;
    }

    public static h d(p2.m mVar, long j3, int i10) {
        long j10 = mVar.f45123k;
        i0 i0Var = mVar.f45131s;
        int i11 = (int) (j3 - j10);
        i0 i0Var2 = mVar.f45130r;
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
        if (i10 < jVar.f45105x.size()) {
            return new h((p2.k) jVar.f45105x.get(i10), j3, i10);
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
        int length = iVar.f16732r.length();
        v2.l[] lVarArr = new v2.l[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.f16732r.h(i10);
            Uri uri = iVar.f16720e[h];
            p2.d dVar = iVar.f16722g;
            if (!dVar.c(uri)) {
                lVarArr[i10] = v2.l.B;
            } else {
                p2.m a10 = dVar.a(uri, z11);
                a10.getClass();
                long j10 = a10.h - dVar.f45065y;
                if (h != a2) {
                    z10 = true;
                } else {
                    z10 = z11;
                }
                Pair c10 = iVar.c(jVar2, z10, a10, j10, j3);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                long j11 = a10.f45123k;
                i0 i0Var = a10.f45131s;
                i0 i0Var2 = a10.f45130r;
                int i11 = (int) (longValue - j11);
                if (i11 >= 0 && i0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            p2.j jVar3 = (p2.j) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar3);
                            } else if (intValue < jVar3.f45105x.size()) {
                                i0 i0Var3 = jVar3.f45105x;
                                arrayList.addAll(i0Var3.subList(intValue, i0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(i0Var2.subList(i11, i0Var2.size()));
                        intValue = 0;
                    }
                    if (a10.f45126n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(intValue, i0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    e9.g0 g0Var = i0.f8749b;
                    list = a1.f8712e;
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
            p2.m a2 = this.f16722g.a(this.f16720e[this.h.a(jVar.d)], false);
            a2.getClass();
            i0 i0Var2 = a2.f45130r;
            int i11 = (int) (jVar.f49303s - a2.f45123k);
            if (i11 >= 0) {
                if (i11 < i0Var2.size()) {
                    i0Var = ((p2.j) i0Var2.get(i11)).f45105x;
                } else {
                    i0Var = a2.f45131s;
                }
                if (i10 < i0Var.size()) {
                    p2.h hVar = (p2.h) i0Var.get(i10);
                    if (hVar.f45100x) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(e2.a.l(a2.f45152a, hVar.f45106a)), jVar.f49279b.f10265a)) {
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
            long j12 = jVar.f49303s;
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
        long j13 = mVar.f45133u;
        i0 i0Var2 = mVar.f45131s;
        long j14 = mVar.f45123k;
        i0 i0Var3 = mVar.f45130r;
        long j15 = j13 + j3;
        if (jVar != null && !this.f16731q) {
            j10 = jVar.h;
        }
        if (!mVar.f45127o && j10 >= j15) {
            return new Pair(Long.valueOf(j14 + i0Var3.size()), -1);
        }
        long j16 = j10 - j3;
        Long valueOf2 = Long.valueOf(j16);
        int i12 = 0;
        if (this.f16722g.f45064x && jVar != null) {
            z11 = false;
        }
        int c10 = d0.c(i0Var3, valueOf2, z11);
        long j17 = c10 + j14;
        if (c10 >= 0) {
            p2.j jVar2 = (p2.j) i0Var3.get(c10);
            if (j16 < jVar2.f45109e + jVar2.f45108c) {
                i0Var = jVar2.f45105x;
            } else {
                i0Var = i0Var2;
            }
            while (true) {
                if (i12 >= i0Var.size()) {
                    break;
                }
                p2.h hVar = (p2.h) i0Var.get(i12);
                if (j16 < hVar.f45109e + hVar.f45108c) {
                    if (hVar.f45099w) {
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
        y0 y0Var = this.f16724j;
        byte[] bArr = (byte[]) ((d) y0Var.f15627b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) y0Var.f15627b).put(uri, bArr);
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        b2.s sVar = this.f16721f[i10];
        int n10 = this.f16732r.n();
        Object q6 = this.f16732r.q();
        byte[] bArr3 = this.f16727m;
        ?? eVar = new v2.e(this.f16719c, mVar, 3, sVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = d0.f8530b;
        }
        eVar.f16710s = bArr3;
        return eVar;
    }
}
