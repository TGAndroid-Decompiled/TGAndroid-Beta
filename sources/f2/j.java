package f2;

import h2.l0;
import j$.util.Objects;
public final class j {
    public static final j f10729e = new j(-1, -1, -1);
    public final int f10730a;
    public final int f10731b;
    public final int f10732c;
    public final int d;

    public j(int i7, int i10, int i11) {
        int i12;
        this.f10730a = i7;
        this.f10731b = i10;
        this.f10732c = i11;
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
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f10730a == jVar.f10730a && this.f10731b == jVar.f10731b && this.f10732c == jVar.f10732c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10730a), Integer.valueOf(this.f10731b), Integer.valueOf(this.f10732c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f10730a + ", channelCount=" + this.f10731b + ", encoding=" + this.f10732c + ']';
    }
}
