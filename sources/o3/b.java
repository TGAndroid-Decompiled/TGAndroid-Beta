package o3;

import c8.m1;
import e2.n0;
import e2.p0;
import e2.u;
public final class b implements p0 {
    public final long f21673a;
    public final long f21674b;
    public final long f21675c;
    public final long d;
    public final long f21676e;

    public b(long j3, long j10, long j11, long j12, long j13) {
        this.f21673a = j3;
        this.f21674b = j10;
        this.f21675c = j11;
        this.d = j12;
        this.f21676e = j13;
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
            if (this.f21673a == bVar.f21673a && this.f21674b == bVar.f21674b && this.f21675c == bVar.f21675c && this.d == bVar.d && this.f21676e == bVar.f21676e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = m1.b(this.f21674b);
        int b11 = m1.b(this.f21675c);
        int b12 = m1.b(this.d);
        return m1.b(this.f21676e) + ((b12 + ((b11 + ((b10 + ((m1.b(this.f21673a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f21673a + ", photoSize=" + this.f21674b + ", photoPresentationTimestampUs=" + this.f21675c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f21676e;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
