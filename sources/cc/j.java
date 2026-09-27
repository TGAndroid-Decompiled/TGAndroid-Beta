package cc;

import v7.a7;
public abstract class j {
    public final float f4209a;
    public final float f4210b;

    public j(float f7, float f10) {
        this.f4209a = f7;
        this.f4210b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return a7.a(jVar.f4209a, jVar.f4210b, jVar2.f4209a, jVar2.f4210b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4209a == jVar.f4209a && this.f4210b == jVar.f4210b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4210b) + (Float.floatToIntBits(this.f4209a) * 31);
    }

    public final String toString() {
        return "(" + this.f4209a + ',' + this.f4210b + ')';
    }
}
