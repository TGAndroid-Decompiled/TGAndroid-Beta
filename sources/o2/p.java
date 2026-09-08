package o2;

import b2.o0;
import b2.p0;
import java.util.Map;
import u2.a1;
public final class p extends a1 {
    public final Map H;
    public b2.o I;

    public p(y2.d dVar, n2.m mVar, n2.j jVar, Map map) {
        super(dVar, mVar, jVar);
        this.H = map;
    }

    @Override
    public final b2.s p(b2.s sVar) {
        b2.o oVar;
        b2.o oVar2 = this.I;
        if (oVar2 == null) {
            oVar2 = sVar.v;
        }
        if (oVar2 != null && (oVar = (b2.o) this.H.get(oVar2.f2251c)) != null) {
            oVar2 = oVar;
        }
        p0 p0Var = sVar.f2391l;
        p0 p0Var2 = null;
        if (p0Var != null) {
            o0[] o0VarArr = p0Var.f2261a;
            int length = o0VarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    o0 o0Var = o0VarArr[i10];
                    if ((o0Var instanceof q3.n) && "com.apple.streaming.transportStreamTimestamp".equals(((q3.n) o0Var).f44191b)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                if (length != 1) {
                    o0[] o0VarArr2 = new o0[length - 1];
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 != i10) {
                            o0VarArr2[i11 < i10 ? i11 : i11 - 1] = o0VarArr[i11];
                        }
                    }
                    p0Var2 = new p0(o0VarArr2);
                }
            }
            if (oVar2 == sVar.v || p0Var != sVar.f2391l) {
                b2.r a2 = sVar.a();
                a2.f2343u = oVar2;
                a2.f2333k = p0Var;
                sVar = new b2.s(a2);
            }
            return super.p(sVar);
        }
        p0Var = p0Var2;
        if (oVar2 == sVar.v) {
        }
        b2.r a22 = sVar.a();
        a22.f2343u = oVar2;
        a22.f2333k = p0Var;
        sVar = new b2.s(a22);
        return super.p(sVar);
    }
}
