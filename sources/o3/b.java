package o3;

import c8.j1;
import e2.n0;
import e2.p0;
import e2.u;
public final class b implements p0 {
    public final long f21315a;
    public final long f21316b;
    public final long f21317c;
    public final long d;
    public final long f21318e;

    public b(long j3, long j10, long j11, long j12, long j13) {
        this.f21315a = j3;
        this.f21316b = j10;
        this.f21317c = j11;
        this.d = j12;
        this.f21318e = j13;
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
            if (this.f21315a == bVar.f21315a && this.f21316b == bVar.f21316b && this.f21317c == bVar.f21317c && this.d == bVar.d && this.f21318e == bVar.f21318e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = j1.b(this.f21316b);
        int b11 = j1.b(this.f21317c);
        int b12 = j1.b(this.d);
        return j1.b(this.f21318e) + ((b12 + ((b11 + ((b10 + ((j1.b(this.f21315a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f21315a + ", photoSize=" + this.f21316b + ", photoPresentationTimestampUs=" + this.f21317c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f21318e;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
