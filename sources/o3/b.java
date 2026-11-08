package o3;

import c8.f1;
import e2.n0;
import e2.p0;
import e2.u;
public final class b implements p0 {
    public final long f20794a;
    public final long f20795b;
    public final long f20796c;
    public final long d;
    public final long f20797e;

    public b(long j3, long j10, long j11, long j12, long j13) {
        this.f20794a = j3;
        this.f20795b = j10;
        this.f20796c = j11;
        this.d = j12;
        this.f20797e = j13;
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
            if (this.f20794a == bVar.f20794a && this.f20795b == bVar.f20795b && this.f20796c == bVar.f20796c && this.d == bVar.d && this.f20797e == bVar.f20797e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = f1.b(this.f20795b);
        int b11 = f1.b(this.f20796c);
        int b12 = f1.b(this.d);
        return f1.b(this.f20797e) + ((b12 + ((b11 + ((b10 + ((f1.b(this.f20794a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f20794a + ", photoSize=" + this.f20795b + ", photoPresentationTimestampUs=" + this.f20796c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f20797e;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
