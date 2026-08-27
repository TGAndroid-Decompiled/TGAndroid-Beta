package o4;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.y0;
import d5.g0;
import h3.t0;
import h7.u6;
import j$.util.DesugarCollections;
import j4.i1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n2.b0;
import p8.l0;
import p8.x;
import p8.z;

public final class i {

    public final j f19205a;

    public final com.google.android.exoplayer2.upstream.m f19206b;

    public final com.google.android.exoplayer2.upstream.m f19207c;
    public final n1.d d;

    public final Uri[] f19208e;

    public final t0[] f19209f;

    public final p4.c f19210g;
    public final i1 h;

    public final List f19211i;

    public final i3.k f19213k;

    public boolean f19214l;

    public j4.b f19216n;

    public Uri f19217o;

    public boolean f19218p;

    public b5.s f19219q;

    public boolean f19221s;

    public final b0 f19212j = new b0(3);

    public byte[] f19215m = g0.f4799f;

    public long f19220r = -9223372036854775807L;

    public i(j jVar, p4.c cVar, Uri[] uriArr, t0[] t0VarArr, m5.o oVar, y0 y0Var, n1.d dVar, List list, i3.k kVar) {
        this.f19205a = jVar;
        this.f19210g = cVar;
        this.f19208e = uriArr;
        this.f19209f = t0VarArr;
        this.d = dVar;
        this.f19211i = list;
        this.f19213k = kVar;
        com.google.android.exoplayer2.upstream.m mVarCreateDataSource = ((com.google.android.exoplayer2.upstream.l) oVar.f17823b).createDataSource();
        this.f19206b = mVarCreateDataSource;
        if (y0Var != null) {
            mVarCreateDataSource.addTransferListener(y0Var);
        }
        this.f19207c = ((com.google.android.exoplayer2.upstream.l) oVar.f17823b).createDataSource();
        this.h = new i1("", t0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((t0VarArr[i10].f8187e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        i1 i1Var = this.h;
        int[] iArrE = u6.e(arrayList);
        g gVar = new g(i1Var, iArrE);
        gVar.f19201g = gVar.a(i1Var.d[iArrE[0]]);
        this.f19219q = gVar;
    }

    public final l4.l[] a(k kVar, long j10) {
        List listUnmodifiableList;
        i iVar = this;
        k kVar2 = kVar;
        int iA = kVar2 == null ? -1 : iVar.h.a(kVar2.d);
        int length = iVar.f19219q.length();
        l4.l[] lVarArr = new l4.l[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int iJ = iVar.f19219q.j(i10);
            Uri uri = iVar.f19208e[iJ];
            p4.c cVar = iVar.f19210g;
            if (cVar.c(uri)) {
                p4.j jVarA = cVar.a(uri, z10);
                jVarA.getClass();
                long j11 = jVarA.h - cVar.f45379y;
                Pair pairC = iVar.c(kVar2, iJ != iA, jVarA, j11, j10);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j12 = jVarA.f45404k;
                z zVar = jVarA.f45412s;
                z zVar2 = jVarA.f45411r;
                int i11 = (int) (jLongValue - j12);
                if (i11 < 0 || zVar2.size() < i11) {
                    x xVar = z.f45604b;
                    listUnmodifiableList = l0.f45555e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < zVar2.size()) {
                        if (iIntValue != -1) {
                            p4.g gVar = (p4.g) zVar2.get(i11);
                            if (iIntValue == 0) {
                                arrayList.add(gVar);
                            } else if (iIntValue < gVar.f45386x.size()) {
                                z zVar3 = gVar.f45386x;
                                arrayList.addAll(zVar3.subList(iIntValue, zVar3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(zVar2.subList(i11, zVar2.size()));
                        iIntValue = 0;
                    }
                    if (jVarA.f45407n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < zVar.size()) {
                            arrayList.addAll(zVar.subList(iIntValue, zVar.size()));
                        }
                    }
                    listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                }
                lVarArr[i10] = new f(j11, listUnmodifiableList);
            } else {
                lVarArr[i10] = l4.l.f15443o;
            }
            i10++;
            iVar = this;
            kVar2 = kVar;
            z10 = false;
        }
        return lVarArr;
    }

    public final int b(k kVar) {
        int i10 = kVar.A;
        if (i10 == -1) {
            return 1;
        }
        p4.j jVarA = this.f19210g.a(this.f19208e[this.h.a(kVar.d)], false);
        jVarA.getClass();
        z zVar = jVarA.f45411r;
        int i11 = (int) (kVar.f15442s - jVarA.f45404k);
        if (i11 < 0) {
            return 1;
        }
        z zVar2 = i11 < zVar.size() ? ((p4.g) zVar.get(i11)).f45386x : jVarA.f45412s;
        if (i10 >= zVar2.size()) {
            return 2;
        }
        p4.e eVar = (p4.e) zVar2.get(i10);
        if (eVar.f45381x) {
            return 0;
        }
        return g0.a(Uri.parse(d5.a.G(jVarA.f45432a, eVar.f45387a)), kVar.f15418b.f3022a) ? 1 : 2;
    }

    public final Pair c(k kVar, boolean z10, p4.j jVar, long j10, long j11) {
        boolean z11 = true;
        int i10 = -1;
        if (kVar != null) {
            long jB = kVar.f15442s;
            int i11 = kVar.A;
            if (!z10) {
                if (!kVar.T) {
                    return new Pair(Long.valueOf(jB), Integer.valueOf(i11));
                }
                if (i11 == -1) {
                    jB = kVar.b();
                }
                return new Pair(Long.valueOf(jB), Integer.valueOf(i11 != -1 ? i11 + 1 : -1));
            }
        }
        long j12 = jVar.f45414u;
        z zVar = jVar.f45412s;
        long j13 = jVar.f45404k;
        z zVar2 = jVar.f45411r;
        long j14 = j12 + j10;
        if (kVar != null && !this.f19218p) {
            j11 = kVar.h;
        }
        if (!jVar.f45408o && j11 >= j14) {
            return new Pair(Long.valueOf(j13 + ((long) zVar2.size())), -1);
        }
        long j15 = j11 - j10;
        Long lValueOf = Long.valueOf(j15);
        if (this.f19210g.f45378x && kVar != null) {
            z11 = false;
        }
        int iC = g0.c(zVar2, lValueOf, z11);
        long j16 = ((long) iC) + j13;
        if (iC >= 0) {
            p4.g gVar = (p4.g) zVar2.get(iC);
            z zVar3 = j15 < gVar.f45390e + gVar.f45389c ? gVar.f45386x : zVar;
            for (int i12 = 0; i12 < zVar3.size(); i12++) {
                p4.e eVar = (p4.e) zVar3.get(i12);
                if (j15 < eVar.f45390e + eVar.f45389c) {
                    if (!eVar.f45380w) {
                        break;
                    }
                    j16 += zVar3 == zVar ? 1L : 0L;
                    i10 = i12;
                    break;
                }
            }
        }
        return new Pair(Long.valueOf(j16), Integer.valueOf(i10));
    }

    public final e d(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        b0 b0Var = this.f19212j;
        byte[] bArr = (byte[]) ((d) b0Var.f18130b).remove(uri);
        if (bArr != null) {
            return null;
        }
        com.google.android.exoplayer2.upstream.q qVar = new com.google.android.exoplayer2.upstream.q(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        t0 t0Var = this.f19209f[i10];
        int iP = this.f19219q.p();
        Object objR = this.f19219q.r();
        byte[] bArr2 = this.f19215m;
        e eVar = new e(this.f19207c, qVar, 3, t0Var, iP, objR, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = g0.f4799f;
        }
        eVar.f19198s = bArr2;
        return eVar;
    }
}
