package defpackage;

import j$.util.Objects;
public final class mg3 extends ka {
    public final long c;

    public mg3(long j) {
        super(0, false);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mg3) && this.c == ((mg3) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.c));
    }
}
