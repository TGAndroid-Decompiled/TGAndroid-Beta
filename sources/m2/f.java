package m2;

import j$.util.Objects;
public final class f {
    public final String f15075a;
    public final String f15076b;
    public final String f15077c;

    public f(String str, String str2, String str3) {
        this.f15075a = str;
        this.f15076b = str2;
        this.f15077c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f15075a, fVar.f15075a) && Objects.equals(this.f15076b, fVar.f15076b) && Objects.equals(this.f15077c, fVar.f15077c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15075a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15076b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f15077c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
