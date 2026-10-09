package m2;

import j$.util.Objects;
public final class f {
    public final String f15933a;
    public final String f15934b;
    public final String f15935c;

    public f(String str, String str2, String str3) {
        this.f15933a = str;
        this.f15934b = str2;
        this.f15935c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f15933a, fVar.f15933a) && Objects.equals(this.f15934b, fVar.f15934b) && Objects.equals(this.f15935c, fVar.f15935c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15933a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15934b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f15935c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
