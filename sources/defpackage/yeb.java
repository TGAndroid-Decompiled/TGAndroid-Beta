package defpackage;
public final class yeb {
    public final int a;
    public final int b;

    public yeb(int i, int i2) {
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
        if (obj == null || yeb.class != obj.getClass()) {
            return false;
        }
        yeb yebVar = (yeb) obj;
        if (this.b == yebVar.b && this.a == yebVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
