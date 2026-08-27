package id;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class u1 extends kotlin.jvm.internal.i implements ad.q {

    public static final u1 f11202a = new u1(3, v1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object a(Object obj, Object obj2, tc.c cVar) {
        Object objU;
        v1 v1Var = (v1) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v1.f11206a;
        do {
            objU = v1Var.u();
            if (!(objU instanceof b1)) {
                throw null;
            }
        } while (v1Var.I(objU) < 0);
        f0.n(v1Var, false, new p1(), 3);
        throw null;
    }
}
