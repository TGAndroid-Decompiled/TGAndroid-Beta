package l3;

import b2.q0;
import b2.s0;
import b2.w;
import v7.c8;
public final class b implements s0 {
    public final long f15896a;
    public final long f15897b;
    public final long f15898c;
    public final long d;
    public final long e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f15896a = j10;
        this.f15897b = j11;
        this.f15898c = j12;
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
            if (this.f15896a == bVar.f15896a && this.f15897b == bVar.f15897b && this.f15898c == bVar.f15898c && this.d == bVar.d && this.e == bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f15897b);
        int b11 = c8.b(this.f15898c);
        int b12 = c8.b(this.d);
        return c8.b(this.e) + ((b12 + ((b11 + ((b10 + ((c8.b(this.f15896a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f15896a + ", photoSize=" + this.f15897b + ", photoPresentationTimestampUs=" + this.f15898c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
