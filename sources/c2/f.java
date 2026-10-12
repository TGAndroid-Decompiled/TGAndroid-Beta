package c2;

import e2.d0;
import j$.util.Objects;
public final class f {
    public static final f f4006e = new f(-1, -1, -1);
    public final int f4007a;
    public final int f4008b;
    public final int f4009c;
    public final int d;

    public f(int i10, int i11, int i12) {
        int i13;
        this.f4007a = i10;
        this.f4008b = i11;
        this.f4009c = i12;
        if (d0.J(i12)) {
            i13 = d0.s(i12) * i11;
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
        if (this.f4007a == fVar.f4007a && this.f4008b == fVar.f4008b && this.f4009c == fVar.f4009c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4007a), Integer.valueOf(this.f4008b), Integer.valueOf(this.f4009c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4007a + ", channelCount=" + this.f4008b + ", encoding=" + this.f4009c + ']';
    }
}
