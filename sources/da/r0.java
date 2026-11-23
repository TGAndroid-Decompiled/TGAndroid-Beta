package da;
public final class r0 extends c2 {
    public final int f8154a;
    public final String f8155b;
    public final int f8156c;
    public final long d;
    public final long f8157e;
    public final boolean f8158f;
    public final int f8159g;
    public final String h;
    public final String f8160i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z10, int i11, String str2, String str3) {
        this.f8154a = i7;
        this.f8155b = str;
        this.f8156c = i10;
        this.d = j3;
        this.f8157e = j10;
        this.f8158f = z10;
        this.f8159g = i11;
        this.h = str2;
        this.f8160i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f8154a == r0Var.f8154a && this.f8155b.equals(r0Var.f8155b) && this.f8156c == r0Var.f8156c && this.d == r0Var.d && this.f8157e == r0Var.f8157e && this.f8158f == r0Var.f8158f && this.f8159g == r0Var.f8159g && this.h.equals(r0Var.h) && this.f8160i.equals(r0Var.f8160i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.d;
        long j10 = this.f8157e;
        int hashCode = (((((((((this.f8154a ^ 1000003) * 1000003) ^ this.f8155b.hashCode()) * 1000003) ^ this.f8156c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f8158f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f8159g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8160i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f8154a);
        sb2.append(", model=");
        sb2.append(this.f8155b);
        sb2.append(", cores=");
        sb2.append(this.f8156c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f8157e);
        sb2.append(", simulator=");
        sb2.append(this.f8158f);
        sb2.append(", state=");
        sb2.append(this.f8159g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.f8160i, "}");
    }
}
