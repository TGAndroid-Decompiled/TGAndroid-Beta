package defpackage;
public final class ppb {
    public static final opb Companion = new Object();
    public final long a;
    public final long b;
    public final long c;

    public ppb(int i, long j, long j2, long j3) {
        if (1 == (i & 1)) {
            this.a = j;
            this.b = (i & 2) == 0 ? j * 1000 : j2;
            if ((i & 4) == 0) {
                this.c = j / 1000;
                return;
            } else {
                this.c = j3;
                return;
            }
        }
        dte.a(i, 1, npb.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ppb) && this.a == ((ppb) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public ppb(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
