package k9;

import java.util.List;
public final class b0 extends g1 {
    public final int f10822a;
    public final String f10823b;
    public final int f10824c;
    public final int d;
    public final long f10825e;
    public final long f10826f;
    public final long f10827g;
    public final String h;
    public final List f10828i;

    public b0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f10822a = i10;
        this.f10823b = str;
        this.f10824c = i11;
        this.d = i12;
        this.f10825e = j10;
        this.f10826f = j11;
        this.f10827g = j12;
        this.h = str2;
        this.f10828i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            b0 b0Var = (b0) ((g1) obj);
            List list2 = b0Var.f10828i;
            String str2 = b0Var.h;
            if (this.f10822a == b0Var.f10822a && this.f10823b.equals(b0Var.f10823b) && this.f10824c == b0Var.f10824c && this.d == b0Var.d && this.f10825e == b0Var.f10825e && this.f10826f == b0Var.f10826f && this.f10827g == b0Var.f10827g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f10828i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f10825e;
        long j11 = this.f10826f;
        long j12 = this.f10827g;
        int hashCode2 = (((((((((((((this.f10822a ^ 1000003) * 1000003) ^ this.f10823b.hashCode()) * 1000003) ^ this.f10824c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f10828i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f10822a + ", processName=" + this.f10823b + ", reasonCode=" + this.f10824c + ", importance=" + this.d + ", pss=" + this.f10825e + ", rss=" + this.f10826f + ", timestamp=" + this.f10827g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f10828i + "}";
    }
}
