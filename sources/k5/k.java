package k5;

import java.util.Arrays;
public final class k extends r {
    public final long f12324a;
    public final Integer f12325b;
    public final long f12326c;
    public final byte[] d;
    public final String e;
    public final long f12327f;
    public final v f12328g;

    public k(long j3, Integer num, long j10, byte[] bArr, String str, long j11, v vVar) {
        this.f12324a = j3;
        this.f12325b = num;
        this.f12326c = j10;
        this.d = bArr;
        this.e = str;
        this.f12327f = j11;
        this.f12328g = vVar;
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
            v vVar2 = kVar.f12328g;
            String str2 = kVar.e;
            Integer num2 = kVar.f12325b;
            if (this.f12324a == kVar.f12324a && ((num = this.f12325b) != null ? num.equals(num2) : num2 == null) && this.f12326c == kVar.f12326c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).d;
                } else {
                    bArr = kVar.d;
                }
                if (Arrays.equals(this.d, bArr) && ((str = this.e) != null ? str.equals(str2) : str2 == null) && this.f12327f == kVar.f12327f && ((vVar = this.f12328g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j3 = this.f12324a;
        int i10 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f12325b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.f12326c;
        int hashCode3 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j11 = this.f12327f;
        int i12 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        v vVar = this.f12328g;
        if (vVar != null) {
            i11 = vVar.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f12324a + ", eventCode=" + this.f12325b + ", eventUptimeMs=" + this.f12326c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f12327f + ", networkConnectionInfo=" + this.f12328g + "}";
    }
}
