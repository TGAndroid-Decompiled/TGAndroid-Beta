package n7;
public final class b {
    public final Object f15110a;

    public b(Object obj) {
        this.f15110a = obj;
    }

    public Object a() {
        if (a.f15104b == null) {
            a.f15104b = new Exception();
        }
        synchronized (a.f15103a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
