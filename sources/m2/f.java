package m2;

import j$.util.Objects;
public final class f {
    public final String f16003a;
    public final String f16004b;
    public final String f16005c;

    public f(String str, String str2, String str3) {
        this.f16003a = str;
        this.f16004b = str2;
        this.f16005c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f16003a, fVar.f16003a) && Objects.equals(this.f16004b, fVar.f16004b) && Objects.equals(this.f16005c, fVar.f16005c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f16003a.hashCode() * 31;
        int i11 = 0;
        String str = this.f16004b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f16005c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
