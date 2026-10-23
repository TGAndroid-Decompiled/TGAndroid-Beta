package o2;

import b2.s0;
import b2.t0;
import b2.v;
import b2.w;
import java.util.Map;
import u2.e1;
public final class p extends e1 {
    public final Map J;
    public b2.s K;

    public p(androidx.biometric.e eVar, n2.n nVar, n2.k kVar, Map map) {
        super(eVar, nVar, kVar);
        this.J = map;
    }

    @Override
    public final w r(w wVar) {
        b2.s sVar;
        b2.s sVar2 = this.K;
        if (sVar2 == null) {
            sVar2 = wVar.f4138w;
        }
        if (sVar2 != null && (sVar = (b2.s) this.J.get(sVar2.f3988c)) != null) {
            sVar2 = sVar;
        }
        t0 t0Var = wVar.f4128l;
        t0 t0Var2 = null;
        if (t0Var != null) {
            s0[] s0VarArr = t0Var.f4014a;
            int length = s0VarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    s0 s0Var = s0VarArr[i10];
                    if ((s0Var instanceof q3.m) && "com.apple.streaming.transportStreamTimestamp".equals(((q3.m) s0Var).f44799b)) {
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
                    s0[] s0VarArr2 = new s0[length - 1];
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 != i10) {
                            s0VarArr2[i11 < i10 ? i11 : i11 - 1] = s0VarArr[i11];
                        }
                    }
                    t0Var2 = new t0(s0VarArr2);
                }
            }
            if (sVar2 == wVar.f4138w || t0Var != wVar.f4128l) {
                v a2 = wVar.a();
                a2.v = sVar2;
                a2.f4075k = t0Var;
                wVar = new w(a2);
            }
            return super.r(wVar);
        }
        t0Var = t0Var2;
        if (sVar2 == wVar.f4138w) {
        }
        v a22 = wVar.a();
        a22.v = sVar2;
        a22.f4075k = t0Var;
        wVar = new w(a22);
        return super.r(wVar);
    }
}
