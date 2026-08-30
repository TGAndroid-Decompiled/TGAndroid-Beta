package l3;

import java.util.Arrays;
public final class l {
    public static final l e = new l(-1, -1, -1);
    public final int f11194a;
    public final int f11195b;
    public final int f11196c;
    public final int d;

    public l(int i10, int i11, int i12) {
        int i13;
        this.f11194a = i10;
        this.f11195b = i11;
        this.f11196c = i12;
        if (h5.d0.D(i12)) {
            i13 = h5.d0.x(i12, i11);
        } else {
            i13 = -1;
        }
        this.d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f11194a == lVar.f11194a && this.f11195b == lVar.f11195b && this.f11196c == lVar.f11196c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11194a), Integer.valueOf(this.f11195b), Integer.valueOf(this.f11196c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f11194a + ", channelCount=" + this.f11195b + ", encoding=" + this.f11196c + ']';
    }
}
