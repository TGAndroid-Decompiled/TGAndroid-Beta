package fe;

import be.b0;
import be.g1;
import ge.s;
import td.p;
public final class j extends kotlin.jvm.internal.j implements p {
    public final g f9153b;

    public j(g gVar) {
        super(2);
        this.f9153b = gVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int intValue = ((Number) obj).intValue();
        kd.f fVar = (kd.f) obj2;
        kd.g key = fVar.getKey();
        kd.f fVar2 = this.f9153b.f9149b.get(key);
        if (key != b0.f2653b) {
            if (fVar != fVar2) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = intValue + 1;
            }
            return Integer.valueOf(i10);
        }
        g1 g1Var = (g1) fVar2;
        g1 g1Var2 = (g1) fVar;
        while (true) {
            if (g1Var2 == null) {
                g1Var2 = null;
                break;
            } else if (g1Var2 == g1Var || !(g1Var2 instanceof s)) {
                break;
            } else {
                g1Var2 = g1Var2.getParent();
            }
        }
        if (g1Var2 == g1Var) {
            if (g1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + g1Var2 + ", expected child of " + g1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
