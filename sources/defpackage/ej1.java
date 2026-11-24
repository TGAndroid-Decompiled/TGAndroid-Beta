package defpackage;
public final class ej1 extends fj1 {
    public final Throwable a;

    public ej1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ej1) {
            if (rp5.a(this.a, ((ej1) obj).a)) {
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
