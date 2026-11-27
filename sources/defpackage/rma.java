package defpackage;
public final class rma {
    public static final rma c = new rma(-1, -1);
    public final int a;
    public final int b;

    static {
        new rma(0, 0);
        String str = gcc.a;
    }

    public rma(int i, int i2) {
        boolean z;
        if ((i != -1 && i < 0) || (i2 != -1 && i2 < 0)) {
            z = false;
        } else {
            z = true;
        }
        yve.f(z);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof rma) {
            rma rmaVar = (rma) obj;
            if (this.a == rmaVar.a && this.b == rmaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b ^ ((i << 16) | (i >>> 16));
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
