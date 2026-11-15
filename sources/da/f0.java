package da;

import java.util.List;
public final class f0 extends u1 {
    public final int f7733a;
    public final String f7734b;
    public final int f7735c;
    public final int d;
    public final long f7736e;
    public final long f7737f;
    public final long f7738g;
    public final String h;
    public final List f7739i;

    public f0(int i7, String str, int i10, int i11, long j3, long j10, long j11, String str2, List list) {
        this.f7733a = i7;
        this.f7734b = str;
        this.f7735c = i10;
        this.d = i11;
        this.f7736e = j3;
        this.f7737f = j10;
        this.f7738g = j11;
        this.h = str2;
        this.f7739i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f7739i;
            String str2 = f0Var.h;
            if (this.f7733a == f0Var.f7733a && this.f7734b.equals(f0Var.f7734b) && this.f7735c == f0Var.f7735c && this.d == f0Var.d && this.f7736e == f0Var.f7736e && this.f7737f == f0Var.f7737f && this.f7738g == f0Var.f7738g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f7739i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f7736e;
        long j10 = this.f7737f;
        long j11 = this.f7738g;
        int hashCode2 = (((((((((((((this.f7733a ^ 1000003) * 1000003) ^ this.f7734b.hashCode()) * 1000003) ^ this.f7735c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f7739i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f7733a + ", processName=" + this.f7734b + ", reasonCode=" + this.f7735c + ", importance=" + this.d + ", pss=" + this.f7736e + ", rss=" + this.f7737f + ", timestamp=" + this.f7738g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f7739i + "}";
    }
}
