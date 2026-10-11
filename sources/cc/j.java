package cc;

import v7.z6;
public abstract class j {
    public final float f4603a;
    public final float f4604b;

    public j(float f7, float f10) {
        this.f4603a = f7;
        this.f4604b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z6.a(jVar.f4603a, jVar.f4604b, jVar2.f4603a, jVar2.f4604b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4603a == jVar.f4603a && this.f4604b == jVar.f4604b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4604b) + (Float.floatToIntBits(this.f4603a) * 31);
    }

    public final String toString() {
        return "(" + this.f4603a + ',' + this.f4604b + ')';
    }
}
