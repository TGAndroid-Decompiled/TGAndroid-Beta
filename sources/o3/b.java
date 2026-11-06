package o3;

import c8.f1;
import e2.n0;
import e2.p0;
import e2.u;
public final class b implements p0 {
    public final long f20791a;
    public final long f20792b;
    public final long f20793c;
    public final long d;
    public final long f20794e;

    public b(long j3, long j10, long j11, long j12, long j13) {
        this.f20791a = j3;
        this.f20792b = j10;
        this.f20793c = j11;
        this.d = j12;
        this.f20794e = j13;
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
            if (this.f20791a == bVar.f20791a && this.f20792b == bVar.f20792b && this.f20793c == bVar.f20793c && this.d == bVar.d && this.f20794e == bVar.f20794e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = f1.b(this.f20792b);
        int b11 = f1.b(this.f20793c);
        int b12 = f1.b(this.d);
        return f1.b(this.f20794e) + ((b12 + ((b11 + ((b10 + ((f1.b(this.f20791a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f20791a + ", photoSize=" + this.f20792b + ", photoPresentationTimestampUs=" + this.f20793c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f20794e;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
