package be;
public abstract class d2 {
    public static final ThreadLocal f4272a = new ThreadLocal();

    public static x0 a() {
        ThreadLocal threadLocal = f4272a;
        x0 x0Var = (x0) threadLocal.get();
        if (x0Var == null) {
            i iVar = new i(Thread.currentThread());
            threadLocal.set(iVar);
            return iVar;
        }
        return x0Var;
    }
}
