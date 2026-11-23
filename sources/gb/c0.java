package gb;
public final class c0 {
    public static final b0 Companion = new Object();
    public final int f13294a;
    public final String f13295b;

    public c0(int i7, int i10, String str) {
        if (3 != (i7 & 3)) {
            oe.k.a(i7, 3, a0.f13279a.d());
            throw null;
        }
        this.f13294a = i10;
        this.f13295b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f13294a == c0Var.f13294a && kotlin.jvm.internal.j.a(this.f13295b, c0Var.f13295b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13295b.hashCode() + (this.f13294a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.f13294a + ", uuid=" + this.f13295b + ')';
    }

    public c0(int i7, String uuid) {
        kotlin.jvm.internal.j.e(uuid, "uuid");
        this.f13294a = i7;
        this.f13295b = uuid;
    }
}
