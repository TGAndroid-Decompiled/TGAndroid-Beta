package ob;

import k7.n6;
public abstract class j {
    public final float f16535a;
    public final float f16536b;

    public j(float f10, float f11) {
        this.f16535a = f10;
        this.f16536b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return n6.a(jVar.f16535a, jVar.f16536b, jVar2.f16535a, jVar2.f16536b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f16535a == jVar.f16535a && this.f16536b == jVar.f16536b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16536b) + (Float.floatToIntBits(this.f16535a) * 31);
    }

    public final String toString() {
        return "(" + this.f16535a + ',' + this.f16536b + ')';
    }
}
