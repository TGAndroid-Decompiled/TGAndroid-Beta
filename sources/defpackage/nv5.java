package defpackage;
public final class nv5 extends rs4 implements hs4 {
    public static final nv5 a = new rs4(3, ov5.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        Object v;
        ov5 ov5Var = (ov5) obj;
        if (obj2 == null) {
            int i = ov5.c;
            do {
                v = ov5Var.v();
                if (!(v instanceof ep5)) {
                    throw null;
                }
            } while (ov5Var.K(v) < 0);
            pne.c(ov5Var, true, new pd6());
            throw null;
        }
        throw new ClassCastException();
    }
}
