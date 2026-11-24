package defpackage;

import java.util.ArrayList;
public final class bb0 extends yd6 {
    public final long a;
    public final long b;
    public final x80 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public bb0(long j, long j2, x80 x80Var, Integer num, String str, ArrayList arrayList) {
        fx8 fx8Var = fx8.a;
        this.a = j;
        this.b = j2;
        this.c = x80Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof yd6) {
                bb0 bb0Var = (bb0) ((yd6) obj);
                if (this.a == bb0Var.a && this.b == bb0Var.b && this.c.equals(bb0Var.c)) {
                    Integer num = bb0Var.d;
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str = bb0Var.e;
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f.equals(bb0Var.f)) {
                        Object obj2 = fx8.a;
                        if (obj2.equals(obj2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        long j2 = this.b;
        int hashCode2 = (((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((i2 ^ i) * 1000003) ^ this.f.hashCode()) * 1000003) ^ fx8.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + fx8.a + "}";
    }
}
