package ae;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class t1 extends kotlin.jvm.internal.h implements sd.q {
    public static final t1 f501a = new kotlin.jvm.internal.h(3, w1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

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
            g0.n(w1Var, false, new r0(w1Var), 3);
            throw null;
        }
        throw new ClassCastException();
    }
}
