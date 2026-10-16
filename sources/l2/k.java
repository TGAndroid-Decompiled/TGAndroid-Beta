package l2;

import b2.w0;
import b2.x;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import t7.u;
import x2.p;
public final class k {
    public final y2.m f14526a;
    public final pi.e f14527b;
    public final int[] f14528c;
    public final int d;
    public final g2.h e;
    public final long f14529f;
    public final int f14530g;
    public final n h;
    public final i[] f14531i;
    public p f14532j;
    public m2.c f14533k;
    public int f14534l;
    public u2.b f14535m;
    public boolean f14536n;

    public k(c5.f fVar, y2.m mVar, m2.c cVar, pi.e eVar, int i10, int[] iArr, p pVar, int i11, g2.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, n nVar) {
        int i13;
        m2.m mVar2;
        i[] iVarArr;
        x xVar;
        c3.o hVar2;
        v2.e eVar2;
        ?? obj = new Object();
        obj.f14526a = mVar;
        obj.f14533k = cVar;
        obj.f14527b = eVar;
        obj.f14528c = iArr;
        obj.f14532j = pVar;
        obj.d = i11;
        obj.e = hVar;
        obj.f14534l = i10;
        obj.f14529f = j10;
        obj.f14530g = i12;
        n nVar2 = nVar;
        obj.h = nVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f14531i = new i[pVar.length()];
        int i14 = 0;
        int i15 = 0;
        k kVar = obj;
        while (i15 < kVar.f14531i.length) {
            m2.m mVar3 = (m2.m) a2.get(pVar.h(i15));
            m2.b E = eVar.E(mVar3.f15094b);
            i[] iVarArr2 = kVar.f14531i;
            m2.b bVar = E == null ? (m2.b) mVar3.f15094b.get(i14) : E;
            x xVar2 = mVar3.f15093a;
            fVar.getClass();
            String str = xVar2.f2522r;
            if (w0.l(str)) {
                if (!fVar.f4361b) {
                    eVar2 = null;
                    mVar2 = mVar3;
                    iVarArr = iVarArr2;
                    v2.e eVar3 = eVar2;
                    int i16 = i15;
                    long j11 = d;
                    iVarArr[i16] = new i(j11, mVar2, bVar, eVar3, 0L, mVar2.d());
                    i15 = i16 + 1;
                    kVar = this;
                    nVar2 = nVar;
                    d = j11;
                    i14 = 0;
                } else {
                    hVar2 = new z3.i(((u) fVar.f4362c).y(xVar2), xVar2);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    xVar = xVar2;
                    iVarArr = iVarArr2;
                    hVar2 = new u3.f((u) fVar.f4362c, fVar.f4361b ? 1 : 3);
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
                    int g10 = (fVar.f4361b ? i13 : i13 | 32) | w3.h.g(fVar.f4360a);
                    mVar2 = mVar3;
                    iVarArr = iVarArr2;
                    xVar = xVar2;
                    hVar2 = new w3.h((u) fVar.f4362c, g10, null, arrayList, nVar2);
                }
                eVar2 = new v2.e(hVar2, i11, xVar);
                v2.e eVar32 = eVar2;
                int i162 = i15;
                long j112 = d;
                iVarArr[i162] = new i(j112, mVar2, bVar, eVar32, 0L, mVar2.d());
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
            iVarArr[i1622] = new i(j1122, mVar2, bVar, eVar322, 0L, mVar2.d());
            i15 = i1622 + 1;
            kVar = this;
            nVar2 = nVar;
            d = j1122;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f14533k.b(this.f14534l).f15083c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f14528c) {
            arrayList.addAll(((m2.a) list.get(i10)).f15051c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.f14531i;
        i iVar = iVarArr[i10];
        m2.b E = this.f14527b.E(iVar.f14523b.f15094b);
        if (E != null && !E.equals(iVar.f14524c)) {
            i iVar2 = new i(iVar.e, iVar.f14523b, E, iVar.f14522a, iVar.f14525f, iVar.d);
            iVarArr[i10] = iVar2;
            return iVar2;
        }
        return iVar;
    }
}
