package bc;

import a8.w9;
public abstract class j {
    public final float f3152a;
    public final float f3153b;

    public j(float f10, float f11) {
        this.f3152a = f10;
        this.f3153b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return w9.a(jVar.f3152a, jVar.f3153b, jVar2.f3152a, jVar2.f3153b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3152a == jVar.f3152a && this.f3153b == jVar.f3153b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3153b) + (Float.floatToIntBits(this.f3152a) * 31);
    }

    public final String toString() {
        return "(" + this.f3152a + ',' + this.f3153b + ')';
    }
}
