package m2;

import j$.util.Objects;
public final class f {
    public final String f14400a;
    public final String f14401b;
    public final String f14402c;

    public f(String str, String str2, String str3) {
        this.f14400a = str;
        this.f14401b = str2;
        this.f14402c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14400a, fVar.f14400a) && Objects.equals(this.f14401b, fVar.f14401b) && Objects.equals(this.f14402c, fVar.f14402c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14400a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14401b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14402c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
