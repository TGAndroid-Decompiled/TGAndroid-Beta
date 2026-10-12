package dc;

import v7.f7;
public abstract class j {
    public final float f6483a;
    public final float f6484b;

    public j(float f7, float f10) {
        this.f6483a = f7;
        this.f6484b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return f7.a(jVar.f6483a, jVar.f6484b, jVar2.f6483a, jVar2.f6484b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f6483a == jVar.f6483a && this.f6484b == jVar.f6484b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6484b) + (Float.floatToIntBits(this.f6483a) * 31);
    }

    public final String toString() {
        return "(" + this.f6483a + ',' + this.f6484b + ')';
    }
}
