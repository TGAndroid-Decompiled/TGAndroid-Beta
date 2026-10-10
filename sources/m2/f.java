package m2;

import j$.util.Objects;
public final class f {
    public final String f15937a;
    public final String f15938b;
    public final String f15939c;

    public f(String str, String str2, String str3) {
        this.f15937a = str;
        this.f15938b = str2;
        this.f15939c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f15937a, fVar.f15937a) && Objects.equals(this.f15938b, fVar.f15938b) && Objects.equals(this.f15939c, fVar.f15939c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15937a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15938b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f15939c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
