package o2;

import b2.t0;
import b2.u0;
import b2.w;
import b2.x;
import java.util.Map;
import u2.c1;
public final class p extends c1 {
    public final Map J;
    public b2.t K;

    public p(androidx.biometric.e eVar, n2.n nVar, n2.k kVar, Map map) {
        super(eVar, nVar, kVar);
        this.J = map;
    }

    @Override
    public final x r(x xVar) {
        b2.t tVar;
        b2.t tVar2 = this.K;
        if (tVar2 == null) {
            tVar2 = xVar.f2522w;
        }
        if (tVar2 != null && (tVar = (b2.t) this.J.get(tVar2.f2372c)) != null) {
            tVar2 = tVar;
        }
        u0 u0Var = xVar.f2512l;
        u0 u0Var2 = null;
        if (u0Var != null) {
            t0[] t0VarArr = u0Var.f2398a;
            int length = t0VarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    t0 t0Var = t0VarArr[i10];
                    if ((t0Var instanceof q3.m) && "com.apple.streaming.transportStreamTimestamp".equals(((q3.m) t0Var).f43290b)) {
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
                    t0[] t0VarArr2 = new t0[length - 1];
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 != i10) {
                            t0VarArr2[i11 < i10 ? i11 : i11 - 1] = t0VarArr[i11];
                        }
                    }
                    u0Var2 = new u0(t0VarArr2);
                }
            }
            if (tVar2 == xVar.f2522w || u0Var != xVar.f2512l) {
                w a2 = xVar.a();
                a2.v = tVar2;
                a2.f2459k = u0Var;
                xVar = new x(a2);
            }
            return super.r(xVar);
        }
        u0Var = u0Var2;
        if (tVar2 == xVar.f2522w) {
        }
        w a22 = xVar.a();
        a22.v = tVar2;
        a22.f2459k = u0Var;
        xVar = new x(a22);
        return super.r(xVar);
    }
}
