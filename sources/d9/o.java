package d9;
public final class o implements n, he.b, ib.b {
    public final Object f7954a;

    public o(Object obj) {
        this.f7954a = obj;
    }

    public static o b(Object obj) {
        if (obj != null) {
            return new o(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override
    public Object a() {
        return this.f7954a;
    }

    public Object c() {
        if (q7.a.f56027b == null) {
            q7.a.f56027b = new Exception();
        }
        synchronized (q7.a.f56026a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public Object mo24get() {
        return this.f7954a;
    }
}
