package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14678a;
    public final long f14679b;
    public final j f14680c;
    public final Integer d;
    public final String f14681e;
    public final ArrayList f14682f;

    public l(long j3, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f14692a;
        this.f14678a = j3;
        this.f14679b = j10;
        this.f14680c = jVar;
        this.d = num;
        this.f14681e = str;
        this.f14682f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f14692a;
                ArrayList arrayList = lVar.f14682f;
                String str = lVar.f14681e;
                Integer num = lVar.d;
                j jVar = lVar.f14680c;
                if (this.f14678a == lVar.f14678a && this.f14679b == lVar.f14679b && this.f14680c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f14681e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f14682f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f14678a;
        long j10 = this.f14679b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14680c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f14681e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((i11 ^ i10) * 1000003) ^ this.f14682f.hashCode()) * 1000003) ^ w.f14692a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14678a + ", requestUptimeMs=" + this.f14679b + ", clientInfo=" + this.f14680c + ", logSource=" + this.d + ", logSourceName=" + this.f14681e + ", logEvents=" + this.f14682f + ", qosTier=" + w.f14692a + "}";
    }
}
