package o3;

import c8.l1;
import e2.n0;
import e2.p0;
import e2.u;
public final class b implements p0 {
    public final long f21682a;
    public final long f21683b;
    public final long f21684c;
    public final long d;
    public final long f21685e;

    public b(long j3, long j10, long j11, long j12, long j13) {
        this.f21682a = j3;
        this.f21683b = j10;
        this.f21684c = j11;
        this.d = j12;
        this.f21685e = j13;
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
            if (this.f21682a == bVar.f21682a && this.f21683b == bVar.f21683b && this.f21684c == bVar.f21684c && this.d == bVar.d && this.f21685e == bVar.f21685e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = l1.b(this.f21683b);
        int b11 = l1.b(this.f21684c);
        int b12 = l1.b(this.d);
        return l1.b(this.f21685e) + ((b12 + ((b11 + ((b10 + ((l1.b(this.f21682a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f21682a + ", photoSize=" + this.f21683b + ", photoPresentationTimestampUs=" + this.f21684c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f21685e;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
