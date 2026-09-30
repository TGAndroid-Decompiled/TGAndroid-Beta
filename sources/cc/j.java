package cc;

import v7.a7;
public abstract class j {
    public final float f4214a;
    public final float f4215b;

    public j(float f7, float f10) {
        this.f4214a = f7;
        this.f4215b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return a7.a(jVar.f4214a, jVar.f4215b, jVar2.f4214a, jVar2.f4215b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4214a == jVar.f4214a && this.f4215b == jVar.f4215b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4215b) + (Float.floatToIntBits(this.f4214a) * 31);
    }

    public final String toString() {
        return "(" + this.f4214a + ',' + this.f4215b + ')';
    }
}
