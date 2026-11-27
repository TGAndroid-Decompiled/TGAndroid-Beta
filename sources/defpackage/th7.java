package defpackage;

import j$.util.Objects;
public final class th7 implements tf7 {
    public final float a;
    public final sh7 b;
    public final sh7 c;

    public th7(float f, sh7 sh7Var, sh7 sh7Var2) {
        this.a = f;
        this.b = sh7Var;
        this.c = sh7Var2;
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
        if (!(obj instanceof th7)) {
            return false;
        }
        th7 th7Var = (th7) obj;
        if (Float.compare(this.a, th7Var.a) != 0 || !Objects.equals(this.b, th7Var.b) || !Objects.equals(this.c, th7Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        int i2 = 0;
        sh7 sh7Var = this.b;
        if (sh7Var != null) {
            i = sh7Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (floatToIntBits + i) * 31;
        sh7 sh7Var2 = this.c;
        if (sh7Var2 != null) {
            i2 = sh7Var2.hashCode();
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
