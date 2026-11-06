package f2;

import h2.m0;
import j$.util.Objects;
public final class k {
    public static final k f10916e = new k(-1, -1, -1);
    public final int f10917a;
    public final int f10918b;
    public final int f10919c;
    public final int d;

    public k(int i7, int i10, int i11) {
        int i12;
        this.f10917a = i7;
        this.f10918b = i10;
        this.f10919c = i11;
        if (m0.M(i11)) {
            i12 = m0.u(i11) * i10;
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
        if (this.f10917a == kVar.f10917a && this.f10918b == kVar.f10918b && this.f10919c == kVar.f10919c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10917a), Integer.valueOf(this.f10918b), Integer.valueOf(this.f10919c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f10917a + ", channelCount=" + this.f10918b + ", encoding=" + this.f10919c + ']';
    }
}
