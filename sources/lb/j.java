package lb;

import h7.y;

public abstract class j {

    public final float f15529a;

    public final float f15530b;

    public j(float f10, float f11) {
        this.f15529a = f10;
        this.f15530b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return y.a(jVar.f15529a, jVar.f15530b, jVar2.f15529a, jVar2.f15530b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f15529a == jVar.f15529a && this.f15530b == jVar.f15530b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15530b) + (Float.floatToIntBits(this.f15529a) * 31);
    }

    public final String toString() {
        return "(" + this.f15529a + ',' + this.f15530b + ')';
    }
}
