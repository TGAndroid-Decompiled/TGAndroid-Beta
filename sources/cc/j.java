package cc;

import v7.a7;
public abstract class j {
    public final float f4216a;
    public final float f4217b;

    public j(float f7, float f10) {
        this.f4216a = f7;
        this.f4217b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return a7.a(jVar.f4216a, jVar.f4217b, jVar2.f4216a, jVar2.f4217b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4216a == jVar.f4216a && this.f4217b == jVar.f4217b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4217b) + (Float.floatToIntBits(this.f4216a) * 31);
    }

    public final String toString() {
        return "(" + this.f4216a + ',' + this.f4217b + ')';
    }
}
