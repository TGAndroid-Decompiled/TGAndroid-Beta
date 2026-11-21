package bc;

import a8.w9;
public abstract class j {
    public final float f3145a;
    public final float f3146b;

    public j(float f10, float f11) {
        this.f3145a = f10;
        this.f3146b = f11;
    }

    public static float a(j jVar, j jVar2) {
        return w9.a(jVar.f3145a, jVar.f3146b, jVar2.f3145a, jVar2.f3146b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f3145a == jVar.f3145a && this.f3146b == jVar.f3146b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3146b) + (Float.floatToIntBits(this.f3145a) * 31);
    }

    public final String toString() {
        return "(" + this.f3145a + ',' + this.f3146b + ')';
    }
}
