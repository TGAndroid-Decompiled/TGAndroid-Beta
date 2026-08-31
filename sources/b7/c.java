package b7;
public final class c implements td.a {
    public final Object f1811a;

    public c(Object obj) {
        this.f1811a = obj;
    }

    public Object a() {
        if (b.f1803b == null) {
            b.f1803b = new Exception();
        }
        synchronized (b.f1802a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
