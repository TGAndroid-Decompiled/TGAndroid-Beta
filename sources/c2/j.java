package c2;

import e2.l0;
import j$.util.Objects;
public final class j {
    public static final j e = new j(-1, -1, -1);
    public final int f3547a;
    public final int f3548b;
    public final int f3549c;
    public final int d;

    public j(int i10, int i11, int i12) {
        int i13;
        this.f3547a = i10;
        this.f3548b = i11;
        this.f3549c = i12;
        if (l0.M(i12)) {
            i13 = l0.u(i12) * i11;
        } else {
            i13 = -1;
        }
        this.d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f3547a == jVar.f3547a && this.f3548b == jVar.f3548b && this.f3549c == jVar.f3549c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3547a), Integer.valueOf(this.f3548b), Integer.valueOf(this.f3549c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f3547a + ", channelCount=" + this.f3548b + ", encoding=" + this.f3549c + ']';
    }
}
