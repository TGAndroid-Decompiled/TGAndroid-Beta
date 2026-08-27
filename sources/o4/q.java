package o4;

import h3.s0;
import h3.t0;
import j4.a1;
import java.util.Map;

public final class q extends a1 {
    public final Map H;
    public l3.d I;

    public q(com.google.android.exoplayer2.upstream.r rVar, l3.j jVar, b6.a aVar, Map map) {
        super(rVar, jVar, aVar);
        this.H = map;
    }

    @Override
    public final t0 m(t0 t0Var) {
        l3.d dVar;
        l3.d dVar2 = this.I;
        if (dVar2 == null) {
            dVar2 = t0Var.E;
        }
        if (dVar2 != null && (dVar = (l3.d) this.H.get(dVar2.f15392c)) != null) {
            dVar2 = dVar;
        }
        z3.c cVar = t0Var.f8191s;
        z3.c cVar2 = null;
        if (cVar == null) {
            cVar = cVar2;
        } else {
            z3.b[] bVarArr = cVar.f50188a;
            int length = bVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                z3.b bVar = bVarArr[i11];
                if ((bVar instanceof e4.m) && "com.apple.streaming.transportStreamTimestamp".equals(((e4.m) bVar).f5216b)) {
                    break;
                }
                i11++;
            }
            if (i11 != -1) {
                if (length != 1) {
                    z3.b[] bVarArr2 = new z3.b[length - 1];
                    while (i10 < length) {
                        if (i10 != i11) {
                            bVarArr2[i10 < i11 ? i10 : i10 - 1] = bVarArr[i10];
                        }
                        i10++;
                    }
                    cVar2 = new z3.c(bVarArr2);
                }
                cVar = cVar2;
            }
        }
        if (dVar2 != t0Var.E || cVar != t0Var.f8191s) {
            s0 s0VarA = t0Var.a();
            s0VarA.f8138r = dVar2;
            s0VarA.f8129i = cVar;
            t0Var = new t0(s0VarA);
        }
        return super.m(t0Var);
    }
}
