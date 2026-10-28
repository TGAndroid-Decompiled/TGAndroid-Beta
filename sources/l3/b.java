package l3;

import a8.fd;
import b2.r0;
import b2.t0;
import b2.x;
public final class b implements t0 {
    public final long f16857a;
    public final long f16858b;
    public final long f16859c;
    public final long d;
    public final long e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f16857a = j10;
        this.f16858b = j11;
        this.f16859c = j12;
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
            if (this.f16857a == bVar.f16857a && this.f16858b == bVar.f16858b && this.f16859c == bVar.f16859c && this.d == bVar.d && this.e == bVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = fd.b(this.f16858b);
        int b11 = fd.b(this.f16859c);
        int b12 = fd.b(this.d);
        return fd.b(this.e) + ((b12 + ((b11 + ((b10 + ((fd.b(this.f16857a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f16857a + ", photoSize=" + this.f16858b + ", photoPresentationTimestampUs=" + this.f16859c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
