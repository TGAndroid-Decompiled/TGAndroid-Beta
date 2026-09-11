package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14788a;
    public final long f14789b;
    public final j f14790c;
    public final Integer d;
    public final String f14791e;
    public final ArrayList f14792f;

    public l(long j3, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f14802a;
        this.f14788a = j3;
        this.f14789b = j10;
        this.f14790c = jVar;
        this.d = num;
        this.f14791e = str;
        this.f14792f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f14802a;
                ArrayList arrayList = lVar.f14792f;
                String str = lVar.f14791e;
                Integer num = lVar.d;
                j jVar = lVar.f14790c;
                if (this.f14788a == lVar.f14788a && this.f14789b == lVar.f14789b && this.f14790c.equals(jVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f14791e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f14792f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f14788a;
        long j10 = this.f14789b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f14790c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f14791e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return w.f14802a.hashCode() ^ ((((i11 ^ i10) * 1000003) ^ this.f14792f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14788a + ", requestUptimeMs=" + this.f14789b + ", clientInfo=" + this.f14790c + ", logSource=" + this.d + ", logSourceName=" + this.f14791e + ", logEvents=" + this.f14792f + ", qosTier=" + w.f14802a + "}";
    }
}
