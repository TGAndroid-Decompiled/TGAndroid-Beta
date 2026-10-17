package n7;
public final class b {
    public final Object f17254a;

    public b(Object obj) {
        this.f17254a = obj;
    }

    public Object a() {
        if (a.f17249b == null) {
            a.f17249b = new Exception();
        }
        synchronized (a.f17248a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
