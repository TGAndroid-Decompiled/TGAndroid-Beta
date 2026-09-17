package m2;

import j$.util.Objects;
public final class f {
    public final String f15805a;
    public final String f15806b;
    public final String f15807c;

    public f(String str, String str2, String str3) {
        this.f15805a = str;
        this.f15806b = str2;
        this.f15807c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f15805a, fVar.f15805a) && Objects.equals(this.f15806b, fVar.f15806b) && Objects.equals(this.f15807c, fVar.f15807c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f15805a.hashCode() * 31;
        int i11 = 0;
        String str = this.f15806b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f15807c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
