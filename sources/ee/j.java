package ee;

import ae.c0;
import ae.h1;
import fe.s;
import sd.p;
public final class j extends kotlin.jvm.internal.j implements p {
    public final g f8914b;

    public j(g gVar) {
        super(2);
        this.f8914b = gVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int intValue = ((Number) obj).intValue();
        jd.f fVar = (jd.f) obj2;
        jd.g key = fVar.getKey();
        jd.f fVar2 = this.f8914b.f8909b.get(key);
        if (key != c0.f433b) {
            if (fVar != fVar2) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = intValue + 1;
            }
            return Integer.valueOf(i10);
        }
        h1 h1Var = (h1) fVar2;
        h1 h1Var2 = (h1) fVar;
        while (true) {
            if (h1Var2 == null) {
                h1Var2 = null;
                break;
            } else if (h1Var2 == h1Var || !(h1Var2 instanceof s)) {
                break;
            } else {
                h1Var2 = h1Var2.getParent();
            }
        }
        if (h1Var2 == h1Var) {
            if (h1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + h1Var2 + ", expected child of " + h1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
