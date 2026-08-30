package k9;
public final class k0 extends m1 {
    public final int f10180a;
    public final String f10181b;
    public final int f10182c;
    public final long d;
    public final long e;
    public final boolean f10183f;
    public final int f10184g;
    public final String h;
    public final String f10185i;

    public k0(int i10, String str, int i11, long j10, long j11, boolean z4, int i12, String str2, String str3) {
        this.f10180a = i10;
        this.f10181b = str;
        this.f10182c = i11;
        this.d = j10;
        this.e = j11;
        this.f10183f = z4;
        this.f10184g = i12;
        this.h = str2;
        this.f10185i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f10180a == k0Var.f10180a && this.f10181b.equals(k0Var.f10181b) && this.f10182c == k0Var.f10182c && this.d == k0Var.d && this.e == k0Var.e && this.f10183f == k0Var.f10183f && this.f10184g == k0Var.f10184g && this.h.equals(k0Var.h) && this.f10185i.equals(k0Var.f10185i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.d;
        long j11 = this.e;
        int hashCode = (((((((((this.f10180a ^ 1000003) * 1000003) ^ this.f10181b.hashCode()) * 1000003) ^ this.f10182c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f10183f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f10184g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f10185i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f10180a);
        sb.append(", model=");
        sb.append(this.f10181b);
        sb.append(", cores=");
        sb.append(this.f10182c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", simulator=");
        sb.append(this.f10183f);
        sb.append(", state=");
        sb.append(this.f10184g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return android.support.v4.media.a.r(sb, this.f10185i, "}");
    }
}
