package defpackage;

import j$.util.Objects;
public final class l20 {
    public static final l20 e = new l20(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public l20(int i, int i2, int i3) {
        int i4;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (g8c.N(i3)) {
            i4 = g8c.u(i3) * i2;
        } else {
            i4 = -1;
        }
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l20)) {
            return false;
        }
        l20 l20Var = (l20) obj;
        if (this.a == l20Var.a && this.b == l20Var.b && this.c == l20Var.c) {
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
