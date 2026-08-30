package b7;
public final class c implements o8.n {
    public final Object f1672a;

    public c(Object obj) {
        this.f1672a = obj;
    }

    @Override
    public Object a() {
        return this.f1672a;
    }

    public Object b() {
        if (b.f1665b == null) {
            b.f1665b = new Exception();
        }
        synchronized (b.f1664a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
