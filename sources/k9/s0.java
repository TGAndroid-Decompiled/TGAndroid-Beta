package k9;
public final class s0 extends q1 {
    public final long f10999a;
    public final String f11000b;
    public final String f11001c;
    public final long d;
    public final int f11002e;

    public s0(long j10, String str, String str2, long j11, int i10) {
        this.f10999a = j10;
        this.f11000b = str;
        this.f11001c = str2;
        this.d = j11;
        this.f11002e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.f11001c;
            if (this.f10999a == s0Var.f10999a && this.f11000b.equals(s0Var.f11000b) && ((str = this.f11001c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.f11002e == s0Var.f11002e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f10999a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f11000b.hashCode()) * 1000003;
        String str = this.f11001c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j11 = this.d;
        return this.f11002e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f10999a);
        sb.append(", symbol=");
        sb.append(this.f11000b);
        sb.append(", file=");
        sb.append(this.f11001c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return android.support.v4.media.a.m(this.f11002e, "}", sb);
    }
}
