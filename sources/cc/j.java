package cc;

import v7.a7;
public abstract class j {
    public final float f4629a;
    public final float f4630b;

    public j(float f7, float f10) {
        this.f4629a = f7;
        this.f4630b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return a7.a(jVar.f4629a, jVar.f4630b, jVar2.f4629a, jVar2.f4630b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4629a == jVar.f4629a && this.f4630b == jVar.f4630b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4630b) + (Float.floatToIntBits(this.f4629a) * 31);
    }

    public final String toString() {
        return "(" + this.f4629a + ',' + this.f4630b + ')';
    }
}
