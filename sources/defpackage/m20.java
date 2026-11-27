package defpackage;

import j$.util.Objects;
public final class m20 {
    public static final m20 e = new m20(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public m20(int i, int i2, int i3) {
        int i4;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (gcc.N(i3)) {
            i4 = gcc.u(i3) * i2;
        } else {
            i4 = -1;
        }
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m20)) {
            return false;
        }
        m20 m20Var = (m20) obj;
        if (this.a == m20Var.a && this.b == m20Var.b && this.c == m20Var.c) {
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
