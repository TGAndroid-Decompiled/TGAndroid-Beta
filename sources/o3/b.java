package o3;

import c8.f1;
import e2.n0;
import e2.p0;
import e2.u;
public final class b implements p0 {
    public final long f20799a;
    public final long f20800b;
    public final long f20801c;
    public final long d;
    public final long f20802e;

    public b(long j3, long j10, long j11, long j12, long j13) {
        this.f20799a = j3;
        this.f20800b = j10;
        this.f20801c = j11;
        this.d = j12;
        this.f20802e = j13;
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
            if (this.f20799a == bVar.f20799a && this.f20800b == bVar.f20800b && this.f20801c == bVar.f20801c && this.d == bVar.d && this.f20802e == bVar.f20802e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = f1.b(this.f20800b);
        int b11 = f1.b(this.f20801c);
        int b12 = f1.b(this.d);
        return f1.b(this.f20802e) + ((b12 + ((b11 + ((b10 + ((f1.b(this.f20799a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f20799a + ", photoSize=" + this.f20800b + ", photoPresentationTimestampUs=" + this.f20801c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f20802e;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
