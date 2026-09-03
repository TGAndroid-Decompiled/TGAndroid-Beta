package k9;
public final class s0 extends q1 {
    public final long f10219a;
    public final String f10220b;
    public final String f10221c;
    public final long d;
    public final int e;

    public s0(long j10, String str, String str2, long j11, int i10) {
        this.f10219a = j10;
        this.f10220b = str;
        this.f10221c = str2;
        this.d = j11;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f10221c;
            if (this.f10219a == s0Var.f10219a && this.f10220b.equals(s0Var.f10220b) && ((str = this.f10221c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.e == s0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f10219a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f10220b.hashCode()) * 1000003;
        String str = this.f10221c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j11 = this.d;
        return this.e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f10219a);
        sb.append(", symbol=");
        sb.append(this.f10220b);
        sb.append(", file=");
        sb.append(this.f10221c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return android.support.v4.media.a.m(this.e, "}", sb);
    }
}
