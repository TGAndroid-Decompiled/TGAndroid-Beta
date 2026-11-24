package defpackage;

import j$.util.Objects;
public final class sf3 extends ja {
    public final long c;

    public sf3(long j) {
        super(0, false);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sf3) && this.c == ((sf3) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.c));
    }
}
