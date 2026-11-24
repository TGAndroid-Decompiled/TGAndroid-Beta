package defpackage;
public final class mo5 implements kt8, ky9 {
    public final Object a;

    public mo5(Object obj) {
        this.a = obj;
    }

    public static mo5 a(Object obj) {
        if (obj != null) {
            return new mo5(obj);
        }
        fvc.f("instance cannot be null");
        return null;
    }

    public final Object b() {
        if (hed.b == null) {
            hed.b = new Exception();
        }
        synchronized (hed.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public final Object mo9get() {
        return this.a;
    }
}
