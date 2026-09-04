package c2;

import e2.d0;
import j$.util.Objects;
public final class f {
    public static final f f4152e = new f(-1, -1, -1);
    public final int f4153a;
    public final int f4154b;
    public final int f4155c;
    public final int d;

    public f(int i10, int i11, int i12) {
        int i13;
        this.f4153a = i10;
        this.f4154b = i11;
        this.f4155c = i12;
        if (d0.K(i12)) {
            i13 = d0.t(i12) * i11;
        } else {
            i13 = -1;
        }
        this.d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f4153a == fVar.f4153a && this.f4154b == fVar.f4154b && this.f4155c == fVar.f4155c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4153a), Integer.valueOf(this.f4154b), Integer.valueOf(this.f4155c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4153a + ", channelCount=" + this.f4154b + ", encoding=" + this.f4155c + ']';
    }
}
