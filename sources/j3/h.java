package j3;

import java.util.Arrays;
public final class h {
    public static final h f13246e = new h(-1, -1, -1);
    public final int f13247a;
    public final int f13248b;
    public final int f13249c;
    public final int d;

    public h(int i9, int i10, int i11) {
        int i12;
        this.f13247a = i9;
        this.f13248b = i10;
        this.f13249c = i11;
        if (d5.f0.D(i11)) {
            i12 = d5.f0.w(i11, i10);
        } else {
            i12 = -1;
        }
        this.d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f13247a == hVar.f13247a && this.f13248b == hVar.f13248b && this.f13249c == hVar.f13249c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13247a), Integer.valueOf(this.f13248b), Integer.valueOf(this.f13249c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f13247a + ", channelCount=" + this.f13248b + ", encoding=" + this.f13249c + ']';
    }
}
