package be;
public final class d1 implements e1 {
    public final td.l f2656a;

    public d1(td.l lVar) {
        this.f2656a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f2656a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f2656a.getClass().getSimpleName() + '@' + f0.k(this) + ']';
    }
}
