package c2;

import e2.d0;
import j$.util.Objects;
public final class f {
    public static final f e = new f(-1, -1, -1);
    public final int f4083a;
    public final int f4084b;
    public final int f4085c;
    public final int d;

    public f(int i10, int i11, int i12) {
        int i13;
        this.f4083a = i10;
        this.f4084b = i11;
        this.f4085c = i12;
        if (d0.K(i12)) {
            i13 = d0.t(i12) * i11;
        } else {
            i13 = -1;
        }
        this.d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f4083a == fVar.f4083a && this.f4084b == fVar.f4084b && this.f4085c == fVar.f4085c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4083a), Integer.valueOf(this.f4084b), Integer.valueOf(this.f4085c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f4083a + ", channelCount=" + this.f4084b + ", encoding=" + this.f4085c + ']';
    }
}
