package c2;

import e2.d0;
import j$.util.Objects;
public final class f {
    public static final f f3957e = new f(-1, -1, -1);
    public final int f3958a;
    public final int f3959b;
    public final int f3960c;
    public final int d;

    public f(int i10, int i11, int i12) {
        int i13;
        this.f3958a = i10;
        this.f3959b = i11;
        this.f3960c = i12;
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
        if (this.f3958a == fVar.f3958a && this.f3959b == fVar.f3959b && this.f3960c == fVar.f3960c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3958a), Integer.valueOf(this.f3959b), Integer.valueOf(this.f3960c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f3958a + ", channelCount=" + this.f3959b + ", encoding=" + this.f3960c + ']';
    }
}
