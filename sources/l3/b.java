package l3;

import b2.r0;
import b2.t0;
import b2.x;
import v7.c8;
public final class b implements t0 {
    public final long f14554a;
    public final long f14555b;
    public final long f14556c;
    public final long d;
    public final long e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f14554a = j10;
        this.f14555b = j11;
        this.f14556c = j12;
        this.d = j13;
        this.e = j14;
    }

    @Override
    public final x a() {
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
            if (this.f14554a == bVar.f14554a && this.f14555b == bVar.f14555b && this.f14556c == bVar.f14556c && this.d == bVar.d && this.e == bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = c8.b(this.f14555b);
        int b11 = c8.b(this.f14556c);
        int b12 = c8.b(this.d);
        return c8.b(this.e) + ((b12 + ((b11 + ((b10 + ((c8.b(this.f14554a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f14554a + ", photoSize=" + this.f14555b + ", photoPresentationTimestampUs=" + this.f14556c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
