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
    public final y2.n f14054a;
    public final t f14055b;
    public final int[] f14056c;
    public final int d;
    public final g2.h e;
    public final long f14057f;
    public final int f14058g;
    public final n h;
    public final i[] f14059i;
    public r f14060j;
    public m2.c f14061k;
    public int f14062l;
    public u2.b f14063m;
    public boolean f14064n;

    public k(p pVar, y2.n nVar, m2.c cVar, t tVar, int i10, int[] iArr, r rVar, int i11, g2.h hVar, long j3, int i12, boolean z10, ArrayList arrayList, n nVar2) {
        int i13;
        m2.m mVar;
        i[] iVarArr;
        s sVar;
        c3.o iVar;
        v2.d dVar;
        ?? obj = new Object();
        obj.f14054a = nVar;
        obj.f14061k = cVar;
        obj.f14055b = tVar;
        obj.f14056c = iArr;
        obj.f14060j = rVar;
        obj.d = i11;
        obj.e = hVar;
        obj.f14062l = i10;
        obj.f14057f = j3;
        obj.f14058g = i12;
        n nVar3 = nVar2;
        obj.h = nVar3;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f14059i = new i[rVar.length()];
        int i14 = 0;
        int i15 = 0;
        k kVar = obj;
        while (i15 < kVar.f14059i.length) {
            m2.m mVar2 = (m2.m) a2.get(rVar.h(i15));
            m2.b j10 = tVar.j(mVar2.f14657b);
            i[] iVarArr2 = kVar.f14059i;
            m2.b bVar = j10 == null ? (m2.b) mVar2.f14657b.get(i14) : j10;
            s sVar2 = mVar2.f14656a;
            pVar.getClass();
            String str = sVar2.f3300q;
            if (r0.l(str)) {
                if (!pVar.f3168b) {
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
                    iVar = new z3.h(((qb.b) pVar.f3169c).x(sVar2), sVar2);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    sVar = sVar2;
                    iVarArr = iVarArr2;
                    iVar = new u3.d((qb.b) pVar.f3169c, pVar.f3168b ? 1 : 3);
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
                    int i17 = pVar.f3168b ? i13 : i13 | 32;
                    iVarArr = iVarArr2;
                    sVar = sVar2;
                    iVar = new w3.i((qb.b) pVar.f3169c, i17, null, arrayList, nVar3);
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
        List list = this.f14061k.b(this.f14062l).f14646c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f14056c) {
            arrayList.addAll(((m2.a) list.get(i10)).f14614c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.f14059i;
        i iVar = iVarArr[i10];
        m2.b j3 = this.f14055b.j(iVar.f14051b.f14657b);
        if (j3 != null && !j3.equals(iVar.f14052c)) {
            i iVar2 = new i(iVar.e, iVar.f14051b, j3, iVar.f14050a, iVar.f14053f, iVar.d);
            iVarArr[i10] = iVar2;
            return iVar2;
        }
        return iVar;
    }
}
