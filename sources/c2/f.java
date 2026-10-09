package c2;

import e2.d0;
import j$.util.Objects;
public final class f {
    public static final f f4007e = new f(-1, -1, -1);
    public final int f4008a;
    public final int f4009b;
    public final int f4010c;
    public final int d;

    public f(int i10, int i11, int i12) {
        int i13;
        this.f4008a = i10;
        this.f4009b = i11;
        this.f4010c = i12;
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
        if (this.f4008a == fVar.f4008a && this.f4009b == fVar.f4009b && this.f4010c == fVar.f4010c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4008a), Integer.valueOf(this.f4009b), Integer.valueOf(this.f4010c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4008a + ", channelCount=" + this.f4009b + ", encoding=" + this.f4010c + ']';
    }
}
