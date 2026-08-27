package n4;

import d5.g0;

public final class f {

    public final String f18238a;

    public final String f18239b;

    public final String f18240c;

    public f(String str, String str2, String str3) {
        this.f18238a = str;
        this.f18239b = str2;
        this.f18240c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (g0.a(this.f18238a, fVar.f18238a) && g0.a(this.f18239b, fVar.f18239b) && g0.a(this.f18240c, fVar.f18240c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f18238a.hashCode() * 31;
        String str = this.f18239b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18240c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
