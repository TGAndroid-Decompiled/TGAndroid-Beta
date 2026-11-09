package da;
public final class r0 extends c2 {
    public final int f8488a;
    public final String f8489b;
    public final int f8490c;
    public final long d;
    public final long f8491e;
    public final boolean f8492f;
    public final int f8493g;
    public final String h;
    public final String f8494i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z9, int i11, String str2, String str3) {
        this.f8488a = i7;
        this.f8489b = str;
        this.f8490c = i10;
        this.d = j3;
        this.f8491e = j10;
        this.f8492f = z9;
        this.f8493g = i11;
        this.h = str2;
        this.f8494i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f8488a == r0Var.f8488a && this.f8489b.equals(r0Var.f8489b) && this.f8490c == r0Var.f8490c && this.d == r0Var.d && this.f8491e == r0Var.f8491e && this.f8492f == r0Var.f8492f && this.f8493g == r0Var.f8493g && this.h.equals(r0Var.h) && this.f8494i.equals(r0Var.f8494i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.d;
        long j10 = this.f8491e;
        int hashCode = (((((((((this.f8488a ^ 1000003) * 1000003) ^ this.f8489b.hashCode()) * 1000003) ^ this.f8490c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f8492f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f8493g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8494i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f8488a);
        sb2.append(", model=");
        sb2.append(this.f8489b);
        sb2.append(", cores=");
        sb2.append(this.f8490c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f8491e);
        sb2.append(", simulator=");
        sb2.append(this.f8492f);
        sb2.append(", state=");
        sb2.append(this.f8493g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.f8494i, "}");
    }
}
