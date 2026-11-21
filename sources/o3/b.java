package o3;

import c8.l1;
import e2.n0;
import e2.p0;
import e2.u;
public final class b implements p0 {
    public final long f21704a;
    public final long f21705b;
    public final long f21706c;
    public final long d;
    public final long f21707e;

    public b(long j3, long j10, long j11, long j12, long j13) {
        this.f21704a = j3;
        this.f21705b = j10;
        this.f21706c = j11;
        this.d = j12;
        this.f21707e = j13;
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
            if (this.f21704a == bVar.f21704a && this.f21705b == bVar.f21705b && this.f21706c == bVar.f21706c && this.d == bVar.d && this.f21707e == bVar.f21707e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = l1.b(this.f21705b);
        int b11 = l1.b(this.f21706c);
        int b12 = l1.b(this.d);
        return l1.b(this.f21707e) + ((b12 + ((b11 + ((b10 + ((l1.b(this.f21704a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f21704a + ", photoSize=" + this.f21705b + ", photoPresentationTimestampUs=" + this.f21706c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f21707e;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
