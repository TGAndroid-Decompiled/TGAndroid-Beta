package f2;

import h2.l0;
import j$.util.Objects;
public final class k {
    public static final k f11077e = new k(-1, -1, -1);
    public final int f11078a;
    public final int f11079b;
    public final int f11080c;
    public final int d;

    public k(int i7, int i10, int i11) {
        int i12;
        this.f11078a = i7;
        this.f11079b = i10;
        this.f11080c = i11;
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
        if (this.f11078a == kVar.f11078a && this.f11079b == kVar.f11079b && this.f11080c == kVar.f11080c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11078a), Integer.valueOf(this.f11079b), Integer.valueOf(this.f11080c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f11078a + ", channelCount=" + this.f11079b + ", encoding=" + this.f11080c + ']';
    }
}
