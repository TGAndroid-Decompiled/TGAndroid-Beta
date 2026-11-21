package da;
public final class r0 extends c2 {
    public final int f8188a;
    public final String f8189b;
    public final int f8190c;
    public final long d;
    public final long f8191e;
    public final boolean f8192f;
    public final int f8193g;
    public final String h;
    public final String f8194i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z10, int i11, String str2, String str3) {
        this.f8188a = i7;
        this.f8189b = str;
        this.f8190c = i10;
        this.d = j3;
        this.f8191e = j10;
        this.f8192f = z10;
        this.f8193g = i11;
        this.h = str2;
        this.f8194i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f8188a == r0Var.f8188a && this.f8189b.equals(r0Var.f8189b) && this.f8190c == r0Var.f8190c && this.d == r0Var.d && this.f8191e == r0Var.f8191e && this.f8192f == r0Var.f8192f && this.f8193g == r0Var.f8193g && this.h.equals(r0Var.h) && this.f8194i.equals(r0Var.f8194i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.d;
        long j10 = this.f8191e;
        int hashCode = (((((((((this.f8188a ^ 1000003) * 1000003) ^ this.f8189b.hashCode()) * 1000003) ^ this.f8190c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f8192f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f8193g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8194i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f8188a);
        sb2.append(", model=");
        sb2.append(this.f8189b);
        sb2.append(", cores=");
        sb2.append(this.f8190c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f8191e);
        sb2.append(", simulator=");
        sb2.append(this.f8192f);
        sb2.append(", state=");
        sb2.append(this.f8193g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.f8194i, "}");
    }
}
