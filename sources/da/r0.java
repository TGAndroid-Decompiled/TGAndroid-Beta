package da;
public final class r0 extends c2 {
    public final int f7877a;
    public final String f7878b;
    public final int f7879c;
    public final long d;
    public final long f7880e;
    public final boolean f7881f;
    public final int f7882g;
    public final String h;
    public final String f7883i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z10, int i11, String str2, String str3) {
        this.f7877a = i7;
        this.f7878b = str;
        this.f7879c = i10;
        this.d = j3;
        this.f7880e = j10;
        this.f7881f = z10;
        this.f7882g = i11;
        this.h = str2;
        this.f7883i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f7877a == r0Var.f7877a && this.f7878b.equals(r0Var.f7878b) && this.f7879c == r0Var.f7879c && this.d == r0Var.d && this.f7880e == r0Var.f7880e && this.f7881f == r0Var.f7881f && this.f7882g == r0Var.f7882g && this.h.equals(r0Var.h) && this.f7883i.equals(r0Var.f7883i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.d;
        long j10 = this.f7880e;
        int hashCode = (((((((((this.f7877a ^ 1000003) * 1000003) ^ this.f7878b.hashCode()) * 1000003) ^ this.f7879c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f7881f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f7882g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f7883i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f7877a);
        sb2.append(", model=");
        sb2.append(this.f7878b);
        sb2.append(", cores=");
        sb2.append(this.f7879c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f7880e);
        sb2.append(", simulator=");
        sb2.append(this.f7881f);
        sb2.append(", state=");
        sb2.append(this.f7882g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.f7883i, "}");
    }
}
