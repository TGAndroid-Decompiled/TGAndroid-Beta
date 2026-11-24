package defpackage;
public abstract class wc9 {
    public final float a;
    public final float b;

    public wc9(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static float a(wc9 wc9Var, wc9 wc9Var2) {
        return oqe.a(wc9Var.a, wc9Var.b, wc9Var2.a, wc9Var2.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wc9) {
            wc9 wc9Var = (wc9) obj;
            if (this.a == wc9Var.a && this.b == wc9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "(" + this.a + ',' + this.b + ')';
    }
}
