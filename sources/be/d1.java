package be;
public final class d1 implements e1 {
    public final td.l f4269a;

    public d1(td.l lVar) {
        this.f4269a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f4269a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f4269a.getClass().getSimpleName() + '@' + f0.k(this) + ']';
    }
}
