package f2;

import h2.l0;
import j$.util.Objects;
public final class k {
    public static final k f11048e = new k(-1, -1, -1);
    public final int f11049a;
    public final int f11050b;
    public final int f11051c;
    public final int d;

    public k(int i7, int i10, int i11) {
        int i12;
        this.f11049a = i7;
        this.f11050b = i10;
        this.f11051c = i11;
        if (l0.M(i11)) {
            i12 = l0.u(i11) * i10;
        } else {
            i12 = -1;
        }
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f11049a == kVar.f11049a && this.f11050b == kVar.f11050b && this.f11051c == kVar.f11051c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11049a), Integer.valueOf(this.f11050b), Integer.valueOf(this.f11051c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f11049a + ", channelCount=" + this.f11050b + ", encoding=" + this.f11051c + ']';
    }
}
