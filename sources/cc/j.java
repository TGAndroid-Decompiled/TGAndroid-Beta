package cc;

import v7.z6;
public abstract class j {
    public final float f4602a;
    public final float f4603b;

    public j(float f7, float f10) {
        this.f4602a = f7;
        this.f4603b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z6.a(jVar.f4602a, jVar.f4603b, jVar2.f4602a, jVar2.f4603b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4602a == jVar.f4602a && this.f4603b == jVar.f4603b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4603b) + (Float.floatToIntBits(this.f4602a) * 31);
    }

    public final String toString() {
        return "(" + this.f4602a + ',' + this.f4603b + ')';
    }
}
