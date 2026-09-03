package ob;

import k7.o6;
public abstract class j {
    public final float f16705a;
    public final float f16706b;

    public j(float f10, float f11) {
        this.f16705a = f10;
        this.f16706b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return o6.a(jVar.f16705a, jVar.f16706b, jVar2.f16705a, jVar2.f16706b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f16705a == jVar.f16705a && this.f16706b == jVar.f16706b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16706b) + (Float.floatToIntBits(this.f16705a) * 31);
    }

    public final String toString() {
        return "(" + this.f16705a + ',' + this.f16706b + ')';
    }
}
