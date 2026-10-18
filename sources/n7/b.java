package n7;
public final class b {
    public final Object f17261a;

    public b(Object obj) {
        this.f17261a = obj;
    }

    public Object a() {
        if (a.f17256b == null) {
            a.f17256b = new Exception();
        }
        synchronized (a.f17255a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
