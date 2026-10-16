package de;
public final class e extends f {
    public final Throwable f6512a;

    public e(Throwable th2) {
        this.f6512a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f6512a, ((e) obj).f6512a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f6512a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f6512a + ')';
    }
}
