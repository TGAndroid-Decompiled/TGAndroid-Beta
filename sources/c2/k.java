package c2;

import e2.m0;
import j$.util.Objects;
public final class k {
    public static final k e = new k(-1, -1, -1);
    public final int f4142a;
    public final int f4143b;
    public final int f4144c;
    public final int d;

    public k(int i10, int i11, int i12) {
        int i13;
        this.f4142a = i10;
        this.f4143b = i11;
        this.f4144c = i12;
        if (m0.M(i12)) {
            i13 = m0.u(i12) * i11;
        } else {
            i13 = -1;
        }
        this.d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f4142a == kVar.f4142a && this.f4143b == kVar.f4143b && this.f4144c == kVar.f4144c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4142a), Integer.valueOf(this.f4143b), Integer.valueOf(this.f4144c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4142a + ", channelCount=" + this.f4143b + ", encoding=" + this.f4144c + ']';
    }
}
