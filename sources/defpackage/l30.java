package defpackage;

import j$.util.Objects;
public final class l30 {
    public static final l30 e = new l30(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public l30(int i, int i2, int i3) {
        int i4;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (hac.N(i3)) {
            i4 = hac.u(i3) * i2;
        } else {
            i4 = -1;
        }
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l30)) {
            return false;
        }
        l30 l30Var = (l30) obj;
        if (this.a == l30Var.a && this.b == l30Var.b && this.c == l30Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
    }
}
