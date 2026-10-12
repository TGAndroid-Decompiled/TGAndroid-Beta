package k5;

import java.util.Arrays;
public final class k extends r {
    public final long f14670a;
    public final Integer f14671b;
    public final long f14672c;
    public final byte[] d;
    public final String f14673e;
    public final long f14674f;
    public final v f14675g;

    public k(long j3, Integer num, long j10, byte[] bArr, String str, long j11, v vVar) {
        this.f14670a = j3;
        this.f14671b = num;
        this.f14672c = j10;
        this.d = bArr;
        this.f14673e = str;
        this.f14674f = j11;
        this.f14675g = vVar;
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
            v vVar2 = kVar.f14675g;
            String str2 = kVar.f14673e;
            Integer num2 = kVar.f14671b;
            if (this.f14670a == kVar.f14670a && ((num = this.f14671b) != null ? num.equals(num2) : num2 == null) && this.f14672c == kVar.f14672c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).d;
                } else {
                    bArr = kVar.d;
                }
                if (Arrays.equals(this.d, bArr) && ((str = this.f14673e) != null ? str.equals(str2) : str2 == null) && this.f14674f == kVar.f14674f && ((vVar = this.f14675g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j3 = this.f14670a;
        int i10 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f14671b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.f14672c;
        int hashCode3 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f14673e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j11 = this.f14674f;
        int i12 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        v vVar = this.f14675g;
        if (vVar != null) {
            i11 = vVar.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f14670a + ", eventCode=" + this.f14671b + ", eventUptimeMs=" + this.f14672c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.f14673e + ", timezoneOffsetSeconds=" + this.f14674f + ", networkConnectionInfo=" + this.f14675g + "}";
    }
}
