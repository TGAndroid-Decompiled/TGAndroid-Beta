package md;

import ad.p;
import id.b0;
import id.g1;
import kotlin.jvm.internal.k;
import nd.s;

public final class j extends k implements p {

    public final g f18035b;

    public j(g gVar) {
        super(2);
        this.f18035b = gVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        rc.f fVar = (rc.f) obj2;
        rc.g key = fVar.getKey();
        rc.f fVar2 = this.f18035b.f18030b.get(key);
        if (key != b0.f11122b) {
            return Integer.valueOf(fVar != fVar2 ? Integer.MIN_VALUE : iIntValue + 1);
        }
        g1 g1Var = (g1) fVar2;
        g1 parent = (g1) fVar;
        while (true) {
            if (parent != null) {
                if (parent == g1Var || !(parent instanceof s)) {
                    break;
                }
                parent = parent.getParent();
            } else {
                parent = null;
                break;
            }
        }
        if (parent == g1Var) {
            if (g1Var != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + g1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
