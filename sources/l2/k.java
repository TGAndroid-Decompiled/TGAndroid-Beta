package l2;

import b2.w0;
import b2.x;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.q;
public final class k {
    public final y2.m f16830a;
    public final ti.e f16831b;
    public final int[] f16832c;
    public final int d;
    public final g2.h e;
    public final long f16833f;
    public final int f16834g;
    public final n h;
    public final i[] f16835i;
    public q f16836j;
    public m2.c f16837k;
    public int f16838l;
    public u2.b f16839m;
    public boolean f16840n;

    public k(d5.f fVar, y2.m mVar, m2.c cVar, ti.e eVar, int i10, int[] iArr, q qVar, int i11, g2.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, n nVar) {
        int i13;
        m2.m mVar2;
        i[] iVarArr;
        x xVar;
        c3.o hVar2;
        v2.e eVar2;
        ?? obj = new Object();
        obj.f16830a = mVar;
        obj.f16837k = cVar;
        obj.f16831b = eVar;
        obj.f16832c = iArr;
        obj.f16836j = qVar;
        obj.d = i11;
        obj.e = hVar;
        obj.f16838l = i10;
        obj.f16833f = j10;
        obj.f16834g = i12;
        n nVar2 = nVar;
        obj.h = nVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f16835i = new i[qVar.length()];
        int i14 = 0;
        int i15 = 0;
        k kVar = obj;
        while (i15 < kVar.f16835i.length) {
            m2.m mVar3 = (m2.m) a2.get(qVar.h(i15));
            m2.b t10 = eVar.t(mVar3.f17973b);
            i[] iVarArr2 = kVar.f16835i;
            m2.b bVar = t10 == null ? (m2.b) mVar3.f17973b.get(i14) : t10;
            x xVar2 = mVar3.f17972a;
            fVar.getClass();
            String str = xVar2.f3585r;
            if (w0.l(str)) {
                if (!fVar.f7971b) {
                    eVar2 = null;
                    mVar2 = mVar3;
                    iVarArr = iVarArr2;
                    v2.e eVar3 = eVar2;
                    int i16 = i15;
                    long j11 = d;
                    iVarArr[i16] = new i(j11, mVar2, bVar, eVar3, 0L, mVar2.c());
                    i15 = i16 + 1;
                    kVar = this;
                    nVar2 = nVar;
                    d = j11;
                    i14 = 0;
                } else {
                    hVar2 = new z3.h(((qb.a) fVar.f7972c).f0(xVar2), xVar2);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    xVar = xVar2;
                    iVarArr = iVarArr2;
                    hVar2 = new u3.f((qb.a) fVar.f7972c, fVar.f7971b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar2 = new k3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar2 = new g3.a(1);
                } else {
                    if (z10) {
                        i13 = 4;
                    } else {
                        i13 = 0;
                    }
                    int g7 = (fVar.f7971b ? i13 : i13 | 32) | w3.h.g(fVar.f7970a);
                    mVar2 = mVar3;
                    iVarArr = iVarArr2;
                    xVar = xVar2;
                    hVar2 = new w3.h((qb.a) fVar.f7972c, g7, null, arrayList, nVar2);
                }
                eVar2 = new v2.e(hVar2, i11, xVar);
                v2.e eVar32 = eVar2;
                int i162 = i15;
                long j112 = d;
                iVarArr[i162] = new i(j112, mVar2, bVar, eVar32, 0L, mVar2.c());
                i15 = i162 + 1;
                kVar = this;
                nVar2 = nVar;
                d = j112;
                i14 = 0;
            }
            mVar2 = mVar3;
            xVar = xVar2;
            iVarArr = iVarArr2;
            eVar2 = new v2.e(hVar2, i11, xVar);
            v2.e eVar322 = eVar2;
            int i1622 = i15;
            long j1122 = d;
            iVarArr[i1622] = new i(j1122, mVar2, bVar, eVar322, 0L, mVar2.c());
            i15 = i1622 + 1;
            kVar = this;
            nVar2 = nVar;
            d = j1122;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f16837k.b(this.f16838l).f17962c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f16832c) {
            arrayList.addAll(((m2.a) list.get(i10)).f17930c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.f16835i;
        i iVar = iVarArr[i10];
        m2.b t10 = this.f16831b.t(iVar.f16827b.f17973b);
        if (t10 != null && !t10.equals(iVar.f16828c)) {
            i iVar2 = new i(iVar.e, iVar.f16827b, t10, iVar.f16826a, iVar.f16829f, iVar.d);
            iVarArr[i10] = iVar2;
            return iVar2;
        }
        return iVar;
    }
}
