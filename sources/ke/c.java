package ke;
public final class c implements b {
    public final Object f16537a;

    public c(Object obj) {
        this.f16537a = obj;
    }

    public Object a() {
        if (o7.a.f19197b == null) {
            o7.a.f19197b = new Exception();
        }
        synchronized (o7.a.f19196a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
