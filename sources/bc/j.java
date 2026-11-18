package bc;

import a8.w9;
public abstract class j {
    public final float f3133a;
    public final float f3134b;

    public j(float f10, float f11) {
        this.f3133a = f10;
        this.f3134b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return w9.a(jVar.f3133a, jVar.f3134b, jVar2.f3133a, jVar2.f3134b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3133a == jVar.f3133a && this.f3134b == jVar.f3134b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3134b) + (Float.floatToIntBits(this.f3133a) * 31);
    }

    public final String toString() {
        return "(" + this.f3133a + ',' + this.f3134b + ')';
    }
}
