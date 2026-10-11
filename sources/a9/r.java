package a9;
public final class r implements q, ie.a {
    public final Object f377a;

    public r(Object obj) {
        this.f377a = obj;
    }

    @Override
    public Object a() {
        return this.f377a;
    }

    public Object b() {
        if (n7.a.f16782b == null) {
            n7.a.f16782b = new Exception();
        }
        synchronized (n7.a.f16781a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
