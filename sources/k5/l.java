package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14948a;
    public final long f14949b;
    public final j f14950c;
    public final Integer d;
    public final String e;
    public final ArrayList f14951f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f14961a;
        this.f14948a = j10;
        this.f14949b = j11;
        this.f14950c = jVar;
        this.d = num;
        this.e = str;
        this.f14951f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f14961a;
                ArrayList arrayList = lVar.f14951f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f14950c;
                if (this.f14948a == lVar.f14948a && this.f14949b == lVar.f14949b && this.f14950c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f14951f.equals(arrayList) && obj2.equals(obj2)) {
                        return true;
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
        long j10 = this.f14948a;
        long j11 = this.f14949b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f14950c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((i11 ^ i10) * 1000003) ^ this.f14951f.hashCode()) * 1000003) ^ w.f14961a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14948a + ", requestUptimeMs=" + this.f14949b + ", clientInfo=" + this.f14950c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f14951f + ", qosTier=" + w.f14961a + "}";
    }
}
