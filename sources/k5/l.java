package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14941a;
    public final long f14942b;
    public final j f14943c;
    public final Integer d;
    public final String e;
    public final ArrayList f14944f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f14954a;
        this.f14941a = j10;
        this.f14942b = j11;
        this.f14943c = jVar;
        this.d = num;
        this.e = str;
        this.f14944f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f14954a;
                ArrayList arrayList = lVar.f14944f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f14943c;
                if (this.f14941a == lVar.f14941a && this.f14942b == lVar.f14942b && this.f14943c.equals(jVar)) {
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
                    if (this.f14944f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f14941a;
        long j11 = this.f14942b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f14943c.hashCode()) * 1000003;
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
        return ((((i11 ^ i10) * 1000003) ^ this.f14944f.hashCode()) * 1000003) ^ w.f14954a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14941a + ", requestUptimeMs=" + this.f14942b + ", clientInfo=" + this.f14943c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f14944f + ", qosTier=" + w.f14954a + "}";
    }
}
