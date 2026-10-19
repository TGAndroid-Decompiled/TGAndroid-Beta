package c2;

import e2.m0;
import j$.util.Objects;
public final class k {
    public static final k e = new k(-1, -1, -1);
    public final int f4513a;
    public final int f4514b;
    public final int f4515c;
    public final int d;

    public k(int i10, int i11, int i12) {
        int i13;
        this.f4513a = i10;
        this.f4514b = i11;
        this.f4515c = i12;
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
        if (this.f4513a == kVar.f4513a && this.f4514b == kVar.f4514b && this.f4515c == kVar.f4515c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4513a), Integer.valueOf(this.f4514b), Integer.valueOf(this.f4515c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4513a + ", channelCount=" + this.f4514b + ", encoding=" + this.f4515c + ']';
    }
}
