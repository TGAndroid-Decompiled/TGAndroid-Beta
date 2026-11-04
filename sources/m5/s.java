package m5;

import java.util.Arrays;
public final class s extends e0 {
    public final long f19156a;
    public final Integer f19157b;
    public final a0 f19158c;
    public final long d;
    public final byte[] f19159e;
    public final String f19160f;
    public final long f19161g;
    public final i0 h;
    public final b0 f19162i;

    public s(long j10, Integer num, a0 a0Var, long j11, byte[] bArr, String str, long j12, i0 i0Var, b0 b0Var) {
        this.f19156a = j10;
        this.f19157b = num;
        this.f19158c = a0Var;
        this.d = j11;
        this.f19159e = bArr;
        this.f19160f = str;
        this.f19161g = j12;
        this.h = i0Var;
        this.f19162i = b0Var;
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
            b0 b0Var2 = sVar.f19162i;
            i0 i0Var2 = sVar.h;
            String str2 = sVar.f19160f;
            a0 a0Var2 = sVar.f19158c;
            Integer num2 = sVar.f19157b;
            if (this.f19156a == sVar.f19156a && ((num = this.f19157b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.f19158c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.d == sVar.d) {
                if (e0Var instanceof s) {
                    bArr = ((s) e0Var).f19159e;
                } else {
                    bArr = sVar.f19159e;
                }
                if (Arrays.equals(this.f19159e, bArr) && ((str = this.f19160f) != null ? str.equals(str2) : str2 == null) && this.f19161g == sVar.f19161g && ((i0Var = this.h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.f19162i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
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
        long j10 = this.f19156a;
        int i3 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i10 = 0;
        Integer num = this.f19157b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (i3 ^ hashCode) * 1000003;
        a0 a0Var = this.f19158c;
        if (a0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = a0Var.hashCode();
        }
        long j11 = this.d;
        int hashCode5 = (((((i11 ^ hashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f19159e)) * 1000003;
        String str = this.f19160f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        long j12 = this.f19161g;
        int i12 = (((hashCode5 ^ hashCode3) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        i0 i0Var = this.h;
        if (i0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = i0Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        b0 b0Var = this.f19162i;
        if (b0Var != null) {
            i10 = b0Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f19156a + ", eventCode=" + this.f19157b + ", complianceData=" + this.f19158c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.f19159e) + ", sourceExtensionJsonProto3=" + this.f19160f + ", timezoneOffsetSeconds=" + this.f19161g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.f19162i + "}";
    }
}
