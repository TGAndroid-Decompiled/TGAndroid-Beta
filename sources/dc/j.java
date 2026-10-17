package dc;

import v7.f7;
public abstract class j {
    public final float f7941a;
    public final float f7942b;

    public j(float f7, float f10) {
        this.f7941a = f7;
        this.f7942b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return f7.a(jVar.f7941a, jVar.f7942b, jVar2.f7941a, jVar2.f7942b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f7941a == jVar.f7941a && this.f7942b == jVar.f7942b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7942b) + (Float.floatToIntBits(this.f7941a) * 31);
    }

    public final String toString() {
        return "(" + this.f7941a + ',' + this.f7942b + ')';
    }
}
