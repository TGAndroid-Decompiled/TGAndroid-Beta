package dc;

import v7.f7;
public abstract class j {
    public final float f7939a;
    public final float f7940b;

    public j(float f7, float f10) {
        this.f7939a = f7;
        this.f7940b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return f7.a(jVar.f7939a, jVar.f7940b, jVar2.f7939a, jVar2.f7940b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f7939a == jVar.f7939a && this.f7940b == jVar.f7940b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7940b) + (Float.floatToIntBits(this.f7939a) * 31);
    }

    public final String toString() {
        return "(" + this.f7939a + ',' + this.f7940b + ')';
    }
}
