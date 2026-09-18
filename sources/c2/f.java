package c2;

import e2.d0;
import j$.util.Objects;
public final class f {
    public static final f e = new f(-1, -1, -1);
    public final int f3669a;
    public final int f3670b;
    public final int f3671c;
    public final int d;

    public f(int i10, int i11, int i12) {
        int i13;
        this.f3669a = i10;
        this.f3670b = i11;
        this.f3671c = i12;
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
        if (this.f3669a == fVar.f3669a && this.f3670b == fVar.f3670b && this.f3671c == fVar.f3671c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3669a), Integer.valueOf(this.f3670b), Integer.valueOf(this.f3671c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f3669a + ", channelCount=" + this.f3670b + ", encoding=" + this.f3671c + ']';
    }
}
