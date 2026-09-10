package n7;
public final class b {
    public final Object f13940a;

    public b(Object obj) {
        this.f13940a = obj;
    }

    public Object a() {
        if (a.f13934b == null) {
            a.f13934b = new Exception();
        }
        synchronized (a.f13933a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
