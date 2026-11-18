package o3;

import c8.l1;
import e2.n0;
import e2.p0;
import e2.u;
public final class b implements p0 {
    public final long f21679a;
    public final long f21680b;
    public final long f21681c;
    public final long d;
    public final long f21682e;

    public b(long j3, long j10, long j11, long j12, long j13) {
        this.f21679a = j3;
        this.f21680b = j10;
        this.f21681c = j11;
        this.d = j12;
        this.f21682e = j13;
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f21679a == bVar.f21679a && this.f21680b == bVar.f21680b && this.f21681c == bVar.f21681c && this.d == bVar.d && this.f21682e == bVar.f21682e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = l1.b(this.f21680b);
        int b11 = l1.b(this.f21681c);
        int b12 = l1.b(this.d);
        return l1.b(this.f21682e) + ((b12 + ((b11 + ((b10 + ((l1.b(this.f21679a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f21679a + ", photoSize=" + this.f21680b + ", photoPresentationTimestampUs=" + this.f21681c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f21682e;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
