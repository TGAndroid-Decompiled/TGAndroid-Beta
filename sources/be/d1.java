package be;
public final class d1 implements e1 {
    public final td.l f2660a;

    public d1(td.l lVar) {
        this.f2660a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f2660a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f2660a.getClass().getSimpleName() + '@' + f0.k(this) + ']';
    }
}
