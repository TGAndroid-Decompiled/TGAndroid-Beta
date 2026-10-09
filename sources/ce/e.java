package ce;
public final class e extends f {
    public final Throwable f4632a;

    public e(Throwable th2) {
        this.f4632a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f4632a, ((e) obj).f4632a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f4632a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f4632a + ')';
    }
}
