package defpackage;

import j$.util.Objects;
public final class fh3 extends ja {
    public final long c;

    public fh3(long j) {
        super(0, false);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fh3) && this.c == ((fh3) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.c));
    }
}
