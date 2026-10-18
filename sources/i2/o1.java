package i2;
public final class o1 {
    public static final o1 f12527c = new o1(0, false);
    public final int f12528a;
    public final boolean f12529b;

    public o1(int i10, boolean z10) {
        this.f12528a = i10;
        this.f12529b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f12528a == o1Var.f12528a && this.f12529b == o1Var.f12529b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12528a << 1) + (this.f12529b ? 1 : 0);
    }
}
