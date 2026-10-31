package l2;

import b2.v0;
import b2.x;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import t7.u;
import x2.q;
public final class l {
    public final y2.m f11610a;
    public final xa.n f11611b;
    public final int[] f11612c;
    public final int d;
    public final g2.h e;
    public final long f11613f;
    public final int f11614g;
    public final o h;
    public final j[] f11615i;
    public q f11616j;
    public m2.c f11617k;
    public int f11618l;
    public u2.b f11619m;
    public boolean f11620n;

    public l(c5.e eVar, y2.m mVar, m2.c cVar, xa.n nVar, int i10, int[] iArr, q qVar, int i11, g2.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, o oVar) {
        int i13;
        m2.m mVar2;
        j[] jVarArr;
        x xVar;
        c3.o hVar2;
        v2.e eVar2;
        ?? obj = new Object();
        obj.f11610a = mVar;
        obj.f11617k = cVar;
        obj.f11611b = nVar;
        obj.f11612c = iArr;
        obj.f11616j = qVar;
        obj.d = i11;
        obj.e = hVar;
        obj.f11618l = i10;
        obj.f11613f = j10;
        obj.f11614g = i12;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f11615i = new j[qVar.length()];
        int i14 = 0;
        int i15 = 0;
        l lVar = obj;
        while (i15 < lVar.f11615i.length) {
            m2.m mVar3 = (m2.m) a2.get(qVar.h(i15));
            m2.b W = nVar.W(mVar3.f12668b);
            j[] jVarArr2 = lVar.f11615i;
            m2.b bVar = W == null ? (m2.b) mVar3.f12668b.get(i14) : W;
            x xVar2 = mVar3.f12667a;
            eVar.getClass();
            String str = xVar2.f2422r;
            if (v0.l(str)) {
                if (!eVar.f3776b) {
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
                    hVar2 = new z3.h(((u) eVar.f3777c).m(xVar2), xVar2);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    xVar = xVar2;
                    jVarArr = jVarArr2;
                    hVar2 = new u3.f((u) eVar.f3777c, eVar.f3776b ? 1 : 3);
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
                    int g10 = (eVar.f3776b ? i13 : i13 | 32) | w3.h.g(eVar.f3775a);
                    mVar2 = mVar3;
                    jVarArr = jVarArr2;
                    xVar = xVar2;
                    hVar2 = new w3.h((u) eVar.f3777c, g10, null, arrayList, oVar2);
                }
                eVar2 = new v2.e(hVar2, i11, xVar);
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
            eVar2 = new v2.e(hVar2, i11, xVar);
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
        List list = this.f11617k.b(this.f11618l).f12657c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f11612c) {
            arrayList.addAll(((m2.a) list.get(i10)).f12625c);
        }
        return arrayList;
    }

    public final j b(int i10) {
        j[] jVarArr = this.f11615i;
        j jVar = jVarArr[i10];
        m2.b W = this.f11611b.W(jVar.f11607b.f12668b);
        if (W != null && !W.equals(jVar.f11608c)) {
            j jVar2 = new j(jVar.e, jVar.f11607b, W, jVar.f11606a, jVar.f11609f, jVar.d);
            jVarArr[i10] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
