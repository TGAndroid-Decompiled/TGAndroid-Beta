package cc;

import v7.z6;
public abstract class j {
    public final float f4210a;
    public final float f4211b;

    public j(float f7, float f10) {
        this.f4210a = f7;
        this.f4211b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return z6.a(jVar.f4210a, jVar.f4211b, jVar2.f4210a, jVar2.f4211b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4210a == jVar.f4210a && this.f4211b == jVar.f4211b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4211b) + (Float.floatToIntBits(this.f4210a) * 31);
    }

    public final String toString() {
        return "(" + this.f4210a + ',' + this.f4211b + ')';
    }
}
