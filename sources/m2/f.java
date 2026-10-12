package m2;

import j$.util.Objects;
public final class f {
    public final String f15683a;
    public final String f15684b;
    public final String f15685c;

    public f(String str, String str2, String str3) {
        this.f15683a = str;
        this.f15684b = str2;
        this.f15685c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f15683a, fVar.f15683a) && Objects.equals(this.f15684b, fVar.f15684b) && Objects.equals(this.f15685c, fVar.f15685c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15683a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15684b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f15685c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
