package c2;

import e2.m0;
import j$.util.Objects;
public final class k {
    public static final k e = new k(-1, -1, -1);
    public final int f4146a;
    public final int f4147b;
    public final int f4148c;
    public final int d;

    public k(int i10, int i11, int i12) {
        int i13;
        this.f4146a = i10;
        this.f4147b = i11;
        this.f4148c = i12;
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
        if (this.f4146a == kVar.f4146a && this.f4147b == kVar.f4147b && this.f4148c == kVar.f4148c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4146a), Integer.valueOf(this.f4147b), Integer.valueOf(this.f4148c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4146a + ", channelCount=" + this.f4147b + ", encoding=" + this.f4148c + ']';
    }
}
