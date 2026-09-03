package l3;

import java.util.Arrays;
public final class l {
    public static final l e = new l(-1, -1, -1);
    public final int f11304a;
    public final int f11305b;
    public final int f11306c;
    public final int d;

    public l(int i10, int i11, int i12) {
        int i13;
        this.f11304a = i10;
        this.f11305b = i11;
        this.f11306c = i12;
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
        if (this.f11304a == lVar.f11304a && this.f11305b == lVar.f11305b && this.f11306c == lVar.f11306c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11304a), Integer.valueOf(this.f11305b), Integer.valueOf(this.f11306c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f11304a + ", channelCount=" + this.f11305b + ", encoding=" + this.f11306c + ']';
    }
}
