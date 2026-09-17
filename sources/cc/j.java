package cc;

import v7.z6;
public abstract class j {
    public final float f4774a;
    public final float f4775b;

    public j(float f7, float f10) {
        this.f4774a = f7;
        this.f4775b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z6.a(jVar.f4774a, jVar.f4775b, jVar2.f4774a, jVar2.f4775b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4774a == jVar.f4774a && this.f4775b == jVar.f4775b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4775b) + (Float.floatToIntBits(this.f4774a) * 31);
    }

    public final String toString() {
        return "(" + this.f4774a + ',' + this.f4775b + ')';
    }
}
