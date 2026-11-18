package o2;

import a3.u;
import b3.q;
import bg.w0;
import e2.s0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
public final class l {
    public final q f21647a;
    public final xi.e f21648b;
    public final int[] f21649c;
    public final int d;
    public final j2.h f21650e;
    public final long f21651f;
    public final int f21652g;
    public final o h;
    public final j[] f21653i;
    public u f21654j;
    public p2.c f21655k;
    public int f21656l;
    public x2.b f21657m;
    public boolean f21658n;

    public l(w0 w0Var, q qVar, p2.c cVar, xi.e eVar, int i7, int[] iArr, u uVar, int i10, j2.h hVar, long j3, int i11, boolean z10, ArrayList arrayList, o oVar) {
        int i12;
        p2.m mVar;
        j[] jVarArr;
        e2.u uVar2;
        f3.o hVar2;
        y2.e eVar2;
        ?? obj = new Object();
        obj.f21647a = qVar;
        obj.f21655k = cVar;
        obj.f21648b = eVar;
        obj.f21649c = iArr;
        obj.f21654j = uVar;
        obj.d = i10;
        obj.f21650e = hVar;
        obj.f21656l = i7;
        obj.f21651f = j3;
        obj.f21652g = i11;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i7);
        ArrayList a10 = obj.a();
        obj.f21653i = new j[uVar.length()];
        int i13 = 0;
        int i14 = 0;
        l lVar = obj;
        while (i14 < lVar.f21653i.length) {
            p2.m mVar2 = (p2.m) a10.get(uVar.i(i14));
            p2.b M = eVar.M(mVar2.f55126b);
            j[] jVarArr2 = lVar.f21653i;
            p2.b bVar = M == null ? (p2.b) mVar2.f55126b.get(i13) : M;
            e2.u uVar3 = mVar2.f55125a;
            w0Var.getClass();
            String str = uVar3.f10765r;
            if (s0.l(str)) {
                if (!w0Var.f3354a) {
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
                    hVar2 = new c4.h(((nb.a) w0Var.f3356c).j(uVar3), uVar3);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    uVar2 = uVar3;
                    jVarArr = jVarArr2;
                    hVar2 = new x3.f((nb.a) w0Var.f3356c, w0Var.f3354a ? 1 : 3);
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
                    int g10 = (w0Var.f3354a ? i12 : i12 | 32) | z3.h.g(w0Var.f3355b);
                    mVar = mVar2;
                    jVarArr = jVarArr2;
                    uVar2 = uVar3;
                    hVar2 = new z3.h((nb.a) w0Var.f3356c, g10, null, arrayList, oVar2);
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
        List list = this.f21655k.b(this.f21656l).f55114c;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f21649c) {
            arrayList.addAll(((p2.a) list.get(i7)).f55078c);
        }
        return arrayList;
    }

    public final j b(int i7) {
        j[] jVarArr = this.f21653i;
        j jVar = jVarArr[i7];
        p2.b M = this.f21648b.M(jVar.f21643b.f55126b);
        if (M != null && !M.equals(jVar.f21644c)) {
            j jVar2 = new j(jVar.f21645e, jVar.f21643b, M, jVar.f21642a, jVar.f21646f, jVar.d);
            jVarArr[i7] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
