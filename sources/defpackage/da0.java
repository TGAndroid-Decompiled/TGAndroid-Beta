package defpackage;

import java.util.ArrayList;
public final class da0 extends de6 {
    public final long a;
    public final long b;
    public final z70 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public da0(long j, long j2, z70 z70Var, Integer num, String str, ArrayList arrayList) {
        py8 py8Var = py8.a;
        this.a = j;
        this.b = j2;
        this.c = z70Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof de6) {
                da0 da0Var = (da0) ((de6) obj);
                if (this.a == da0Var.a && this.b == da0Var.b && this.c.equals(da0Var.c)) {
                    Integer num = da0Var.d;
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str = da0Var.e;
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f.equals(da0Var.f)) {
                        Object obj2 = py8.a;
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
        return ((((i2 ^ i) * 1000003) ^ this.f.hashCode()) * 1000003) ^ py8.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + py8.a + "}";
    }
}
