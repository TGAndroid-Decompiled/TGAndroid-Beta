package defpackage;
public final class nj1 extends oj1 {
    public final Throwable a;

    public nj1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nj1) {
            if (ur5.a(this.a, ((nj1) obj).a)) {
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
