package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14675a;
    public final long f14676b;
    public final j f14677c;
    public final Integer d;
    public final String f14678e;
    public final ArrayList f14679f;

    public l(long j3, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f14689a;
        this.f14675a = j3;
        this.f14676b = j10;
        this.f14677c = jVar;
        this.d = num;
        this.f14678e = str;
        this.f14679f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f14689a;
                ArrayList arrayList = lVar.f14679f;
                String str = lVar.f14678e;
                Integer num = lVar.d;
                j jVar = lVar.f14677c;
                if (this.f14675a == lVar.f14675a && this.f14676b == lVar.f14676b && this.f14677c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f14678e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f14679f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f14675a;
        long j10 = this.f14676b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14677c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f14678e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((i11 ^ i10) * 1000003) ^ this.f14679f.hashCode()) * 1000003) ^ w.f14689a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14675a + ", requestUptimeMs=" + this.f14676b + ", clientInfo=" + this.f14677c + ", logSource=" + this.d + ", logSourceName=" + this.f14678e + ", logEvents=" + this.f14679f + ", qosTier=" + w.f14689a + "}";
    }
}
