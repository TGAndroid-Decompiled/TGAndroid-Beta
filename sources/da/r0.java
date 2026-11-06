package da;
public final class r0 extends c2 {
    public final int f8490a;
    public final String f8491b;
    public final int f8492c;
    public final long d;
    public final long f8493e;
    public final boolean f8494f;
    public final int f8495g;
    public final String h;
    public final String f8496i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z9, int i11, String str2, String str3) {
        this.f8490a = i7;
        this.f8491b = str;
        this.f8492c = i10;
        this.d = j3;
        this.f8493e = j10;
        this.f8494f = z9;
        this.f8495g = i11;
        this.h = str2;
        this.f8496i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f8490a == r0Var.f8490a && this.f8491b.equals(r0Var.f8491b) && this.f8492c == r0Var.f8492c && this.d == r0Var.d && this.f8493e == r0Var.f8493e && this.f8494f == r0Var.f8494f && this.f8495g == r0Var.f8495g && this.h.equals(r0Var.h) && this.f8496i.equals(r0Var.f8496i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.d;
        long j10 = this.f8493e;
        int hashCode = (((((((((this.f8490a ^ 1000003) * 1000003) ^ this.f8491b.hashCode()) * 1000003) ^ this.f8492c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f8494f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f8495g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8496i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f8490a);
        sb2.append(", model=");
        sb2.append(this.f8491b);
        sb2.append(", cores=");
        sb2.append(this.f8492c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f8493e);
        sb2.append(", simulator=");
        sb2.append(this.f8494f);
        sb2.append(", state=");
        sb2.append(this.f8495g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.f8496i, "}");
    }
}
