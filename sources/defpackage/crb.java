package defpackage;
public abstract class crb {
    public static final ThreadLocal a = new ThreadLocal();

    public static z44 a() {
        ThreadLocal threadLocal = a;
        z44 z44Var = (z44) threadLocal.get();
        if (z44Var == null) {
            qk0 qk0Var = new qk0(Thread.currentThread());
            threadLocal.set(qk0Var);
            return qk0Var;
        }
        return z44Var;
    }
}
