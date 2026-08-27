package id;

public final class d1 implements e1 {

    public final ad.l f11130a;

    public d1(ad.l lVar) {
        this.f11130a = lVar;
    }

    @Override
    public final void a(Throwable th) {
        this.f11130a.invoke(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f11130a.getClass().getSimpleName() + '@' + f0.k(this) + ']';
    }
}
