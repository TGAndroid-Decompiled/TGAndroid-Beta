package n5;

import java.util.ArrayList;
public final class t extends f0 {
    public final long f20480a;
    public final long f20481b;
    public final n f20482c;
    public final Integer d;
    public final String f20483e;
    public final ArrayList f20484f;

    public t(long j3, long j10, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.f20451a;
        this.f20480a = j3;
        this.f20481b = j10;
        this.f20482c = nVar;
        this.d = num;
        this.f20483e = str;
        this.f20484f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f0) {
                t tVar = (t) ((f0) obj);
                Object obj2 = j0.f20451a;
                ArrayList arrayList = tVar.f20484f;
                String str = tVar.f20483e;
                Integer num = tVar.d;
                n nVar = tVar.f20482c;
                if (this.f20480a == tVar.f20480a && this.f20481b == tVar.f20481b && this.f20482c.equals(nVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f20483e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f20484f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f20480a;
        long j10 = this.f20481b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f20482c.hashCode()) * 1000003;
        int i7 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f20483e;
        if (str != null) {
            i7 = str.hashCode();
        }
        return ((((i10 ^ i7) * 1000003) ^ this.f20484f.hashCode()) * 1000003) ^ j0.f20451a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f20480a + ", requestUptimeMs=" + this.f20481b + ", clientInfo=" + this.f20482c + ", logSource=" + this.d + ", logSourceName=" + this.f20483e + ", logEvents=" + this.f20484f + ", qosTier=" + j0.f20451a + "}";
    }
}
