package cc;

import v7.z6;
public abstract class j {
    public final float f4207a;
    public final float f4208b;

    public j(float f7, float f10) {
        this.f4207a = f7;
        this.f4208b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z6.a(jVar.f4207a, jVar.f4208b, jVar2.f4207a, jVar2.f4208b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4207a == jVar.f4207a && this.f4208b == jVar.f4208b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4208b) + (Float.floatToIntBits(this.f4207a) * 31);
    }

    public final String toString() {
        return "(" + this.f4207a + ',' + this.f4208b + ')';
    }
}
