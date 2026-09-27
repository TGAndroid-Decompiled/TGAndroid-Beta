package m2;

import j$.util.Objects;
public final class f {
    public final String f14680a;
    public final String f14681b;
    public final String f14682c;

    public f(String str, String str2, String str3) {
        this.f14680a = str;
        this.f14681b = str2;
        this.f14682c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14680a, fVar.f14680a) && Objects.equals(this.f14681b, fVar.f14681b) && Objects.equals(this.f14682c, fVar.f14682c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14680a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14681b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14682c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
