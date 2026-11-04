package ca;

import java.util.List;
public final class f0 extends u1 {
    public final int f4369a;
    public final String f4370b;
    public final int f4371c;
    public final int d;
    public final long f4372e;
    public final long f4373f;
    public final long f4374g;
    public final String h;
    public final List f4375i;

    public f0(int i3, String str, int i10, int i11, long j10, long j11, long j12, String str2, List list) {
        this.f4369a = i3;
        this.f4370b = str;
        this.f4371c = i10;
        this.d = i11;
        this.f4372e = j10;
        this.f4373f = j11;
        this.f4374g = j12;
        this.h = str2;
        this.f4375i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f4375i;
            String str2 = f0Var.h;
            if (this.f4369a == f0Var.f4369a && this.f4370b.equals(f0Var.f4370b) && this.f4371c == f0Var.f4371c && this.d == f0Var.d && this.f4372e == f0Var.f4372e && this.f4373f == f0Var.f4373f && this.f4374g == f0Var.f4374g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((list = this.f4375i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f4372e;
        long j11 = this.f4373f;
        long j12 = this.f4374g;
        int hashCode2 = (((((((((((((this.f4369a ^ 1000003) * 1000003) ^ this.f4370b.hashCode()) * 1000003) ^ this.f4371c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i3 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f4375i;
        if (list != null) {
            i3 = list.hashCode();
        }
        return i10 ^ i3;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f4369a + ", processName=" + this.f4370b + ", reasonCode=" + this.f4371c + ", importance=" + this.d + ", pss=" + this.f4372e + ", rss=" + this.f4373f + ", timestamp=" + this.f4374g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.f4375i + "}";
    }
}
