package defpackage;
public abstract class ke9 {
    public final float a;
    public final float b;

    public ke9(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static float a(ke9 ke9Var, ke9 ke9Var2) {
        return dte.a(ke9Var.a, ke9Var.b, ke9Var2.a, ke9Var2.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ke9) {
            ke9 ke9Var = (ke9) obj;
            if (this.a == ke9Var.a && this.b == ke9Var.b) {
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
