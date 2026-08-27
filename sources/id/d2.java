package id;

public abstract class d2 {

    public static final ThreadLocal f11131a = new ThreadLocal();

    public static x0 a() {
        ThreadLocal threadLocal = f11131a;
        x0 x0Var = (x0) threadLocal.get();
        if (x0Var != null) {
            return x0Var;
        }
        i iVar = new i(Thread.currentThread());
        threadLocal.set(iVar);
        return iVar;
    }
}
