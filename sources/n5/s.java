package n5;

import java.util.Arrays;
public final class s extends e0 {
    public final long f20473a;
    public final Integer f20474b;
    public final a0 f20475c;
    public final long d;
    public final byte[] f20476e;
    public final String f20477f;
    public final long f20478g;
    public final i0 h;
    public final b0 f20479i;

    public s(long j3, Integer num, a0 a0Var, long j10, byte[] bArr, String str, long j11, i0 i0Var, b0 b0Var) {
        this.f20473a = j3;
        this.f20474b = num;
        this.f20475c = a0Var;
        this.d = j10;
        this.f20476e = bArr;
        this.f20477f = str;
        this.f20478g = j11;
        this.h = i0Var;
        this.f20479i = b0Var;
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
            b0 b0Var2 = sVar.f20479i;
            i0 i0Var2 = sVar.h;
            String str2 = sVar.f20477f;
            a0 a0Var2 = sVar.f20475c;
            Integer num2 = sVar.f20474b;
            if (this.f20473a == sVar.f20473a && ((num = this.f20474b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.f20475c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.d == sVar.d) {
                if (e0Var instanceof s) {
                    bArr = ((s) e0Var).f20476e;
                } else {
                    bArr = sVar.f20476e;
                }
                if (Arrays.equals(this.f20476e, bArr) && ((str = this.f20477f) != null ? str.equals(str2) : str2 == null) && this.f20478g == sVar.f20478g && ((i0Var = this.h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.f20479i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
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
        long j3 = this.f20473a;
        int i7 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        int i10 = 0;
        Integer num = this.f20474b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (i7 ^ hashCode) * 1000003;
        a0 a0Var = this.f20475c;
        if (a0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = a0Var.hashCode();
        }
        long j10 = this.d;
        int hashCode5 = (((((i11 ^ hashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f20476e)) * 1000003;
        String str = this.f20477f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        long j11 = this.f20478g;
        int i12 = (((hashCode5 ^ hashCode3) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        i0 i0Var = this.h;
        if (i0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = i0Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        b0 b0Var = this.f20479i;
        if (b0Var != null) {
            i10 = b0Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f20473a + ", eventCode=" + this.f20474b + ", complianceData=" + this.f20475c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.f20476e) + ", sourceExtensionJsonProto3=" + this.f20477f + ", timezoneOffsetSeconds=" + this.f20478g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.f20479i + "}";
    }
}
