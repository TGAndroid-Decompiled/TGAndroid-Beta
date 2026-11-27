package defpackage;
public final class e2a implements d2a {
    public final Object a;

    public final Object a() {
        if (yid.b == null) {
            yid.b = new Exception();
        }
        synchronized (yid.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
