package e;

import ib.b;
public final class a implements he.a, b {
    public final Object f10170a;

    public a(Object obj) {
        this.f10170a = obj;
    }

    public static a a(Object obj) {
        if (obj != null) {
            return new a(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public Object b() {
        if (q7.a.f56105b == null) {
            q7.a.f56105b = new Exception();
        }
        synchronized (q7.a.f56104a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public Object mo23get() {
        return this.f10170a;
    }
}
