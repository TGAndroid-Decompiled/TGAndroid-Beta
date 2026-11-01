package l3;

import b2.r0;
import b2.t0;
import b2.x;
import v7.d8;
public final class b implements t0 {
    public final long f11639a;
    public final long f11640b;
    public final long f11641c;
    public final long d;
    public final long e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f11639a = j10;
        this.f11640b = j11;
        this.f11641c = j12;
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
            if (this.f11639a == bVar.f11639a && this.f11640b == bVar.f11640b && this.f11641c == bVar.f11641c && this.d == bVar.d && this.e == bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = d8.b(this.f11640b);
        int b11 = d8.b(this.f11641c);
        int b12 = d8.b(this.d);
        return d8.b(this.e) + ((b12 + ((b11 + ((b10 + ((d8.b(this.f11639a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f11639a + ", photoSize=" + this.f11640b + ", photoPresentationTimestampUs=" + this.f11641c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
