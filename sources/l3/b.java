package l3;

import b2.q0;
import b2.s0;
import b2.w;
import v7.c8;
public final class b implements s0 {
    public final long f15957a;
    public final long f15958b;
    public final long f15959c;
    public final long d;
    public final long e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f15957a = j10;
        this.f15958b = j11;
        this.f15959c = j12;
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
            if (this.f15957a == bVar.f15957a && this.f15958b == bVar.f15958b && this.f15959c == bVar.f15959c && this.d == bVar.d && this.e == bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f15958b);
        int b11 = c8.b(this.f15959c);
        int b12 = c8.b(this.d);
        return c8.b(this.e) + ((b12 + ((b11 + ((b10 + ((c8.b(this.f15957a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f15957a + ", photoSize=" + this.f15958b + ", photoPresentationTimestampUs=" + this.f15959c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
