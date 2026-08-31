package ob;

import k7.o6;
public abstract class j {
    public final float f16703a;
    public final float f16704b;

    public j(float f10, float f11) {
        this.f16703a = f10;
        this.f16704b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return o6.a(jVar.f16703a, jVar.f16704b, jVar2.f16703a, jVar2.f16704b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f16703a == jVar.f16703a && this.f16704b == jVar.f16704b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16704b) + (Float.floatToIntBits(this.f16703a) * 31);
    }

    public final String toString() {
        return "(" + this.f16703a + ',' + this.f16704b + ')';
    }
}
