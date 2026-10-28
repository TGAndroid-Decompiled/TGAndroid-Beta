package ke;
public final class c implements b {
    public final Object f16536a;

    public c(Object obj) {
        this.f16536a = obj;
    }

    public Object a() {
        if (o7.a.f19196b == null) {
            o7.a.f19196b = new Exception();
        }
        synchronized (o7.a.f19195a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
