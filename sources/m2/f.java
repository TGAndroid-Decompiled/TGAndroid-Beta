package m2;

import j$.util.Objects;
public final class f {
    public final String f15994a;
    public final String f15995b;
    public final String f15996c;

    public f(String str, String str2, String str3) {
        this.f15994a = str;
        this.f15995b = str2;
        this.f15996c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f15994a, fVar.f15994a) && Objects.equals(this.f15995b, fVar.f15995b) && Objects.equals(this.f15996c, fVar.f15996c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15994a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15995b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f15996c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
