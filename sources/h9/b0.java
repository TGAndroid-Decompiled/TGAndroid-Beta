package h9;

import java.util.List;

public final class b0 extends g1 {

    public final int f8638a;

    public final String f8639b;

    public final int f8640c;
    public final int d;

    public final long f8641e;

    public final long f8642f;

    public final long f8643g;
    public final String h;

    public final List f8644i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f8638a = i10;
        this.f8639b = str;
        this.f8640c = i11;
        this.d = i12;
        this.f8641e = j10;
        this.f8642f = j11;
        this.f8643g = j12;
        this.h = str2;
        this.f8644i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f8644i;
            String str2 = b0Var.h;
            if (this.f8638a == b0Var.f8638a && this.f8639b.equals(b0Var.f8639b) && this.f8640c == b0Var.f8640c && this.d == b0Var.d && this.f8641e == b0Var.f8641e && this.f8642f == b0Var.f8642f && this.f8643g == b0Var.f8643g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f8644i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f8638a ^ 1000003) * 1000003) ^ this.f8639b.hashCode()) * 1000003) ^ this.f8640c) * 1000003) ^ this.d) * 1000003;
        long j10 = this.f8641e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f8642f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f8643g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f8644i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f8638a + ", processName=" + this.f8639b + ", reasonCode=" + this.f8640c + ", importance=" + this.d + ", pss=" + this.f8641e + ", rss=" + this.f8642f + ", timestamp=" + this.f8643g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f8644i + "}";
    }
}
