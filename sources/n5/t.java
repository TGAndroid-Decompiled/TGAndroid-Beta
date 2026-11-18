package n5;

import java.util.ArrayList;
public final class t extends f0 {
    public final long f21405a;
    public final long f21406b;
    public final n f21407c;
    public final Integer d;
    public final String f21408e;
    public final ArrayList f21409f;

    public t(long j3, long j10, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.f21376a;
        this.f21405a = j3;
        this.f21406b = j10;
        this.f21407c = nVar;
        this.d = num;
        this.f21408e = str;
        this.f21409f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f0) {
                t tVar = (t) ((f0) obj);
                Object obj2 = j0.f21376a;
                ArrayList arrayList = tVar.f21409f;
                String str = tVar.f21408e;
                Integer num = tVar.d;
                n nVar = tVar.f21407c;
                if (this.f21405a == tVar.f21405a && this.f21406b == tVar.f21406b && this.f21407c.equals(nVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f21408e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f21409f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f21405a;
        long j10 = this.f21406b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f21407c.hashCode()) * 1000003;
        int i7 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f21408e;
        if (str != null) {
            i7 = str.hashCode();
        }
        return ((((i10 ^ i7) * 1000003) ^ this.f21409f.hashCode()) * 1000003) ^ j0.f21376a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f21405a + ", requestUptimeMs=" + this.f21406b + ", clientInfo=" + this.f21407c + ", logSource=" + this.d + ", logSourceName=" + this.f21408e + ", logEvents=" + this.f21409f + ", qosTier=" + j0.f21376a + "}";
    }
}
