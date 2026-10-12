package l2;

import b2.r0;
import com.google.firebase.messaging.s;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.r;
public final class l {
    public final y2.m f15103a;
    public final s f15104b;
    public final int[] f15105c;
    public final int d;
    public final g2.h f15106e;
    public final long f15107f;
    public final int f15108g;
    public final o h;
    public final j[] f15109i;
    public r f15110j;
    public m2.c f15111k;
    public int f15112l;
    public u2.b f15113m;
    public boolean f15114n;

    public l(b2.p pVar, y2.m mVar, m2.c cVar, s sVar, int i10, int[] iArr, r rVar, int i11, g2.h hVar, long j3, int i12, boolean z10, ArrayList arrayList, o oVar) {
        int i13;
        m2.m mVar2;
        j[] jVarArr;
        b2.s sVar2;
        c3.o iVar;
        v2.d dVar;
        ?? obj = new Object();
        obj.f15103a = mVar;
        obj.f15111k = cVar;
        obj.f15104b = sVar;
        obj.f15105c = iArr;
        obj.f15110j = rVar;
        obj.d = i11;
        obj.f15106e = hVar;
        obj.f15112l = i10;
        obj.f15107f = j3;
        obj.f15108g = i12;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f15109i = new j[rVar.length()];
        int i14 = 0;
        int i15 = 0;
        l lVar = obj;
        while (i15 < lVar.f15109i.length) {
            m2.m mVar3 = (m2.m) a2.get(rVar.h(i15));
            m2.b j10 = sVar.j(mVar3.f15702b);
            j[] jVarArr2 = lVar.f15109i;
            m2.b bVar = j10 == null ? (m2.b) mVar3.f15702b.get(i14) : j10;
            b2.s sVar3 = mVar3.f15701a;
            pVar.getClass();
            String str = sVar3.f3640q;
            if (r0.l(str)) {
                if (!pVar.f3503b) {
                    dVar = null;
                    mVar2 = mVar3;
                    jVarArr = jVarArr2;
                    v2.d dVar2 = dVar;
                    int i16 = i15;
                    long j11 = d;
                    jVarArr[i16] = new j(j11, mVar2, bVar, dVar2, 0L, mVar2.c());
                    i15 = i16 + 1;
                    lVar = this;
                    oVar2 = oVar;
                    d = j11;
                    i14 = 0;
                } else {
                    iVar = new z3.h(((qb.b) pVar.f3504c).m(sVar3), sVar3);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    sVar2 = sVar3;
                    jVarArr = jVarArr2;
                    iVar = new u3.d((qb.b) pVar.f3504c, pVar.f3503b ? 1 : 3);
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
                    mVar2 = mVar3;
                    int i17 = pVar.f3503b ? i13 : i13 | 32;
                    jVarArr = jVarArr2;
                    sVar2 = sVar3;
                    iVar = new w3.i((qb.b) pVar.f3504c, i17, null, arrayList, oVar2);
                }
                dVar = new v2.d(iVar, i11, sVar2);
                v2.d dVar22 = dVar;
                int i162 = i15;
                long j112 = d;
                jVarArr[i162] = new j(j112, mVar2, bVar, dVar22, 0L, mVar2.c());
                i15 = i162 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j112;
                i14 = 0;
            }
            mVar2 = mVar3;
            sVar2 = sVar3;
            jVarArr = jVarArr2;
            dVar = new v2.d(iVar, i11, sVar2);
            v2.d dVar222 = dVar;
            int i1622 = i15;
            long j1122 = d;
            jVarArr[i1622] = new j(j1122, mVar2, bVar, dVar222, 0L, mVar2.c());
            i15 = i1622 + 1;
            lVar = this;
            oVar2 = oVar;
            d = j1122;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f15111k.b(this.f15112l).f15690c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f15105c) {
            arrayList.addAll(((m2.a) list.get(i10)).f15654c);
        }
        return arrayList;
    }

    public final j b(int i10) {
        j[] jVarArr = this.f15109i;
        j jVar = jVarArr[i10];
        m2.b j3 = this.f15104b.j(jVar.f15099b.f15702b);
        if (j3 != null && !j3.equals(jVar.f15100c)) {
            j jVar2 = new j(jVar.f15101e, jVar.f15099b, j3, jVar.f15098a, jVar.f15102f, jVar.d);
            jVarArr[i10] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
