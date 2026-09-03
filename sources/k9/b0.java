package k9;

import java.util.List;
public final class b0 extends g1 {
    public final int f10064a;
    public final String f10065b;
    public final int f10066c;
    public final int d;
    public final long e;
    public final long f10067f;
    public final long f10068g;
    public final String h;
    public final List f10069i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f10064a = i10;
        this.f10065b = str;
        this.f10066c = i11;
        this.d = i12;
        this.e = j10;
        this.f10067f = j11;
        this.f10068g = j12;
        this.h = str2;
        this.f10069i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f10069i;
            String str2 = b0Var.h;
            if (this.f10064a == b0Var.f10064a && this.f10065b.equals(b0Var.f10065b) && this.f10066c == b0Var.f10066c && this.d == b0Var.d && this.e == b0Var.e && this.f10067f == b0Var.f10067f && this.f10068g == b0Var.f10068g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f10069i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f10067f;
        long j12 = this.f10068g;
        int hashCode2 = (((((((((((((this.f10064a ^ 1000003) * 1000003) ^ this.f10065b.hashCode()) * 1000003) ^ this.f10066c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f10069i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f10064a + ", processName=" + this.f10065b + ", reasonCode=" + this.f10066c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f10067f + ", timestamp=" + this.f10068g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f10069i + "}";
    }
}
