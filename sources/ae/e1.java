package ae;
public final class e1 implements f1 {
    public final sd.l f440a;

    public e1(sd.l lVar) {
        this.f440a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f440a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f440a.getClass().getSimpleName() + '@' + g0.k(this) + ']';
    }
}
