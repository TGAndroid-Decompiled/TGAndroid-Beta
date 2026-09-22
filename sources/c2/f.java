package c2;

import e2.d0;
import j$.util.Objects;
public final class f {
    public static final f e = new f(-1, -1, -1);
    public final int f3666a;
    public final int f3667b;
    public final int f3668c;
    public final int d;

    public f(int i10, int i11, int i12) {
        int i13;
        this.f3666a = i10;
        this.f3667b = i11;
        this.f3668c = i12;
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
        if (this.f3666a == fVar.f3666a && this.f3667b == fVar.f3667b && this.f3668c == fVar.f3668c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3666a), Integer.valueOf(this.f3667b), Integer.valueOf(this.f3668c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f3666a + ", channelCount=" + this.f3667b + ", encoding=" + this.f3668c + ']';
    }
}
