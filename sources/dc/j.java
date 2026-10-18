package dc;

import v7.f7;
public abstract class j {
    public final float f7942a;
    public final float f7943b;

    public j(float f7, float f10) {
        this.f7942a = f7;
        this.f7943b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return f7.a(jVar.f7942a, jVar.f7943b, jVar2.f7942a, jVar2.f7943b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f7942a == jVar.f7942a && this.f7943b == jVar.f7943b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7943b) + (Float.floatToIntBits(this.f7942a) * 31);
    }

    public final String toString() {
        return "(" + this.f7942a + ',' + this.f7943b + ')';
    }
}
