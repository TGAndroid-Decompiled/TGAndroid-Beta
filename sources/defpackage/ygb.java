package defpackage;
public final class ygb {
    public final int a;
    public final int b;

    public ygb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ygb.class != obj.getClass()) {
            return false;
        }
        ygb ygbVar = (ygb) obj;
        if (this.b == ygbVar.b && this.a == ygbVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
