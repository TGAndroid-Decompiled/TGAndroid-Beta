package c2;

import e2.m0;
import j$.util.Objects;
public final class k {
    public static final k e = new k(-1, -1, -1);
    public final int f4515a;
    public final int f4516b;
    public final int f4517c;
    public final int d;

    public k(int i10, int i11, int i12) {
        int i13;
        this.f4515a = i10;
        this.f4516b = i11;
        this.f4517c = i12;
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
        if (this.f4515a == kVar.f4515a && this.f4516b == kVar.f4516b && this.f4517c == kVar.f4517c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4515a), Integer.valueOf(this.f4516b), Integer.valueOf(this.f4517c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4515a + ", channelCount=" + this.f4516b + ", encoding=" + this.f4517c + ']';
    }
}
