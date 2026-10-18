package dc;

import v7.f7;
public abstract class j {
    public final float f7940a;
    public final float f7941b;

    public j(float f7, float f10) {
        this.f7940a = f7;
        this.f7941b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return f7.a(jVar.f7940a, jVar.f7941b, jVar2.f7940a, jVar2.f7941b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f7940a == jVar.f7940a && this.f7941b == jVar.f7941b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7941b) + (Float.floatToIntBits(this.f7940a) * 31);
    }

    public final String toString() {
        return "(" + this.f7940a + ',' + this.f7941b + ')';
    }
}
