package defpackage;

import j$.util.Objects;
public final class sh7 implements sf7 {
    public final float a;
    public final rh7 b;
    public final rh7 c;

    public sh7(float f, rh7 rh7Var, rh7 rh7Var2) {
        this.a = f;
        this.b = rh7Var;
        this.c = rh7Var2;
    }

    @Override
    public final ko4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sh7)) {
            return false;
        }
        sh7 sh7Var = (sh7) obj;
        if (Float.compare(this.a, sh7Var.a) != 0 || !Objects.equals(this.b, sh7Var.b) || !Objects.equals(this.c, sh7Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        int i2 = 0;
        rh7 rh7Var = this.b;
        if (rh7Var != null) {
            i = rh7Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (floatToIntBits + i) * 31;
        rh7 rh7Var2 = this.c;
        if (rh7Var2 != null) {
            i2 = rh7Var2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }

    @Override
    public final void b(lt6 lt6Var) {
    }
}
