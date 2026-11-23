package bc;

import a8.x9;
public abstract class j {
    public final float f3103a;
    public final float f3104b;

    public j(float f10, float f11) {
        this.f3103a = f10;
        this.f3104b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return x9.a(jVar.f3103a, jVar.f3104b, jVar2.f3103a, jVar2.f3104b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3103a == jVar.f3103a && this.f3104b == jVar.f3104b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3104b) + (Float.floatToIntBits(this.f3103a) * 31);
    }

    public final String toString() {
        return "(" + this.f3103a + ',' + this.f3104b + ')';
    }
}
