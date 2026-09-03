package o4;
public class u {
    public final Object f16406a;
    public final int f16407b;
    public final int f16408c;
    public final long d;
    public final int e;

    public u(Object obj) {
        this(obj, -1L);
    }

    public final boolean a() {
        if (this.f16407b != -1) {
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
        if (this.f16406a.equals(uVar.f16406a) && this.f16407b == uVar.f16407b && this.f16408c == uVar.f16408c && this.d == uVar.d && this.e == uVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f16406a.hashCode() + 527) * 31) + this.f16407b) * 31) + this.f16408c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public u(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public u(u uVar) {
        this.f16406a = uVar.f16406a;
        this.f16407b = uVar.f16407b;
        this.f16408c = uVar.f16408c;
        this.d = uVar.d;
        this.e = uVar.e;
    }

    public u(int i10, int i11, int i12, long j10, Object obj) {
        this.f16406a = obj;
        this.f16407b = i10;
        this.f16408c = i11;
        this.d = j10;
        this.e = i12;
    }
}
