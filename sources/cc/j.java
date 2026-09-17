package cc;

import v7.z6;
public abstract class j {
    public final float f4215a;
    public final float f4216b;

    public j(float f7, float f10) {
        this.f4215a = f7;
        this.f4216b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z6.a(jVar.f4215a, jVar.f4216b, jVar2.f4215a, jVar2.f4216b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4215a == jVar.f4215a && this.f4216b == jVar.f4216b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4216b) + (Float.floatToIntBits(this.f4215a) * 31);
    }

    public final String toString() {
        return "(" + this.f4215a + ',' + this.f4216b + ')';
    }
}
