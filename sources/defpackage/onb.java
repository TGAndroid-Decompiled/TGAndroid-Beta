package defpackage;
public final class onb {
    public static final nnb Companion = new Object();
    public final long a;
    public final long b;
    public final long c;

    public onb(int i, long j, long j2, long j3) {
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
        are.a(i, 1, mnb.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof onb) && this.a == ((onb) obj).a) {
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

    public onb(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
