package da;

import java.util.List;
public final class f0 extends u1 {
    public final int f8041a;
    public final String f8042b;
    public final int f8043c;
    public final int d;
    public final long f8044e;
    public final long f8045f;
    public final long f8046g;
    public final String h;
    public final List f8047i;

    public f0(int i7, String str, int i10, int i11, long j3, long j10, long j11, String str2, List list) {
        this.f8041a = i7;
        this.f8042b = str;
        this.f8043c = i10;
        this.d = i11;
        this.f8044e = j3;
        this.f8045f = j10;
        this.f8046g = j11;
        this.h = str2;
        this.f8047i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f8047i;
            String str2 = f0Var.h;
            if (this.f8041a == f0Var.f8041a && this.f8042b.equals(f0Var.f8042b) && this.f8043c == f0Var.f8043c && this.d == f0Var.d && this.f8044e == f0Var.f8044e && this.f8045f == f0Var.f8045f && this.f8046g == f0Var.f8046g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f8047i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8044e;
        long j10 = this.f8045f;
        long j11 = this.f8046g;
        int hashCode2 = (((((((((((((this.f8041a ^ 1000003) * 1000003) ^ this.f8042b.hashCode()) * 1000003) ^ this.f8043c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f8047i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f8041a + ", processName=" + this.f8042b + ", reasonCode=" + this.f8043c + ", importance=" + this.d + ", pss=" + this.f8044e + ", rss=" + this.f8045f + ", timestamp=" + this.f8046g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f8047i + "}";
    }
}
