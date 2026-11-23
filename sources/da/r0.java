package da;
public final class r0 extends c2 {
    public final int f8153a;
    public final String f8154b;
    public final int f8155c;
    public final long d;
    public final long f8156e;
    public final boolean f8157f;
    public final int f8158g;
    public final String h;
    public final String f8159i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z10, int i11, String str2, String str3) {
        this.f8153a = i7;
        this.f8154b = str;
        this.f8155c = i10;
        this.d = j3;
        this.f8156e = j10;
        this.f8157f = z10;
        this.f8158g = i11;
        this.h = str2;
        this.f8159i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f8153a == r0Var.f8153a && this.f8154b.equals(r0Var.f8154b) && this.f8155c == r0Var.f8155c && this.d == r0Var.d && this.f8156e == r0Var.f8156e && this.f8157f == r0Var.f8157f && this.f8158g == r0Var.f8158g && this.h.equals(r0Var.h) && this.f8159i.equals(r0Var.f8159i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.d;
        long j10 = this.f8156e;
        int hashCode = (((((((((this.f8153a ^ 1000003) * 1000003) ^ this.f8154b.hashCode()) * 1000003) ^ this.f8155c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f8157f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f8158g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8159i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f8153a);
        sb2.append(", model=");
        sb2.append(this.f8154b);
        sb2.append(", cores=");
        sb2.append(this.f8155c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f8156e);
        sb2.append(", simulator=");
        sb2.append(this.f8157f);
        sb2.append(", state=");
        sb2.append(this.f8158g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.f8159i, "}");
    }
}
