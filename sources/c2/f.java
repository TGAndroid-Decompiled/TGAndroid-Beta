package c2;

import e2.d0;
import j$.util.Objects;
public final class f {
    public static final f f3958e = new f(-1, -1, -1);
    public final int f3959a;
    public final int f3960b;
    public final int f3961c;
    public final int d;

    public f(int i10, int i11, int i12) {
        int i13;
        this.f3959a = i10;
        this.f3960b = i11;
        this.f3961c = i12;
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
        if (this.f3959a == fVar.f3959a && this.f3960b == fVar.f3960b && this.f3961c == fVar.f3961c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3959a), Integer.valueOf(this.f3960b), Integer.valueOf(this.f3961c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f3959a + ", channelCount=" + this.f3960b + ", encoding=" + this.f3961c + ']';
    }
}
