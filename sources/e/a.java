package e;
public final class a implements he.a {
    public final Object f8596a;

    public a(Object obj) {
        this.f8596a = obj;
    }

    public Object a() {
        if (n7.a.f16616b == null) {
            n7.a.f16616b = new Exception();
        }
        synchronized (n7.a.f16615a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
