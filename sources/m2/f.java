package m2;

import j$.util.Objects;
public final class f {
    public final String f16497a;
    public final String f16498b;
    public final String f16499c;

    public f(String str, String str2, String str3) {
        this.f16497a = str;
        this.f16498b = str2;
        this.f16499c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f16497a, fVar.f16497a) && Objects.equals(this.f16498b, fVar.f16498b) && Objects.equals(this.f16499c, fVar.f16499c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f16497a.hashCode() * 31;
        int i11 = 0;
        String str = this.f16498b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f16499c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
