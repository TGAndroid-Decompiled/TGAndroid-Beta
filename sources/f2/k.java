package f2;

import h2.l0;
import j$.util.Objects;
public final class k {
    public static final k f11080e = new k(-1, -1, -1);
    public final int f11081a;
    public final int f11082b;
    public final int f11083c;
    public final int d;

    public k(int i7, int i10, int i11) {
        int i12;
        this.f11081a = i7;
        this.f11082b = i10;
        this.f11083c = i11;
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
        if (this.f11081a == kVar.f11081a && this.f11082b == kVar.f11082b && this.f11083c == kVar.f11083c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11081a), Integer.valueOf(this.f11082b), Integer.valueOf(this.f11083c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f11081a + ", channelCount=" + this.f11082b + ", encoding=" + this.f11083c + ']';
    }
}
