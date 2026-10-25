package aa;
public final class l0 extends o1 {
    public final int f1140a;
    public final String f1141b;
    public final int f1142c;
    public final long d;
    public final long e;
    public final boolean f1143f;
    public final int f1144g;
    public final String h;
    public final String f1145i;

    public l0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f1140a = i10;
        this.f1141b = str;
        this.f1142c = i11;
        this.d = j10;
        this.e = j11;
        this.f1143f = z10;
        this.f1144g = i12;
        this.h = str2;
        this.f1145i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            l0 l0Var = (l0) ((o1) obj);
            if (this.f1140a == l0Var.f1140a && this.f1141b.equals(l0Var.f1141b) && this.f1142c == l0Var.f1142c && this.d == l0Var.d && this.e == l0Var.e && this.f1143f == l0Var.f1143f && this.f1144g == l0Var.f1144g && this.h.equals(l0Var.h) && this.f1145i.equals(l0Var.f1145i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.d;
        long j11 = this.e;
        int hashCode = (((((((((this.f1140a ^ 1000003) * 1000003) ^ this.f1141b.hashCode()) * 1000003) ^ this.f1142c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f1143f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f1144g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f1145i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f1140a);
        sb2.append(", model=");
        sb2.append(this.f1141b);
        sb2.append(", cores=");
        sb2.append(this.f1142c);
        sb2.append(", ram=");
        sb2.append(this.d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f1143f);
        sb2.append(", state=");
        sb2.append(this.f1144g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return a1.g.s(sb2, this.f1145i, "}");
    }
}
