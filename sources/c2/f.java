package c2;

import e2.d0;
import j$.util.Objects;
public final class f {
    public static final f f4179e = new f(-1, -1, -1);
    public final int f4180a;
    public final int f4181b;
    public final int f4182c;
    public final int d;

    public f(int i10, int i11, int i12) {
        int i13;
        this.f4180a = i10;
        this.f4181b = i11;
        this.f4182c = i12;
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
        if (this.f4180a == fVar.f4180a && this.f4181b == fVar.f4181b && this.f4182c == fVar.f4182c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4180a), Integer.valueOf(this.f4181b), Integer.valueOf(this.f4182c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4180a + ", channelCount=" + this.f4181b + ", encoding=" + this.f4182c + ']';
    }
}
