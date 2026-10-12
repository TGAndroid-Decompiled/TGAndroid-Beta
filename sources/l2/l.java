package l2;

import b2.w0;
import b2.x;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import t7.u;
public final class l {
    public final y2.m f14526a;
    public final qi.e f14527b;
    public final int[] f14528c;
    public final int d;
    public final g2.h e;
    public final long f14529f;
    public final int f14530g;
    public final o h;
    public final j[] f14531i;
    public x2.p f14532j;
    public m2.c f14533k;
    public int f14534l;
    public u2.b f14535m;
    public boolean f14536n;

    public l(c5.f fVar, y2.m mVar, m2.c cVar, qi.e eVar, int i10, int[] iArr, x2.p pVar, int i11, g2.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, o oVar) {
        int i13;
        m2.m mVar2;
        j[] jVarArr;
        x xVar;
        c3.o iVar;
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
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f14531i = new j[pVar.length()];
        int i14 = 0;
        int i15 = 0;
        l lVar = obj;
        while (i15 < lVar.f14531i.length) {
            m2.m mVar3 = (m2.m) a2.get(pVar.h(i15));
            m2.b E = eVar.E(mVar3.f15359b);
            j[] jVarArr2 = lVar.f14531i;
            m2.b bVar = E == null ? (m2.b) mVar3.f15359b.get(i14) : E;
            x xVar2 = mVar3.f15358a;
            fVar.getClass();
            String str = xVar2.f2518r;
            if (w0.l(str)) {
                if (!fVar.f4358b) {
                    eVar2 = null;
                    mVar2 = mVar3;
                    jVarArr = jVarArr2;
                    v2.e eVar3 = eVar2;
                    int i16 = i15;
                    long j11 = d;
                    jVarArr[i16] = new j(j11, mVar2, bVar, eVar3, 0L, mVar2.d());
                    i15 = i16 + 1;
                    lVar = this;
                    oVar2 = oVar;
                    d = j11;
                    i14 = 0;
                } else {
                    iVar = new z3.i(((u) fVar.f4359c).p(xVar2), xVar2);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    xVar = xVar2;
                    jVarArr = jVarArr2;
                    iVar = new u3.f((u) fVar.f4359c, fVar.f4358b ? 1 : 3);
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
                    int g10 = (fVar.f4358b ? i13 : i13 | 32) | w3.i.g(fVar.f4357a);
                    mVar2 = mVar3;
                    jVarArr = jVarArr2;
                    xVar = xVar2;
                    iVar = new w3.i((u) fVar.f4359c, g10, null, arrayList, oVar2);
                }
                eVar2 = new v2.e(iVar, i11, xVar);
                v2.e eVar32 = eVar2;
                int i162 = i15;
                long j112 = d;
                jVarArr[i162] = new j(j112, mVar2, bVar, eVar32, 0L, mVar2.d());
                i15 = i162 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j112;
                i14 = 0;
            }
            mVar2 = mVar3;
            xVar = xVar2;
            jVarArr = jVarArr2;
            eVar2 = new v2.e(iVar, i11, xVar);
            v2.e eVar322 = eVar2;
            int i1622 = i15;
            long j1122 = d;
            jVarArr[i1622] = new j(j1122, mVar2, bVar, eVar322, 0L, mVar2.d());
            i15 = i1622 + 1;
            lVar = this;
            oVar2 = oVar;
            d = j1122;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f14533k.b(this.f14534l).f15348c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f14528c) {
            arrayList.addAll(((m2.a) list.get(i10)).f15316c);
        }
        return arrayList;
    }

    public final j b(int i10) {
        j[] jVarArr = this.f14531i;
        j jVar = jVarArr[i10];
        m2.b E = this.f14527b.E(jVar.f14523b.f15359b);
        if (E != null && !E.equals(jVar.f14524c)) {
            j jVar2 = new j(jVar.e, jVar.f14523b, E, jVar.f14522a, jVar.f14525f, jVar.d);
            jVarArr[i10] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
