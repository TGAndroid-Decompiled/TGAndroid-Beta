package f2;

import h2.l0;
import j$.util.Objects;
public final class k {
    public static final k f11041e = new k(-1, -1, -1);
    public final int f11042a;
    public final int f11043b;
    public final int f11044c;
    public final int d;

    public k(int i7, int i10, int i11) {
        int i12;
        this.f11042a = i7;
        this.f11043b = i10;
        this.f11044c = i11;
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
        if (this.f11042a == kVar.f11042a && this.f11043b == kVar.f11043b && this.f11044c == kVar.f11044c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11042a), Integer.valueOf(this.f11043b), Integer.valueOf(this.f11044c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f11042a + ", channelCount=" + this.f11043b + ", encoding=" + this.f11044c + ']';
    }
}
