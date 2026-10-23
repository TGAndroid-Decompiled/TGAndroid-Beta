package l2;

import b2.v0;
import b2.w;
import c3.q;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import t7.u;
public final class l {
    public final y2.m f15929a;
    public final qi.e f15930b;
    public final int[] f15931c;
    public final int d;
    public final g2.h e;
    public final long f15932f;
    public final int f15933g;
    public final o h;
    public final j[] f15934i;
    public x2.p f15935j;
    public m2.c f15936k;
    public int f15937l;
    public u2.b f15938m;
    public boolean f15939n;

    public l(c5.f fVar, y2.m mVar, m2.c cVar, qi.e eVar, int i10, int[] iArr, x2.p pVar, int i11, g2.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, o oVar) {
        int i13;
        m2.m mVar2;
        j[] jVarArr;
        w wVar;
        q hVar2;
        v2.e eVar2;
        ?? obj = new Object();
        obj.f15929a = mVar;
        obj.f15936k = cVar;
        obj.f15930b = eVar;
        obj.f15931c = iArr;
        obj.f15935j = pVar;
        obj.d = i11;
        obj.e = hVar;
        obj.f15937l = i10;
        obj.f15932f = j10;
        obj.f15933g = i12;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f15934i = new j[pVar.length()];
        int i14 = 0;
        int i15 = 0;
        l lVar = obj;
        while (i15 < lVar.f15934i.length) {
            m2.m mVar3 = (m2.m) a2.get(pVar.h(i15));
            m2.b G = eVar.G(mVar3.f16516b);
            j[] jVarArr2 = lVar.f15934i;
            m2.b bVar = G == null ? (m2.b) mVar3.f16516b.get(i14) : G;
            w wVar2 = mVar3.f16515a;
            fVar.getClass();
            String str = wVar2.f4134r;
            if (v0.l(str)) {
                if (!fVar.f4734b) {
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
                    hVar2 = new z3.h(((u) fVar.f4735c).y(wVar2), wVar2);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    wVar = wVar2;
                    jVarArr = jVarArr2;
                    hVar2 = new u3.f((u) fVar.f4735c, fVar.f4734b ? 1 : 3);
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
                    int g10 = (fVar.f4734b ? i13 : i13 | 32) | w3.h.g(fVar.f4733a);
                    mVar2 = mVar3;
                    jVarArr = jVarArr2;
                    wVar = wVar2;
                    hVar2 = new w3.h((u) fVar.f4735c, g10, null, arrayList, oVar2);
                }
                eVar2 = new v2.e(hVar2, i11, wVar);
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
            wVar = wVar2;
            jVarArr = jVarArr2;
            eVar2 = new v2.e(hVar2, i11, wVar);
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
        List list = this.f15936k.b(this.f15937l).f16505c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f15931c) {
            arrayList.addAll(((m2.a) list.get(i10)).f16473c);
        }
        return arrayList;
    }

    public final j b(int i10) {
        j[] jVarArr = this.f15934i;
        j jVar = jVarArr[i10];
        m2.b G = this.f15930b.G(jVar.f15926b.f16516b);
        if (G != null && !G.equals(jVar.f15927c)) {
            j jVar2 = new j(jVar.e, jVar.f15926b, G, jVar.f15925a, jVar.f15928f, jVar.d);
            jVarArr[i10] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
