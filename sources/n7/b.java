package n7;
public final class b {
    public final Object f15108a;

    public b(Object obj) {
        this.f15108a = obj;
    }

    public Object a() {
        if (a.f15102b == null) {
            a.f15102b = new Exception();
        }
        synchronized (a.f15101a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
