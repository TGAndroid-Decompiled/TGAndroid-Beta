package h9;

public final class k0 extends m1 {

    public final int f8745a;

    public final String f8746b;

    public final int f8747c;
    public final long d;

    public final long f8748e;

    public final boolean f8749f;

    public final int f8750g;
    public final String h;

    public final String f8751i;

    public k0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f8745a = i10;
        this.f8746b = str;
        this.f8747c = i11;
        this.d = j10;
        this.f8748e = j11;
        this.f8749f = z10;
        this.f8750g = i12;
        this.h = str2;
        this.f8751i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f8745a == k0Var.f8745a && this.f8746b.equals(k0Var.f8746b) && this.f8747c == k0Var.f8747c && this.d == k0Var.d && this.f8748e == k0Var.f8748e && this.f8749f == k0Var.f8749f && this.f8750g == k0Var.f8750g && this.h.equals(k0Var.h) && this.f8751i.equals(k0Var.f8751i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f8745a ^ 1000003) * 1000003) ^ this.f8746b.hashCode()) * 1000003) ^ this.f8747c) * 1000003;
        long j10 = this.d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f8748e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f8749f ? 1231 : 1237)) * 1000003) ^ this.f8750g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8751i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f8745a);
        sb2.append(", model=");
        sb2.append(this.f8746b);
        sb2.append(", cores=");
        sb2.append(this.f8747c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f8748e);
        sb2.append(", simulator=");
        sb2.append(this.f8749f);
        sb2.append(", state=");
        sb2.append(this.f8750g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a9.p.p(sb2, this.f8751i, "}");
    }
}
