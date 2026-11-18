package f2;

import h2.l0;
import j$.util.Objects;
public final class k {
    public static final k f11051e = new k(-1, -1, -1);
    public final int f11052a;
    public final int f11053b;
    public final int f11054c;
    public final int d;

    public k(int i7, int i10, int i11) {
        int i12;
        this.f11052a = i7;
        this.f11053b = i10;
        this.f11054c = i11;
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
        if (this.f11052a == kVar.f11052a && this.f11053b == kVar.f11053b && this.f11054c == kVar.f11054c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11052a), Integer.valueOf(this.f11053b), Integer.valueOf(this.f11054c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f11052a + ", channelCount=" + this.f11053b + ", encoding=" + this.f11054c + ']';
    }
}
