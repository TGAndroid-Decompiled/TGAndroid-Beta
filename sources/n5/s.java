package n5;

import java.util.Arrays;
public final class s extends e0 {
    public final long f21426a;
    public final Integer f21427b;
    public final a0 f21428c;
    public final long d;
    public final byte[] f21429e;
    public final String f21430f;
    public final long f21431g;
    public final i0 h;
    public final b0 f21432i;

    public s(long j3, Integer num, a0 a0Var, long j10, byte[] bArr, String str, long j11, i0 i0Var, b0 b0Var) {
        this.f21426a = j3;
        this.f21427b = num;
        this.f21428c = a0Var;
        this.d = j10;
        this.f21429e = bArr;
        this.f21430f = str;
        this.f21431g = j11;
        this.h = i0Var;
        this.f21432i = b0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        a0 a0Var;
        byte[] bArr;
        String str;
        i0 i0Var;
        b0 b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            b0 b0Var2 = sVar.f21432i;
            i0 i0Var2 = sVar.h;
            String str2 = sVar.f21430f;
            a0 a0Var2 = sVar.f21428c;
            Integer num2 = sVar.f21427b;
            if (this.f21426a == sVar.f21426a && ((num = this.f21427b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.f21428c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.d == sVar.d) {
                if (e0Var instanceof s) {
                    bArr = ((s) e0Var).f21429e;
                } else {
                    bArr = sVar.f21429e;
                }
                if (Arrays.equals(this.f21429e, bArr) && ((str = this.f21430f) != null ? str.equals(str2) : str2 == null) && this.f21431g == sVar.f21431g && ((i0Var = this.h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.f21432i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j3 = this.f21426a;
        int i7 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        int i10 = 0;
        Integer num = this.f21427b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (i7 ^ hashCode) * 1000003;
        a0 a0Var = this.f21428c;
        if (a0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = a0Var.hashCode();
        }
        long j10 = this.d;
        int hashCode5 = (((((i11 ^ hashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f21429e)) * 1000003;
        String str = this.f21430f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        long j11 = this.f21431g;
        int i12 = (((hashCode5 ^ hashCode3) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        i0 i0Var = this.h;
        if (i0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = i0Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        b0 b0Var = this.f21432i;
        if (b0Var != null) {
            i10 = b0Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f21426a + ", eventCode=" + this.f21427b + ", complianceData=" + this.f21428c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.f21429e) + ", sourceExtensionJsonProto3=" + this.f21430f + ", timezoneOffsetSeconds=" + this.f21431g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.f21432i + "}";
    }
}
