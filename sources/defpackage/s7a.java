package defpackage;

import j$.util.Objects;
import java.util.HashSet;
public final class s7a {
    public static final s7a b = new s7a(new HashSet());
    public static final String c;
    public final yo5 a;

    static {
        String str = hac.a;
        c = "0";
    }

    public s7a(HashSet hashSet) {
        this.a = yo5.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7a)) {
            return false;
        }
        return this.a.equals(((s7a) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
