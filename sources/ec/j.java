package ec;

import a8.ic;
public abstract class j {
    public final float f9892a;
    public final float f9893b;

    public j(float f7, float f10) {
        this.f9892a = f7;
        this.f9893b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return ic.a(jVar.f9892a, jVar.f9893b, jVar2.f9892a, jVar2.f9893b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f9892a == jVar.f9892a && this.f9893b == jVar.f9893b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9893b) + (Float.floatToIntBits(this.f9892a) * 31);
    }

    public final String toString() {
        return "(" + this.f9892a + ',' + this.f9893b + ')';
    }
}
