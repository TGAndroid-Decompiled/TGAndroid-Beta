package ae;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class v1 extends kotlin.jvm.internal.h implements sd.q {
    public static final v1 f512a = new kotlin.jvm.internal.h(3, w1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object c(Object obj, Object obj2, ld.c cVar) {
        Object u10;
        w1 w1Var = (w1) obj;
        if (obj2 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.f514a;
            do {
                u10 = w1Var.u();
                if (!(u10 instanceof c1)) {
                    throw null;
                }
            } while (w1Var.I(u10) < 0);
            g0.n(w1Var, false, new fe.k(), 3);
            throw null;
        }
        throw new ClassCastException();
    }
}
