package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14646a;
    public final long f14647b;
    public final j f14648c;
    public final Integer d;
    public final String f14649e;
    public final ArrayList f14650f;

    public l(long j3, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f14660a;
        this.f14646a = j3;
        this.f14647b = j10;
        this.f14648c = jVar;
        this.d = num;
        this.f14649e = str;
        this.f14650f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f14660a;
                ArrayList arrayList = lVar.f14650f;
                String str = lVar.f14649e;
                Integer num = lVar.d;
                j jVar = lVar.f14648c;
                if (this.f14646a == lVar.f14646a && this.f14647b == lVar.f14647b && this.f14648c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f14649e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f14650f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f14646a;
        long j10 = this.f14647b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14648c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f14649e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return w.f14660a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f14650f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14646a + ", requestUptimeMs=" + this.f14647b + ", clientInfo=" + this.f14648c + ", logSource=" + this.d + ", logSourceName=" + this.f14649e + ", logEvents=" + this.f14650f + ", qosTier=" + w.f14660a + "}";
    }
}
