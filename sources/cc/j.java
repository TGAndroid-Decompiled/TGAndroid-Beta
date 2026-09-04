package cc;

import v7.z6;
public abstract class j {
    public final float f4747a;
    public final float f4748b;

    public j(float f7, float f10) {
        this.f4747a = f7;
        this.f4748b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z6.a(jVar.f4747a, jVar.f4748b, jVar2.f4747a, jVar2.f4748b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4747a == jVar.f4747a && this.f4748b == jVar.f4748b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4748b) + (Float.floatToIntBits(this.f4747a) * 31);
    }

    public final String toString() {
        return "(" + this.f4747a + ',' + this.f4748b + ')';
    }
}
