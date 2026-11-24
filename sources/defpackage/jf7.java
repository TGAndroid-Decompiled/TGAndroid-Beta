package defpackage;

import j$.util.Objects;
public final class jf7 implements jd7 {
    public final float a;
    public final if7 b;
    public final if7 c;

    public jf7(float f, if7 if7Var, if7 if7Var2) {
        this.a = f;
        this.b = if7Var;
        this.c = if7Var2;
    }

    @Override
    public final fm4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jf7)) {
            return false;
        }
        jf7 jf7Var = (jf7) obj;
        if (Float.compare(this.a, jf7Var.a) != 0 || !Objects.equals(this.b, jf7Var.b) || !Objects.equals(this.c, jf7Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        int i2 = 0;
        if7 if7Var = this.b;
        if (if7Var != null) {
            i = if7Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (floatToIntBits + i) * 31;
        if7 if7Var2 = this.c;
        if (if7Var2 != null) {
            i2 = if7Var2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }

    @Override
    public final void b(hr6 hr6Var) {
    }
}
