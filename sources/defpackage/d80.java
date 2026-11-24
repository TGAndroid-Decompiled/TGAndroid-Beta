package defpackage;

import java.util.List;
public final class d80 extends hy2 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;

    public d80(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hy2) {
            d80 d80Var = (d80) ((hy2) obj);
            if (this.a == d80Var.a && this.b.equals(d80Var.b) && this.c == d80Var.c && this.d == d80Var.d && this.e == d80Var.e && this.f == d80Var.f && this.g == d80Var.g) {
                String str = d80Var.h;
                String str2 = this.h;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = d80Var.i;
                    List list2 = this.i;
                    if (list2 != null ? list2.equals(list) : list == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        int hashCode2 = (((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        int i = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.i;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }
}
