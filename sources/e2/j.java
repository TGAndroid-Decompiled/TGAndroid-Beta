package e2;

import g2.n0;
import j$.util.Objects;
public final class j {
    public static final j f9352e = new j(-1, -1, -1);
    public final int f9353a;
    public final int f9354b;
    public final int f9355c;
    public final int d;

    public j(int i3, int i10, int i11) {
        int i12;
        this.f9353a = i3;
        this.f9354b = i10;
        this.f9355c = i11;
        if (n0.M(i11)) {
            i12 = n0.u(i11) * i10;
        } else {
            i12 = -1;
        }
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f9353a == jVar.f9353a && this.f9354b == jVar.f9354b && this.f9355c == jVar.f9355c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9353a), Integer.valueOf(this.f9354b), Integer.valueOf(this.f9355c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f9353a + ", channelCount=" + this.f9354b + ", encoding=" + this.f9355c + ']';
    }
}
