package m2;

import j$.util.Objects;
public final class f {
    public final String f17954a;
    public final String f17955b;
    public final String f17956c;

    public f(String str, String str2, String str3) {
        this.f17954a = str;
        this.f17955b = str2;
        this.f17956c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f17954a, fVar.f17954a) && Objects.equals(this.f17955b, fVar.f17955b) && Objects.equals(this.f17956c, fVar.f17956c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f17954a.hashCode() * 31;
        int i11 = 0;
        String str = this.f17955b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f17956c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
