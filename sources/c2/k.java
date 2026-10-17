package c2;

import e2.m0;
import j$.util.Objects;
public final class k {
    public static final k e = new k(-1, -1, -1);
    public final int f4516a;
    public final int f4517b;
    public final int f4518c;
    public final int d;

    public k(int i10, int i11, int i12) {
        int i13;
        this.f4516a = i10;
        this.f4517b = i11;
        this.f4518c = i12;
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
        if (this.f4516a == kVar.f4516a && this.f4517b == kVar.f4517b && this.f4518c == kVar.f4518c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4516a), Integer.valueOf(this.f4517b), Integer.valueOf(this.f4518c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4516a + ", channelCount=" + this.f4517b + ", encoding=" + this.f4518c + ']';
    }
}
