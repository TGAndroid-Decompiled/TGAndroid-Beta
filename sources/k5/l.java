package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f14146a;
    public final long f14147b;
    public final j f14148c;
    public final Integer d;
    public final String e;
    public final ArrayList f14149f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f14159a;
        this.f14146a = j10;
        this.f14147b = j11;
        this.f14148c = jVar;
        this.d = num;
        this.e = str;
        this.f14149f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f14159a;
                ArrayList arrayList = lVar.f14149f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f14148c;
                if (this.f14146a == lVar.f14146a && this.f14147b == lVar.f14147b && this.f14148c.equals(jVar)) {
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
                    if (this.f14149f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f14146a;
        long j11 = this.f14147b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f14148c.hashCode()) * 1000003;
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
        return ((((i11 ^ i10) * 1000003) ^ this.f14149f.hashCode()) * 1000003) ^ w.f14159a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f14146a + ", requestUptimeMs=" + this.f14147b + ", clientInfo=" + this.f14148c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f14149f + ", qosTier=" + w.f14159a + "}";
    }
}
