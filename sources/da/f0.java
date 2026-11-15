package da;

import java.util.List;
public final class f0 extends u1 {
    public final int f7730a;
    public final String f7731b;
    public final int f7732c;
    public final int d;
    public final long f7733e;
    public final long f7734f;
    public final long f7735g;
    public final String h;
    public final List f7736i;

    public f0(int i7, String str, int i10, int i11, long j3, long j10, long j11, String str2, List list) {
        this.f7730a = i7;
        this.f7731b = str;
        this.f7732c = i10;
        this.d = i11;
        this.f7733e = j3;
        this.f7734f = j10;
        this.f7735g = j11;
        this.h = str2;
        this.f7736i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f7736i;
            String str2 = f0Var.h;
            if (this.f7730a == f0Var.f7730a && this.f7731b.equals(f0Var.f7731b) && this.f7732c == f0Var.f7732c && this.d == f0Var.d && this.f7733e == f0Var.f7733e && this.f7734f == f0Var.f7734f && this.f7735g == f0Var.f7735g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f7736i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f7733e;
        long j10 = this.f7734f;
        long j11 = this.f7735g;
        int hashCode2 = (((((((((((((this.f7730a ^ 1000003) * 1000003) ^ this.f7731b.hashCode()) * 1000003) ^ this.f7732c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f7736i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f7730a + ", processName=" + this.f7731b + ", reasonCode=" + this.f7732c + ", importance=" + this.d + ", pss=" + this.f7733e + ", rss=" + this.f7734f + ", timestamp=" + this.f7735g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f7736i + "}";
    }
}
