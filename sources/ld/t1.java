package ld;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class t1 extends kotlin.jvm.internal.i implements dd.q {
    public static final t1 f11922a = new kotlin.jvm.internal.i(3, u1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object a(Object obj, Object obj2, wc.c cVar) {
        Object u10;
        u1 u1Var = (u1) obj;
        if (obj2 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.f11927a;
            do {
                u10 = u1Var.u();
                if (!(u10 instanceof a1)) {
                    throw null;
                }
            } while (u1Var.I(u10) < 0);
            e0.n(u1Var, false, new qd.k(), 3);
            throw null;
        }
        throw new ClassCastException();
    }
}
