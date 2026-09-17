package n7;
public final class b {
    public final Object f15120a;

    public b(Object obj) {
        this.f15120a = obj;
    }

    public Object a() {
        if (a.f15114b == null) {
            a.f15114b = new Exception();
        }
        synchronized (a.f15113a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
