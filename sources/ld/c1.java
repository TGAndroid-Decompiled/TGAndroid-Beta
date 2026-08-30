package ld;
public final class c1 implements d1 {
    public final dd.l f11865a;

    public c1(dd.l lVar) {
        this.f11865a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f11865a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f11865a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
