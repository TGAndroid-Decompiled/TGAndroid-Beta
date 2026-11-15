package da;
public final class r0 extends c2 {
    public final int f7880a;
    public final String f7881b;
    public final int f7882c;
    public final long d;
    public final long f7883e;
    public final boolean f7884f;
    public final int f7885g;
    public final String h;
    public final String f7886i;

    public r0(int i7, String str, int i10, long j3, long j10, boolean z10, int i11, String str2, String str3) {
        this.f7880a = i7;
        this.f7881b = str;
        this.f7882c = i10;
        this.d = j3;
        this.f7883e = j10;
        this.f7884f = z10;
        this.f7885g = i11;
        this.h = str2;
        this.f7886i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f7880a == r0Var.f7880a && this.f7881b.equals(r0Var.f7881b) && this.f7882c == r0Var.f7882c && this.d == r0Var.d && this.f7883e == r0Var.f7883e && this.f7884f == r0Var.f7884f && this.f7885g == r0Var.f7885g && this.h.equals(r0Var.h) && this.f7886i.equals(r0Var.f7886i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j3 = this.d;
        long j10 = this.f7883e;
        int hashCode = (((((((((this.f7880a ^ 1000003) * 1000003) ^ this.f7881b.hashCode()) * 1000003) ^ this.f7882c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f7884f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f7885g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f7886i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f7880a);
        sb2.append(", model=");
        sb2.append(this.f7881b);
        sb2.append(", cores=");
        sb2.append(this.f7882c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.f7883e);
        sb2.append(", simulator=");
        sb2.append(this.f7884f);
        sb2.append(", state=");
        sb2.append(this.f7885g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a8.p0.s(sb2, this.f7886i, "}");
    }
}
