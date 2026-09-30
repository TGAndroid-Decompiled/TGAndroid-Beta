package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f13471a;
    public final long f13472b;
    public final j f13473c;
    public final Integer d;
    public final String e;
    public final ArrayList f13474f;

    public l(long j3, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f13484a;
        this.f13471a = j3;
        this.f13472b = j10;
        this.f13473c = jVar;
        this.d = num;
        this.e = str;
        this.f13474f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f13484a;
                ArrayList arrayList = lVar.f13474f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f13473c;
                if (this.f13471a == lVar.f13471a && this.f13472b == lVar.f13472b && this.f13473c.equals(jVar)) {
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
                    if (this.f13474f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f13471a;
        long j10 = this.f13472b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f13473c.hashCode()) * 1000003;
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
        return w.f13484a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f13474f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f13471a + ", requestUptimeMs=" + this.f13472b + ", clientInfo=" + this.f13473c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f13474f + ", qosTier=" + w.f13484a + "}";
    }
}
