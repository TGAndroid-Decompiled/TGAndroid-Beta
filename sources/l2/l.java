package l2;

import b2.v0;
import b2.w;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import t7.u;
public final class l {
    public final y2.m f15860a;
    public final qi.e f15861b;
    public final int[] f15862c;
    public final int d;
    public final g2.h e;
    public final long f15863f;
    public final int f15864g;
    public final o h;
    public final j[] f15865i;
    public x2.p f15866j;
    public m2.c f15867k;
    public int f15868l;
    public u2.b f15869m;
    public boolean f15870n;

    public l(c5.f fVar, y2.m mVar, m2.c cVar, qi.e eVar, int i10, int[] iArr, x2.p pVar, int i11, g2.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, o oVar) {
        int i13;
        m2.m mVar2;
        j[] jVarArr;
        w wVar;
        c3.o hVar2;
        v2.e eVar2;
        ?? obj = new Object();
        obj.f15860a = mVar;
        obj.f15867k = cVar;
        obj.f15861b = eVar;
        obj.f15862c = iArr;
        obj.f15866j = pVar;
        obj.d = i11;
        obj.e = hVar;
        obj.f15868l = i10;
        obj.f15863f = j10;
        obj.f15864g = i12;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f15865i = new j[pVar.length()];
        int i14 = 0;
        int i15 = 0;
        l lVar = obj;
        while (i15 < lVar.f15865i.length) {
            m2.m mVar3 = (m2.m) a2.get(pVar.h(i15));
            m2.b G = eVar.G(mVar3.f16447b);
            j[] jVarArr2 = lVar.f15865i;
            m2.b bVar = G == null ? (m2.b) mVar3.f16447b.get(i14) : G;
            w wVar2 = mVar3.f16446a;
            fVar.getClass();
            String str = wVar2.f4130r;
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
                    hVar2 = new u3.g((u) fVar.f4732c, fVar.f4731b ? 1 : 3);
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
        List list = this.f15867k.b(this.f15868l).f16436c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f15862c) {
            arrayList.addAll(((m2.a) list.get(i10)).f16404c);
        }
        return arrayList;
    }

    public final j b(int i10) {
        j[] jVarArr = this.f15865i;
        j jVar = jVarArr[i10];
        m2.b G = this.f15861b.G(jVar.f15857b.f16447b);
        if (G != null && !G.equals(jVar.f15858c)) {
            j jVar2 = new j(jVar.e, jVar.f15857b, G, jVar.f15856a, jVar.f15859f, jVar.d);
            jVarArr[i10] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
