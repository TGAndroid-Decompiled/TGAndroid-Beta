package da;

import java.util.List;
public final class f0 extends u1 {
    public final int f8007a;
    public final String f8008b;
    public final int f8009c;
    public final int d;
    public final long f8010e;
    public final long f8011f;
    public final long f8012g;
    public final String h;
    public final List f8013i;

    public f0(int i7, String str, int i10, int i11, long j3, long j10, long j11, String str2, List list) {
        this.f8007a = i7;
        this.f8008b = str;
        this.f8009c = i10;
        this.d = i11;
        this.f8010e = j3;
        this.f8011f = j10;
        this.f8012g = j11;
        this.h = str2;
        this.f8013i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f8013i;
            String str2 = f0Var.h;
            if (this.f8007a == f0Var.f8007a && this.f8008b.equals(f0Var.f8008b) && this.f8009c == f0Var.f8009c && this.d == f0Var.d && this.f8010e == f0Var.f8010e && this.f8011f == f0Var.f8011f && this.f8012g == f0Var.f8012g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f8013i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8010e;
        long j10 = this.f8011f;
        long j11 = this.f8012g;
        int hashCode2 = (((((((((((((this.f8007a ^ 1000003) * 1000003) ^ this.f8008b.hashCode()) * 1000003) ^ this.f8009c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f8013i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f8007a + ", processName=" + this.f8008b + ", reasonCode=" + this.f8009c + ", importance=" + this.d + ", pss=" + this.f8010e + ", rss=" + this.f8011f + ", timestamp=" + this.f8012g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f8013i + "}";
    }
}
