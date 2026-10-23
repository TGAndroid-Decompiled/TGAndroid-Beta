package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14993a;
    public final long f14994b;
    public final j f14995c;
    public final Integer d;
    public final String e;
    public final ArrayList f14996f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f15006a;
        this.f14993a = j10;
        this.f14994b = j11;
        this.f14995c = jVar;
        this.d = num;
        this.e = str;
        this.f14996f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f15006a;
                ArrayList arrayList = lVar.f14996f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f14995c;
                if (this.f14993a == lVar.f14993a && this.f14994b == lVar.f14994b && this.f14995c.equals(jVar)) {
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
                    if (this.f14996f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f14993a;
        long j11 = this.f14994b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f14995c.hashCode()) * 1000003;
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
        return ((((i11 ^ i10) * 1000003) ^ this.f14996f.hashCode()) * 1000003) ^ w.f15006a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14993a + ", requestUptimeMs=" + this.f14994b + ", clientInfo=" + this.f14995c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f14996f + ", qosTier=" + w.f15006a + "}";
    }
}
