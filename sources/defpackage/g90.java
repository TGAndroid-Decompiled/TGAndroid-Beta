package defpackage;
public final class g90 extends uz2 {
    public final String a;

    public g90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uz2) {
            return this.a.equals(((g90) ((uz2) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return c00.k(new StringBuilder("Log{content="), this.a, "}");
    }
}
