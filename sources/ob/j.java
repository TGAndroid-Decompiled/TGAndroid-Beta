package ob;

import k7.n6;
public abstract class j {
    public final float f16517a;
    public final float f16518b;

    public j(float f10, float f11) {
        this.f16517a = f10;
        this.f16518b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return n6.a(jVar.f16517a, jVar.f16518b, jVar2.f16517a, jVar2.f16518b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f16517a == jVar.f16517a && this.f16518b == jVar.f16518b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16518b) + (Float.floatToIntBits(this.f16517a) * 31);
    }

    public final String toString() {
        return "(" + this.f16517a + ',' + this.f16518b + ')';
    }
}
