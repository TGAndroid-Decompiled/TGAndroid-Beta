package l2;

import b2.r0;
import com.google.firebase.messaging.s;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.r;
public final class m {
    public final y2.o f12743a;
    public final s f12744b;
    public final int[] f12745c;
    public final int d;
    public final g2.h e;
    public final long f12746f;
    public final int f12747g;
    public final p h;
    public final k[] f12748i;
    public r f12749j;
    public m2.c f12750k;
    public int f12751l;
    public u2.b f12752m;
    public boolean f12753n;

    public m(b2.p pVar, y2.o oVar, m2.c cVar, s sVar, int i10, int[] iArr, r rVar, int i11, g2.h hVar, long j3, int i12, boolean z10, ArrayList arrayList, p pVar2) {
        int i13;
        m2.m mVar;
        k[] kVarArr;
        b2.s sVar2;
        c3.o hVar2;
        v2.d dVar;
        ?? obj = new Object();
        obj.f12743a = oVar;
        obj.f12750k = cVar;
        obj.f12744b = sVar;
        obj.f12745c = iArr;
        obj.f12749j = rVar;
        obj.d = i11;
        obj.e = hVar;
        obj.f12751l = i10;
        obj.f12746f = j3;
        obj.f12747g = i12;
        p pVar3 = pVar2;
        obj.h = pVar3;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.f12748i = new k[rVar.length()];
        int i14 = 0;
        int i15 = 0;
        m mVar2 = obj;
        while (i15 < mVar2.f12748i.length) {
            m2.m mVar3 = (m2.m) a2.get(rVar.h(i15));
            m2.b m10 = sVar.m(mVar3.f13269b);
            k[] kVarArr2 = mVar2.f12748i;
            m2.b bVar = m10 == null ? (m2.b) mVar3.f13269b.get(i14) : m10;
            b2.s sVar3 = mVar3.f13268a;
            pVar.getClass();
            String str = sVar3.f2001q;
            if (r0.l(str)) {
                if (!pVar.f1869b) {
                    dVar = null;
                    mVar = mVar3;
                    kVarArr = kVarArr2;
                    v2.d dVar2 = dVar;
                    int i16 = i15;
                    long j10 = d;
                    kVarArr[i16] = new k(j10, mVar, bVar, dVar2, 0L, mVar.d());
                    i15 = i16 + 1;
                    mVar2 = this;
                    pVar3 = pVar2;
                    d = j10;
                    i14 = 0;
                } else {
                    hVar2 = new z3.h(((rb.a) pVar.f1870c).d(sVar3), sVar3);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar3;
                    sVar2 = sVar3;
                    kVarArr = kVarArr2;
                    hVar2 = new u3.d((rb.a) pVar.f1870c, pVar.f1869b ? 1 : 3);
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
                    mVar = mVar3;
                    int i17 = pVar.f1869b ? i13 : i13 | 32;
                    kVarArr = kVarArr2;
                    sVar2 = sVar3;
                    hVar2 = new w3.h((rb.a) pVar.f1870c, i17, null, arrayList, pVar3);
                }
                dVar = new v2.d(hVar2, i11, sVar2);
                v2.d dVar22 = dVar;
                int i162 = i15;
                long j102 = d;
                kVarArr[i162] = new k(j102, mVar, bVar, dVar22, 0L, mVar.d());
                i15 = i162 + 1;
                mVar2 = this;
                pVar3 = pVar2;
                d = j102;
                i14 = 0;
            }
            mVar = mVar3;
            sVar2 = sVar3;
            kVarArr = kVarArr2;
            dVar = new v2.d(hVar2, i11, sVar2);
            v2.d dVar222 = dVar;
            int i1622 = i15;
            long j1022 = d;
            kVarArr[i1622] = new k(j1022, mVar, bVar, dVar222, 0L, mVar.d());
            i15 = i1622 + 1;
            mVar2 = this;
            pVar3 = pVar2;
            d = j1022;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f12750k.b(this.f12751l).f13258c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f12745c) {
            arrayList.addAll(((m2.a) list.get(i10)).f13226c);
        }
        return arrayList;
    }

    public final k b(int i10) {
        k[] kVarArr = this.f12748i;
        k kVar = kVarArr[i10];
        m2.b m10 = this.f12744b.m(kVar.f12740b.f13269b);
        if (m10 != null && !m10.equals(kVar.f12741c)) {
            k kVar2 = new k(kVar.e, kVar.f12740b, m10, kVar.f12739a, kVar.f12742f, kVar.d);
            kVarArr[i10] = kVar2;
            return kVar2;
        }
        return kVar;
    }
}
