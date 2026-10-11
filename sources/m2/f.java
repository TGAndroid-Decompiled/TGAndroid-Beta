package m2;

import j$.util.Objects;
public final class f {
    public final String f15958a;
    public final String f15959b;
    public final String f15960c;

    public f(String str, String str2, String str3) {
        this.f15958a = str;
        this.f15959b = str2;
        this.f15960c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f15958a, fVar.f15958a) && Objects.equals(this.f15959b, fVar.f15959b) && Objects.equals(this.f15960c, fVar.f15960c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15958a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15959b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f15960c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
