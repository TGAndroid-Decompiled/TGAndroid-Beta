package ba;

import a4.w;
import m1.j;
public final class b {
    public final String f2032a;
    public final int f2033b;
    public final String f2034c;
    public final String d;
    public final long f2035e;
    public final long f2036f;
    public final String f2037g;

    public b(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.f2032a = str;
        this.f2033b = i10;
        this.f2034c = str2;
        this.d = str3;
        this.f2035e = j10;
        this.f2036f = j11;
        this.f2037g = str4;
    }

    public final a a() {
        a aVar = new a(0);
        aVar.f2028c = this.f2032a;
        aVar.f2027b = this.f2033b;
        aVar.d = this.f2034c;
        aVar.f2029e = this.d;
        aVar.f2031g = Long.valueOf(this.f2035e);
        aVar.h = Long.valueOf(this.f2036f);
        aVar.f2030f = this.f2037g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f2037g;
                String str2 = bVar.d;
                String str3 = bVar.f2034c;
                String str4 = bVar.f2032a;
                String str5 = this.f2032a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (j.a(this.f2033b, bVar.f2033b)) {
                    String str6 = this.f2034c;
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
                    if (this.f2035e == bVar.f2035e && this.f2036f == bVar.f2036f) {
                        String str8 = this.f2037g;
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
        String str = this.f2032a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b10 = (((hashCode ^ 1000003) * 1000003) ^ j.b(this.f2033b)) * 1000003;
        String str2 = this.f2034c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (b10 ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j10 = this.f2035e;
        long j11 = this.f2036f;
        int i12 = (((((i11 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f2037g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f2032a);
        sb2.append(", registrationStatus=");
        int i10 = this.f2033b;
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
        sb2.append(str);
        sb2.append(", authToken=");
        sb2.append(this.f2034c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f2035e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f2036f);
        sb2.append(", fisError=");
        return w.q(sb2, this.f2037g, "}");
    }
}
