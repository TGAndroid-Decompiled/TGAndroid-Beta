package aa;

import a9.p;
import m1.j;

public final class b {

    public final String f205a;

    public final int f206b;

    public final String f207c;
    public final String d;

    public final long f208e;

    public final long f209f;

    public final String f210g;

    public b(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.f205a = str;
        this.f206b = i10;
        this.f207c = str2;
        this.d = str3;
        this.f208e = j10;
        this.f209f = j11;
        this.f210g = str4;
    }

    public final a a() {
        a aVar = new a(0);
        aVar.f201c = this.f205a;
        aVar.f200b = this.f206b;
        aVar.d = this.f207c;
        aVar.f202e = this.d;
        aVar.f204g = Long.valueOf(this.f208e);
        aVar.h = Long.valueOf(this.f209f);
        aVar.f203f = this.f210g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f210g;
        String str2 = bVar.d;
        String str3 = bVar.f207c;
        String str4 = bVar.f205a;
        String str5 = this.f205a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!j.a(this.f206b, bVar.f206b)) {
            return false;
        }
        String str6 = this.f207c;
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
        if (this.f208e != bVar.f208e || this.f209f != bVar.f209f) {
            return false;
        }
        String str8 = this.f210g;
        if (str8 == null) {
            return str == null;
        }
        return str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f205a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ j.b(this.f206b)) * 1000003;
        String str2 = this.f207c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f208e;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f209f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f210g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f205a);
        sb2.append(", registrationStatus=");
        int i10 = this.f206b;
        if (i10 == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i10 == 2) {
            str = "NOT_GENERATED";
        } else if (i10 == 3) {
            str = "UNREGISTERED";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb2.append(str);
        sb2.append(", authToken=");
        sb2.append(this.f207c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f208e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f209f);
        sb2.append(", fisError=");
        return p.p(sb2, this.f210g, "}");
    }
}
