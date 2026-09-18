package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f13484a;
    public final long f13485b;
    public final j f13486c;
    public final Integer d;
    public final String e;
    public final ArrayList f13487f;

    public l(long j3, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f13497a;
        this.f13484a = j3;
        this.f13485b = j10;
        this.f13486c = jVar;
        this.d = num;
        this.e = str;
        this.f13487f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f13497a;
                ArrayList arrayList = lVar.f13487f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f13486c;
                if (this.f13484a == lVar.f13484a && this.f13485b == lVar.f13485b && this.f13486c.equals(jVar)) {
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
                    if (this.f13487f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f13484a;
        long j10 = this.f13485b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f13486c.hashCode()) * 1000003;
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
        return w.f13497a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f13487f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f13484a + ", requestUptimeMs=" + this.f13485b + ", clientInfo=" + this.f13486c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f13487f + ", qosTier=" + w.f13497a + "}";
    }
}
