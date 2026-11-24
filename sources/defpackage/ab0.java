package defpackage;

import java.util.Arrays;
public final class ab0 extends vd6 {
    public final long a;
    public final Integer b;
    public final y80 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final db0 h;
    public final ra0 i;

    public ab0(long j, Integer num, y80 y80Var, long j2, byte[] bArr, String str, long j3, db0 db0Var, ra0 ra0Var) {
        this.a = j;
        this.b = num;
        this.c = y80Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = db0Var;
        this.i = ra0Var;
    }

    public final boolean equals(Object obj) {
        ab0 ab0Var;
        if (obj != this) {
            if (obj instanceof vd6) {
                vd6 vd6Var = (vd6) obj;
                ab0 ab0Var2 = (ab0) vd6Var;
                if (this.a == ab0Var2.a) {
                    Integer num = ab0Var2.b;
                    Integer num2 = this.b;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    y80 y80Var = ab0Var2.c;
                    y80 y80Var2 = this.c;
                    if (y80Var2 == null) {
                        if (y80Var != null) {
                            return false;
                        }
                    } else if (!y80Var2.equals(y80Var)) {
                        return false;
                    }
                    if (this.d == ab0Var2.d) {
                        if (vd6Var instanceof ab0) {
                            ab0Var = (ab0) vd6Var;
                        } else {
                            ab0Var = ab0Var2;
                        }
                        if (Arrays.equals(this.e, ab0Var.e)) {
                            String str = ab0Var2.f;
                            String str2 = this.f;
                            if (str2 == null) {
                                if (str != null) {
                                    return false;
                                }
                            } else if (!str2.equals(str)) {
                                return false;
                            }
                            if (this.g == ab0Var2.g) {
                                db0 db0Var = ab0Var2.h;
                                db0 db0Var2 = this.h;
                                if (db0Var2 == null) {
                                    if (db0Var != null) {
                                        return false;
                                    }
                                } else if (!db0Var2.equals(db0Var)) {
                                    return false;
                                }
                                ra0 ra0Var = ab0Var2.i;
                                ra0 ra0Var2 = this.i;
                                if (ra0Var2 == null) {
                                    if (ra0Var == null) {
                                        return true;
                                    }
                                    return false;
                                } else if (ra0Var2.equals(ra0Var)) {
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
        y80 y80Var = this.c;
        if (y80Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = y80Var.hashCode();
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
        db0 db0Var = this.h;
        if (db0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = db0Var.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        ra0 ra0Var = this.i;
        if (ra0Var != null) {
            i2 = ra0Var.hashCode();
        }
        return i5 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
