package m2;

import j$.util.Objects;
public final class f {
    public final String f16434a;
    public final String f16435b;
    public final String f16436c;

    public f(String str, String str2, String str3) {
        this.f16434a = str;
        this.f16435b = str2;
        this.f16436c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f16434a, fVar.f16434a) && Objects.equals(this.f16435b, fVar.f16435b) && Objects.equals(this.f16436c, fVar.f16436c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f16434a.hashCode() * 31;
        int i11 = 0;
        String str = this.f16435b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f16436c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
