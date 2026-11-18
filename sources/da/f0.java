package da;

import java.util.List;
public final class f0 extends u1 {
    public final int f8015a;
    public final String f8016b;
    public final int f8017c;
    public final int d;
    public final long f8018e;
    public final long f8019f;
    public final long f8020g;
    public final String h;
    public final List f8021i;

    public f0(int i7, String str, int i10, int i11, long j3, long j10, long j11, String str2, List list) {
        this.f8015a = i7;
        this.f8016b = str;
        this.f8017c = i10;
        this.d = i11;
        this.f8018e = j3;
        this.f8019f = j10;
        this.f8020g = j11;
        this.h = str2;
        this.f8021i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f8021i;
            String str2 = f0Var.h;
            if (this.f8015a == f0Var.f8015a && this.f8016b.equals(f0Var.f8016b) && this.f8017c == f0Var.f8017c && this.d == f0Var.d && this.f8018e == f0Var.f8018e && this.f8019f == f0Var.f8019f && this.f8020g == f0Var.f8020g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f8021i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8018e;
        long j10 = this.f8019f;
        long j11 = this.f8020g;
        int hashCode2 = (((((((((((((this.f8015a ^ 1000003) * 1000003) ^ this.f8016b.hashCode()) * 1000003) ^ this.f8017c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f8021i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f8015a + ", processName=" + this.f8016b + ", reasonCode=" + this.f8017c + ", importance=" + this.d + ", pss=" + this.f8018e + ", rss=" + this.f8019f + ", timestamp=" + this.f8020g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f8021i + "}";
    }
}
