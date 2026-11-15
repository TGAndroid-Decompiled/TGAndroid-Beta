package o2;

import a3.u;
import bg.v0;
import e2.s0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
public final class l {
    public final b3.p f21283a;
    public final xi.e f21284b;
    public final int[] f21285c;
    public final int d;
    public final j2.h f21286e;
    public final long f21287f;
    public final int f21288g;
    public final o h;
    public final j[] f21289i;
    public u f21290j;
    public p2.c f21291k;
    public int f21292l;
    public x2.b f21293m;
    public boolean f21294n;

    public l(v0 v0Var, b3.p pVar, p2.c cVar, xi.e eVar, int i7, int[] iArr, u uVar, int i10, j2.h hVar, long j3, int i11, boolean z10, ArrayList arrayList, o oVar) {
        int i12;
        p2.m mVar;
        j[] jVarArr;
        e2.u uVar2;
        f3.o hVar2;
        y2.e eVar2;
        ?? obj = new Object();
        obj.f21283a = pVar;
        obj.f21291k = cVar;
        obj.f21284b = eVar;
        obj.f21285c = iArr;
        obj.f21290j = uVar;
        obj.d = i10;
        obj.f21286e = hVar;
        obj.f21292l = i7;
        obj.f21287f = j3;
        obj.f21288g = i11;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i7);
        ArrayList a10 = obj.a();
        obj.f21289i = new j[uVar.length()];
        int i13 = 0;
        int i14 = 0;
        l lVar = obj;
        while (i14 < lVar.f21289i.length) {
            p2.m mVar2 = (p2.m) a10.get(uVar.i(i14));
            p2.b I = eVar.I(mVar2.f54557b);
            j[] jVarArr2 = lVar.f21289i;
            p2.b bVar = I == null ? (p2.b) mVar2.f54557b.get(i13) : I;
            e2.u uVar3 = mVar2.f54556a;
            v0Var.getClass();
            String str = uVar3.f10450r;
            if (s0.l(str)) {
                if (!v0Var.f3346a) {
                    eVar2 = null;
                    mVar = mVar2;
                    jVarArr = jVarArr2;
                    y2.e eVar3 = eVar2;
                    int i15 = i14;
                    long j10 = d;
                    jVarArr[i15] = new j(j10, mVar, bVar, eVar3, 0L, mVar.c());
                    i14 = i15 + 1;
                    lVar = this;
                    oVar2 = oVar;
                    d = j10;
                    i13 = 0;
                } else {
                    hVar2 = new c4.h(((nb.a) v0Var.f3348c).f(uVar3), uVar3);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    uVar2 = uVar3;
                    jVarArr = jVarArr2;
                    hVar2 = new x3.f((nb.a) v0Var.f3348c, v0Var.f3346a ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar2 = new n3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar2 = new b4.a(0);
                } else {
                    if (z10) {
                        i12 = 4;
                    } else {
                        i12 = 0;
                    }
                    int g10 = (v0Var.f3346a ? i12 : i12 | 32) | z3.h.g(v0Var.f3347b);
                    mVar = mVar2;
                    jVarArr = jVarArr2;
                    uVar2 = uVar3;
                    hVar2 = new z3.h((nb.a) v0Var.f3348c, g10, null, arrayList, oVar2);
                }
                eVar2 = new y2.e(hVar2, i10, uVar2);
                y2.e eVar32 = eVar2;
                int i152 = i14;
                long j102 = d;
                jVarArr[i152] = new j(j102, mVar, bVar, eVar32, 0L, mVar.c());
                i14 = i152 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j102;
                i13 = 0;
            }
            mVar = mVar2;
            uVar2 = uVar3;
            jVarArr = jVarArr2;
            eVar2 = new y2.e(hVar2, i10, uVar2);
            y2.e eVar322 = eVar2;
            int i1522 = i14;
            long j1022 = d;
            jVarArr[i1522] = new j(j1022, mVar, bVar, eVar322, 0L, mVar.c());
            i14 = i1522 + 1;
            lVar = this;
            oVar2 = oVar;
            d = j1022;
            i13 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f21291k.b(this.f21292l).f54545c;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f21285c) {
            arrayList.addAll(((p2.a) list.get(i7)).f54509c);
        }
        return arrayList;
    }

    public final j b(int i7) {
        j[] jVarArr = this.f21289i;
        j jVar = jVarArr[i7];
        p2.b I = this.f21284b.I(jVar.f21279b.f54557b);
        if (I != null && !I.equals(jVar.f21280c)) {
            j jVar2 = new j(jVar.f21281e, jVar.f21279b, I, jVar.f21278a, jVar.f21282f, jVar.d);
            jVarArr[i7] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
