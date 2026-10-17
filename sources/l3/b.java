package l3;

import b2.q0;
import b2.s0;
import b2.w;
import v7.c8;
public final class b implements s0 {
    public final long f15888a;
    public final long f15889b;
    public final long f15890c;
    public final long d;
    public final long e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f15888a = j10;
        this.f15889b = j11;
        this.f15890c = j12;
        this.d = j13;
        this.e = j14;
    }

    @Override
    public final w a() {
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
            if (this.f15888a == bVar.f15888a && this.f15889b == bVar.f15889b && this.f15890c == bVar.f15890c && this.d == bVar.d && this.e == bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f15889b);
        int b11 = c8.b(this.f15890c);
        int b12 = c8.b(this.d);
        return c8.b(this.e) + ((b12 + ((b11 + ((b10 + ((c8.b(this.f15888a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f15888a + ", photoSize=" + this.f15889b + ", photoPresentationTimestampUs=" + this.f15890c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
