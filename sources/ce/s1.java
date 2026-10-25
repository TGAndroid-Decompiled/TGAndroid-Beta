package ce;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class s1 extends kotlin.jvm.internal.h implements ud.q {
    public static final s1 f6261a = new kotlin.jvm.internal.h(3, v1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object a(Object obj, Object obj2, nd.c cVar) {
        Object u10;
        v1 v1Var = (v1) obj;
        if (obj2 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v1.f6273a;
            do {
                u10 = v1Var.u();
                if (!(u10 instanceof b1)) {
                    throw null;
                }
            } while (v1Var.I(u10) < 0);
            f0.n(v1Var, false, new q0(v1Var), 3);
            throw null;
        }
        throw new ClassCastException();
    }
}
