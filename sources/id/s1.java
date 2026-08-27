package id;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class s1 extends kotlin.jvm.internal.i implements ad.q {

    public static final s1 f11193a = new s1(3, v1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

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
        f0.n(v1Var, false, new q0(v1Var), 3);
        throw null;
    }
}
