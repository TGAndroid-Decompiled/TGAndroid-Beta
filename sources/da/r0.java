package da;
public final class r0 extends c2 {
    public final int f8191a;
    public final String f8192b;
    public final int f8193c;
    public final long d;
    public final long f8194e;
    public final boolean f8195f;
    public final int f8196g;
    public final String h;
    public final String f8197i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z10, int i11, String str2, String str3) {
        this.f8191a = i7;
        this.f8192b = str;
        this.f8193c = i10;
        this.d = j3;
        this.f8194e = j10;
        this.f8195f = z10;
        this.f8196g = i11;
        this.h = str2;
        this.f8197i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f8191a == r0Var.f8191a && this.f8192b.equals(r0Var.f8192b) && this.f8193c == r0Var.f8193c && this.d == r0Var.d && this.f8194e == r0Var.f8194e && this.f8195f == r0Var.f8195f && this.f8196g == r0Var.f8196g && this.h.equals(r0Var.h) && this.f8197i.equals(r0Var.f8197i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.d;
        long j10 = this.f8194e;
        int hashCode = (((((((((this.f8191a ^ 1000003) * 1000003) ^ this.f8192b.hashCode()) * 1000003) ^ this.f8193c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f8195f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f8196g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8197i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f8191a);
        sb2.append(", model=");
        sb2.append(this.f8192b);
        sb2.append(", cores=");
        sb2.append(this.f8193c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f8194e);
        sb2.append(", simulator=");
        sb2.append(this.f8195f);
        sb2.append(", state=");
        sb2.append(this.f8196g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.f8197i, "}");
    }
}
