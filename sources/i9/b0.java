package i9;

import java.util.List;
public final class b0 extends g1 {
    public final int f8602a;
    public final String f8603b;
    public final int f8604c;
    public final int d;
    public final long f8605e;
    public final long f8606f;
    public final long f8607g;
    public final String h;
    public final List f8608i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f8602a = i10;
        this.f8603b = str;
        this.f8604c = i11;
        this.d = i12;
        this.f8605e = j10;
        this.f8606f = j11;
        this.f8607g = j12;
        this.h = str2;
        this.f8608i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f8608i;
            String str2 = b0Var.h;
            if (this.f8602a == b0Var.f8602a && this.f8603b.equals(b0Var.f8603b) && this.f8604c == b0Var.f8604c && this.d == b0Var.d && this.f8605e == b0Var.f8605e && this.f8606f == b0Var.f8606f && this.f8607g == b0Var.f8607g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f8608i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f8605e;
        long j11 = this.f8606f;
        long j12 = this.f8607g;
        int hashCode2 = (((((((((((((this.f8602a ^ 1000003) * 1000003) ^ this.f8603b.hashCode()) * 1000003) ^ this.f8604c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f8608i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f8602a + ", processName=" + this.f8603b + ", reasonCode=" + this.f8604c + ", importance=" + this.d + ", pss=" + this.f8605e + ", rss=" + this.f8606f + ", timestamp=" + this.f8607g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f8608i + "}";
    }
}
