package jd;
public final class c1 implements d1 {
    public final bd.l f11452a;

    public c1(bd.l lVar) {
        this.f11452a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f11452a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f11452a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
