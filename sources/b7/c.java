package b7;
public final class c {
    public final Object f1683a;

    public c(Object obj) {
        this.f1683a = obj;
    }

    public Object a() {
        if (b.f1676b == null) {
            b.f1676b = new Exception();
        }
        synchronized (b.f1675a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
