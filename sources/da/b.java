package da;

import m1.j;
public final class b {
    public final String f4287a;
    public final int f4288b;
    public final String f4289c;
    public final String d;
    public final long e;
    public final long f4290f;
    public final String f4291g;

    public b(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.f4287a = str;
        this.f4288b = i10;
        this.f4289c = str2;
        this.d = str3;
        this.e = j10;
        this.f4290f = j11;
        this.f4291g = str4;
    }

    public final a a() {
        a aVar = new a(0);
        aVar.f4284c = this.f4287a;
        aVar.f4283b = this.f4288b;
        aVar.d = this.f4289c;
        aVar.e = this.d;
        aVar.f4286g = Long.valueOf(this.e);
        aVar.h = Long.valueOf(this.f4290f);
        aVar.f4285f = this.f4291g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f4291g;
                String str2 = bVar.d;
                String str3 = bVar.f4289c;
                String str4 = bVar.f4287a;
                String str5 = this.f4287a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (j.b(this.f4288b, bVar.f4288b)) {
                    String str6 = this.f4289c;
                    if (str6 == null) {
                        if (str3 != null) {
                            return false;
                        }
                    } else if (!str6.equals(str3)) {
                        return false;
                    }
                    String str7 = this.d;
                    if (str7 == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (!str7.equals(str2)) {
                        return false;
                    }
                    if (this.e == bVar.e && this.f4290f == bVar.f4290f) {
                        String str8 = this.f4291g;
                        if (str8 == null) {
                            if (str == null) {
                                return true;
                            }
                            return false;
                        } else if (str8.equals(str)) {
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
        int i10 = 0;
        String str = this.f4287a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c3 = (((hashCode ^ 1000003) * 1000003) ^ j.c(this.f4288b)) * 1000003;
        String str2 = this.f4289c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (c3 ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j10 = this.e;
        long j11 = this.f4290f;
        int i12 = (((((i11 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f4291g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f4287a);
        sb.append(", registrationStatus=");
        int i10 = this.f4288b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
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
        sb.append(this.f4289c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f4290f);
        sb.append(", fisError=");
        return android.support.v4.media.a.r(sb, this.f4291g, "}");
    }
}
