package defpackage;

import j$.util.Objects;
import java.util.HashSet;
public final class i9a {
    public static final i9a b = new i9a(new HashSet());
    public static final String c;
    public final bp5 a;

    static {
        String str = gcc.a;
        c = "0";
    }

    public i9a(HashSet hashSet) {
        this.a = bp5.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9a)) {
            return false;
        }
        return this.a.equals(((i9a) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
