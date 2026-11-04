package ca;
public final class r0 extends c2 {
    public final int f4516a;
    public final String f4517b;
    public final int f4518c;
    public final long d;
    public final long f4519e;
    public final boolean f4520f;
    public final int f4521g;
    public final String h;
    public final String f4522i;

    public r0(int i3, String str, int i10, long j10, long j11, boolean z10, int i11, String str2, String str3) {
        this.f4516a = i3;
        this.f4517b = str;
        this.f4518c = i10;
        this.d = j10;
        this.f4519e = j11;
        this.f4520f = z10;
        this.f4521g = i11;
        this.h = str2;
        this.f4522i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f4516a == r0Var.f4516a && this.f4517b.equals(r0Var.f4517b) && this.f4518c == r0Var.f4518c && this.d == r0Var.d && this.f4519e == r0Var.f4519e && this.f4520f == r0Var.f4520f && this.f4521g == r0Var.f4521g && this.h.equals(r0Var.h) && this.f4522i.equals(r0Var.f4522i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        long j10 = this.d;
        long j11 = this.f4519e;
        int hashCode = (((((((((this.f4516a ^ 1000003) * 1000003) ^ this.f4517b.hashCode()) * 1000003) ^ this.f4518c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f4520f) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        return ((((((hashCode ^ i3) * 1000003) ^ this.f4521g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f4522i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f4516a);
        sb2.append(", model=");
        sb2.append(this.f4517b);
        sb2.append(", cores=");
        sb2.append(this.f4518c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f4519e);
        sb2.append(", simulator=");
        sb2.append(this.f4520f);
        sb2.append(", state=");
        sb2.append(this.f4521g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.s(sb2, this.f4522i, "}");
    }
}
