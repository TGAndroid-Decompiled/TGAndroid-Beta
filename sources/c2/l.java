package c2;

import e2.n0;
import j$.util.Objects;
public final class l {
    public static final l e = new l(-1, -1, -1);
    public final int f5954a;
    public final int f5955b;
    public final int f5956c;
    public final int d;

    public l(int i10, int i11, int i12) {
        int i13;
        this.f5954a = i10;
        this.f5955b = i11;
        this.f5956c = i12;
        if (n0.M(i12)) {
            i13 = n0.u(i12) * i11;
        } else {
            i13 = -1;
        }
        this.d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f5954a == lVar.f5954a && this.f5955b == lVar.f5955b && this.f5956c == lVar.f5956c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5954a), Integer.valueOf(this.f5955b), Integer.valueOf(this.f5956c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f5954a + ", channelCount=" + this.f5955b + ", encoding=" + this.f5956c + ']';
    }
}
