package da;

import java.util.List;
public final class f0 extends u1 {
    public final int f8012a;
    public final String f8013b;
    public final int f8014c;
    public final int d;
    public final long f8015e;
    public final long f8016f;
    public final long f8017g;
    public final String h;
    public final List f8018i;

    public f0(int i7, String str, int i10, int i11, long j3, long j10, long j11, String str2, List list) {
        this.f8012a = i7;
        this.f8013b = str;
        this.f8014c = i10;
        this.d = i11;
        this.f8015e = j3;
        this.f8016f = j10;
        this.f8017g = j11;
        this.h = str2;
        this.f8018i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f8018i;
            String str2 = f0Var.h;
            if (this.f8012a == f0Var.f8012a && this.f8013b.equals(f0Var.f8013b) && this.f8014c == f0Var.f8014c && this.d == f0Var.d && this.f8015e == f0Var.f8015e && this.f8016f == f0Var.f8016f && this.f8017g == f0Var.f8017g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f8018i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8015e;
        long j10 = this.f8016f;
        long j11 = this.f8017g;
        int hashCode2 = (((((((((((((this.f8012a ^ 1000003) * 1000003) ^ this.f8013b.hashCode()) * 1000003) ^ this.f8014c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f8018i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f8012a + ", processName=" + this.f8013b + ", reasonCode=" + this.f8014c + ", importance=" + this.d + ", pss=" + this.f8015e + ", rss=" + this.f8016f + ", timestamp=" + this.f8017g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f8018i + "}";
    }
}
