package k9;
public final class a1 extends c2 {
    public final String f10813a;

    public a1(String str) {
        this.f10813a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return this.f10813a.equals(((a1) ((c2) obj)).f10813a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10813a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("User{identifier="), this.f10813a, "}");
    }
}
