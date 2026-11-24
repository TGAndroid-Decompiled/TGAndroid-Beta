package defpackage;
public final class mk1 extends nk1 {
    public final Throwable a;

    public mk1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mk1) {
            if (rr5.a(this.a, ((mk1) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
