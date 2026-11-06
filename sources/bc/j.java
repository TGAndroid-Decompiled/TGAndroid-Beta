package bc;

import a8.r9;
public abstract class j {
    public final float f3180a;
    public final float f3181b;

    public j(float f10, float f11) {
        this.f3180a = f10;
        this.f3181b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return r9.a(jVar.f3180a, jVar.f3181b, jVar2.f3180a, jVar2.f3181b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3180a == jVar.f3180a && this.f3181b == jVar.f3181b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3181b) + (Float.floatToIntBits(this.f3180a) * 31);
    }

    public final String toString() {
        return "(" + this.f3180a + ',' + this.f3181b + ')';
    }
}
