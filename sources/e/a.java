package e;
public final class a implements he.a {
    public final Object f8624a;

    public a(Object obj) {
        this.f8624a = obj;
    }

    public Object a() {
        if (n7.a.f16643b == null) {
            n7.a.f16643b = new Exception();
        }
        synchronized (n7.a.f16642a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
