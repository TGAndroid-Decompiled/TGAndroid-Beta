package f2;

import h2.m0;
import j$.util.Objects;
public final class k {
    public static final k f10921e = new k(-1, -1, -1);
    public final int f10922a;
    public final int f10923b;
    public final int f10924c;
    public final int d;

    public k(int i7, int i10, int i11) {
        int i12;
        this.f10922a = i7;
        this.f10923b = i10;
        this.f10924c = i11;
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
        if (this.f10922a == kVar.f10922a && this.f10923b == kVar.f10923b && this.f10924c == kVar.f10924c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10922a), Integer.valueOf(this.f10923b), Integer.valueOf(this.f10924c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f10922a + ", channelCount=" + this.f10923b + ", encoding=" + this.f10924c + ']';
    }
}
