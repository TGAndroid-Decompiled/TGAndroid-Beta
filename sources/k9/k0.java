package k9;
public final class k0 extends m1 {
    public final int f10160a;
    public final String f10161b;
    public final int f10162c;
    public final long d;
    public final long e;
    public final boolean f10163f;
    public final int f10164g;
    public final String h;
    public final String f10165i;

    public k0(int i10, String str, int i11, long j10, long j11, boolean z4, int i12, String str2, String str3) {
        this.f10160a = i10;
        this.f10161b = str;
        this.f10162c = i11;
        this.d = j10;
        this.e = j11;
        this.f10163f = z4;
        this.f10164g = i12;
        this.h = str2;
        this.f10165i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            k0 k0Var = (k0) ((m1) obj);
            if (this.f10160a == k0Var.f10160a && this.f10161b.equals(k0Var.f10161b) && this.f10162c == k0Var.f10162c && this.d == k0Var.d && this.e == k0Var.e && this.f10163f == k0Var.f10163f && this.f10164g == k0Var.f10164g && this.h.equals(k0Var.h) && this.f10165i.equals(k0Var.f10165i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.d;
        long j11 = this.e;
        int hashCode = (((((((((this.f10160a ^ 1000003) * 1000003) ^ this.f10161b.hashCode()) * 1000003) ^ this.f10162c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f10163f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f10164g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f10165i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f10160a);
        sb.append(", model=");
        sb.append(this.f10161b);
        sb.append(", cores=");
        sb.append(this.f10162c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", simulator=");
        sb.append(this.f10163f);
        sb.append(", state=");
        sb.append(this.f10164g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return android.support.v4.media.a.r(sb, this.f10165i, "}");
    }
}
