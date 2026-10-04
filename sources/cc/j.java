package cc;

import v7.z6;
public abstract class j {
    public final float f4554a;
    public final float f4555b;

    public j(float f7, float f10) {
        this.f4554a = f7;
        this.f4555b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z6.a(jVar.f4554a, jVar.f4555b, jVar2.f4554a, jVar2.f4555b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4554a == jVar.f4554a && this.f4555b == jVar.f4555b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4555b) + (Float.floatToIntBits(this.f4554a) * 31);
    }

    public final String toString() {
        return "(" + this.f4554a + ',' + this.f4555b + ')';
    }
}
