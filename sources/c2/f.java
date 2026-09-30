package c2;

import e2.d0;
import j$.util.Objects;
public final class f {
    public static final f e = new f(-1, -1, -1);
    public final int f3668a;
    public final int f3669b;
    public final int f3670c;
    public final int d;

    public f(int i10, int i11, int i12) {
        int i13;
        this.f3668a = i10;
        this.f3669b = i11;
        this.f3670c = i12;
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
        if (this.f3668a == fVar.f3668a && this.f3669b == fVar.f3669b && this.f3670c == fVar.f3670c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3668a), Integer.valueOf(this.f3669b), Integer.valueOf(this.f3670c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f3668a + ", channelCount=" + this.f3669b + ", encoding=" + this.f3670c + ']';
    }
}
