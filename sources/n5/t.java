package n5;

import java.util.ArrayList;
public final class t extends f0 {
    public final long f20472a;
    public final long f20473b;
    public final n f20474c;
    public final Integer d;
    public final String f20475e;
    public final ArrayList f20476f;

    public t(long j3, long j10, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.f20443a;
        this.f20472a = j3;
        this.f20473b = j10;
        this.f20474c = nVar;
        this.d = num;
        this.f20475e = str;
        this.f20476f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f0) {
                t tVar = (t) ((f0) obj);
                Object obj2 = j0.f20443a;
                ArrayList arrayList = tVar.f20476f;
                String str = tVar.f20475e;
                Integer num = tVar.d;
                n nVar = tVar.f20474c;
                if (this.f20472a == tVar.f20472a && this.f20473b == tVar.f20473b && this.f20474c.equals(nVar)) {
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str2 = this.f20475e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f20476f.equals(arrayList) && obj2.equals(obj2)) {
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
        long j3 = this.f20472a;
        long j10 = this.f20473b;
        int hashCode2 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f20474c.hashCode()) * 1000003;
        int i7 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.f20475e;
        if (str != null) {
            i7 = str.hashCode();
        }
        return ((((i10 ^ i7) * 1000003) ^ this.f20476f.hashCode()) * 1000003) ^ j0.f20443a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f20472a + ", requestUptimeMs=" + this.f20473b + ", clientInfo=" + this.f20474c + ", logSource=" + this.d + ", logSourceName=" + this.f20475e + ", logEvents=" + this.f20476f + ", qosTier=" + j0.f20443a + "}";
    }
}
