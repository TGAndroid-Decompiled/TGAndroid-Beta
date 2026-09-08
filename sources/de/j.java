package de;

import ee.s;
import rd.p;
import zd.b0;
import zd.f1;
public final class j extends kotlin.jvm.internal.j implements p {
    public final g f6834b;

    public j(g gVar) {
        super(2);
        this.f6834b = gVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int intValue = ((Number) obj).intValue();
        id.f fVar = (id.f) obj2;
        id.g key = fVar.getKey();
        id.f fVar2 = this.f6834b.f6829b.get(key);
        if (key != b0.f51553b) {
            if (fVar != fVar2) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = intValue + 1;
            }
            return Integer.valueOf(i10);
        }
        f1 f1Var = (f1) fVar2;
        f1 f1Var2 = (f1) fVar;
        while (true) {
            if (f1Var2 == null) {
                f1Var2 = null;
                break;
            } else if (f1Var2 == f1Var || !(f1Var2 instanceof s)) {
                break;
            } else {
                f1Var2 = f1Var2.getParent();
            }
        }
        if (f1Var2 == f1Var) {
            if (f1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + f1Var2 + ", expected child of " + f1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
