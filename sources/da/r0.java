package da;
public final class r0 extends c2 {
    public final int f8162a;
    public final String f8163b;
    public final int f8164c;
    public final long d;
    public final long f8165e;
    public final boolean f8166f;
    public final int f8167g;
    public final String h;
    public final String f8168i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z10, int i11, String str2, String str3) {
        this.f8162a = i7;
        this.f8163b = str;
        this.f8164c = i10;
        this.d = j3;
        this.f8165e = j10;
        this.f8166f = z10;
        this.f8167g = i11;
        this.h = str2;
        this.f8168i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f8162a == r0Var.f8162a && this.f8163b.equals(r0Var.f8163b) && this.f8164c == r0Var.f8164c && this.d == r0Var.d && this.f8165e == r0Var.f8165e && this.f8166f == r0Var.f8166f && this.f8167g == r0Var.f8167g && this.h.equals(r0Var.h) && this.f8168i.equals(r0Var.f8168i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.d;
        long j10 = this.f8165e;
        int hashCode = (((((((((this.f8162a ^ 1000003) * 1000003) ^ this.f8163b.hashCode()) * 1000003) ^ this.f8164c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f8166f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f8167g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8168i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f8162a);
        sb2.append(", model=");
        sb2.append(this.f8163b);
        sb2.append(", cores=");
        sb2.append(this.f8164c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f8165e);
        sb2.append(", simulator=");
        sb2.append(this.f8166f);
        sb2.append(", state=");
        sb2.append(this.f8167g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.f8168i, "}");
    }
}
