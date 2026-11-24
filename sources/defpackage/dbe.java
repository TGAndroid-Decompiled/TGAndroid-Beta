package defpackage;
public abstract class dbe {
    public static final void a(cy2 cy2Var, Throwable th) {
        try {
            dl dlVar = (dl) cy2Var.get(nf5.b);
            if (dlVar != null) {
                dlVar.c(th);
            } else {
                xae.a(cy2Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                uhe.a(runtimeException, th);
                th = runtimeException;
            }
            xae.a(cy2Var, th);
        }
    }
}
