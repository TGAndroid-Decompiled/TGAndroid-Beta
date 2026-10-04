package k5;

import java.util.Arrays;
public final class k extends r {
    public final long f14640a;
    public final Integer f14641b;
    public final long f14642c;
    public final byte[] d;
    public final String f14643e;
    public final long f14644f;
    public final v f14645g;

    public k(long j3, Integer num, long j10, byte[] bArr, String str, long j11, v vVar) {
        this.f14640a = j3;
        this.f14641b = num;
        this.f14642c = j10;
        this.d = bArr;
        this.f14643e = str;
        this.f14644f = j11;
        this.f14645g = vVar;
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
            v vVar2 = kVar.f14645g;
            String str2 = kVar.f14643e;
            Integer num2 = kVar.f14641b;
            if (this.f14640a == kVar.f14640a && ((num = this.f14641b) != null ? num.equals(num2) : num2 == null) && this.f14642c == kVar.f14642c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).d;
                } else {
                    bArr = kVar.d;
                }
                if (Arrays.equals(this.d, bArr) && ((str = this.f14643e) != null ? str.equals(str2) : str2 == null) && this.f14644f == kVar.f14644f && ((vVar = this.f14645g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j3 = this.f14640a;
        int i10 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f14641b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.f14642c;
        int hashCode3 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f14643e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j11 = this.f14644f;
        int i12 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        v vVar = this.f14645g;
        if (vVar != null) {
            i11 = vVar.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f14640a + ", eventCode=" + this.f14641b + ", eventUptimeMs=" + this.f14642c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.f14643e + ", timezoneOffsetSeconds=" + this.f14644f + ", networkConnectionInfo=" + this.f14645g + "}";
    }
}
