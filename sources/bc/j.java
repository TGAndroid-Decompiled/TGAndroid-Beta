package bc;

import a8.t9;
public abstract class j {
    public final float f3135a;
    public final float f3136b;

    public j(float f10, float f11) {
        this.f3135a = f10;
        this.f3136b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return t9.a(jVar.f3135a, jVar.f3136b, jVar2.f3135a, jVar2.f3136b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3135a == jVar.f3135a && this.f3136b == jVar.f3136b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3136b) + (Float.floatToIntBits(this.f3135a) * 31);
    }

    public final String toString() {
        return "(" + this.f3135a + ',' + this.f3136b + ')';
    }
}
