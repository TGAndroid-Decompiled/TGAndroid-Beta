package k9;
public final class s0 extends q1 {
    public final long f10239a;
    public final String f10240b;
    public final String f10241c;
    public final long d;
    public final int e;

    public s0(long j10, String str, String str2, long j11, int i10) {
        this.f10239a = j10;
        this.f10240b = str;
        this.f10241c = str2;
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
            String str2 = s0Var.f10241c;
            if (this.f10239a == s0Var.f10239a && this.f10240b.equals(s0Var.f10240b) && ((str = this.f10241c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.e == s0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f10239a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f10240b.hashCode()) * 1000003;
        String str = this.f10241c;
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
        sb.append(this.f10239a);
        sb.append(", symbol=");
        sb.append(this.f10240b);
        sb.append(", file=");
        sb.append(this.f10241c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return android.support.v4.media.a.m(this.e, "}", sb);
    }
}
