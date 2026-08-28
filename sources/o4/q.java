package o4;

import h3.s0;
import h3.t0;
import j4.a1;
import java.util.Map;
public final class q extends a1 {
    public final Map H;
    public l3.c I;

    public q(com.google.android.exoplayer2.upstream.r rVar, l3.i iVar, a6.a aVar, Map map) {
        super(rVar, iVar, aVar);
        this.H = map;
    }

    @Override
    public final t0 m(t0 t0Var) {
        l3.c cVar;
        l3.c cVar2 = this.I;
        if (cVar2 == null) {
            cVar2 = t0Var.E;
        }
        if (cVar2 != null && (cVar = (l3.c) this.H.get(cVar2.f16635c)) != null) {
            cVar2 = cVar;
        }
        z3.c cVar3 = t0Var.f9767s;
        z3.c cVar4 = null;
        if (cVar3 != null) {
            z3.b[] bVarArr = cVar3.f50288a;
            int length = bVarArr.length;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    z3.b bVar = bVarArr[i9];
                    if ((bVar instanceof e4.m) && "com.apple.streaming.transportStreamTimestamp".equals(((e4.m) bVar).f4857b)) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 != -1) {
                if (length != 1) {
                    z3.b[] bVarArr2 = new z3.b[length - 1];
                    for (int i10 = 0; i10 < length; i10++) {
                        if (i10 != i9) {
                            bVarArr2[i10 < i9 ? i10 : i10 - 1] = bVarArr[i10];
                        }
                    }
                    cVar4 = new z3.c(bVarArr2);
                }
            }
            if (cVar2 == t0Var.E || cVar3 != t0Var.f9767s) {
                s0 a2 = t0Var.a();
                a2.f9708r = cVar2;
                a2.f9699i = cVar3;
                t0Var = new t0(a2);
            }
            return super.m(t0Var);
        }
        cVar3 = cVar4;
        if (cVar2 == t0Var.E) {
        }
        s0 a22 = t0Var.a();
        a22.f9708r = cVar2;
        a22.f9699i = cVar3;
        t0Var = new t0(a22);
        return super.m(t0Var);
    }
}
