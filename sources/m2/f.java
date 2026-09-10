package m2;

import j$.util.Objects;
public final class f {
    public final String f13250a;
    public final String f13251b;
    public final String f13252c;

    public f(String str, String str2, String str3) {
        this.f13250a = str;
        this.f13251b = str2;
        this.f13252c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f13250a, fVar.f13250a) && Objects.equals(this.f13251b, fVar.f13251b) && Objects.equals(this.f13252c, fVar.f13252c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f13250a.hashCode() * 31;
        int i11 = 0;
        String str = this.f13251b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f13252c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
