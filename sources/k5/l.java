package k5;

import java.util.ArrayList;
public final class l extends s {
    public final long f10910a;
    public final long f10911b;
    public final j f10912c;
    public final Integer d;
    public final String e;
    public final ArrayList f10913f;

    public l(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f10923a;
        this.f10910a = j10;
        this.f10911b = j11;
        this.f10912c = jVar;
        this.d = num;
        this.e = str;
        this.f10913f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s) {
                l lVar = (l) ((s) obj);
                Object obj2 = w.f10923a;
                ArrayList arrayList = lVar.f10913f;
                String str = lVar.e;
                Integer num = lVar.d;
                j jVar = lVar.f10912c;
                if (this.f10910a == lVar.f10910a && this.f10911b == lVar.f10911b && this.f10912c.equals(jVar)) {
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
                    if (this.f10913f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f10910a;
        long j11 = this.f10911b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f10912c.hashCode()) * 1000003;
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
        return ((((i11 ^ i10) * 1000003) ^ this.f10913f.hashCode()) * 1000003) ^ w.f10923a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f10910a + ", requestUptimeMs=" + this.f10911b + ", clientInfo=" + this.f10912c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f10913f + ", qosTier=" + w.f10923a + "}";
    }
}
