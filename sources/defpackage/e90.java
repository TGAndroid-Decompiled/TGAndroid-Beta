package defpackage;
public final class e90 extends zy2 {
    public final String a;

    public e90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zy2) {
            return this.a.equals(((e90) ((zy2) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return b00.j(new StringBuilder("Log{content="), this.a, "}");
    }
}
