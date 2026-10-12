package m2;

import j$.util.Objects;
public final class f {
    public final String f15340a;
    public final String f15341b;
    public final String f15342c;

    public f(String str, String str2, String str3) {
        this.f15340a = str;
        this.f15341b = str2;
        this.f15342c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f15340a, fVar.f15340a) && Objects.equals(this.f15341b, fVar.f15341b) && Objects.equals(this.f15342c, fVar.f15342c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15340a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15341b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f15342c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
