package l2;

import b2.r0;
import com.google.firebase.messaging.s;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.r;
public final class l {
    public final y2.m f15291a;
    public final s f15292b;
    public final int[] f15293c;
    public final int d;
    public final g2.h f15294e;
    public final long f15295f;
    public final int f15296g;
    public final o h;
    public final j[] f15297i;
    public r f15298j;
    public m2.c f15299k;
    public int f15300l;
    public u2.b f15301m;
    public boolean f15302n;

    public l(b2.p pVar, y2.m mVar, m2.c cVar, s sVar, int i10, int[] iArr, r rVar, int i11, g2.h hVar, long j3, int i12, boolean z10, ArrayList arrayList, o oVar) {
        int i13;
        m2.m mVar2;
        j[] jVarArr;
        b2.s sVar2;
        c3.o hVar2;
        v2.d dVar;
        ?? obj = new Object();
        obj.f15291a = mVar;
        obj.f15299k = cVar;
        obj.f15292b = sVar;
        obj.f15293c = iArr;
        obj.f15298j = rVar;
        obj.d = i11;
        obj.f15294e = hVar;
        obj.f15300l = i10;
        obj.f15295f = j3;
        obj.f15296g = i12;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f15297i = new j[rVar.length()];
        int i14 = 0;
        int i15 = 0;
        l lVar = obj;
        while (i15 < lVar.f15297i.length) {
            m2.m mVar3 = (m2.m) a2.get(rVar.h(i15));
            m2.b k10 = sVar.k(mVar3.f16018b);
            j[] jVarArr2 = lVar.f15297i;
            m2.b bVar = k10 == null ? (m2.b) mVar3.f16018b.get(i14) : k10;
            b2.s sVar3 = mVar3.f16017a;
            pVar.getClass();
            String str = sVar3.f3563q;
            if (r0.l(str)) {
                if (!pVar.f3426b) {
                    dVar = null;
                    mVar2 = mVar3;
                    jVarArr = jVarArr2;
                    v2.d dVar2 = dVar;
                    int i16 = i15;
                    long j10 = d;
                    jVarArr[i16] = new j(j10, mVar2, bVar, dVar2, 0L, mVar2.c());
                    i15 = i16 + 1;
                    lVar = this;
                    oVar2 = oVar;
                    d = j10;
                    i14 = 0;
                } else {
                    hVar2 = new z3.i(((qb.b) pVar.f3427c).v(sVar3), sVar3);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    sVar2 = sVar3;
                    jVarArr = jVarArr2;
                    hVar2 = new u3.d((qb.b) pVar.f3427c, pVar.f3426b ? 1 : 3);
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
                    mVar2 = mVar3;
                    int i17 = pVar.f3426b ? i13 : i13 | 32;
                    jVarArr = jVarArr2;
                    sVar2 = sVar3;
                    hVar2 = new w3.h((qb.b) pVar.f3427c, i17, null, arrayList, oVar2);
                }
                dVar = new v2.d(hVar2, i11, sVar2);
                v2.d dVar22 = dVar;
                int i162 = i15;
                long j102 = d;
                jVarArr[i162] = new j(j102, mVar2, bVar, dVar22, 0L, mVar2.c());
                i15 = i162 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j102;
                i14 = 0;
            }
            mVar2 = mVar3;
            sVar2 = sVar3;
            jVarArr = jVarArr2;
            dVar = new v2.d(hVar2, i11, sVar2);
            v2.d dVar222 = dVar;
            int i1622 = i15;
            long j1022 = d;
            jVarArr[i1622] = new j(j1022, mVar2, bVar, dVar222, 0L, mVar2.c());
            i15 = i1622 + 1;
            lVar = this;
            oVar2 = oVar;
            d = j1022;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f15299k.b(this.f15300l).f16006c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f15293c) {
            arrayList.addAll(((m2.a) list.get(i10)).f15970c);
        }
        return arrayList;
    }

    public final j b(int i10) {
        j[] jVarArr = this.f15297i;
        j jVar = jVarArr[i10];
        m2.b k10 = this.f15292b.k(jVar.f15287b.f16018b);
        if (k10 != null && !k10.equals(jVar.f15288c)) {
            j jVar2 = new j(jVar.f15289e, jVar.f15287b, k10, jVar.f15286a, jVar.f15290f, jVar.d);
            jVarArr[i10] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
