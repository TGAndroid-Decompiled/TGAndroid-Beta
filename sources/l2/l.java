package l2;

import b2.v0;
import b2.w;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import t7.u;
public final class l {
    public final y2.m f15868a;
    public final qi.e f15869b;
    public final int[] f15870c;
    public final int d;
    public final g2.h e;
    public final long f15871f;
    public final int f15872g;
    public final o h;
    public final j[] f15873i;
    public x2.p f15874j;
    public m2.c f15875k;
    public int f15876l;
    public u2.b f15877m;
    public boolean f15878n;

    public l(c5.f fVar, y2.m mVar, m2.c cVar, qi.e eVar, int i10, int[] iArr, x2.p pVar, int i11, g2.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, o oVar) {
        int i13;
        m2.m mVar2;
        j[] jVarArr;
        w wVar;
        c3.o hVar2;
        v2.e eVar2;
        ?? obj = new Object();
        obj.f15868a = mVar;
        obj.f15875k = cVar;
        obj.f15869b = eVar;
        obj.f15870c = iArr;
        obj.f15874j = pVar;
        obj.d = i11;
        obj.e = hVar;
        obj.f15876l = i10;
        obj.f15871f = j10;
        obj.f15872g = i12;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f15873i = new j[pVar.length()];
        int i14 = 0;
        int i15 = 0;
        l lVar = obj;
        while (i15 < lVar.f15873i.length) {
            m2.m mVar3 = (m2.m) a2.get(pVar.h(i15));
            m2.b G = eVar.G(mVar3.f16455b);
            j[] jVarArr2 = lVar.f15873i;
            m2.b bVar = G == null ? (m2.b) mVar3.f16455b.get(i14) : G;
            w wVar2 = mVar3.f16454a;
            fVar.getClass();
            String str = wVar2.f4129r;
            if (v0.l(str)) {
                if (!fVar.f4731b) {
                    eVar2 = null;
                    mVar2 = mVar3;
                    jVarArr = jVarArr2;
                    v2.e eVar3 = eVar2;
                    int i16 = i15;
                    long j11 = d;
                    jVarArr[i16] = new j(j11, mVar2, bVar, eVar3, 0L, mVar2.c());
                    i15 = i16 + 1;
                    lVar = this;
                    oVar2 = oVar;
                    d = j11;
                    i14 = 0;
                } else {
                    hVar2 = new z3.h(((u) fVar.f4732c).y(wVar2), wVar2);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    wVar = wVar2;
                    jVarArr = jVarArr2;
                    hVar2 = new u3.f((u) fVar.f4732c, fVar.f4731b ? 1 : 3);
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
                    int g10 = (fVar.f4731b ? i13 : i13 | 32) | w3.h.g(fVar.f4730a);
                    mVar2 = mVar3;
                    jVarArr = jVarArr2;
                    wVar = wVar2;
                    hVar2 = new w3.h((u) fVar.f4732c, g10, null, arrayList, oVar2);
                }
                eVar2 = new v2.e(hVar2, i11, wVar);
                v2.e eVar32 = eVar2;
                int i162 = i15;
                long j112 = d;
                jVarArr[i162] = new j(j112, mVar2, bVar, eVar32, 0L, mVar2.c());
                i15 = i162 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j112;
                i14 = 0;
            }
            mVar2 = mVar3;
            wVar = wVar2;
            jVarArr = jVarArr2;
            eVar2 = new v2.e(hVar2, i11, wVar);
            v2.e eVar322 = eVar2;
            int i1622 = i15;
            long j1122 = d;
            jVarArr[i1622] = new j(j1122, mVar2, bVar, eVar322, 0L, mVar2.c());
            i15 = i1622 + 1;
            lVar = this;
            oVar2 = oVar;
            d = j1122;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f15875k.b(this.f15876l).f16444c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f15870c) {
            arrayList.addAll(((m2.a) list.get(i10)).f16412c);
        }
        return arrayList;
    }

    public final j b(int i10) {
        j[] jVarArr = this.f15873i;
        j jVar = jVarArr[i10];
        m2.b G = this.f15869b.G(jVar.f15865b.f16455b);
        if (G != null && !G.equals(jVar.f15866c)) {
            j jVar2 = new j(jVar.e, jVar.f15865b, G, jVar.f15864a, jVar.f15867f, jVar.d);
            jVarArr[i10] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
