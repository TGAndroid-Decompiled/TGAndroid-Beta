package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14679a;
    public final long f14680b;
    public final j f14681c;
    public final Integer d;
    public final String f14682e;
    public final ArrayList f14683f;

    public l(long j3, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f14693a;
        this.f14679a = j3;
        this.f14680b = j10;
        this.f14681c = jVar;
        this.d = num;
        this.f14682e = str;
        this.f14683f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f14693a;
                ArrayList arrayList = lVar.f14683f;
                String str = lVar.f14682e;
                Integer num = lVar.d;
                j jVar = lVar.f14681c;
                if (this.f14679a == lVar.f14679a && this.f14680b == lVar.f14680b && this.f14681c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f14682e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f14683f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f14679a;
        long j10 = this.f14680b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14681c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f14682e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((i11 ^ i10) * 1000003) ^ this.f14683f.hashCode()) * 1000003) ^ w.f14693a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14679a + ", requestUptimeMs=" + this.f14680b + ", clientInfo=" + this.f14681c + ", logSource=" + this.d + ", logSourceName=" + this.f14682e + ", logEvents=" + this.f14683f + ", qosTier=" + w.f14693a + "}";
    }
}
