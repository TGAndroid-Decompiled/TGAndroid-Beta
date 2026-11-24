package defpackage;

import java.util.ArrayList;
public final class ba0 extends zb6 {
    public final long a;
    public final long b;
    public final x70 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public ba0(long j, long j2, x70 x70Var, Integer num, String str, ArrayList arrayList) {
        ev8 ev8Var = ev8.a;
        this.a = j;
        this.b = j2;
        this.c = x70Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof zb6) {
                ba0 ba0Var = (ba0) ((zb6) obj);
                if (this.a == ba0Var.a && this.b == ba0Var.b && this.c.equals(ba0Var.c)) {
                    Integer num = ba0Var.d;
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str = ba0Var.e;
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f.equals(ba0Var.f)) {
                        Object obj2 = ev8.a;
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
        return ((((i2 ^ i) * 1000003) ^ this.f.hashCode()) * 1000003) ^ ev8.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + ev8.a + "}";
    }
}
