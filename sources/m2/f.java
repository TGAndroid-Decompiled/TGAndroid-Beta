package m2;

import j$.util.Objects;
public final class f {
    public final String f16435a;
    public final String f16436b;
    public final String f16437c;

    public f(String str, String str2, String str3) {
        this.f16435a = str;
        this.f16436b = str2;
        this.f16437c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f16435a, fVar.f16435a) && Objects.equals(this.f16436b, fVar.f16436b) && Objects.equals(this.f16437c, fVar.f16437c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f16435a.hashCode() * 31;
        int i11 = 0;
        String str = this.f16436b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f16437c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
