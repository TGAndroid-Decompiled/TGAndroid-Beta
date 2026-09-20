package l2;

import b2.p;
import b2.r0;
import com.google.firebase.messaging.t;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.s;
public final class k {
    public final y2.n f14043a;
    public final t f14044b;
    public final int[] f14045c;
    public final int d;
    public final g2.h e;
    public final long f14046f;
    public final int f14047g;
    public final n h;
    public final i[] f14048i;
    public s f14049j;
    public m2.c f14050k;
    public int f14051l;
    public u2.b f14052m;
    public boolean f14053n;

    public k(p pVar, y2.n nVar, m2.c cVar, t tVar, int i10, int[] iArr, s sVar, int i11, g2.h hVar, long j3, int i12, boolean z10, ArrayList arrayList, n nVar2) {
        int i13;
        m2.m mVar;
        i[] iVarArr;
        b2.s sVar2;
        c3.o iVar;
        v2.d dVar;
        ?? obj = new Object();
        obj.f14043a = nVar;
        obj.f14050k = cVar;
        obj.f14044b = tVar;
        obj.f14045c = iArr;
        obj.f14049j = sVar;
        obj.d = i11;
        obj.e = hVar;
        obj.f14051l = i10;
        obj.f14046f = j3;
        obj.f14047g = i12;
        n nVar3 = nVar2;
        obj.h = nVar3;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f14048i = new i[sVar.length()];
        int i14 = 0;
        int i15 = 0;
        k kVar = obj;
        while (i15 < kVar.f14048i.length) {
            m2.m mVar2 = (m2.m) a2.get(sVar.h(i15));
            m2.b j10 = tVar.j(mVar2.f14652b);
            i[] iVarArr2 = kVar.f14048i;
            m2.b bVar = j10 == null ? (m2.b) mVar2.f14652b.get(i14) : j10;
            b2.s sVar3 = mVar2.f14651a;
            pVar.getClass();
            String str = sVar3.f3308q;
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
                    iVar = new z3.h(((qb.b) pVar.f3177c).x(sVar3), sVar3);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    sVar2 = sVar3;
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
                    sVar2 = sVar3;
                    iVar = new w3.i((qb.b) pVar.f3177c, i17, null, arrayList, nVar3);
                }
                dVar = new v2.d(iVar, i11, sVar2);
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
            sVar2 = sVar3;
            iVarArr = iVarArr2;
            dVar = new v2.d(iVar, i11, sVar2);
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
        List list = this.f14050k.b(this.f14051l).f14641c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f14045c) {
            arrayList.addAll(((m2.a) list.get(i10)).f14609c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.f14048i;
        i iVar = iVarArr[i10];
        m2.b j3 = this.f14044b.j(iVar.f14040b.f14652b);
        if (j3 != null && !j3.equals(iVar.f14041c)) {
            i iVar2 = new i(iVar.e, iVar.f14040b, j3, iVar.f14039a, iVar.f14042f, iVar.d);
            iVarArr[i10] = iVar2;
            return iVar2;
        }
        return iVar;
    }
}
