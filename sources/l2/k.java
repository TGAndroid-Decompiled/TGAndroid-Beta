package l2;

import b2.p;
import b2.r0;
import b2.s;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.r;
public final class k {
    public final y2.n f15254a;
    public final fg.f f15255b;
    public final int[] f15256c;
    public final int d;
    public final g2.h f15257e;
    public final long f15258f;
    public final int f15259g;
    public final n h;
    public final i[] f15260i;
    public r f15261j;
    public m2.c f15262k;
    public int f15263l;
    public u2.b f15264m;
    public boolean f15265n;

    public k(p pVar, y2.n nVar, m2.c cVar, fg.f fVar, int i10, int[] iArr, r rVar, int i11, g2.h hVar, long j3, int i12, boolean z10, ArrayList arrayList, n nVar2) {
        int i13;
        m2.m mVar;
        i[] iVarArr;
        s sVar;
        c3.o hVar2;
        v2.d dVar;
        ?? obj = new Object();
        obj.f15254a = nVar;
        obj.f15262k = cVar;
        obj.f15255b = fVar;
        obj.f15256c = iArr;
        obj.f15261j = rVar;
        obj.d = i11;
        obj.f15257e = hVar;
        obj.f15263l = i10;
        obj.f15258f = j3;
        obj.f15259g = i12;
        n nVar3 = nVar2;
        obj.h = nVar3;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f15260i = new i[rVar.length()];
        int i14 = 0;
        int i15 = 0;
        k kVar = obj;
        while (i15 < kVar.f15260i.length) {
            m2.m mVar2 = (m2.m) a2.get(rVar.h(i15));
            m2.b P = fVar.P(mVar2.f15825b);
            i[] iVarArr2 = kVar.f15260i;
            m2.b bVar = P == null ? (m2.b) mVar2.f15825b.get(i14) : P;
            s sVar2 = mVar2.f15824a;
            pVar.getClass();
            String str = sVar2.f2396q;
            if (r0.l(str)) {
                if (!pVar.f2259b) {
                    dVar = null;
                    mVar = mVar2;
                    iVarArr = iVarArr2;
                    v2.d dVar2 = dVar;
                    int i16 = i15;
                    long j10 = d;
                    iVarArr[i16] = new i(j10, mVar, bVar, dVar2, 0L, mVar.d());
                    i15 = i16 + 1;
                    kVar = this;
                    nVar3 = nVar2;
                    d = j10;
                    i14 = 0;
                } else {
                    hVar2 = new z3.h(((rb.a) pVar.f2260c).v(sVar2), sVar2);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    sVar = sVar2;
                    iVarArr = iVarArr2;
                    hVar2 = new u3.d((rb.a) pVar.f2260c, pVar.f2259b ? 1 : 3);
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
                    mVar = mVar2;
                    int i17 = pVar.f2259b ? i13 : i13 | 32;
                    iVarArr = iVarArr2;
                    sVar = sVar2;
                    hVar2 = new w3.h((rb.a) pVar.f2260c, i17, null, arrayList, nVar3);
                }
                dVar = new v2.d(hVar2, i11, sVar);
                v2.d dVar22 = dVar;
                int i162 = i15;
                long j102 = d;
                iVarArr[i162] = new i(j102, mVar, bVar, dVar22, 0L, mVar.d());
                i15 = i162 + 1;
                kVar = this;
                nVar3 = nVar2;
                d = j102;
                i14 = 0;
            }
            mVar = mVar2;
            sVar = sVar2;
            iVarArr = iVarArr2;
            dVar = new v2.d(hVar2, i11, sVar);
            v2.d dVar222 = dVar;
            int i1622 = i15;
            long j1022 = d;
            iVarArr[i1622] = new i(j1022, mVar, bVar, dVar222, 0L, mVar.d());
            i15 = i1622 + 1;
            kVar = this;
            nVar3 = nVar2;
            d = j1022;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f15262k.b(this.f15263l).f15813c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f15256c) {
            arrayList.addAll(((m2.a) list.get(i10)).f15777c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.f15260i;
        i iVar = iVarArr[i10];
        m2.b P = this.f15255b.P(iVar.f15250b.f15825b);
        if (P != null && !P.equals(iVar.f15251c)) {
            i iVar2 = new i(iVar.f15252e, iVar.f15250b, P, iVar.f15249a, iVar.f15253f, iVar.d);
            iVarArr[i10] = iVar2;
            return iVar2;
        }
        return iVar;
    }
}
