package defpackage;

import java.util.Arrays;
public final class aa0 extends wb6 {
    public final long a;
    public final Integer b;
    public final y70 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final da0 h;
    public final r90 i;

    public aa0(long j, Integer num, y70 y70Var, long j2, byte[] bArr, String str, long j3, da0 da0Var, r90 r90Var) {
        this.a = j;
        this.b = num;
        this.c = y70Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = da0Var;
        this.i = r90Var;
    }

    public final boolean equals(Object obj) {
        aa0 aa0Var;
        if (obj != this) {
            if (obj instanceof wb6) {
                wb6 wb6Var = (wb6) obj;
                aa0 aa0Var2 = (aa0) wb6Var;
                if (this.a == aa0Var2.a) {
                    Integer num = aa0Var2.b;
                    Integer num2 = this.b;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    y70 y70Var = aa0Var2.c;
                    y70 y70Var2 = this.c;
                    if (y70Var2 == null) {
                        if (y70Var != null) {
                            return false;
                        }
                    } else if (!y70Var2.equals(y70Var)) {
                        return false;
                    }
                    if (this.d == aa0Var2.d) {
                        if (wb6Var instanceof aa0) {
                            aa0Var = (aa0) wb6Var;
                        } else {
                            aa0Var = aa0Var2;
                        }
                        if (Arrays.equals(this.e, aa0Var.e)) {
                            String str = aa0Var2.f;
                            String str2 = this.f;
                            if (str2 == null) {
                                if (str != null) {
                                    return false;
                                }
                            } else if (!str2.equals(str)) {
                                return false;
                            }
                            if (this.g == aa0Var2.g) {
                                da0 da0Var = aa0Var2.h;
                                da0 da0Var2 = this.h;
                                if (da0Var2 == null) {
                                    if (da0Var != null) {
                                        return false;
                                    }
                                } else if (!da0Var2.equals(da0Var)) {
                                    return false;
                                }
                                r90 r90Var = aa0Var2.i;
                                r90 r90Var2 = this.i;
                                if (r90Var2 == null) {
                                    if (r90Var == null) {
                                        return true;
                                    }
                                    return false;
                                } else if (r90Var2.equals(r90Var)) {
                                    return true;
                                } else {
                                    return false;
                                }
                            }
                            return false;
                        }
                        return false;
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
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.a;
        int i = (((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003;
        int i2 = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        y70 y70Var = this.c;
        if (y70Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = y70Var.hashCode();
        }
        long j2 = this.d;
        int hashCode5 = (((((i3 ^ hashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        long j3 = this.g;
        int i4 = (((hashCode5 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        da0 da0Var = this.h;
        if (da0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = da0Var.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        r90 r90Var = this.i;
        if (r90Var != null) {
            i2 = r90Var.hashCode();
        }
        return i5 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
