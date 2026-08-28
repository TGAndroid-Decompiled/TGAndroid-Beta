package hd;
public abstract class d2 {
    public static final ThreadLocal f10422a = new ThreadLocal();

    public static x0 a() {
        ThreadLocal threadLocal = f10422a;
        x0 x0Var = (x0) threadLocal.get();
        if (x0Var == null) {
            i iVar = new i(Thread.currentThread());
            threadLocal.set(iVar);
            return iVar;
        }
        return x0Var;
    }
}
