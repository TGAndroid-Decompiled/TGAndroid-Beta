package defpackage;
public final class ea0 extends k03 {
    public final String a;

    public ea0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k03) {
            return this.a.equals(((ea0) ((k03) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return b10.j(new StringBuilder("Log{content="), this.a, "}");
    }
}
