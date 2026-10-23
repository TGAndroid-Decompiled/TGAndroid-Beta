package c2;

import e2.m0;
import j$.util.Objects;
public final class k {
    public static final k e = new k(-1, -1, -1);
    public final int f4517a;
    public final int f4518b;
    public final int f4519c;
    public final int d;

    public k(int i10, int i11, int i12) {
        int i13;
        this.f4517a = i10;
        this.f4518b = i11;
        this.f4519c = i12;
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
        if (this.f4517a == kVar.f4517a && this.f4518b == kVar.f4518b && this.f4519c == kVar.f4519c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4517a), Integer.valueOf(this.f4518b), Integer.valueOf(this.f4519c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4517a + ", channelCount=" + this.f4518b + ", encoding=" + this.f4519c + ']';
    }
}
