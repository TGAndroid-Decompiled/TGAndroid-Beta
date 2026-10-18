package n7;
public final class b {
    public final Object f17257a;

    public b(Object obj) {
        this.f17257a = obj;
    }

    public Object a() {
        if (a.f17252b == null) {
            a.f17252b = new Exception();
        }
        synchronized (a.f17251a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
