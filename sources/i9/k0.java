package i9;
public final class k0 extends m1 {
    public final int f8709a;
    public final String f8710b;
    public final int f8711c;
    public final long d;
    public final long f8712e;
    public final boolean f8713f;
    public final int f8714g;
    public final String h;
    public final String f8715i;

    public k0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f8709a = i10;
        this.f8710b = str;
        this.f8711c = i11;
        this.d = j10;
        this.f8712e = j11;
        this.f8713f = z10;
        this.f8714g = i12;
        this.h = str2;
        this.f8715i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f8709a == k0Var.f8709a && this.f8710b.equals(k0Var.f8710b) && this.f8711c == k0Var.f8711c && this.d == k0Var.d && this.f8712e == k0Var.f8712e && this.f8713f == k0Var.f8713f && this.f8714g == k0Var.f8714g && this.h.equals(k0Var.h) && this.f8715i.equals(k0Var.f8715i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.d;
        long j11 = this.f8712e;
        int hashCode = (((((((((this.f8709a ^ 1000003) * 1000003) ^ this.f8710b.hashCode()) * 1000003) ^ this.f8711c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f8713f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f8714g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8715i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f8709a);
        sb2.append(", model=");
        sb2.append(this.f8710b);
        sb2.append(", cores=");
        sb2.append(this.f8711c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f8712e);
        sb2.append(", simulator=");
        sb2.append(this.f8713f);
        sb2.append(", state=");
        sb2.append(this.f8714g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a4.w.q(sb2, this.f8715i, "}");
    }
}
