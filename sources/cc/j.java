package cc;

import v7.z6;
public abstract class j {
    public final float f4553a;
    public final float f4554b;

    public j(float f7, float f10) {
        this.f4553a = f7;
        this.f4554b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z6.a(jVar.f4553a, jVar.f4554b, jVar2.f4553a, jVar2.f4554b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4553a == jVar.f4553a && this.f4554b == jVar.f4554b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4554b) + (Float.floatToIntBits(this.f4553a) * 31);
    }

    public final String toString() {
        return "(" + this.f4553a + ',' + this.f4554b + ')';
    }
}
