package l2;

import b2.p;
import b2.r0;
import b2.s;
import com.google.firebase.messaging.t;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.r;
public final class k {
    public final y2.n f14004a;
    public final t f14005b;
    public final int[] f14006c;
    public final int d;
    public final g2.h e;
    public final long f14007f;
    public final int f14008g;
    public final n h;
    public final i[] f14009i;
    public r f14010j;
    public m2.c f14011k;
    public int f14012l;
    public u2.b f14013m;
    public boolean f14014n;

    public k(p pVar, y2.n nVar, m2.c cVar, t tVar, int i10, int[] iArr, r rVar, int i11, g2.h hVar, long j3, int i12, boolean z10, ArrayList arrayList, n nVar2) {
        int i13;
        m2.m mVar;
        i[] iVarArr;
        s sVar;
        c3.o iVar;
        v2.d dVar;
        ?? obj = new Object();
        obj.f14004a = nVar;
        obj.f14011k = cVar;
        obj.f14005b = tVar;
        obj.f14006c = iArr;
        obj.f14010j = rVar;
        obj.d = i11;
        obj.e = hVar;
        obj.f14012l = i10;
        obj.f14007f = j3;
        obj.f14008g = i12;
        n nVar3 = nVar2;
        obj.h = nVar3;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f14009i = new i[rVar.length()];
        int i14 = 0;
        int i15 = 0;
        k kVar = obj;
        while (i15 < kVar.f14009i.length) {
            m2.m mVar2 = (m2.m) a2.get(rVar.h(i15));
            m2.b j10 = tVar.j(mVar2.f14616b);
            i[] iVarArr2 = kVar.f14009i;
            m2.b bVar = j10 == null ? (m2.b) mVar2.f14616b.get(i14) : j10;
            s sVar2 = mVar2.f14615a;
            pVar.getClass();
            String str = sVar2.f3308q;
            if (r0.l(str)) {
                if (!pVar.f3176b) {
                    dVar = null;
                    mVar = mVar2;
                    iVarArr = iVarArr2;
                    v2.d dVar2 = dVar;
                    int i16 = i15;
                    long j11 = d;
                    iVarArr[i16] = new i(j11, mVar, bVar, dVar2, 0L, mVar.d());
                    i15 = i16 + 1;
                    kVar = this;
                    nVar3 = nVar2;
                    d = j11;
                    i14 = 0;
                } else {
                    iVar = new z3.h(((qb.b) pVar.f3177c).x(sVar2), sVar2);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    sVar = sVar2;
                    iVarArr = iVarArr2;
                    iVar = new u3.d((qb.b) pVar.f3177c, pVar.f3176b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    iVar = new k3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    iVar = new g3.a(1);
                } else {
                    if (z10) {
                        i13 = 4;
                    } else {
                        i13 = 0;
                    }
                    mVar = mVar2;
                    int i17 = pVar.f3176b ? i13 : i13 | 32;
                    iVarArr = iVarArr2;
                    sVar = sVar2;
                    iVar = new w3.i((qb.b) pVar.f3177c, i17, null, arrayList, nVar3);
                }
                dVar = new v2.d(iVar, i11, sVar);
                v2.d dVar22 = dVar;
                int i162 = i15;
                long j112 = d;
                iVarArr[i162] = new i(j112, mVar, bVar, dVar22, 0L, mVar.d());
                i15 = i162 + 1;
                kVar = this;
                nVar3 = nVar2;
                d = j112;
                i14 = 0;
            }
            mVar = mVar2;
            sVar = sVar2;
            iVarArr = iVarArr2;
            dVar = new v2.d(iVar, i11, sVar);
            v2.d dVar222 = dVar;
            int i1622 = i15;
            long j1122 = d;
            iVarArr[i1622] = new i(j1122, mVar, bVar, dVar222, 0L, mVar.d());
            i15 = i1622 + 1;
            kVar = this;
            nVar3 = nVar2;
            d = j1122;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f14011k.b(this.f14012l).f14605c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f14006c) {
            arrayList.addAll(((m2.a) list.get(i10)).f14573c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.f14009i;
        i iVar = iVarArr[i10];
        m2.b j3 = this.f14005b.j(iVar.f14001b.f14616b);
        if (j3 != null && !j3.equals(iVar.f14002c)) {
            i iVar2 = new i(iVar.e, iVar.f14001b, j3, iVar.f14000a, iVar.f14003f, iVar.d);
            iVarArr[i10] = iVar2;
            return iVar2;
        }
        return iVar;
    }
}
