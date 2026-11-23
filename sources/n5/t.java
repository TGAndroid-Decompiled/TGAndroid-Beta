package n5;

import java.util.ArrayList;
public final class t extends f0 {
    public final long f21402a;
    public final long f21403b;
    public final n f21404c;
    public final Integer d;
    public final String f21405e;
    public final ArrayList f21406f;

    public t(long j3, long j10, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.f21373a;
        this.f21402a = j3;
        this.f21403b = j10;
        this.f21404c = nVar;
        this.d = num;
        this.f21405e = str;
        this.f21406f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f0) {
                t tVar = (t) ((f0) obj);
                Object obj2 = j0.f21373a;
                ArrayList arrayList = tVar.f21406f;
                String str = tVar.f21405e;
                Integer num = tVar.d;
                n nVar = tVar.f21404c;
                if (this.f21402a == tVar.f21402a && this.f21403b == tVar.f21403b && this.f21404c.equals(nVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f21405e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f21406f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f21402a;
        long j10 = this.f21403b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f21404c.hashCode()) * 1000003;
        int i7 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f21405e;
        if (str != null) {
            i7 = str.hashCode();
        }
        return ((((i10 ^ i7) * 1000003) ^ this.f21406f.hashCode()) * 1000003) ^ j0.f21373a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f21402a + ", requestUptimeMs=" + this.f21403b + ", clientInfo=" + this.f21404c + ", logSource=" + this.d + ", logSourceName=" + this.f21405e + ", logEvents=" + this.f21406f + ", qosTier=" + j0.f21373a + "}";
    }
}
