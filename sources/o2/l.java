package o2;

import a3.u;
import ab.b0;
import bg.w0;
import e2.s0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import w7.s;
public final class l {
    public final b3.p f20759a;
    public final b0 f20760b;
    public final int[] f20761c;
    public final int d;
    public final j2.h f20762e;
    public final long f20763f;
    public final int f20764g;
    public final o h;
    public final j[] f20765i;
    public u f20766j;
    public p2.c f20767k;
    public int f20768l;
    public x2.b f20769m;
    public boolean f20770n;

    public l(w0 w0Var, b3.p pVar, p2.c cVar, b0 b0Var, int i7, int[] iArr, u uVar, int i10, j2.h hVar, long j3, int i11, boolean z9, ArrayList arrayList, o oVar) {
        int i12;
        p2.m mVar;
        j[] jVarArr;
        e2.u uVar2;
        f3.o hVar2;
        y2.e eVar;
        ?? obj = new Object();
        obj.f20759a = pVar;
        obj.f20767k = cVar;
        obj.f20760b = b0Var;
        obj.f20761c = iArr;
        obj.f20766j = uVar;
        obj.d = i10;
        obj.f20762e = hVar;
        obj.f20768l = i7;
        obj.f20763f = j3;
        obj.f20764g = i11;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i7);
        ArrayList a10 = obj.a();
        obj.f20765i = new j[uVar.length()];
        int i13 = 0;
        int i14 = 0;
        l lVar = obj;
        while (i14 < lVar.f20765i.length) {
            p2.m mVar2 = (p2.m) a10.get(uVar.i(i14));
            p2.b s5 = b0Var.s(mVar2.f53048b);
            j[] jVarArr2 = lVar.f20765i;
            p2.b bVar = s5 == null ? (p2.b) mVar2.f53048b.get(i13) : s5;
            e2.u uVar3 = mVar2.f53047a;
            w0Var.getClass();
            String str = uVar3.f10614r;
            if (s0.l(str)) {
                if (!w0Var.f3392a) {
                    eVar = null;
                    mVar = mVar2;
                    jVarArr = jVarArr2;
                    y2.e eVar2 = eVar;
                    int i15 = i14;
                    long j10 = d;
                    jVarArr[i15] = new j(j10, mVar, bVar, eVar2, 0L, mVar.c());
                    i14 = i15 + 1;
                    lVar = this;
                    oVar2 = oVar;
                    d = j10;
                    i13 = 0;
                } else {
                    hVar2 = new c4.h(((s) w0Var.f3394c).l(uVar3), uVar3);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    uVar2 = uVar3;
                    jVarArr = jVarArr2;
                    hVar2 = new x3.f((s) w0Var.f3394c, w0Var.f3392a ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar2 = new n3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar2 = new b4.a(0);
                } else {
                    if (z9) {
                        i12 = 4;
                    } else {
                        i12 = 0;
                    }
                    int g10 = (w0Var.f3392a ? i12 : i12 | 32) | z3.h.g(w0Var.f3393b);
                    mVar = mVar2;
                    jVarArr = jVarArr2;
                    uVar2 = uVar3;
                    hVar2 = new z3.h((s) w0Var.f3394c, g10, null, arrayList, oVar2);
                }
                eVar = new y2.e(hVar2, i10, uVar2);
                y2.e eVar22 = eVar;
                int i152 = i14;
                long j102 = d;
                jVarArr[i152] = new j(j102, mVar, bVar, eVar22, 0L, mVar.c());
                i14 = i152 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j102;
                i13 = 0;
            }
            mVar = mVar2;
            uVar2 = uVar3;
            jVarArr = jVarArr2;
            eVar = new y2.e(hVar2, i10, uVar2);
            y2.e eVar222 = eVar;
            int i1522 = i14;
            long j1022 = d;
            jVarArr[i1522] = new j(j1022, mVar, bVar, eVar222, 0L, mVar.c());
            i14 = i1522 + 1;
            lVar = this;
            oVar2 = oVar;
            d = j1022;
            i13 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f20767k.b(this.f20768l).f53036c;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f20761c) {
            arrayList.addAll(((p2.a) list.get(i7)).f53000c);
        }
        return arrayList;
    }

    public final j b(int i7) {
        j[] jVarArr = this.f20765i;
        j jVar = jVarArr[i7];
        p2.b s5 = this.f20760b.s(jVar.f20755b.f53048b);
        if (s5 != null && !s5.equals(jVar.f20756c)) {
            j jVar2 = new j(jVar.f20757e, jVar.f20755b, s5, jVar.f20754a, jVar.f20758f, jVar.d);
            jVarArr[i7] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
