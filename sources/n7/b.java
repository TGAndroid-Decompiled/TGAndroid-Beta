package n7;
public final class b {
    public final Object f15085a;

    public b(Object obj) {
        this.f15085a = obj;
    }

    public Object a() {
        if (a.f15079b == null) {
            a.f15079b = new Exception();
        }
        synchronized (a.f15078a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
