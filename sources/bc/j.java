package bc;

import a8.t9;
public abstract class j {
    public final float f3138a;
    public final float f3139b;

    public j(float f10, float f11) {
        this.f3138a = f10;
        this.f3139b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return t9.a(jVar.f3138a, jVar.f3139b, jVar2.f3138a, jVar2.f3139b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3138a == jVar.f3138a && this.f3139b == jVar.f3139b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3139b) + (Float.floatToIntBits(this.f3138a) * 31);
    }

    public final String toString() {
        return "(" + this.f3138a + ',' + this.f3139b + ')';
    }
}
