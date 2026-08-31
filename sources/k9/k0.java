package k9;
public final class k0 extends m1 {
    public final int f10929a;
    public final String f10930b;
    public final int f10931c;
    public final long d;
    public final long f10932e;
    public final boolean f10933f;
    public final int f10934g;
    public final String h;
    public final String f10935i;

    public k0(int i10, String str, int i11, long j10, long j11, boolean z4, int i12, String str2, String str3) {
        this.f10929a = i10;
        this.f10930b = str;
        this.f10931c = i11;
        this.d = j10;
        this.f10932e = j11;
        this.f10933f = z4;
        this.f10934g = i12;
        this.h = str2;
        this.f10935i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f10929a == k0Var.f10929a && this.f10930b.equals(k0Var.f10930b) && this.f10931c == k0Var.f10931c && this.d == k0Var.d && this.f10932e == k0Var.f10932e && this.f10933f == k0Var.f10933f && this.f10934g == k0Var.f10934g && this.h.equals(k0Var.h) && this.f10935i.equals(k0Var.f10935i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.d;
        long j11 = this.f10932e;
        int hashCode = (((((((((this.f10929a ^ 1000003) * 1000003) ^ this.f10930b.hashCode()) * 1000003) ^ this.f10931c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f10933f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f10934g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f10935i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f10929a);
        sb.append(", model=");
        sb.append(this.f10930b);
        sb.append(", cores=");
        sb.append(this.f10931c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.f10932e);
        sb.append(", simulator=");
        sb.append(this.f10933f);
        sb.append(", state=");
        sb.append(this.f10934g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return android.support.v4.media.a.r(sb, this.f10935i, "}");
    }
}
