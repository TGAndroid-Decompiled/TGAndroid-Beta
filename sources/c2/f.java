package c2;

import e2.d0;
import j$.util.Objects;
public final class f {
    public static final f e = new f(-1, -1, -1);
    public final int f3661a;
    public final int f3662b;
    public final int f3663c;
    public final int d;

    public f(int i10, int i11, int i12) {
        int i13;
        this.f3661a = i10;
        this.f3662b = i11;
        this.f3663c = i12;
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
        if (this.f3661a == fVar.f3661a && this.f3662b == fVar.f3662b && this.f3663c == fVar.f3663c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3661a), Integer.valueOf(this.f3662b), Integer.valueOf(this.f3663c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f3661a + ", channelCount=" + this.f3662b + ", encoding=" + this.f3663c + ']';
    }
}
