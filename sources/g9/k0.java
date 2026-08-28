package g9;
public final class k0 extends m1 {
    public final int f7574a;
    public final String f7575b;
    public final int f7576c;
    public final long d;
    public final long f7577e;
    public final boolean f7578f;
    public final int f7579g;
    public final String h;
    public final String f7580i;

    public k0(int i9, String str, int i10, long j10, long j11, boolean z10, int i11, String str2, String str3) {
        this.f7574a = i9;
        this.f7575b = str;
        this.f7576c = i10;
        this.d = j10;
        this.f7577e = j11;
        this.f7578f = z10;
        this.f7579g = i11;
        this.h = str2;
        this.f7580i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f7574a == k0Var.f7574a && this.f7575b.equals(k0Var.f7575b) && this.f7576c == k0Var.f7576c && this.d == k0Var.d && this.f7577e == k0Var.f7577e && this.f7578f == k0Var.f7578f && this.f7579g == k0Var.f7579g && this.h.equals(k0Var.h) && this.f7580i.equals(k0Var.f7580i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        long j10 = this.d;
        long j11 = this.f7577e;
        int hashCode = (((((((((this.f7574a ^ 1000003) * 1000003) ^ this.f7575b.hashCode()) * 1000003) ^ this.f7576c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f7578f) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return ((((((hashCode ^ i9) * 1000003) ^ this.f7579g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f7580i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f7574a);
        sb2.append(", model=");
        sb2.append(this.f7575b);
        sb2.append(", cores=");
        sb2.append(this.f7576c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f7577e);
        sb2.append(", simulator=");
        sb2.append(this.f7578f);
        sb2.append(", state=");
        sb2.append(this.f7579g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return aa.d.r(sb2, this.f7580i, "}");
    }
}
