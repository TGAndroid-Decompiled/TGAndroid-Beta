package de;
public final class e extends f {
    public final Throwable f6509a;

    public e(Throwable th2) {
        this.f6509a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f6509a, ((e) obj).f6509a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f6509a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f6509a + ')';
    }
}
