package n3;

import b8.pd;
import d2.p0;
import d2.r0;
import d2.v;
public final class b implements r0 {
    public final long f20213a;
    public final long f20214b;
    public final long f20215c;
    public final long d;
    public final long f20216e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f20213a = j10;
        this.f20214b = j11;
        this.f20215c = j12;
        this.d = j13;
        this.f20216e = j14;
    }

    @Override
    public final v b() {
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
            if (this.f20213a == bVar.f20213a && this.f20214b == bVar.f20214b && this.f20215c == bVar.f20215c && this.d == bVar.d && this.f20216e == bVar.f20216e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = pd.b(this.f20214b);
        int b11 = pd.b(this.f20215c);
        int b12 = pd.b(this.d);
        return pd.b(this.f20216e) + ((b12 + ((b11 + ((b10 + ((pd.b(this.f20213a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f20213a + ", photoSize=" + this.f20214b + ", photoPresentationTimestampUs=" + this.f20215c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f20216e;
    }

    @Override
    public final void a(p0 p0Var) {
    }
}
