package dc;

import v7.f7;
public abstract class j {
    public final float f7951a;
    public final float f7952b;

    public j(float f7, float f10) {
        this.f7951a = f7;
        this.f7952b = f10;
    }

    public static float a(j jVar, j jVar2) {
        return f7.a(jVar.f7951a, jVar.f7952b, jVar2.f7951a, jVar2.f7952b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f7951a == jVar.f7951a && this.f7952b == jVar.f7952b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7952b) + (Float.floatToIntBits(this.f7951a) * 31);
    }

    public final String toString() {
        return "(" + this.f7951a + ',' + this.f7952b + ')';
    }
}
