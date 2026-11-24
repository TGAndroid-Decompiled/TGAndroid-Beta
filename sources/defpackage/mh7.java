package defpackage;

import j$.util.Objects;
public final class mh7 implements lf7 {
    public final float a;
    public final lh7 b;
    public final lh7 c;

    public mh7(float f, lh7 lh7Var, lh7 lh7Var2) {
        this.a = f;
        this.b = lh7Var;
        this.c = lh7Var2;
    }

    @Override
    public final go4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mh7)) {
            return false;
        }
        mh7 mh7Var = (mh7) obj;
        if (Float.compare(this.a, mh7Var.a) != 0 || !Objects.equals(this.b, mh7Var.b) || !Objects.equals(this.c, mh7Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        int i2 = 0;
        lh7 lh7Var = this.b;
        if (lh7Var != null) {
            i = lh7Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (floatToIntBits + i) * 31;
        lh7 lh7Var2 = this.c;
        if (lh7Var2 != null) {
            i2 = lh7Var2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }

    @Override
    public final void b(ht6 ht6Var) {
    }
}
