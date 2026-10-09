package ae;
public abstract class e2 {
    public static final ThreadLocal f441a = new ThreadLocal();

    public static y0 a() {
        ThreadLocal threadLocal = f441a;
        y0 y0Var = (y0) threadLocal.get();
        if (y0Var == null) {
            i iVar = new i(Thread.currentThread());
            threadLocal.set(iVar);
            return iVar;
        }
        return y0Var;
    }
}
