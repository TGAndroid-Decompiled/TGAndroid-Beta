package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14814a;
    public final long f14815b;
    public final j f14816c;
    public final Integer d;
    public final String f14817e;
    public final ArrayList f14818f;

    public l(long j3, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f14828a;
        this.f14814a = j3;
        this.f14815b = j10;
        this.f14816c = jVar;
        this.d = num;
        this.f14817e = str;
        this.f14818f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f14828a;
                ArrayList arrayList = lVar.f14818f;
                String str = lVar.f14817e;
                Integer num = lVar.d;
                j jVar = lVar.f14816c;
                if (this.f14814a == lVar.f14814a && this.f14815b == lVar.f14815b && this.f14816c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f14817e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f14818f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f14814a;
        long j10 = this.f14815b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14816c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f14817e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return w.f14828a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f14818f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14814a + ", requestUptimeMs=" + this.f14815b + ", clientInfo=" + this.f14816c + ", logSource=" + this.d + ", logSourceName=" + this.f14817e + ", logEvents=" + this.f14818f + ", qosTier=" + w.f14828a + "}";
    }
}
