package da;

import java.util.List;
public final class f0 extends u1 {
    public final int f8044a;
    public final String f8045b;
    public final int f8046c;
    public final int d;
    public final long f8047e;
    public final long f8048f;
    public final long f8049g;
    public final String h;
    public final List f8050i;

    public f0(int i7, String str, int i10, int i11, long j3, long j10, long j11, String str2, List list) {
        this.f8044a = i7;
        this.f8045b = str;
        this.f8046c = i10;
        this.d = i11;
        this.f8047e = j3;
        this.f8048f = j10;
        this.f8049g = j11;
        this.h = str2;
        this.f8050i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f8050i;
            String str2 = f0Var.h;
            if (this.f8044a == f0Var.f8044a && this.f8045b.equals(f0Var.f8045b) && this.f8046c == f0Var.f8046c && this.d == f0Var.d && this.f8047e == f0Var.f8047e && this.f8048f == f0Var.f8048f && this.f8049g == f0Var.f8049g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f8050i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8047e;
        long j10 = this.f8048f;
        long j11 = this.f8049g;
        int hashCode2 = (((((((((((((this.f8044a ^ 1000003) * 1000003) ^ this.f8045b.hashCode()) * 1000003) ^ this.f8046c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f8050i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f8044a + ", processName=" + this.f8045b + ", reasonCode=" + this.f8046c + ", importance=" + this.d + ", pss=" + this.f8047e + ", rss=" + this.f8048f + ", timestamp=" + this.f8049g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f8050i + "}";
    }
}
