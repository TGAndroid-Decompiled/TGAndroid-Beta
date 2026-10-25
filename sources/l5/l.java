package l5;

import java.util.ArrayList;
public final class l extends s {
    public final long f16906a;
    public final long f16907b;
    public final j f16908c;
    public final Integer d;
    public final String e;
    public final ArrayList f16909f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f16919a;
        this.f16906a = j10;
        this.f16907b = j11;
        this.f16908c = jVar;
        this.d = num;
        this.e = str;
        this.f16909f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f16919a;
                ArrayList arrayList = lVar.f16909f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f16908c;
                if (this.f16906a == lVar.f16906a && this.f16907b == lVar.f16907b && this.f16908c.equals(jVar)) {
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
                    if (this.f16909f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f16906a;
        long j11 = this.f16907b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f16908c.hashCode()) * 1000003;
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
        return ((((i11 ^ i10) * 1000003) ^ this.f16909f.hashCode()) * 1000003) ^ w.f16919a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f16906a + ", requestUptimeMs=" + this.f16907b + ", clientInfo=" + this.f16908c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f16909f + ", qosTier=" + w.f16919a + "}";
    }
}
