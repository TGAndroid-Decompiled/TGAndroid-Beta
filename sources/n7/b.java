package n7;
public final class b {
    public final Object f15878a;

    public b(Object obj) {
        this.f15878a = obj;
    }

    public Object a() {
        if (a.f15873b == null) {
            a.f15873b = new Exception();
        }
        synchronized (a.f15872a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
