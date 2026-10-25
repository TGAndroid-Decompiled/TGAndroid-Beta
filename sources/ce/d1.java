package ce;
public final class d1 implements e1 {
    public final ud.l f6212a;

    public d1(ud.l lVar) {
        this.f6212a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f6212a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f6212a.getClass().getSimpleName() + '@' + f0.k(this) + ']';
    }
}
