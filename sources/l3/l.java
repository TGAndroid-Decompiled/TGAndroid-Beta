package l3;

import java.util.Arrays;
public final class l {
    public static final l f11559e = new l(-1, -1, -1);
    public final int f11560a;
    public final int f11561b;
    public final int f11562c;
    public final int d;

    public l(int i10, int i11, int i12) {
        int i13;
        this.f11560a = i10;
        this.f11561b = i11;
        this.f11562c = i12;
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
        if (this.f11560a == lVar.f11560a && this.f11561b == lVar.f11561b && this.f11562c == lVar.f11562c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11560a), Integer.valueOf(this.f11561b), Integer.valueOf(this.f11562c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f11560a + ", channelCount=" + this.f11561b + ", encoding=" + this.f11562c + ']';
    }
}
