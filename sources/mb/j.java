package mb;

import i7.z5;
public abstract class j {
    public final float f16969a;
    public final float f16970b;

    public j(float f9, float f10) {
        this.f16969a = f9;
        this.f16970b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z5.a(jVar.f16969a, jVar.f16970b, jVar2.f16969a, jVar2.f16970b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f16969a == jVar.f16969a && this.f16970b == jVar.f16970b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16970b) + (Float.floatToIntBits(this.f16969a) * 31);
    }

    public final String toString() {
        return "(" + this.f16969a + ',' + this.f16970b + ')';
    }
}
