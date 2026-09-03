package o4;
public class u {
    public final Object f16581a;
    public final int f16582b;
    public final int f16583c;
    public final long d;
    public final int f16584e;

    public u(Object obj) {
        this(obj, -1L);
    }

    public final boolean a() {
        if (this.f16582b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f16581a.equals(uVar.f16581a) && this.f16582b == uVar.f16582b && this.f16583c == uVar.f16583c && this.d == uVar.d && this.f16584e == uVar.f16584e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f16581a.hashCode() + 527) * 31) + this.f16582b) * 31) + this.f16583c) * 31) + ((int) this.d)) * 31) + this.f16584e;
    }

    public u(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public u(u uVar) {
        this.f16581a = uVar.f16581a;
        this.f16582b = uVar.f16582b;
        this.f16583c = uVar.f16583c;
        this.d = uVar.d;
        this.f16584e = uVar.f16584e;
    }

    public u(int i10, int i11, int i12, long j10, Object obj) {
        this.f16581a = obj;
        this.f16582b = i10;
        this.f16583c = i11;
        this.d = j10;
        this.f16584e = i12;
    }
}
