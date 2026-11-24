package defpackage;
public final class mt5 extends qq4 implements gq4 {
    public static final mt5 a = new qq4(3, pt5.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        Object v;
        pt5 pt5Var = (pt5) obj;
        if (obj2 == null) {
            int i = pt5.c;
            do {
                v = pt5Var.v();
                if (!(v instanceof en5)) {
                    throw null;
                }
            } while (pt5Var.K(v) < 0);
            nle.c(pt5Var, true, new jt5(pt5Var));
            throw null;
        }
        throw new ClassCastException();
    }
}
