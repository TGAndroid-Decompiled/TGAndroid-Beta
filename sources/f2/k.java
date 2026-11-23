package f2;

import h2.l0;
import j$.util.Objects;
public final class k {
    public static final k f11043e = new k(-1, -1, -1);
    public final int f11044a;
    public final int f11045b;
    public final int f11046c;
    public final int d;

    public k(int i7, int i10, int i11) {
        int i12;
        this.f11044a = i7;
        this.f11045b = i10;
        this.f11046c = i11;
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
        if (this.f11044a == kVar.f11044a && this.f11045b == kVar.f11045b && this.f11046c == kVar.f11046c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11044a), Integer.valueOf(this.f11045b), Integer.valueOf(this.f11046c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f11044a + ", channelCount=" + this.f11045b + ", encoding=" + this.f11046c + ']';
    }
}
