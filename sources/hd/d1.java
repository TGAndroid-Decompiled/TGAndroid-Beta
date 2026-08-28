package hd;
public final class d1 implements e1 {
    public final zc.l f10421a;

    public d1(zc.l lVar) {
        this.f10421a = lVar;
    }

    @Override
    public final void a(Throwable th) {
        this.f10421a.invoke(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f10421a.getClass().getSimpleName() + '@' + f0.k(this) + ']';
    }
}
