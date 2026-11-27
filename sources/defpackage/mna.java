package defpackage;

import j$.util.Objects;
import java.util.Locale;
public final class mna {
    public final long a;
    public final long b;
    public final int c;

    public mna(long j, int i, long j2) {
        boolean z;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mna.class == obj.getClass()) {
            mna mnaVar = (mna) obj;
            if (this.a == mnaVar.a && this.b == mnaVar.b && this.c == mnaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = gcc.a;
        Locale locale = Locale.US;
        StringBuilder o = ik8.o(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        o.append(this.b);
        o.append(", speedDivisor=");
        o.append(this.c);
        return o.toString();
    }
}
