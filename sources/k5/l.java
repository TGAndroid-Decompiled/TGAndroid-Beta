package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14676a;
    public final long f14677b;
    public final j f14678c;
    public final Integer d;
    public final String f14679e;
    public final ArrayList f14680f;

    public l(long j3, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f14690a;
        this.f14676a = j3;
        this.f14677b = j10;
        this.f14678c = jVar;
        this.d = num;
        this.f14679e = str;
        this.f14680f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f14690a;
                ArrayList arrayList = lVar.f14680f;
                String str = lVar.f14679e;
                Integer num = lVar.d;
                j jVar = lVar.f14678c;
                if (this.f14676a == lVar.f14676a && this.f14677b == lVar.f14677b && this.f14678c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f14679e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f14680f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f14676a;
        long j10 = this.f14677b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14678c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f14679e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((i11 ^ i10) * 1000003) ^ this.f14680f.hashCode()) * 1000003) ^ w.f14690a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14676a + ", requestUptimeMs=" + this.f14677b + ", clientInfo=" + this.f14678c + ", logSource=" + this.d + ", logSourceName=" + this.f14679e + ", logEvents=" + this.f14680f + ", qosTier=" + w.f14690a + "}";
    }
}
