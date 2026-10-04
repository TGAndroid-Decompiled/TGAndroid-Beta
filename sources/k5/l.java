package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14647a;
    public final long f14648b;
    public final j f14649c;
    public final Integer d;
    public final String f14650e;
    public final ArrayList f14651f;

    public l(long j3, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f14661a;
        this.f14647a = j3;
        this.f14648b = j10;
        this.f14649c = jVar;
        this.d = num;
        this.f14650e = str;
        this.f14651f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f14661a;
                ArrayList arrayList = lVar.f14651f;
                String str = lVar.f14650e;
                Integer num = lVar.d;
                j jVar = lVar.f14649c;
                if (this.f14647a == lVar.f14647a && this.f14648b == lVar.f14648b && this.f14649c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f14650e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f14651f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f14647a;
        long j10 = this.f14648b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14649c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f14650e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return w.f14661a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f14651f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14647a + ", requestUptimeMs=" + this.f14648b + ", clientInfo=" + this.f14649c + ", logSource=" + this.d + ", logSourceName=" + this.f14650e + ", logEvents=" + this.f14651f + ", qosTier=" + w.f14661a + "}";
    }
}
