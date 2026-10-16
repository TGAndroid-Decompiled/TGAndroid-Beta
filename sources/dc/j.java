package dc;

import v7.f7;
public abstract class j {
    public final float f6486a;
    public final float f6487b;

    public j(float f7, float f10) {
        this.f6486a = f7;
        this.f6487b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return f7.a(jVar.f6486a, jVar.f6487b, jVar2.f6486a, jVar2.f6487b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f6486a == jVar.f6486a && this.f6487b == jVar.f6487b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6487b) + (Float.floatToIntBits(this.f6486a) * 31);
    }

    public final String toString() {
        return "(" + this.f6486a + ',' + this.f6487b + ')';
    }
}
