package defpackage;

import java.util.Arrays;
public final class ca0 extends ae6 {
    public final long a;
    public final Integer b;
    public final a80 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final fa0 h;
    public final t90 i;

    public ca0(long j, Integer num, a80 a80Var, long j2, byte[] bArr, String str, long j3, fa0 fa0Var, t90 t90Var) {
        this.a = j;
        this.b = num;
        this.c = a80Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = fa0Var;
        this.i = t90Var;
    }

    public final boolean equals(Object obj) {
        ca0 ca0Var;
        if (obj != this) {
            if (obj instanceof ae6) {
                ae6 ae6Var = (ae6) obj;
                ca0 ca0Var2 = (ca0) ae6Var;
                if (this.a == ca0Var2.a) {
                    Integer num = ca0Var2.b;
                    Integer num2 = this.b;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    a80 a80Var = ca0Var2.c;
                    a80 a80Var2 = this.c;
                    if (a80Var2 == null) {
                        if (a80Var != null) {
                            return false;
                        }
                    } else if (!a80Var2.equals(a80Var)) {
                        return false;
                    }
                    if (this.d == ca0Var2.d) {
                        if (ae6Var instanceof ca0) {
                            ca0Var = (ca0) ae6Var;
                        } else {
                            ca0Var = ca0Var2;
                        }
                        if (Arrays.equals(this.e, ca0Var.e)) {
                            String str = ca0Var2.f;
                            String str2 = this.f;
                            if (str2 == null) {
                                if (str != null) {
                                    return false;
                                }
                            } else if (!str2.equals(str)) {
                                return false;
                            }
                            if (this.g == ca0Var2.g) {
                                fa0 fa0Var = ca0Var2.h;
                                fa0 fa0Var2 = this.h;
                                if (fa0Var2 == null) {
                                    if (fa0Var != null) {
                                        return false;
                                    }
                                } else if (!fa0Var2.equals(fa0Var)) {
                                    return false;
                                }
                                t90 t90Var = ca0Var2.i;
                                t90 t90Var2 = this.i;
                                if (t90Var2 == null) {
                                    if (t90Var == null) {
                                        return true;
                                    }
                                    return false;
                                } else if (t90Var2.equals(t90Var)) {
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
        a80 a80Var = this.c;
        if (a80Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = a80Var.hashCode();
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
        fa0 fa0Var = this.h;
        if (fa0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fa0Var.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        t90 t90Var = this.i;
        if (t90Var != null) {
            i2 = t90Var.hashCode();
        }
        return i5 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
