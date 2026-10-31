package k5;

import java.util.Arrays;
public final class k extends r {
    public final long f10905a;
    public final Integer f10906b;
    public final long f10907c;
    public final byte[] d;
    public final String e;
    public final long f10908f;
    public final v f10909g;

    public k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, v vVar) {
        this.f10905a = j10;
        this.f10906b = num;
        this.f10907c = j11;
        this.d = bArr;
        this.e = str;
        this.f10908f = j12;
        this.f10909g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f10909g;
            String str2 = kVar.e;
            Integer num2 = kVar.f10906b;
            if (this.f10905a == kVar.f10905a && ((num = this.f10906b) != null ? num.equals(num2) : num2 == null) && this.f10907c == kVar.f10907c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).d;
                } else {
                    bArr = kVar.d;
                }
                if (Arrays.equals(this.d, bArr) && ((str = this.e) != null ? str.equals(str2) : str2 == null) && this.f10908f == kVar.f10908f && ((vVar = this.f10909g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.f10905a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f10906b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j11 = this.f10907c;
        int hashCode3 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j12 = this.f10908f;
        int i12 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        v vVar = this.f10909g;
        if (vVar != null) {
            i11 = vVar.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f10905a + ", eventCode=" + this.f10906b + ", eventUptimeMs=" + this.f10907c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f10908f + ", networkConnectionInfo=" + this.f10909g + "}";
    }
}
