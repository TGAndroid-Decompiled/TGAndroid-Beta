package ld;
public final class c1 implements d1 {
    public final dd.l f12288a;

    public c1(dd.l lVar) {
        this.f12288a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f12288a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f12288a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
