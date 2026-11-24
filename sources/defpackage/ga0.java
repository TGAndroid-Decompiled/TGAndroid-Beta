package defpackage;
public final class ga0 {
    public static final int h = 0;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        sc8.j(ir2.o("Missing required properties:", sb));
    }

    public ga0(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    public final fa0 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = (byte) 3;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ga0) {
                ga0 ga0Var = (ga0) obj;
                String str = ga0Var.a;
                String str2 = this.a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (ug8.c(this.b, ga0Var.b)) {
                    String str3 = ga0Var.c;
                    String str4 = this.c;
                    if (str4 == null) {
                        if (str3 != null) {
                            return false;
                        }
                    } else if (!str4.equals(str3)) {
                        return false;
                    }
                    String str5 = ga0Var.d;
                    String str6 = this.d;
                    if (str6 == null) {
                        if (str5 != null) {
                            return false;
                        }
                    } else if (!str6.equals(str5)) {
                        return false;
                    }
                    if (this.e == ga0Var.e && this.f == ga0Var.f) {
                        String str7 = ga0Var.g;
                        String str8 = this.g;
                        if (str8 == null) {
                            if (str7 == null) {
                                return true;
                            }
                            return false;
                        } else if (str8.equals(str7)) {
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
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int F = (((hashCode ^ 1000003) * 1000003) ^ ug8.F(this.b)) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (F ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.e;
        long j2 = this.f;
        int i3 = (((((i2 ^ hashCode3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "null";
                        } else {
                            str = "REGISTER_ERROR";
                        }
                    } else {
                        str = "REGISTERED";
                    }
                } else {
                    str = "UNREGISTERED";
                }
            } else {
                str = "NOT_GENERATED";
            }
        } else {
            str = "ATTEMPT_MIGRATION";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return b00.j(sb, this.g, "}");
    }
}
