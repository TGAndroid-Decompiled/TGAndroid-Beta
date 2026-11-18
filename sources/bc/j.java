package bc;

import a8.w9;
public abstract class j {
    public final float f3132a;
    public final float f3133b;

    public j(float f10, float f11) {
        this.f3132a = f10;
        this.f3133b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return w9.a(jVar.f3132a, jVar.f3133b, jVar2.f3132a, jVar2.f3133b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3132a == jVar.f3132a && this.f3133b == jVar.f3133b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3133b) + (Float.floatToIntBits(this.f3132a) * 31);
    }

    public final String toString() {
        return "(" + this.f3132a + ',' + this.f3133b + ')';
    }
}
