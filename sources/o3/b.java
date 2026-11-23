package o3;

import c8.m1;
import e2.n0;
import e2.p0;
import e2.u;
public final class b implements p0 {
    public final long f21772a;
    public final long f21773b;
    public final long f21774c;
    public final long d;
    public final long f21775e;

    public b(long j3, long j10, long j11, long j12, long j13) {
        this.f21772a = j3;
        this.f21773b = j10;
        this.f21774c = j11;
        this.d = j12;
        this.f21775e = j13;
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
            if (this.f21772a == bVar.f21772a && this.f21773b == bVar.f21773b && this.f21774c == bVar.f21774c && this.d == bVar.d && this.f21775e == bVar.f21775e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = m1.b(this.f21773b);
        int b11 = m1.b(this.f21774c);
        int b12 = m1.b(this.d);
        return m1.b(this.f21775e) + ((b12 + ((b11 + ((b10 + ((m1.b(this.f21772a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f21772a + ", photoSize=" + this.f21773b + ", photoPresentationTimestampUs=" + this.f21774c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f21775e;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
