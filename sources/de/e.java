package de;
public final class e extends f {
    public final Throwable f7966a;

    public e(Throwable th2) {
        this.f7966a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f7966a, ((e) obj).f7966a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f7966a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f7966a + ')';
    }
}
