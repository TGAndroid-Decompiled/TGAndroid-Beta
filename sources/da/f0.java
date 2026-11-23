package da;

import java.util.List;
public final class f0 extends u1 {
    public final int f8006a;
    public final String f8007b;
    public final int f8008c;
    public final int d;
    public final long f8009e;
    public final long f8010f;
    public final long f8011g;
    public final String h;
    public final List f8012i;

    public f0(int i7, String str, int i10, int i11, long j3, long j10, long j11, String str2, List list) {
        this.f8006a = i7;
        this.f8007b = str;
        this.f8008c = i10;
        this.d = i11;
        this.f8009e = j3;
        this.f8010f = j10;
        this.f8011g = j11;
        this.h = str2;
        this.f8012i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f8012i;
            String str2 = f0Var.h;
            if (this.f8006a == f0Var.f8006a && this.f8007b.equals(f0Var.f8007b) && this.f8008c == f0Var.f8008c && this.d == f0Var.d && this.f8009e == f0Var.f8009e && this.f8010f == f0Var.f8010f && this.f8011g == f0Var.f8011g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f8012i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8009e;
        long j10 = this.f8010f;
        long j11 = this.f8011g;
        int hashCode2 = (((((((((((((this.f8006a ^ 1000003) * 1000003) ^ this.f8007b.hashCode()) * 1000003) ^ this.f8008c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f8012i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f8006a + ", processName=" + this.f8007b + ", reasonCode=" + this.f8008c + ", importance=" + this.d + ", pss=" + this.f8009e + ", rss=" + this.f8010f + ", timestamp=" + this.f8011g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f8012i + "}";
    }
}
