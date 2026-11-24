package defpackage;
public abstract class epb {
    public static final ThreadLocal a = new ThreadLocal();

    public static o54 a() {
        ThreadLocal threadLocal = a;
        o54 o54Var = (o54) threadLocal.get();
        if (o54Var == null) {
            pl0 pl0Var = new pl0(Thread.currentThread());
            threadLocal.set(pl0Var);
            return pl0Var;
        }
        return o54Var;
    }
}
