package da;

import java.util.List;
public final class f0 extends u1 {
    public final int f8343a;
    public final String f8344b;
    public final int f8345c;
    public final int d;
    public final long f8346e;
    public final long f8347f;
    public final long f8348g;
    public final String h;
    public final List f8349i;

    public f0(int i7, String str, int i10, int i11, long j3, long j10, long j11, String str2, List list) {
        this.f8343a = i7;
        this.f8344b = str;
        this.f8345c = i10;
        this.d = i11;
        this.f8346e = j3;
        this.f8347f = j10;
        this.f8348g = j11;
        this.h = str2;
        this.f8349i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f8349i;
            String str2 = f0Var.h;
            if (this.f8343a == f0Var.f8343a && this.f8344b.equals(f0Var.f8344b) && this.f8345c == f0Var.f8345c && this.d == f0Var.d && this.f8346e == f0Var.f8346e && this.f8347f == f0Var.f8347f && this.f8348g == f0Var.f8348g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f8349i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8346e;
        long j10 = this.f8347f;
        long j11 = this.f8348g;
        int hashCode2 = (((((((((((((this.f8343a ^ 1000003) * 1000003) ^ this.f8344b.hashCode()) * 1000003) ^ this.f8345c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f8349i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f8343a + ", processName=" + this.f8344b + ", reasonCode=" + this.f8345c + ", importance=" + this.d + ", pss=" + this.f8346e + ", rss=" + this.f8347f + ", timestamp=" + this.f8348g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f8349i + "}";
    }
}
