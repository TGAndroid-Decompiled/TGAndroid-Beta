package da;
public final class r0 extends c2 {
    public final int f8493a;
    public final String f8494b;
    public final int f8495c;
    public final long d;
    public final long f8496e;
    public final boolean f8497f;
    public final int f8498g;
    public final String h;
    public final String f8499i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z9, int i11, String str2, String str3) {
        this.f8493a = i7;
        this.f8494b = str;
        this.f8495c = i10;
        this.d = j3;
        this.f8496e = j10;
        this.f8497f = z9;
        this.f8498g = i11;
        this.h = str2;
        this.f8499i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f8493a == r0Var.f8493a && this.f8494b.equals(r0Var.f8494b) && this.f8495c == r0Var.f8495c && this.d == r0Var.d && this.f8496e == r0Var.f8496e && this.f8497f == r0Var.f8497f && this.f8498g == r0Var.f8498g && this.h.equals(r0Var.h) && this.f8499i.equals(r0Var.f8499i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.d;
        long j10 = this.f8496e;
        int hashCode = (((((((((this.f8493a ^ 1000003) * 1000003) ^ this.f8494b.hashCode()) * 1000003) ^ this.f8495c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f8497f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f8498g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8499i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f8493a);
        sb2.append(", model=");
        sb2.append(this.f8494b);
        sb2.append(", cores=");
        sb2.append(this.f8495c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f8496e);
        sb2.append(", simulator=");
        sb2.append(this.f8497f);
        sb2.append(", state=");
        sb2.append(this.f8498g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.f8499i, "}");
    }
}
