package e;

import ee.b;
public final class a implements b, fb.b {
    public final Object f9205a;

    public a(Object obj) {
        this.f9205a = obj;
    }

    public static a a(Object obj) {
        if (obj != null) {
            return new a(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public Object b() {
        if (p7.a.f53336b == null) {
            p7.a.f53336b = new Exception();
        }
        synchronized (p7.a.f53335a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public Object mo5get() {
        return this.f9205a;
    }
}
