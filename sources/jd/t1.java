package jd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class t1 extends kotlin.jvm.internal.i implements bd.q {
    public static final t1 f11523a = new kotlin.jvm.internal.i(3, u1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object b(Object obj, Object obj2, uc.c cVar) {
        Object u10;
        u1 u1Var = (u1) obj;
        if (obj2 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.f11529a;
            do {
                u10 = u1Var.u();
                if (!(u10 instanceof a1)) {
                    throw null;
                }
            } while (u1Var.I(u10) < 0);
            e0.n(u1Var, false, new od.l(), 3);
            throw null;
        }
        throw new ClassCastException();
    }
}
