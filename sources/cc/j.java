package cc;

import v7.z6;
public abstract class j {
    public final float f4604a;
    public final float f4605b;

    public j(float f7, float f10) {
        this.f4604a = f7;
        this.f4605b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z6.a(jVar.f4604a, jVar.f4605b, jVar2.f4604a, jVar2.f4605b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4604a == jVar.f4604a && this.f4605b == jVar.f4605b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4605b) + (Float.floatToIntBits(this.f4604a) * 31);
    }

    public final String toString() {
        return "(" + this.f4604a + ',' + this.f4605b + ')';
    }
}
