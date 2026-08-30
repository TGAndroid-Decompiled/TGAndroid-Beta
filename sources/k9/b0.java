package k9;

import java.util.List;
public final class b0 extends g1 {
    public final int f10084a;
    public final String f10085b;
    public final int f10086c;
    public final int d;
    public final long e;
    public final long f10087f;
    public final long f10088g;
    public final String h;
    public final List f10089i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f10084a = i10;
        this.f10085b = str;
        this.f10086c = i11;
        this.d = i12;
        this.e = j10;
        this.f10087f = j11;
        this.f10088g = j12;
        this.h = str2;
        this.f10089i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f10089i;
            String str2 = b0Var.h;
            if (this.f10084a == b0Var.f10084a && this.f10085b.equals(b0Var.f10085b) && this.f10086c == b0Var.f10086c && this.d == b0Var.d && this.e == b0Var.e && this.f10087f == b0Var.f10087f && this.f10088g == b0Var.f10088g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f10089i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f10087f;
        long j12 = this.f10088g;
        int hashCode2 = (((((((((((((this.f10084a ^ 1000003) * 1000003) ^ this.f10085b.hashCode()) * 1000003) ^ this.f10086c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f10089i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f10084a + ", processName=" + this.f10085b + ", reasonCode=" + this.f10086c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f10087f + ", timestamp=" + this.f10088g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f10089i + "}";
    }
}
