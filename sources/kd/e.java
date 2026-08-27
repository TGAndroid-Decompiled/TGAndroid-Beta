package kd;

public final class e extends f {

    public final Throwable f15181a;

    public e(Throwable th) {
        this.f15181a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return kotlin.jvm.internal.j.a(this.f15181a, ((e) obj).f15181a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f15181a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override
    public final String toString() {
        return "Closed(" + this.f15181a + ')';
    }
}
