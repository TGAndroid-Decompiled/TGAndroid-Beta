package aa;

import java.util.List;
public final class c0 extends i1 {
    public final int f1043a;
    public final String f1044b;
    public final int f1045c;
    public final int d;
    public final long e;
    public final long f1046f;
    public final long f1047g;
    public final String h;
    public final List f1048i;

    public c0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f1043a = i10;
        this.f1044b = str;
        this.f1045c = i11;
        this.d = i12;
        this.e = j10;
        this.f1046f = j11;
        this.f1047g = j12;
        this.h = str2;
        this.f1048i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            c0 c0Var = (c0) ((i1) obj);
            List list2 = c0Var.f1048i;
            String str2 = c0Var.h;
            if (this.f1043a == c0Var.f1043a && this.f1044b.equals(c0Var.f1044b) && this.f1045c == c0Var.f1045c && this.d == c0Var.d && this.e == c0Var.e && this.f1046f == c0Var.f1046f && this.f1047g == c0Var.f1047g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f1048i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.e;
        long j11 = this.f1046f;
        long j12 = this.f1047g;
        int hashCode2 = (((((((((((((this.f1043a ^ 1000003) * 1000003) ^ this.f1044b.hashCode()) * 1000003) ^ this.f1045c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f1048i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f1043a + ", processName=" + this.f1044b + ", reasonCode=" + this.f1045c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f1046f + ", timestamp=" + this.f1047g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f1048i + "}";
    }
}
