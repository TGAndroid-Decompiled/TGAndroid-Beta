package l5;

import java.util.ArrayList;
public final class l extends s {
    public final long f16905a;
    public final long f16906b;
    public final j f16907c;
    public final Integer d;
    public final String e;
    public final ArrayList f16908f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f16918a;
        this.f16905a = j10;
        this.f16906b = j11;
        this.f16907c = jVar;
        this.d = num;
        this.e = str;
        this.f16908f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f16918a;
                ArrayList arrayList = lVar.f16908f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f16907c;
                if (this.f16905a == lVar.f16905a && this.f16906b == lVar.f16906b && this.f16907c.equals(jVar)) {
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
                    if (this.f16908f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f16905a;
        long j11 = this.f16906b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f16907c.hashCode()) * 1000003;
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
        return ((((i11 ^ i10) * 1000003) ^ this.f16908f.hashCode()) * 1000003) ^ w.f16918a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f16905a + ", requestUptimeMs=" + this.f16906b + ", clientInfo=" + this.f16907c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f16908f + ", qosTier=" + w.f16918a + "}";
    }
}
