package o3;

import c8.l1;
import e2.n0;
import e2.p0;
import e2.u;
public final class b implements p0 {
    public final long f21707a;
    public final long f21708b;
    public final long f21709c;
    public final long d;
    public final long f21710e;

    public b(long j3, long j10, long j11, long j12, long j13) {
        this.f21707a = j3;
        this.f21708b = j10;
        this.f21709c = j11;
        this.d = j12;
        this.f21710e = j13;
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
            if (this.f21707a == bVar.f21707a && this.f21708b == bVar.f21708b && this.f21709c == bVar.f21709c && this.d == bVar.d && this.f21710e == bVar.f21710e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = l1.b(this.f21708b);
        int b11 = l1.b(this.f21709c);
        int b12 = l1.b(this.d);
        return l1.b(this.f21710e) + ((b12 + ((b11 + ((b10 + ((l1.b(this.f21707a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f21707a + ", photoSize=" + this.f21708b + ", photoPresentationTimestampUs=" + this.f21709c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f21710e;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
