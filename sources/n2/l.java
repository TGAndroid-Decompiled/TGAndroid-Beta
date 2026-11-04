package n2;

import a3.r;
import cg.v0;
import d2.u0;
import d2.v;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
public final class l {
    public final r f20181a;
    public final za.p f20182b;
    public final int[] f20183c;
    public final int d;
    public final i2.h f20184e;
    public final long f20185f;
    public final int f20186g;
    public final o h;
    public final j[] f20187i;
    public z2.p f20188j;
    public o2.c f20189k;
    public int f20190l;
    public w2.b f20191m;
    public boolean f20192n;

    public l(v0 v0Var, r rVar, o2.c cVar, za.p pVar, int i3, int[] iArr, z2.p pVar2, int i10, i2.h hVar, long j10, int i11, boolean z10, ArrayList arrayList, o oVar) {
        int i12;
        o2.m mVar;
        j[] jVarArr;
        v vVar;
        e3.o iVar;
        x2.e eVar;
        ?? obj = new Object();
        obj.f20181a = rVar;
        obj.f20189k = cVar;
        obj.f20182b = pVar;
        obj.f20183c = iArr;
        obj.f20188j = pVar2;
        obj.d = i10;
        obj.f20184e = hVar;
        obj.f20190l = i3;
        obj.f20185f = j10;
        obj.f20186g = i11;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i3);
        ArrayList a10 = obj.a();
        obj.f20187i = new j[pVar2.length()];
        int i13 = 0;
        int i14 = 0;
        l lVar = obj;
        while (i14 < lVar.f20187i.length) {
            o2.m mVar2 = (o2.m) a10.get(pVar2.i(i14));
            o2.b B = pVar.B(mVar2.f20554b);
            j[] jVarArr2 = lVar.f20187i;
            o2.b bVar = B == null ? (o2.b) mVar2.f20554b.get(i13) : B;
            v vVar2 = mVar2.f20553a;
            v0Var.getClass();
            String str = vVar2.f8488r;
            if (u0.l(str)) {
                if (!v0Var.f4757a) {
                    eVar = null;
                    mVar = mVar2;
                    jVarArr = jVarArr2;
                    x2.e eVar2 = eVar;
                    int i15 = i14;
                    long j11 = d;
                    jVarArr[i15] = new j(j11, mVar, bVar, eVar2, 0L, mVar.c());
                    i14 = i15 + 1;
                    lVar = this;
                    oVar2 = oVar;
                    d = j11;
                    i13 = 0;
                } else {
                    iVar = new b4.h(((mb.b) v0Var.f4759c).h(vVar2), vVar2);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    vVar = vVar2;
                    jVarArr = jVarArr2;
                    iVar = new w3.f((mb.b) v0Var.f4759c, v0Var.f4757a ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    iVar = new m3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    iVar = new a4.a(0);
                } else {
                    if (z10) {
                        i12 = 4;
                    } else {
                        i12 = 0;
                    }
                    int g7 = (v0Var.f4757a ? i12 : i12 | 32) | y3.i.g(v0Var.f4758b);
                    mVar = mVar2;
                    jVarArr = jVarArr2;
                    vVar = vVar2;
                    iVar = new y3.i((mb.b) v0Var.f4759c, g7, null, arrayList, oVar2);
                }
                eVar = new x2.e(iVar, i10, vVar);
                x2.e eVar22 = eVar;
                int i152 = i14;
                long j112 = d;
                jVarArr[i152] = new j(j112, mVar, bVar, eVar22, 0L, mVar.c());
                i14 = i152 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j112;
                i13 = 0;
            }
            mVar = mVar2;
            vVar = vVar2;
            jVarArr = jVarArr2;
            eVar = new x2.e(iVar, i10, vVar);
            x2.e eVar222 = eVar;
            int i1522 = i14;
            long j1122 = d;
            jVarArr[i1522] = new j(j1122, mVar, bVar, eVar222, 0L, mVar.c());
            i14 = i1522 + 1;
            lVar = this;
            oVar2 = oVar;
            d = j1122;
            i13 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f20189k.b(this.f20190l).f20542c;
        ArrayList arrayList = new ArrayList();
        for (int i3 : this.f20183c) {
            arrayList.addAll(((o2.a) list.get(i3)).f20506c);
        }
        return arrayList;
    }

    public final j b(int i3) {
        j[] jVarArr = this.f20187i;
        j jVar = jVarArr[i3];
        o2.b B = this.f20182b.B(jVar.f20177b.f20554b);
        if (B != null && !B.equals(jVar.f20178c)) {
            j jVar2 = new j(jVar.f20179e, jVar.f20177b, B, jVar.f20176a, jVar.f20180f, jVar.d);
            jVarArr[i3] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
