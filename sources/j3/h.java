package j3;

import java.util.Arrays;

public final class h {

    public static final h f12342e = new h(-1, -1, -1);

    public final int f12343a;

    public final int f12344b;

    public final int f12345c;
    public final int d;

    public h(int i10, int i11, int i12) {
        this.f12343a = i10;
        this.f12344b = i11;
        this.f12345c = i12;
        this.d = d5.g0.D(i12) ? d5.g0.w(i12, i11) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f12343a == hVar.f12343a && this.f12344b == hVar.f12344b && this.f12345c == hVar.f12345c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12343a), Integer.valueOf(this.f12344b), Integer.valueOf(this.f12345c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f12343a + ", channelCount=" + this.f12344b + ", encoding=" + this.f12345c + ']';
    }
}
