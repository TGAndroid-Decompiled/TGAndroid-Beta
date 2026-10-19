package l3;

import b2.q0;
import b2.s0;
import b2.w;
import v7.c8;
public final class b implements s0 {
    public final long f15894a;
    public final long f15895b;
    public final long f15896c;
    public final long d;
    public final long e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f15894a = j10;
        this.f15895b = j11;
        this.f15896c = j12;
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
            if (this.f15894a == bVar.f15894a && this.f15895b == bVar.f15895b && this.f15896c == bVar.f15896c && this.d == bVar.d && this.e == bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f15895b);
        int b11 = c8.b(this.f15896c);
        int b12 = c8.b(this.d);
        return c8.b(this.e) + ((b12 + ((b11 + ((b10 + ((c8.b(this.f15894a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f15894a + ", photoSize=" + this.f15895b + ", photoPresentationTimestampUs=" + this.f15896c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
