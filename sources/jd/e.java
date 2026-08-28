package jd;
public final class e extends f {
    public final Throwable f14332a;

    public e(Throwable th) {
        this.f14332a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f14332a, ((e) obj).f14332a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f14332a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f14332a + ')';
    }
}
