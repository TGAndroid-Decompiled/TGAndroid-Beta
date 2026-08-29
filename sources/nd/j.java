package nd;

import bd.p;
import jd.b0;
import jd.f1;
import kotlin.jvm.internal.k;
import od.t;
public final class j extends k implements p {
    public final g f17318b;

    public j(g gVar) {
        super(2);
        this.f17318b = gVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int intValue = ((Number) obj).intValue();
        sc.f fVar = (sc.f) obj2;
        sc.g key = fVar.getKey();
        sc.f fVar2 = this.f17318b.f17313b.get(key);
        if (key != b0.f11447b) {
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
            } else if (f1Var2 == f1Var || !(f1Var2 instanceof t)) {
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
