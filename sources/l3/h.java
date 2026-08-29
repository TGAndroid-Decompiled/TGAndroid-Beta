package l3;

import java.util.Arrays;
public final class h {
    public static final h f14098e = new h(-1, -1, -1);
    public final int f14099a;
    public final int f14100b;
    public final int f14101c;
    public final int d;

    public h(int i10, int i11, int i12) {
        int i13;
        this.f14099a = i10;
        this.f14100b = i11;
        this.f14101c = i12;
        if (f5.d0.D(i12)) {
            i13 = f5.d0.w(i12, i11);
        } else {
            i13 = -1;
        }
        this.d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f14099a == hVar.f14099a && this.f14100b == hVar.f14100b && this.f14101c == hVar.f14101c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14099a), Integer.valueOf(this.f14100b), Integer.valueOf(this.f14101c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f14099a + ", channelCount=" + this.f14100b + ", encoding=" + this.f14101c + ']';
    }
}
