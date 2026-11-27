package defpackage;
public final class rv5 extends us4 implements ks4 {
    public static final rv5 a = new us4(3, sv5.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        Object v;
        sv5 sv5Var = (sv5) obj;
        if (obj2 == null) {
            int i = sv5.c;
            do {
                v = sv5Var.v();
                if (!(v instanceof hp5)) {
                    throw null;
                }
            } while (sv5Var.K(v) < 0);
            gqe.c(sv5Var, true, new ud6());
            throw null;
        }
        throw new ClassCastException();
    }
}
