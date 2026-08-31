package ld;
public abstract class c2 {
    public static final ThreadLocal f12289a = new ThreadLocal();

    public static w0 a() {
        ThreadLocal threadLocal = f12289a;
        w0 w0Var = (w0) threadLocal.get();
        if (w0Var == null) {
            i iVar = new i(Thread.currentThread());
            threadLocal.set(iVar);
            return iVar;
        }
        return w0Var;
    }
}
