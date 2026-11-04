package m5;

import java.util.ArrayList;
public final class t extends f0 {
    public final long f19163a;
    public final long f19164b;
    public final n f19165c;
    public final Integer d;
    public final String f19166e;
    public final ArrayList f19167f;

    public t(long j10, long j11, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.f19134a;
        this.f19163a = j10;
        this.f19164b = j11;
        this.f19165c = nVar;
        this.d = num;
        this.f19166e = str;
        this.f19167f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f0) {
                t tVar = (t) ((f0) obj);
                Object obj2 = j0.f19134a;
                ArrayList arrayList = tVar.f19167f;
                String str = tVar.f19166e;
                Integer num = tVar.d;
                n nVar = tVar.f19165c;
                if (this.f19163a == tVar.f19163a && this.f19164b == tVar.f19164b && this.f19165c.equals(nVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f19166e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f19167f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j10 = this.f19163a;
        long j11 = this.f19164b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f19165c.hashCode()) * 1000003;
        int i3 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f19166e;
        if (str != null) {
            i3 = str.hashCode();
        }
        return ((((i10 ^ i3) * 1000003) ^ this.f19167f.hashCode()) * 1000003) ^ j0.f19134a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f19163a + ", requestUptimeMs=" + this.f19164b + ", clientInfo=" + this.f19165c + ", logSource=" + this.d + ", logSourceName=" + this.f19166e + ", logEvents=" + this.f19167f + ", qosTier=" + j0.f19134a + "}";
    }
}
