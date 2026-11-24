package defpackage;
public abstract class qse {
    public static final sa9 a(Throwable th) {
        th.getClass();
        return new sa9(th);
    }

    public static final void b(Object obj) {
        if (!(obj instanceof sa9)) {
            return;
        }
        throw ((sa9) obj).a;
    }
}
