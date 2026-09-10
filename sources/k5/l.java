package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f12329a;
    public final long f12330b;
    public final j f12331c;
    public final Integer d;
    public final String e;
    public final ArrayList f12332f;

    public l(long j3, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f12342a;
        this.f12329a = j3;
        this.f12330b = j10;
        this.f12331c = jVar;
        this.d = num;
        this.e = str;
        this.f12332f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f12342a;
                ArrayList arrayList = lVar.f12332f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f12331c;
                if (this.f12329a == lVar.f12329a && this.f12330b == lVar.f12330b && this.f12331c.equals(jVar)) {
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
                    if (this.f12332f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f12329a;
        long j10 = this.f12330b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f12331c.hashCode()) * 1000003;
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
        return w.f12342a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f12332f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f12329a + ", requestUptimeMs=" + this.f12330b + ", clientInfo=" + this.f12331c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f12332f + ", qosTier=" + w.f12342a + "}";
    }
}
