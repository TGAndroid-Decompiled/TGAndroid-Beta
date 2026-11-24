package defpackage;
public abstract class dnb {
    public static final ThreadLocal a = new ThreadLocal();

    public static d44 a() {
        ThreadLocal threadLocal = a;
        d44 d44Var = (d44) threadLocal.get();
        if (d44Var == null) {
            pk0 pk0Var = new pk0(Thread.currentThread());
            threadLocal.set(pk0Var);
            return pk0Var;
        }
        return d44Var;
    }
}
