package o4;
public class u {
    public final Object f16579a;
    public final int f16580b;
    public final int f16581c;
    public final long d;
    public final int f16582e;

    public u(Object obj) {
        this(obj, -1L);
    }

    public final boolean a() {
        if (this.f16580b != -1) {
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
        if (this.f16579a.equals(uVar.f16579a) && this.f16580b == uVar.f16580b && this.f16581c == uVar.f16581c && this.d == uVar.d && this.f16582e == uVar.f16582e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f16579a.hashCode() + 527) * 31) + this.f16580b) * 31) + this.f16581c) * 31) + ((int) this.d)) * 31) + this.f16582e;
    }

    public u(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public u(u uVar) {
        this.f16579a = uVar.f16579a;
        this.f16580b = uVar.f16580b;
        this.f16581c = uVar.f16581c;
        this.d = uVar.d;
        this.f16582e = uVar.f16582e;
    }

    public u(int i10, int i11, int i12, long j10, Object obj) {
        this.f16579a = obj;
        this.f16580b = i10;
        this.f16581c = i11;
        this.d = j10;
        this.f16582e = i12;
    }
}
