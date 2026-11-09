package da;

import java.util.List;
public final class f0 extends u1 {
    public final int f8341a;
    public final String f8342b;
    public final int f8343c;
    public final int d;
    public final long f8344e;
    public final long f8345f;
    public final long f8346g;
    public final String h;
    public final List f8347i;

    public f0(int i7, String str, int i10, int i11, long j3, long j10, long j11, String str2, List list) {
        this.f8341a = i7;
        this.f8342b = str;
        this.f8343c = i10;
        this.d = i11;
        this.f8344e = j3;
        this.f8345f = j10;
        this.f8346g = j11;
        this.h = str2;
        this.f8347i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f8347i;
            String str2 = f0Var.h;
            if (this.f8341a == f0Var.f8341a && this.f8342b.equals(f0Var.f8342b) && this.f8343c == f0Var.f8343c && this.d == f0Var.d && this.f8344e == f0Var.f8344e && this.f8345f == f0Var.f8345f && this.f8346g == f0Var.f8346g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f8347i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8344e;
        long j10 = this.f8345f;
        long j11 = this.f8346g;
        int hashCode2 = (((((((((((((this.f8341a ^ 1000003) * 1000003) ^ this.f8342b.hashCode()) * 1000003) ^ this.f8343c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f8347i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f8341a + ", processName=" + this.f8342b + ", reasonCode=" + this.f8343c + ", importance=" + this.d + ", pss=" + this.f8344e + ", rss=" + this.f8345f + ", timestamp=" + this.f8346g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f8347i + "}";
    }
}
