package defpackage;
public final class tib {
    public final int a;
    public final int b;

    public tib(int i, int i2) {
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
        if (obj == null || tib.class != obj.getClass()) {
            return false;
        }
        tib tibVar = (tib) obj;
        if (this.b == tibVar.b && this.a == tibVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
