package da;

import java.util.List;
public final class f0 extends u1 {
    public final int f8346a;
    public final String f8347b;
    public final int f8348c;
    public final int d;
    public final long f8349e;
    public final long f8350f;
    public final long f8351g;
    public final String h;
    public final List f8352i;

    public f0(int i7, String str, int i10, int i11, long j3, long j10, long j11, String str2, List list) {
        this.f8346a = i7;
        this.f8347b = str;
        this.f8348c = i10;
        this.d = i11;
        this.f8349e = j3;
        this.f8350f = j10;
        this.f8351g = j11;
        this.h = str2;
        this.f8352i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f8352i;
            String str2 = f0Var.h;
            if (this.f8346a == f0Var.f8346a && this.f8347b.equals(f0Var.f8347b) && this.f8348c == f0Var.f8348c && this.d == f0Var.d && this.f8349e == f0Var.f8349e && this.f8350f == f0Var.f8350f && this.f8351g == f0Var.f8351g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f8352i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8349e;
        long j10 = this.f8350f;
        long j11 = this.f8351g;
        int hashCode2 = (((((((((((((this.f8346a ^ 1000003) * 1000003) ^ this.f8347b.hashCode()) * 1000003) ^ this.f8348c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f8352i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f8346a + ", processName=" + this.f8347b + ", reasonCode=" + this.f8348c + ", importance=" + this.d + ", pss=" + this.f8349e + ", rss=" + this.f8350f + ", timestamp=" + this.f8351g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f8352i + "}";
    }
}
