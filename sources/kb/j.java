package kb;

import g7.w;
public abstract class j {
    public final float f14748a;
    public final float f14749b;

    public j(float f10, float f11) {
        this.f14748a = f10;
        this.f14749b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return w.a(jVar.f14748a, jVar.f14749b, jVar2.f14748a, jVar2.f14749b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f14748a == jVar.f14748a && this.f14749b == jVar.f14749b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14749b) + (Float.floatToIntBits(this.f14748a) * 31);
    }

    public final String toString() {
        return "(" + this.f14748a + ',' + this.f14749b + ')';
    }
}
