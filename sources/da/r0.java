package da;
public final class r0 extends c2 {
    public final int f8159a;
    public final String f8160b;
    public final int f8161c;
    public final long d;
    public final long f8162e;
    public final boolean f8163f;
    public final int f8164g;
    public final String h;
    public final String f8165i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z10, int i11, String str2, String str3) {
        this.f8159a = i7;
        this.f8160b = str;
        this.f8161c = i10;
        this.d = j3;
        this.f8162e = j10;
        this.f8163f = z10;
        this.f8164g = i11;
        this.h = str2;
        this.f8165i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f8159a == r0Var.f8159a && this.f8160b.equals(r0Var.f8160b) && this.f8161c == r0Var.f8161c && this.d == r0Var.d && this.f8162e == r0Var.f8162e && this.f8163f == r0Var.f8163f && this.f8164g == r0Var.f8164g && this.h.equals(r0Var.h) && this.f8165i.equals(r0Var.f8165i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.d;
        long j10 = this.f8162e;
        int hashCode = (((((((((this.f8159a ^ 1000003) * 1000003) ^ this.f8160b.hashCode()) * 1000003) ^ this.f8161c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f8163f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f8164g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8165i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f8159a);
        sb2.append(", model=");
        sb2.append(this.f8160b);
        sb2.append(", cores=");
        sb2.append(this.f8161c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f8162e);
        sb2.append(", simulator=");
        sb2.append(this.f8163f);
        sb2.append(", state=");
        sb2.append(this.f8164g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.f8165i, "}");
    }
}
