package g9;

import java.util.List;
public final class b0 extends g1 {
    public final int f7467a;
    public final String f7468b;
    public final int f7469c;
    public final int d;
    public final long f7470e;
    public final long f7471f;
    public final long f7472g;
    public final String h;
    public final List f7473i;

    public b0(int i9, String str, int i10, int i11, long j10, long j11, long j12, String str2, List list) {
        this.f7467a = i9;
        this.f7468b = str;
        this.f7469c = i10;
        this.d = i11;
        this.f7470e = j10;
        this.f7471f = j11;
        this.f7472g = j12;
        this.h = str2;
        this.f7473i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f7473i;
            String str2 = b0Var.h;
            if (this.f7467a == b0Var.f7467a && this.f7468b.equals(b0Var.f7468b) && this.f7469c == b0Var.f7469c && this.d == b0Var.d && this.f7470e == b0Var.f7470e && this.f7471f == b0Var.f7471f && this.f7472g == b0Var.f7472g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f7473i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f7470e;
        long j11 = this.f7471f;
        long j12 = this.f7472g;
        int hashCode2 = (((((((((((((this.f7467a ^ 1000003) * 1000003) ^ this.f7468b.hashCode()) * 1000003) ^ this.f7469c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i9 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f7473i;
        if (list != null) {
            i9 = list.hashCode();
        }
        return i10 ^ i9;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f7467a + ", processName=" + this.f7468b + ", reasonCode=" + this.f7469c + ", importance=" + this.d + ", pss=" + this.f7470e + ", rss=" + this.f7471f + ", timestamp=" + this.f7472g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f7473i + "}";
    }
}
