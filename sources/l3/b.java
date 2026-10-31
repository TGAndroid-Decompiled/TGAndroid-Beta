package l3;

import b2.r0;
import b2.t0;
import b2.x;
import v7.d8;
public final class b implements t0 {
    public final long f11638a;
    public final long f11639b;
    public final long f11640c;
    public final long d;
    public final long e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f11638a = j10;
        this.f11639b = j11;
        this.f11640c = j12;
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
            if (this.f11638a == bVar.f11638a && this.f11639b == bVar.f11639b && this.f11640c == bVar.f11640c && this.d == bVar.d && this.e == bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = d8.b(this.f11639b);
        int b11 = d8.b(this.f11640c);
        int b12 = d8.b(this.d);
        return d8.b(this.e) + ((b12 + ((b11 + ((b10 + ((d8.b(this.f11638a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f11638a + ", photoSize=" + this.f11639b + ", photoPresentationTimestampUs=" + this.f11640c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
