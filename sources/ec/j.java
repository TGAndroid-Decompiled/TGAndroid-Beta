package ec;

import a8.ic;
public abstract class j {
    public final float f9891a;
    public final float f9892b;

    public j(float f7, float f10) {
        this.f9891a = f7;
        this.f9892b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return ic.a(jVar.f9891a, jVar.f9892b, jVar2.f9891a, jVar2.f9892b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f9891a == jVar.f9891a && this.f9892b == jVar.f9892b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9892b) + (Float.floatToIntBits(this.f9891a) * 31);
    }

    public final String toString() {
        return "(" + this.f9891a + ',' + this.f9892b + ')';
    }
}
